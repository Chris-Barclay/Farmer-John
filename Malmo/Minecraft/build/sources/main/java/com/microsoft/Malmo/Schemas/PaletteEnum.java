//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.15 at 12:44:50 PM PDT 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaletteEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaletteEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="random"/>
 *     &lt;enumeration value="dungeon"/>
 *     &lt;enumeration value="pyramid"/>
 *     &lt;enumeration value="igloo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaletteEnum")
@XmlEnum
public enum PaletteEnum {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("random")
    RANDOM("random"),
    @XmlEnumValue("dungeon")
    DUNGEON("dungeon"),
    @XmlEnumValue("pyramid")
    PYRAMID("pyramid"),
    @XmlEnumValue("igloo")
    IGLOO("igloo");
    private final String value;

    PaletteEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaletteEnum fromValue(String v) {
        for (PaletteEnum c: PaletteEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
