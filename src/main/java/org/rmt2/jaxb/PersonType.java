//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.30 at 07:37:17 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for person_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="person_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mid_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maiden_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="generation" type="{}generation_type"/>
 *         &lt;element name="short_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{}code_detail_type"/>
 *         &lt;element name="gender" type="{}code_detail_type"/>
 *         &lt;element name="marital_status" type="{}code_detail_type"/>
 *         &lt;element name="race" type="{}code_detail_type"/>
 *         &lt;element name="category" type="{}code_detail_type"/>
 *         &lt;element name="birth_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{}address_type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person_type", propOrder = {
    "personId",
    "firstName",
    "midName",
    "lastName",
    "maidenName",
    "generation",
    "shortName",
    "title",
    "gender",
    "maritalStatus",
    "race",
    "category",
    "birthDate",
    "ssn",
    "email",
    "address"
})
public class PersonType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "person_id", required = true, defaultValue = "0")
    protected BigInteger personId;
    @XmlElement(name = "first_name", required = true)
    protected String firstName;
    @XmlElement(name = "mid_name", required = true)
    protected String midName;
    @XmlElement(name = "last_name", required = true)
    protected String lastName;
    @XmlElement(name = "maiden_name", required = true)
    protected String maidenName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GenerationType generation;
    @XmlElement(name = "short_name", required = true)
    protected String shortName;
    @XmlElement(required = true)
    protected CodeDetailType title;
    @XmlElement(required = true)
    protected CodeDetailType gender;
    @XmlElement(name = "marital_status", required = true)
    protected CodeDetailType maritalStatus;
    @XmlElement(required = true)
    protected CodeDetailType race;
    @XmlElement(required = true)
    protected CodeDetailType category;
    @XmlElement(name = "birth_date", required = true)
    protected String birthDate;
    @XmlElement(required = true)
    protected String ssn;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected AddressType address;

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonId(BigInteger value) {
        this.personId = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the midName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidName() {
        return midName;
    }

    /**
     * Sets the value of the midName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidName(String value) {
        this.midName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the maidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaidenName() {
        return maidenName;
    }

    /**
     * Sets the value of the maidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaidenName(String value) {
        this.maidenName = value;
    }

    /**
     * Gets the value of the generation property.
     * 
     * @return
     *     possible object is
     *     {@link GenerationType }
     *     
     */
    public GenerationType getGeneration() {
        return generation;
    }

    /**
     * Sets the value of the generation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerationType }
     *     
     */
    public void setGeneration(GenerationType value) {
        this.generation = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDetailType }
     *     
     */
    public CodeDetailType getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDetailType }
     *     
     */
    public void setTitle(CodeDetailType value) {
        this.title = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDetailType }
     *     
     */
    public CodeDetailType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDetailType }
     *     
     */
    public void setGender(CodeDetailType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDetailType }
     *     
     */
    public CodeDetailType getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDetailType }
     *     
     */
    public void setMaritalStatus(CodeDetailType value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDetailType }
     *     
     */
    public CodeDetailType getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDetailType }
     *     
     */
    public void setRace(CodeDetailType value) {
        this.race = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDetailType }
     *     
     */
    public CodeDetailType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDetailType }
     *     
     */
    public void setCategory(CodeDetailType value) {
        this.category = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

}
