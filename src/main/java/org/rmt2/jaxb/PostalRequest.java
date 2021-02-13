//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.12 at 06:59:02 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * Request one or more records from the Country/State/Province data source.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{}header_type"/>
 *         &lt;element name="postal_criteria">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="zipcode" type="{}zipcode_criteria_type"/>
 *                   &lt;element name="country" type="{}country_criteria_type"/>
 *                   &lt;element name="province" type="{}states_criteria_type"/>
 *                   &lt;element name="ip_addr" type="{}ip_criteria_type"/>
 *                   &lt;element name="timezone" type="{}timezone_criteria_type"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "header",
    "postalCriteria"
})
@XmlRootElement(name = "PostalRequest")
public class PostalRequest
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected HeaderType header;
    @XmlElement(name = "postal_criteria", required = true)
    protected PostalRequest.PostalCriteria postalCriteria;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the postalCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PostalRequest.PostalCriteria }
     *     
     */
    public PostalRequest.PostalCriteria getPostalCriteria() {
        return postalCriteria;
    }

    /**
     * Sets the value of the postalCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalRequest.PostalCriteria }
     *     
     */
    public void setPostalCriteria(PostalRequest.PostalCriteria value) {
        this.postalCriteria = value;
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
     *       &lt;choice>
     *         &lt;element name="zipcode" type="{}zipcode_criteria_type"/>
     *         &lt;element name="country" type="{}country_criteria_type"/>
     *         &lt;element name="province" type="{}states_criteria_type"/>
     *         &lt;element name="ip_addr" type="{}ip_criteria_type"/>
     *         &lt;element name="timezone" type="{}timezone_criteria_type"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "zipcode",
        "country",
        "province",
        "ipAddr",
        "timezone"
    })
    public static class PostalCriteria
        extends RMT2Base
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        protected ZipcodeCriteriaType zipcode;
        protected CountryCriteriaType country;
        protected StatesCriteriaType province;
        @XmlElement(name = "ip_addr")
        protected IpCriteriaType ipAddr;
        protected TimezoneCriteriaType timezone;

        /**
         * Gets the value of the zipcode property.
         * 
         * @return
         *     possible object is
         *     {@link ZipcodeCriteriaType }
         *     
         */
        public ZipcodeCriteriaType getZipcode() {
            return zipcode;
        }

        /**
         * Sets the value of the zipcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZipcodeCriteriaType }
         *     
         */
        public void setZipcode(ZipcodeCriteriaType value) {
            this.zipcode = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link CountryCriteriaType }
         *     
         */
        public CountryCriteriaType getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link CountryCriteriaType }
         *     
         */
        public void setCountry(CountryCriteriaType value) {
            this.country = value;
        }

        /**
         * Gets the value of the province property.
         * 
         * @return
         *     possible object is
         *     {@link StatesCriteriaType }
         *     
         */
        public StatesCriteriaType getProvince() {
            return province;
        }

        /**
         * Sets the value of the province property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatesCriteriaType }
         *     
         */
        public void setProvince(StatesCriteriaType value) {
            this.province = value;
        }

        /**
         * Gets the value of the ipAddr property.
         * 
         * @return
         *     possible object is
         *     {@link IpCriteriaType }
         *     
         */
        public IpCriteriaType getIpAddr() {
            return ipAddr;
        }

        /**
         * Sets the value of the ipAddr property.
         * 
         * @param value
         *     allowed object is
         *     {@link IpCriteriaType }
         *     
         */
        public void setIpAddr(IpCriteriaType value) {
            this.ipAddr = value;
        }

        /**
         * Gets the value of the timezone property.
         * 
         * @return
         *     possible object is
         *     {@link TimezoneCriteriaType }
         *     
         */
        public TimezoneCriteriaType getTimezone() {
            return timezone;
        }

        /**
         * Sets the value of the timezone property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimezoneCriteriaType }
         *     
         */
        public void setTimezone(TimezoneCriteriaType value) {
            this.timezone = value;
        }

    }

}
