//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.31 at 12:43:08 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for gl_account_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gl_account_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="acct_type" type="{}gl_accounttype_type"/>
 *         &lt;element name="acct_catg" type="{}gl_accountcatg_type"/>
 *         &lt;element name="acct_seq" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="account_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="account_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="account_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="account_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="balance_type" type="{}gl_balancetype_type" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="tracking" type="{}record_tracking_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gl_account_type", propOrder = {
    "acctId",
    "acctType",
    "acctCatg",
    "acctSeq",
    "accountNo",
    "accountName",
    "accountCode",
    "accountDescription",
    "balanceType",
    "active",
    "tracking"
})
public class GlAccountType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "acct_id")
    protected BigInteger acctId;
    @XmlElement(name = "acct_type", required = true)
    protected GlAccounttypeType acctType;
    @XmlElement(name = "acct_catg", required = true)
    protected GlAccountcatgType acctCatg;
    @XmlElement(name = "acct_seq")
    protected BigInteger acctSeq;
    @XmlElement(name = "account_no", required = true)
    protected String accountNo;
    @XmlElement(name = "account_name", required = true)
    protected String accountName;
    @XmlElement(name = "account_code", required = true)
    protected String accountCode;
    @XmlElement(name = "account_description", required = true)
    protected String accountDescription;
    @XmlElement(name = "balance_type")
    protected GlBalancetypeType balanceType;
    protected BigInteger active;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcctId(BigInteger value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link GlAccounttypeType }
     *     
     */
    public GlAccounttypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlAccounttypeType }
     *     
     */
    public void setAcctType(GlAccounttypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the acctCatg property.
     * 
     * @return
     *     possible object is
     *     {@link GlAccountcatgType }
     *     
     */
    public GlAccountcatgType getAcctCatg() {
        return acctCatg;
    }

    /**
     * Sets the value of the acctCatg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlAccountcatgType }
     *     
     */
    public void setAcctCatg(GlAccountcatgType value) {
        this.acctCatg = value;
    }

    /**
     * Gets the value of the acctSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcctSeq() {
        return acctSeq;
    }

    /**
     * Sets the value of the acctSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcctSeq(BigInteger value) {
        this.acctSeq = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the accountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountDescription() {
        return accountDescription;
    }

    /**
     * Sets the value of the accountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountDescription(String value) {
        this.accountDescription = value;
    }

    /**
     * Gets the value of the balanceType property.
     * 
     * @return
     *     possible object is
     *     {@link GlBalancetypeType }
     *     
     */
    public GlBalancetypeType getBalanceType() {
        return balanceType;
    }

    /**
     * Sets the value of the balanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlBalancetypeType }
     *     
     */
    public void setBalanceType(GlBalancetypeType value) {
        this.balanceType = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActive(BigInteger value) {
        this.active = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTrackingType }
     *     
     */
    public RecordTrackingType getTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTrackingType }
     *     
     */
    public void setTracking(RecordTrackingType value) {
        this.tracking = value;
    }

}
