from builtins import range
import MalmoPython
import sys
import time
import random
import json
import numpy as np
import farm_generator as fg
import pathfinding_network as pfn


block_value = {"white_shulker_box": 0,
               "brown_shulker_box": 1,
                "blue_shulker_box": 2}


def spawn_farm(f, n, m):
    """ Spawns farm blocks in world
        f = farm; 3D-array of the farm
        n = width of the farm
        m = mission
    """
    testing = False
    for x, i in zip(range(-int(n/2), int(n/2)), range(n)):
        for z, j in zip(range(-int(n/2), int(n/2)), range(n)):
            m.drawBlock(x, 0, z, f[0][i][j])
            if not testing:
                m.drawBlock(x, 1, z, f[1][i][j])
            else:
                m.drawBlock(x, 1, z, "air")


def get_agent_pos(f, n):
    """ Returns random (x, z) start position of agent
        f = farm
        n = width of the farm
    """
    pos = None
    for x, i in zip(range(-int(n/2), int(n/2)), range(n)):
        for z, j in zip(range(-int(n/2), int(n/2)), range(n)):
            if f[0][i][j] == "white_shulker_box" and (random.random() < 0.02 or pos is None):
                pos = (x, z)
    return pos


def move_agent(i, a, pos):
    if i == 0:
        command = "tp {} 2 {}".format(pos[0]+1, pos[1])
    elif i == 1:
        command = "tp {} 2 {}".format(pos[0], pos[1]-1)
    elif i == 2:
        command = "tp {} 2 {}".format(pos[0], pos[1]+1)
    else:
        command = "tp {} 2 {}".format(pos[0]-1, pos[1])
    a.sendCommand(command)


def run_mission():
    random.seed(time.time())
    mission_xml = '''<?xml version="1.0" encoding="UTF-8" ?>
            <Mission xmlns="http://ProjectMalmo.microsoft.com" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
            
              <About>
                <Summary>Setup Farm</Summary>
              </About>
              
              <ServerSection>
                <ServerHandlers>
                  <FlatWorldGenerator generatorString="2;10x0;1;"/>
                  <DrawingDecorator>
                  </DrawingDecorator>
                  <ServerQuitFromTimeUp timeLimitMs="10000"/>
                  <ServerQuitWhenAnyAgentFinishes/>
                </ServerHandlers>
              </ServerSection>
              
              <AgentSection mode="Survival">
                <Name>FarmerBot</Name>
                <AgentStart>
                  <Placement yaw="180"/>
                  <Inventory>
                    <InventoryObject slot="0" type="wheat_seeds" quantity="64"/>
                    <InventoryObject slot="1" type="carrot" quantity="64"/>
                    <InventoryObject slot="2" type="potato" quantity="64"/>
                  </Inventory>
                </AgentStart>
                <AgentHandlers>
                  <ObservationFromFullStats/>
                  <ContinuousMovementCommands/>
                  <AbsoluteMovementCommands/>
                </AgentHandlers>
              </AgentSection>
            </Mission>'''
            
    # Create Agent Host
    agent_host = MalmoPython.AgentHost()
    try:
        agent_host.parse( sys.argv )
    except RuntimeError as e:
        print('ERROR:',e)
        print(agent_host.getUsage())
        exit(1)
    if agent_host.receivedArgument("help"):
        print(agent_host.getUsage())
        exit(0)

    # Create Mission
    my_mission = MalmoPython.MissionSpec(mission_xml, True)
    my_mission_record = MalmoPython.MissionRecordSpec()

    # Create Farm
    size = 32
    size += size % 2 # Make sure the size is even
    # 3D-array of the farm
    #   farm[0] = 2D-array color_shulker_box data
    #   farm[1] = 2D-array minecraft block data
    farm = fg.generate_farm(size)
    spawn_farm(farm, size, my_mission)
    agent_spawn = get_agent_pos(farm, size)
    my_mission.startAt(agent_spawn[0], 4, agent_spawn[1])

    # Actual plots where crops are planted
    farmland = []
    for r in range(size):
        for c in range(size):
            if farm[0][r][c] == "brown_shulker_box":
                farmland.append((r, c))

    # Path finding neural network
    pf = pfn.QPathFinding(4, 8)

    # Attempt to start a mission:
    max_retries = 3
    for retry in range(max_retries):
        try:
            agent_host.startMission(my_mission, my_mission_record)
            break
        except RuntimeError as e:
            if retry == max_retries - 1:
                print("Error starting mission:", e)
                exit(1)
            else:
                time.sleep(2)
                
    # Loop until mission starts:
    print("Waiting for the mission to start ", end=' ')
    world_state = agent_host.getWorldState()
    while not world_state.has_mission_begun:
        print(".", end="")
        time.sleep(0.1)
        world_state = agent_host.getWorldState()
        for error in world_state.errors:
            print("Error:", error.text)

    print("\nMission running ", end=' ')

    # For testing path finding
    dest = list(random.choice(farmland))

    # Loop until mission ends:
    while world_state.is_mission_running:
        print(".", end="")
        time.sleep(0.5)
        world_state = agent_host.getWorldState()
        for error in world_state.errors:
            print("Error:", error.text)

        if len(world_state.observations) > 0:
            msg = world_state.observations[-1].text
            ob = json.loads(msg)
            # Get agent's current position
            start = [int(float(ob.get(u'XPos', 0))), int(float(ob.get(u'ZPos', 0)))]
            
            # Get adjacent blocks to agent
            adj = []
            for i in range(-1, 2):
                for j in range(-1, 2):
                    if not (i == j or i+j == 0):
                        adj.append(block_value[farm[0][start[0]+i][start[1]+j]])
                        
            # Input vector for path finding NN
            path_finding_input = np.array(start + dest + adj)
            action = pf.choose_action(path_finding_input)
            move_agent(action, agent_host, start)
            # print(action)
            # do action and get next observation/reward
            # observation_, reward, done = env.step()
            # store transitions
            # train for a few steps

    print("\nMission ended")
    # Mission has ended.
    time.sleep(1)
        
        
if __name__ == "__main__":
    run_mission()
