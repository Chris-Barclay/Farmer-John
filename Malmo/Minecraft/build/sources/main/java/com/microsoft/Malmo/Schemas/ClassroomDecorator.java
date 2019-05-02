//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.02 at 03:28:55 PM PDT 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="complexity">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="building" type="{http://ProjectMalmo.microsoft.com}ZeroToOne"/>
 *                   &lt;element name="path" type="{http://ProjectMalmo.microsoft.com}ZeroToOne"/>
 *                   &lt;element name="division" type="{http://ProjectMalmo.microsoft.com}ZeroToOne"/>
 *                   &lt;element name="obstacle" type="{http://ProjectMalmo.microsoft.com}ZeroToOne"/>
 *                   &lt;element name="hint" type="{http://ProjectMalmo.microsoft.com}ZeroToOne"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="specification">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="width" type="{http://ProjectMalmo.microsoft.com}BuildingSize"/>
 *                   &lt;element name="height" type="{http://ProjectMalmo.microsoft.com}BuildingSize"/>
 *                   &lt;element name="length" type="{http://ProjectMalmo.microsoft.com}BuildingSize"/>
 *                   &lt;element name="pathLength" type="{http://ProjectMalmo.microsoft.com}NonNegative"/>
 *                   &lt;element name="divisions">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="southNorth" type="{http://ProjectMalmo.microsoft.com}NonNegative"/>
 *                             &lt;element name="eastWest" type="{http://ProjectMalmo.microsoft.com}NonNegative"/>
 *                             &lt;element name="aboveBelow" type="{http://ProjectMalmo.microsoft.com}NonNegative"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="horizontalObstacles" type="{http://ProjectMalmo.microsoft.com}HorizontalObstacles"/>
 *                   &lt;element name="verticalObstacles" type="{http://ProjectMalmo.microsoft.com}VerticalObstacles"/>
 *                   &lt;element name="hintLikelihood" type="{http://ProjectMalmo.microsoft.com}ZeroToOne"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="seed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="palette" type="{http://ProjectMalmo.microsoft.com}PaletteEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "complexity",
    "specification"
})
@XmlRootElement(name = "ClassroomDecorator")
public class ClassroomDecorator {

    protected ClassroomDecorator.Complexity complexity;
    protected ClassroomDecorator.Specification specification;
    @XmlAttribute(name = "seed")
    protected String seed;
    @XmlAttribute(name = "palette")
    protected PaletteEnum palette;

    /**
     * Gets the value of the complexity property.
     * 
     * @return
     *     possible object is
     *     {@link ClassroomDecorator.Complexity }
     *     
     */
    public ClassroomDecorator.Complexity getComplexity() {
        return complexity;
    }

    /**
     * Sets the value of the complexity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassroomDecorator.Complexity }
     *     
     */
    public void setComplexity(ClassroomDecorator.Complexity value) {
        this.complexity = value;
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link ClassroomDecorator.Specification }
     *     
     */
    public ClassroomDecorator.Specification getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassroomDecorator.Specification }
     *     
     */
    public void setSpecification(ClassroomDecorator.Specification value) {
        this.specification = value;
    }

    /**
     * Gets the value of the seed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeed() {
        return seed;
    }

    /**
     * Sets the value of the seed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeed(String value) {
        this.seed = value;
    }

    /**
     * Gets the value of the palette property.
     * 
     * @return
     *     possible object is
     *     {@link PaletteEnum }
     *     
     */
    public PaletteEnum getPalette() {
        return palette;
    }

    /**
     * Sets the value of the palette property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaletteEnum }
     *     
     */
    public void setPalette(PaletteEnum value) {
        this.palette = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="building" type="{http://ProjectMalmo.microsoft.com}ZeroToOne"/>
     *         &lt;element name="path" type="{http://ProjectMalmo.microsoft.com}ZeroToOne"/>
     *         &lt;element name="division" type="{http://ProjectMalmo.microsoft.com}ZeroToOne"/>
     *         &lt;element name="obstacle" type="{http://ProjectMalmo.microsoft.com}ZeroToOne"/>
     *         &lt;element name="hint" type="{http://ProjectMalmo.microsoft.com}ZeroToOne"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "building",
        "path",
        "division",
        "obstacle",
        "hint"
    })
    public static class Complexity {

        protected double building;
        protected double path;
        protected double division;
        protected double obstacle;
        protected double hint;

        /**
         * Gets the value of the building property.
         * 
         */
        public double getBuilding() {
            return building;
        }

        /**
         * Sets the value of the building property.
         * 
         */
        public void setBuilding(double value) {
            this.building = value;
        }

        /**
         * Gets the value of the path property.
         * 
         */
        public double getPath() {
            return path;
        }

        /**
         * Sets the value of the path property.
         * 
         */
        public void setPath(double value) {
            this.path = value;
        }

        /**
         * Gets the value of the division property.
         * 
         */
        public double getDivision() {
            return division;
        }

        /**
         * Sets the value of the division property.
         * 
         */
        public void setDivision(double value) {
            this.division = value;
        }

        /**
         * Gets the value of the obstacle property.
         * 
         */
        public double getObstacle() {
            return obstacle;
        }

        /**
         * Sets the value of the obstacle property.
         * 
         */
        public void setObstacle(double value) {
            this.obstacle = value;
        }

        /**
         * Gets the value of the hint property.
         * 
         */
        public double getHint() {
            return hint;
        }

        /**
         * Sets the value of the hint property.
         * 
         */
        public void setHint(double value) {
            this.hint = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="width" type="{http://ProjectMalmo.microsoft.com}BuildingSize"/>
     *         &lt;element name="height" type="{http://ProjectMalmo.microsoft.com}BuildingSize"/>
     *         &lt;element name="length" type="{http://ProjectMalmo.microsoft.com}BuildingSize"/>
     *         &lt;element name="pathLength" type="{http://ProjectMalmo.microsoft.com}NonNegative"/>
     *         &lt;element name="divisions">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="southNorth" type="{http://ProjectMalmo.microsoft.com}NonNegative"/>
     *                   &lt;element name="eastWest" type="{http://ProjectMalmo.microsoft.com}NonNegative"/>
     *                   &lt;element name="aboveBelow" type="{http://ProjectMalmo.microsoft.com}NonNegative"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="horizontalObstacles" type="{http://ProjectMalmo.microsoft.com}HorizontalObstacles"/>
     *         &lt;element name="verticalObstacles" type="{http://ProjectMalmo.microsoft.com}VerticalObstacles"/>
     *         &lt;element name="hintLikelihood" type="{http://ProjectMalmo.microsoft.com}ZeroToOne"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "width",
        "height",
        "length",
        "pathLength",
        "divisions",
        "horizontalObstacles",
        "verticalObstacles",
        "hintLikelihood"
    })
    public static class Specification {

        protected int width;
        protected int height;
        protected int length;
        protected int pathLength;
        @XmlElement(required = true)
        protected ClassroomDecorator.Specification.Divisions divisions;
        @XmlElement(required = true)
        protected HorizontalObstacles horizontalObstacles;
        @XmlElement(required = true)
        protected VerticalObstacles verticalObstacles;
        protected double hintLikelihood;

        /**
         * Gets the value of the width property.
         * 
         */
        public int getWidth() {
            return width;
        }

        /**
         * Sets the value of the width property.
         * 
         */
        public void setWidth(int value) {
            this.width = value;
        }

        /**
         * Gets the value of the height property.
         * 
         */
        public int getHeight() {
            return height;
        }

        /**
         * Sets the value of the height property.
         * 
         */
        public void setHeight(int value) {
            this.height = value;
        }

        /**
         * Gets the value of the length property.
         * 
         */
        public int getLength() {
            return length;
        }

        /**
         * Sets the value of the length property.
         * 
         */
        public void setLength(int value) {
            this.length = value;
        }

        /**
         * Gets the value of the pathLength property.
         * 
         */
        public int getPathLength() {
            return pathLength;
        }

        /**
         * Sets the value of the pathLength property.
         * 
         */
        public void setPathLength(int value) {
            this.pathLength = value;
        }

        /**
         * Gets the value of the divisions property.
         * 
         * @return
         *     possible object is
         *     {@link ClassroomDecorator.Specification.Divisions }
         *     
         */
        public ClassroomDecorator.Specification.Divisions getDivisions() {
            return divisions;
        }

        /**
         * Sets the value of the divisions property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClassroomDecorator.Specification.Divisions }
         *     
         */
        public void setDivisions(ClassroomDecorator.Specification.Divisions value) {
            this.divisions = value;
        }

        /**
         * Gets the value of the horizontalObstacles property.
         * 
         * @return
         *     possible object is
         *     {@link HorizontalObstacles }
         *     
         */
        public HorizontalObstacles getHorizontalObstacles() {
            return horizontalObstacles;
        }

        /**
         * Sets the value of the horizontalObstacles property.
         * 
         * @param value
         *     allowed object is
         *     {@link HorizontalObstacles }
         *     
         */
        public void setHorizontalObstacles(HorizontalObstacles value) {
            this.horizontalObstacles = value;
        }

        /**
         * Gets the value of the verticalObstacles property.
         * 
         * @return
         *     possible object is
         *     {@link VerticalObstacles }
         *     
         */
        public VerticalObstacles getVerticalObstacles() {
            return verticalObstacles;
        }

        /**
         * Sets the value of the verticalObstacles property.
         * 
         * @param value
         *     allowed object is
         *     {@link VerticalObstacles }
         *     
         */
        public void setVerticalObstacles(VerticalObstacles value) {
            this.verticalObstacles = value;
        }

        /**
         * Gets the value of the hintLikelihood property.
         * 
         */
        public double getHintLikelihood() {
            return hintLikelihood;
        }

        /**
         * Sets the value of the hintLikelihood property.
         * 
         */
        public void setHintLikelihood(double value) {
            this.hintLikelihood = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="southNorth" type="{http://ProjectMalmo.microsoft.com}NonNegative"/>
         *         &lt;element name="eastWest" type="{http://ProjectMalmo.microsoft.com}NonNegative"/>
         *         &lt;element name="aboveBelow" type="{http://ProjectMalmo.microsoft.com}NonNegative"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Divisions {

            protected int southNorth;
            protected int eastWest;
            protected int aboveBelow;

            /**
             * Gets the value of the southNorth property.
             * 
             */
            public int getSouthNorth() {
                return southNorth;
            }

            /**
             * Sets the value of the southNorth property.
             * 
             */
            public void setSouthNorth(int value) {
                this.southNorth = value;
            }

            /**
             * Gets the value of the eastWest property.
             * 
             */
            public int getEastWest() {
                return eastWest;
            }

            /**
             * Sets the value of the eastWest property.
             * 
             */
            public void setEastWest(int value) {
                this.eastWest = value;
            }

            /**
             * Gets the value of the aboveBelow property.
             * 
             */
            public int getAboveBelow() {
                return aboveBelow;
            }

            /**
             * Sets the value of the aboveBelow property.
             * 
             */
            public void setAboveBelow(int value) {
                this.aboveBelow = value;
            }

        }

    }

}
