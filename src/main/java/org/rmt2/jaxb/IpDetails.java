//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 12:13:36 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for ip_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ip_details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ip_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ip_from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ip_to" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ip_octal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ip_details", propOrder = {
    "ipId",
    "ipFrom",
    "ipTo",
    "ipOctal",
    "countryCode",
    "countryName",
    "region",
    "city",
    "latitude",
    "longitude",
    "zip",
    "timezone"
})
public class IpDetails
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ip_id", required = true, defaultValue = "0")
    protected String ipId;
    @XmlElement(name = "ip_from", required = true)
    protected String ipFrom;
    @XmlElement(name = "ip_to", required = true)
    protected String ipTo;
    @XmlElement(name = "ip_octal", required = true)
    protected String ipOctal;
    @XmlElement(name = "country_code")
    protected String countryCode;
    @XmlElement(name = "country_name")
    protected String countryName;
    protected String region;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String latitude;
    @XmlElement(required = true)
    protected String longitude;
    @XmlElement(required = true)
    protected String zip;
    @XmlElement(required = true)
    protected String timezone;

    /**
     * Gets the value of the ipId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpId() {
        return ipId;
    }

    /**
     * Sets the value of the ipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpId(String value) {
        this.ipId = value;
    }

    /**
     * Gets the value of the ipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpFrom() {
        return ipFrom;
    }

    /**
     * Sets the value of the ipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpFrom(String value) {
        this.ipFrom = value;
    }

    /**
     * Gets the value of the ipTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpTo() {
        return ipTo;
    }

    /**
     * Sets the value of the ipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpTo(String value) {
        this.ipTo = value;
    }

    /**
     * Gets the value of the ipOctal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpOctal() {
        return ipOctal;
    }

    /**
     * Sets the value of the ipOctal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpOctal(String value) {
        this.ipOctal = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

}
