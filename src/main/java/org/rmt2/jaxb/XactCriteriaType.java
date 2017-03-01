//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 12:13:36 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for xact_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xact_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xactId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="account_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_xact_amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="to_xact_amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="from_xact_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_xact_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xact_reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xact_reason_options" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xact_subtype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xact_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="business_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="confirm_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoice_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_item_amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="to_item_amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="from_rel_op_item_amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_rel_op_item_amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_rel_op_xact_amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_rel_op_xact_amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_rel_op_xact_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_rel_op_xact_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_created" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_updated" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xact_criteria_type", propOrder = {
    "xactId",
    "accountNo",
    "fromXactAmount",
    "toXactAmount",
    "fromXactDate",
    "toXactDate",
    "xactReason",
    "xactReasonOptions",
    "xactSubtype",
    "xactType",
    "businessName",
    "confirmNo",
    "invoiceNo",
    "fromItemAmount",
    "toItemAmount",
    "fromRelOpItemAmount",
    "toRelOpItemAmount",
    "fromRelOpXactAmount",
    "toRelOpXactAmount",
    "fromRelOpXactDate",
    "toRelOpXactDate",
    "dateCreated",
    "dateUpdated",
    "userId"
})
public class XactCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected BigInteger xactId;
    @XmlElement(name = "account_no", required = true)
    protected String accountNo;
    @XmlElement(name = "from_xact_amount", required = true)
    protected BigDecimal fromXactAmount;
    @XmlElement(name = "to_xact_amount", required = true)
    protected BigDecimal toXactAmount;
    @XmlElement(name = "from_xact_date", required = true)
    protected String fromXactDate;
    @XmlElement(name = "to_xact_date", required = true)
    protected String toXactDate;
    @XmlElement(name = "xact_reason", required = true)
    protected String xactReason;
    @XmlElement(name = "xact_reason_options", required = true)
    protected String xactReasonOptions;
    @XmlElement(name = "xact_subtype", required = true)
    protected String xactSubtype;
    @XmlElement(name = "xact_type", required = true)
    protected String xactType;
    @XmlElement(name = "business_name", required = true)
    protected String businessName;
    @XmlElement(name = "confirm_no", required = true)
    protected String confirmNo;
    @XmlElement(name = "invoice_no", required = true)
    protected String invoiceNo;
    @XmlElement(name = "from_item_amount", required = true)
    protected BigDecimal fromItemAmount;
    @XmlElement(name = "to_item_amount", required = true)
    protected BigDecimal toItemAmount;
    @XmlElement(name = "from_rel_op_item_amount", required = true)
    protected String fromRelOpItemAmount;
    @XmlElement(name = "to_rel_op_item_amount", required = true)
    protected String toRelOpItemAmount;
    @XmlElement(name = "from_rel_op_xact_amount", required = true)
    protected String fromRelOpXactAmount;
    @XmlElement(name = "to_rel_op_xact_amount", required = true)
    protected String toRelOpXactAmount;
    @XmlElement(name = "from_rel_op_xact_date", required = true)
    protected String fromRelOpXactDate;
    @XmlElement(name = "to_rel_op_xact_date", required = true)
    protected String toRelOpXactDate;
    @XmlElement(name = "date_created", required = true)
    protected String dateCreated;
    @XmlElement(name = "date_updated", required = true)
    protected String dateUpdated;
    @XmlElement(name = "user_id", required = true)
    protected String userId;

    /**
     * Gets the value of the xactId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXactId() {
        return xactId;
    }

    /**
     * Sets the value of the xactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXactId(BigInteger value) {
        this.xactId = value;
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
     * Gets the value of the fromXactAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFromXactAmount() {
        return fromXactAmount;
    }

    /**
     * Sets the value of the fromXactAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFromXactAmount(BigDecimal value) {
        this.fromXactAmount = value;
    }

    /**
     * Gets the value of the toXactAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToXactAmount() {
        return toXactAmount;
    }

    /**
     * Sets the value of the toXactAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToXactAmount(BigDecimal value) {
        this.toXactAmount = value;
    }

    /**
     * Gets the value of the fromXactDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromXactDate() {
        return fromXactDate;
    }

    /**
     * Sets the value of the fromXactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromXactDate(String value) {
        this.fromXactDate = value;
    }

    /**
     * Gets the value of the toXactDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToXactDate() {
        return toXactDate;
    }

    /**
     * Sets the value of the toXactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToXactDate(String value) {
        this.toXactDate = value;
    }

    /**
     * Gets the value of the xactReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXactReason() {
        return xactReason;
    }

    /**
     * Sets the value of the xactReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXactReason(String value) {
        this.xactReason = value;
    }

    /**
     * Gets the value of the xactReasonOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXactReasonOptions() {
        return xactReasonOptions;
    }

    /**
     * Sets the value of the xactReasonOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXactReasonOptions(String value) {
        this.xactReasonOptions = value;
    }

    /**
     * Gets the value of the xactSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXactSubtype() {
        return xactSubtype;
    }

    /**
     * Sets the value of the xactSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXactSubtype(String value) {
        this.xactSubtype = value;
    }

    /**
     * Gets the value of the xactType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXactType() {
        return xactType;
    }

    /**
     * Sets the value of the xactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXactType(String value) {
        this.xactType = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the confirmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmNo() {
        return confirmNo;
    }

    /**
     * Sets the value of the confirmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmNo(String value) {
        this.confirmNo = value;
    }

    /**
     * Gets the value of the invoiceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Sets the value of the invoiceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
    }

    /**
     * Gets the value of the fromItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFromItemAmount() {
        return fromItemAmount;
    }

    /**
     * Sets the value of the fromItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFromItemAmount(BigDecimal value) {
        this.fromItemAmount = value;
    }

    /**
     * Gets the value of the toItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToItemAmount() {
        return toItemAmount;
    }

    /**
     * Sets the value of the toItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToItemAmount(BigDecimal value) {
        this.toItemAmount = value;
    }

    /**
     * Gets the value of the fromRelOpItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromRelOpItemAmount() {
        return fromRelOpItemAmount;
    }

    /**
     * Sets the value of the fromRelOpItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromRelOpItemAmount(String value) {
        this.fromRelOpItemAmount = value;
    }

    /**
     * Gets the value of the toRelOpItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRelOpItemAmount() {
        return toRelOpItemAmount;
    }

    /**
     * Sets the value of the toRelOpItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRelOpItemAmount(String value) {
        this.toRelOpItemAmount = value;
    }

    /**
     * Gets the value of the fromRelOpXactAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromRelOpXactAmount() {
        return fromRelOpXactAmount;
    }

    /**
     * Sets the value of the fromRelOpXactAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromRelOpXactAmount(String value) {
        this.fromRelOpXactAmount = value;
    }

    /**
     * Gets the value of the toRelOpXactAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRelOpXactAmount() {
        return toRelOpXactAmount;
    }

    /**
     * Sets the value of the toRelOpXactAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRelOpXactAmount(String value) {
        this.toRelOpXactAmount = value;
    }

    /**
     * Gets the value of the fromRelOpXactDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromRelOpXactDate() {
        return fromRelOpXactDate;
    }

    /**
     * Sets the value of the fromRelOpXactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromRelOpXactDate(String value) {
        this.fromRelOpXactDate = value;
    }

    /**
     * Gets the value of the toRelOpXactDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRelOpXactDate() {
        return toRelOpXactDate;
    }

    /**
     * Sets the value of the toRelOpXactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRelOpXactDate(String value) {
        this.toRelOpXactDate = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCreated(String value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the dateUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateUpdated() {
        return dateUpdated;
    }

    /**
     * Sets the value of the dateUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateUpdated(String value) {
        this.dateUpdated = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
