//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.20 at 03:51:44 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.RMT2Base;


/**
 * <p>Java class for xact_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xact_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xact_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="xact_type" type="{}xacttype_type"/>
 *         &lt;element name="xact_subtype_id" type="{}xacttype_type" minOccurs="0"/>
 *         &lt;element name="customer" type="{}customer_type" minOccurs="0"/>
 *         &lt;element name="creditor" type="{}creditor_type" minOccurs="0"/>
 *         &lt;element name="xact_amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="xact_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="xact_reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirm_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="document_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="invoice_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="item_total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="items" type="{}xact_item_type" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "xact_type", propOrder = {
    "xactId",
    "xactType",
    "xactSubtypeId",
    "customer",
    "creditor",
    "xactAmount",
    "xactDate",
    "xactReason",
    "accountNo",
    "confirmNo",
    "documentId",
    "invoiceNo",
    "itemTotal",
    "items",
    "tracking"
})
public class XactType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "xact_id", required = true)
    protected BigInteger xactId;
    @XmlElement(name = "xact_type", required = true)
    protected XacttypeType xactType;
    @XmlElement(name = "xact_subtype_id")
    protected XacttypeType xactSubtypeId;
    protected CustomerType customer;
    protected CreditorType creditor;
    @XmlElement(name = "xact_amount", required = true)
    protected BigDecimal xactAmount;
    @XmlElement(name = "xact_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xactDate;
    @XmlElement(name = "xact_reason")
    protected String xactReason;
    @XmlElement(name = "account_no")
    protected String accountNo;
    @XmlElement(name = "confirm_no")
    protected String confirmNo;
    @XmlElement(name = "document_id")
    protected BigInteger documentId;
    @XmlElement(name = "invoice_no")
    protected String invoiceNo;
    @XmlElement(name = "item_total")
    protected BigDecimal itemTotal;
    protected List<XactItemType> items;
    protected RecordTrackingType tracking;

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
     * Gets the value of the xactType property.
     * 
     * @return
     *     possible object is
     *     {@link XacttypeType }
     *     
     */
    public XacttypeType getXactType() {
        return xactType;
    }

    /**
     * Sets the value of the xactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XacttypeType }
     *     
     */
    public void setXactType(XacttypeType value) {
        this.xactType = value;
    }

    /**
     * Gets the value of the xactSubtypeId property.
     * 
     * @return
     *     possible object is
     *     {@link XacttypeType }
     *     
     */
    public XacttypeType getXactSubtypeId() {
        return xactSubtypeId;
    }

    /**
     * Sets the value of the xactSubtypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link XacttypeType }
     *     
     */
    public void setXactSubtypeId(XacttypeType value) {
        this.xactSubtypeId = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomer(CustomerType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the creditor property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorType }
     *     
     */
    public CreditorType getCreditor() {
        return creditor;
    }

    /**
     * Sets the value of the creditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorType }
     *     
     */
    public void setCreditor(CreditorType value) {
        this.creditor = value;
    }

    /**
     * Gets the value of the xactAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXactAmount() {
        return xactAmount;
    }

    /**
     * Sets the value of the xactAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXactAmount(BigDecimal value) {
        this.xactAmount = value;
    }

    /**
     * Gets the value of the xactDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXactDate() {
        return xactDate;
    }

    /**
     * Sets the value of the xactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXactDate(XMLGregorianCalendar value) {
        this.xactDate = value;
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
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentId(BigInteger value) {
        this.documentId = value;
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
     * Gets the value of the itemTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemTotal() {
        return itemTotal;
    }

    /**
     * Sets the value of the itemTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemTotal(BigDecimal value) {
        this.itemTotal = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XactItemType }
     * 
     * 
     */
    public List<XactItemType> getItems() {
        if (items == null) {
            items = new ArrayList<XactItemType>();
        }
        return this.items;
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
