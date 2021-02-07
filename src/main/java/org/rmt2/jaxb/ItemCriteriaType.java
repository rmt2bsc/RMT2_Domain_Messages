//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.06 at 09:23:36 PM CST 
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
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for item_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="item_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="items" type="{}simple_item_list_type" minOccurs="0"/>
 *         &lt;element name="item_type" type="{}inventory_itemtype_type"/>
 *         &lt;element name="vendor" type="{}creditor_type"/>
 *         &lt;element name="item_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vendor_item_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="item_serial_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qty_on_hand" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="unit_cost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="markup" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="status" type="{}inventory_item_status_type" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "item_criteria_type", propOrder = {
    "itemId",
    "items",
    "itemType",
    "vendor",
    "itemName",
    "vendorItemNo",
    "itemSerialNo",
    "qtyOnHand",
    "unitCost",
    "markup",
    "active",
    "status",
    "tracking"
})
public class ItemCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "item_id", required = true)
    protected BigInteger itemId;
    protected SimpleItemListType items;
    @XmlElement(name = "item_type", required = true)
    protected InventoryItemtypeType itemType;
    @XmlElement(required = true)
    protected CreditorType vendor;
    @XmlElement(name = "item_name", required = true)
    protected String itemName;
    @XmlElement(name = "vendor_item_no", required = true)
    protected String vendorItemNo;
    @XmlElement(name = "item_serial_no", required = true)
    protected String itemSerialNo;
    @XmlElement(name = "qty_on_hand", required = true)
    protected BigInteger qtyOnHand;
    @XmlElement(name = "unit_cost", required = true)
    protected BigDecimal unitCost;
    @XmlElement(required = true)
    protected BigDecimal markup;
    protected BigInteger active;
    protected List<InventoryItemStatusType> status;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemId(BigInteger value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleItemListType }
     *     
     */
    public SimpleItemListType getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleItemListType }
     *     
     */
    public void setItems(SimpleItemListType value) {
        this.items = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryItemtypeType }
     *     
     */
    public InventoryItemtypeType getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryItemtypeType }
     *     
     */
    public void setItemType(InventoryItemtypeType value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorType }
     *     
     */
    public CreditorType getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorType }
     *     
     */
    public void setVendor(CreditorType value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the vendorItemNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorItemNo() {
        return vendorItemNo;
    }

    /**
     * Sets the value of the vendorItemNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorItemNo(String value) {
        this.vendorItemNo = value;
    }

    /**
     * Gets the value of the itemSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSerialNo() {
        return itemSerialNo;
    }

    /**
     * Sets the value of the itemSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSerialNo(String value) {
        this.itemSerialNo = value;
    }

    /**
     * Gets the value of the qtyOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtyOnHand() {
        return qtyOnHand;
    }

    /**
     * Sets the value of the qtyOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtyOnHand(BigInteger value) {
        this.qtyOnHand = value;
    }

    /**
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitCost(BigDecimal value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkup() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarkup(BigDecimal value) {
        this.markup = value;
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
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryItemStatusType }
     * 
     * 
     */
    public List<InventoryItemStatusType> getStatus() {
        if (status == null) {
            status = new ArrayList<InventoryItemStatusType>();
        }
        return this.status;
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
