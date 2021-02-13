//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.12 at 06:30:03 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for profile_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profile_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="application_info" type="{}application_type" minOccurs="0"/>
 *         &lt;element name="role_info" type="{}role_type" minOccurs="0"/>
 *         &lt;element name="app_role_info" type="{}app_role_type" minOccurs="0"/>
 *         &lt;element name="user_group_info" type="{}user_group_type" minOccurs="0"/>
 *         &lt;element name="user_app_role_info" type="{}user_app_role_type" minOccurs="0"/>
 *         &lt;element name="user_info" type="{}user_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resources" type="{}resource_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="application_access_info" type="{}application_access_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profile_type", propOrder = {
    "applicationInfo",
    "roleInfo",
    "appRoleInfo",
    "userGroupInfo",
    "userAppRoleInfo",
    "userInfo",
    "resources",
    "applicationAccessInfo"
})
public class ProfileType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "application_info")
    protected ApplicationType applicationInfo;
    @XmlElement(name = "role_info")
    protected RoleType roleInfo;
    @XmlElement(name = "app_role_info")
    protected AppRoleType appRoleInfo;
    @XmlElement(name = "user_group_info")
    protected UserGroupType userGroupInfo;
    @XmlElement(name = "user_app_role_info")
    protected UserAppRoleType userAppRoleInfo;
    @XmlElement(name = "user_info")
    protected List<UserType> userInfo;
    protected List<ResourceType> resources;
    @XmlElement(name = "application_access_info")
    protected List<ApplicationAccessType> applicationAccessInfo;

    /**
     * Gets the value of the applicationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getApplicationInfo() {
        return applicationInfo;
    }

    /**
     * Sets the value of the applicationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setApplicationInfo(ApplicationType value) {
        this.applicationInfo = value;
    }

    /**
     * Gets the value of the roleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RoleType }
     *     
     */
    public RoleType getRoleInfo() {
        return roleInfo;
    }

    /**
     * Sets the value of the roleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleType }
     *     
     */
    public void setRoleInfo(RoleType value) {
        this.roleInfo = value;
    }

    /**
     * Gets the value of the appRoleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AppRoleType }
     *     
     */
    public AppRoleType getAppRoleInfo() {
        return appRoleInfo;
    }

    /**
     * Sets the value of the appRoleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppRoleType }
     *     
     */
    public void setAppRoleInfo(AppRoleType value) {
        this.appRoleInfo = value;
    }

    /**
     * Gets the value of the userGroupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserGroupType }
     *     
     */
    public UserGroupType getUserGroupInfo() {
        return userGroupInfo;
    }

    /**
     * Sets the value of the userGroupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGroupType }
     *     
     */
    public void setUserGroupInfo(UserGroupType value) {
        this.userGroupInfo = value;
    }

    /**
     * Gets the value of the userAppRoleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserAppRoleType }
     *     
     */
    public UserAppRoleType getUserAppRoleInfo() {
        return userAppRoleInfo;
    }

    /**
     * Sets the value of the userAppRoleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAppRoleType }
     *     
     */
    public void setUserAppRoleInfo(UserAppRoleType value) {
        this.userAppRoleInfo = value;
    }

    /**
     * Gets the value of the userInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserType }
     * 
     * 
     */
    public List<UserType> getUserInfo() {
        if (userInfo == null) {
            userInfo = new ArrayList<UserType>();
        }
        return this.userInfo;
    }

    /**
     * Gets the value of the resources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceType }
     * 
     * 
     */
    public List<ResourceType> getResources() {
        if (resources == null) {
            resources = new ArrayList<ResourceType>();
        }
        return this.resources;
    }

    /**
     * Gets the value of the applicationAccessInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationAccessInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationAccessInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationAccessType }
     * 
     * 
     */
    public List<ApplicationAccessType> getApplicationAccessInfo() {
        if (applicationAccessInfo == null) {
            applicationAccessInfo = new ArrayList<ApplicationAccessType>();
        }
        return this.applicationAccessInfo;
    }

}