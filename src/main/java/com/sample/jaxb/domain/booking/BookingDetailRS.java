//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.10 at 02:38:20 PM CET 
//


package com.sample.jaxb.domain.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;sequence>
 *         &lt;element name="AuditData" type="{http://hotelbeds.com/service/domain/booking/cs/categorization}AuditData"/>
 *         &lt;element ref="{http://hotelbeds.com/service/domain/booking/cs/categorization}BookingDetail"/>
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
    "auditData",
    "bookingDetail"
})
@XmlRootElement(name = "BookingDetailRS")
public class BookingDetailRS {

    @XmlElement(name = "AuditData", required = true)
    protected AuditData auditData;
    @XmlElement(name = "BookingDetail", namespace = "http://hotelbeds.com/service/domain/booking/cs/categorization", required = true)
    protected BookingDetail bookingDetail;

    /**
     * Gets the value of the auditData property.
     * 
     * @return
     *     possible object is
     *     {@link AuditData }
     *     
     */
    public AuditData getAuditData() {
        return auditData;
    }

    /**
     * Sets the value of the auditData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditData }
     *     
     */
    public void setAuditData(AuditData value) {
        this.auditData = value;
    }

    /**
     * Gets the value of the bookingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link BookingDetail }
     *     
     */
    public BookingDetail getBookingDetail() {
        return bookingDetail;
    }

    /**
     * Sets the value of the bookingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingDetail }
     *     
     */
    public void setBookingDetail(BookingDetail value) {
        this.bookingDetail = value;
    }

}