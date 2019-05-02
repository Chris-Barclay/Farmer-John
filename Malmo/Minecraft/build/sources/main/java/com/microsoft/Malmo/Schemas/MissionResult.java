//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.02 at 03:28:55 PM PDT 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MissionResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MissionResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENDED"/>
 *     &lt;enumeration value="PLAYER_DIED"/>
 *     &lt;enumeration value="AGENT_QUIT"/>
 *     &lt;enumeration value="MOD_FAILED_TO_INSTANTIATE_HANDLERS"/>
 *     &lt;enumeration value="MOD_HAS_NO_WORLD_LOADED"/>
 *     &lt;enumeration value="MOD_FAILED_TO_CREATE_WORLD"/>
 *     &lt;enumeration value="MOD_HAS_NO_AGENT_AVAILABLE"/>
 *     &lt;enumeration value="MOD_SERVER_UNREACHABLE"/>
 *     &lt;enumeration value="MOD_SERVER_ABORTED_MISSION"/>
 *     &lt;enumeration value="MOD_CONNECTION_FAILED"/>
 *     &lt;enumeration value="MOD_CRASHED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MissionResult")
@XmlEnum
public enum MissionResult {

    ENDED,
    PLAYER_DIED,
    AGENT_QUIT,
    MOD_FAILED_TO_INSTANTIATE_HANDLERS,
    MOD_HAS_NO_WORLD_LOADED,
    MOD_FAILED_TO_CREATE_WORLD,
    MOD_HAS_NO_AGENT_AVAILABLE,
    MOD_SERVER_UNREACHABLE,
    MOD_SERVER_ABORTED_MISSION,
    MOD_CONNECTION_FAILED,
    MOD_CRASHED;

    public String value() {
        return name();
    }

    public static MissionResult fromValue(String v) {
        return valueOf(v);
    }

}
