//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.14 at 10:25:32 AM CET 
//


package com.sample.jaxb.domain.purchase;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="MasterCard"/>
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="Amex"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodType", namespace = "http://NamespaceTest.com/CommonTypes")
@XmlEnum
public enum PaymentMethodType {

    VISA("VISA"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("Amex")
    AMEX("Amex");
    private final String value;

    PaymentMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodType fromValue(String v) {
        for (PaymentMethodType c: PaymentMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
