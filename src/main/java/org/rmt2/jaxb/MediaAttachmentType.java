//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.12 at 06:42:23 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for media_attachment_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="media_attachment_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachment" type="{}media_attachment_details_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "media_attachment_type", propOrder = {
    "attachment"
})
public class MediaAttachmentType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected MediaAttachmentDetailsType attachment;

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAttachmentDetailsType }
     *     
     */
    public MediaAttachmentDetailsType getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAttachmentDetailsType }
     *     
     */
    public void setAttachment(MediaAttachmentDetailsType value) {
        this.attachment = value;
    }

}
