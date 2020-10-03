//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.02 at 05:53:58 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.RMT2Base;


/**
 * Detail description of an audio or video asset.
 * 
 * <p>Java class for audio_video_project_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audio_video_project_info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="artist" type="{}audio_video_artist_info" minOccurs="0"/>
 *         &lt;element name="project_type" type="{}audio_video_artist_info"/>
 *         &lt;element name="genre" type="{}audio_video_genre_lookup" minOccurs="0"/>
 *         &lt;element name="media_type" type="{}audio_video_media_type_lookup" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="master_dup_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ripped" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="content_path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content_filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="art_work_path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="art_work_filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="media_content" type="{}mime_content_type" minOccurs="0"/>
 *         &lt;element name="date_created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="date_updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audio_video_project_info", propOrder = {
    "id",
    "artist",
    "projectType",
    "genre",
    "mediaType",
    "title",
    "year",
    "masterDupId",
    "ripped",
    "cost",
    "contentPath",
    "contentFilename",
    "artWorkPath",
    "artWorkFilename",
    "comments",
    "mediaContent",
    "dateCreated",
    "dateUpdated",
    "userId"
})
public class AudioVideoProjectInfo
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected BigInteger id;
    protected AudioVideoArtistInfo artist;
    @XmlElement(name = "project_type", required = true)
    protected AudioVideoArtistInfo projectType;
    protected AudioVideoGenreLookup genre;
    @XmlElement(name = "media_type")
    protected AudioVideoMediaTypeLookup mediaType;
    @XmlElement(required = true)
    protected String title;
    protected BigInteger year;
    @XmlElement(name = "master_dup_id")
    protected BigInteger masterDupId;
    protected BigInteger ripped;
    protected BigDecimal cost;
    @XmlElement(name = "content_path")
    protected String contentPath;
    @XmlElement(name = "content_filename")
    protected String contentFilename;
    @XmlElement(name = "art_work_path")
    protected String artWorkPath;
    @XmlElement(name = "art_work_filename")
    protected String artWorkFilename;
    protected String comments;
    @XmlElement(name = "media_content")
    protected MimeContentType mediaContent;
    @XmlElement(name = "date_created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlElement(name = "date_updated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateUpdated;
    @XmlElement(name = "user_id")
    protected String userId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the artist property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVideoArtistInfo }
     *     
     */
    public AudioVideoArtistInfo getArtist() {
        return artist;
    }

    /**
     * Sets the value of the artist property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVideoArtistInfo }
     *     
     */
    public void setArtist(AudioVideoArtistInfo value) {
        this.artist = value;
    }

    /**
     * Gets the value of the projectType property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVideoArtistInfo }
     *     
     */
    public AudioVideoArtistInfo getProjectType() {
        return projectType;
    }

    /**
     * Sets the value of the projectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVideoArtistInfo }
     *     
     */
    public void setProjectType(AudioVideoArtistInfo value) {
        this.projectType = value;
    }

    /**
     * Gets the value of the genre property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVideoGenreLookup }
     *     
     */
    public AudioVideoGenreLookup getGenre() {
        return genre;
    }

    /**
     * Sets the value of the genre property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVideoGenreLookup }
     *     
     */
    public void setGenre(AudioVideoGenreLookup value) {
        this.genre = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVideoMediaTypeLookup }
     *     
     */
    public AudioVideoMediaTypeLookup getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVideoMediaTypeLookup }
     *     
     */
    public void setMediaType(AudioVideoMediaTypeLookup value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYear(BigInteger value) {
        this.year = value;
    }

    /**
     * Gets the value of the masterDupId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMasterDupId() {
        return masterDupId;
    }

    /**
     * Sets the value of the masterDupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMasterDupId(BigInteger value) {
        this.masterDupId = value;
    }

    /**
     * Gets the value of the ripped property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRipped() {
        return ripped;
    }

    /**
     * Sets the value of the ripped property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRipped(BigInteger value) {
        this.ripped = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCost(BigDecimal value) {
        this.cost = value;
    }

    /**
     * Gets the value of the contentPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentPath() {
        return contentPath;
    }

    /**
     * Sets the value of the contentPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentPath(String value) {
        this.contentPath = value;
    }

    /**
     * Gets the value of the contentFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentFilename() {
        return contentFilename;
    }

    /**
     * Sets the value of the contentFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentFilename(String value) {
        this.contentFilename = value;
    }

    /**
     * Gets the value of the artWorkPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtWorkPath() {
        return artWorkPath;
    }

    /**
     * Sets the value of the artWorkPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtWorkPath(String value) {
        this.artWorkPath = value;
    }

    /**
     * Gets the value of the artWorkFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtWorkFilename() {
        return artWorkFilename;
    }

    /**
     * Sets the value of the artWorkFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtWorkFilename(String value) {
        this.artWorkFilename = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the mediaContent property.
     * 
     * @return
     *     possible object is
     *     {@link MimeContentType }
     *     
     */
    public MimeContentType getMediaContent() {
        return mediaContent;
    }

    /**
     * Sets the value of the mediaContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeContentType }
     *     
     */
    public void setMediaContent(MimeContentType value) {
        this.mediaContent = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the dateUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateUpdated() {
        return dateUpdated;
    }

    /**
     * Sets the value of the dateUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateUpdated(XMLGregorianCalendar value) {
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
