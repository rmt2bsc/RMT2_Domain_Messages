//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.31 at 11:09:48 AM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * This is the document that manages the user's session data.
 * 
 * <p>Java class for user_session_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user_session_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ws_token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="session_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="auth_session_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="access_level" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="gateway_interface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remote_host" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remote_addr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remote_app_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="server_protocol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="server_software" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="server_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="server_port" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="user_agent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accept" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accept_lang" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accept_encoding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scheme" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="server_info" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="servlet_context" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="session_create" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="session_last_accessed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="session_max" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="orig_app_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roles" type="{}app_role_type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user_session_type", propOrder = {
    "loginId",
    "wsToken",
    "sessionId",
    "authSessionId",
    "fname",
    "lname",
    "accessLevel",
    "gatewayInterface",
    "remoteHost",
    "remoteAddr",
    "remoteAppName",
    "serverProtocol",
    "serverSoftware",
    "serverName",
    "serverPort",
    "userAgent",
    "local",
    "accept",
    "acceptLang",
    "acceptEncoding",
    "scheme",
    "serverInfo",
    "servletContext",
    "sessionCreate",
    "sessionLastAccessed",
    "sessionMax",
    "origAppId",
    "groupId",
    "roles"
})
public class UserSessionType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "login_id", required = true, defaultValue = "0")
    protected String loginId;
    @XmlElement(name = "ws_token")
    protected String wsToken;
    @XmlElement(name = "session_id", required = true)
    protected String sessionId;
    @XmlElement(name = "auth_session_id")
    protected String authSessionId;
    @XmlElement(required = true)
    protected String fname;
    @XmlElement(required = true)
    protected String lname;
    @XmlElement(name = "access_level")
    protected BigInteger accessLevel;
    @XmlElement(name = "gateway_interface")
    protected String gatewayInterface;
    @XmlElement(name = "remote_host", required = true)
    protected String remoteHost;
    @XmlElement(name = "remote_addr", required = true)
    protected String remoteAddr;
    @XmlElement(name = "remote_app_name")
    protected String remoteAppName;
    @XmlElement(name = "server_protocol", required = true)
    protected String serverProtocol;
    @XmlElement(name = "server_software", required = true)
    protected String serverSoftware;
    @XmlElement(name = "server_name", required = true)
    protected String serverName;
    @XmlElement(name = "server_port", required = true)
    protected BigInteger serverPort;
    @XmlElement(name = "user_agent", required = true)
    protected String userAgent;
    @XmlElement(required = true)
    protected String local;
    @XmlElement(required = true)
    protected String accept;
    @XmlElement(name = "accept_lang", required = true)
    protected String acceptLang;
    @XmlElement(name = "accept_encoding", required = true)
    protected String acceptEncoding;
    @XmlElement(required = true)
    protected String scheme;
    @XmlElement(name = "server_info", required = true)
    protected String serverInfo;
    @XmlElement(name = "servlet_context", required = true)
    protected String servletContext;
    @XmlElement(name = "session_create")
    protected long sessionCreate;
    @XmlElement(name = "session_last_accessed")
    protected long sessionLastAccessed;
    @XmlElement(name = "session_max", required = true)
    protected BigInteger sessionMax;
    @XmlElement(name = "orig_app_id", required = true)
    protected String origAppId;
    @XmlElement(name = "group_id", required = true)
    protected String groupId;
    @XmlElement(required = true)
    protected List<AppRoleType> roles;

    /**
     * Gets the value of the loginId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * Sets the value of the loginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginId(String value) {
        this.loginId = value;
    }

    /**
     * Gets the value of the wsToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsToken() {
        return wsToken;
    }

    /**
     * Sets the value of the wsToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsToken(String value) {
        this.wsToken = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the authSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSessionId() {
        return authSessionId;
    }

    /**
     * Sets the value of the authSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSessionId(String value) {
        this.authSessionId = value;
    }

    /**
     * Gets the value of the fname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFname() {
        return fname;
    }

    /**
     * Sets the value of the fname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFname(String value) {
        this.fname = value;
    }

    /**
     * Gets the value of the lname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLname() {
        return lname;
    }

    /**
     * Sets the value of the lname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLname(String value) {
        this.lname = value;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccessLevel(BigInteger value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the gatewayInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayInterface() {
        return gatewayInterface;
    }

    /**
     * Sets the value of the gatewayInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayInterface(String value) {
        this.gatewayInterface = value;
    }

    /**
     * Gets the value of the remoteHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteHost() {
        return remoteHost;
    }

    /**
     * Sets the value of the remoteHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteHost(String value) {
        this.remoteHost = value;
    }

    /**
     * Gets the value of the remoteAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteAddr() {
        return remoteAddr;
    }

    /**
     * Sets the value of the remoteAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteAddr(String value) {
        this.remoteAddr = value;
    }

    /**
     * Gets the value of the remoteAppName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteAppName() {
        return remoteAppName;
    }

    /**
     * Sets the value of the remoteAppName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteAppName(String value) {
        this.remoteAppName = value;
    }

    /**
     * Gets the value of the serverProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerProtocol() {
        return serverProtocol;
    }

    /**
     * Sets the value of the serverProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerProtocol(String value) {
        this.serverProtocol = value;
    }

    /**
     * Gets the value of the serverSoftware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerSoftware() {
        return serverSoftware;
    }

    /**
     * Sets the value of the serverSoftware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerSoftware(String value) {
        this.serverSoftware = value;
    }

    /**
     * Gets the value of the serverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Sets the value of the serverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

    /**
     * Gets the value of the serverPort property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServerPort() {
        return serverPort;
    }

    /**
     * Sets the value of the serverPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServerPort(BigInteger value) {
        this.serverPort = value;
    }

    /**
     * Gets the value of the userAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the value of the userAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
    }

    /**
     * Gets the value of the local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocal(String value) {
        this.local = value;
    }

    /**
     * Gets the value of the accept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccept() {
        return accept;
    }

    /**
     * Sets the value of the accept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccept(String value) {
        this.accept = value;
    }

    /**
     * Gets the value of the acceptLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptLang() {
        return acceptLang;
    }

    /**
     * Sets the value of the acceptLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptLang(String value) {
        this.acceptLang = value;
    }

    /**
     * Gets the value of the acceptEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptEncoding() {
        return acceptEncoding;
    }

    /**
     * Sets the value of the acceptEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptEncoding(String value) {
        this.acceptEncoding = value;
    }

    /**
     * Gets the value of the scheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * Sets the value of the scheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheme(String value) {
        this.scheme = value;
    }

    /**
     * Gets the value of the serverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerInfo() {
        return serverInfo;
    }

    /**
     * Sets the value of the serverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerInfo(String value) {
        this.serverInfo = value;
    }

    /**
     * Gets the value of the servletContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServletContext() {
        return servletContext;
    }

    /**
     * Sets the value of the servletContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServletContext(String value) {
        this.servletContext = value;
    }

    /**
     * Gets the value of the sessionCreate property.
     * 
     */
    public long getSessionCreate() {
        return sessionCreate;
    }

    /**
     * Sets the value of the sessionCreate property.
     * 
     */
    public void setSessionCreate(long value) {
        this.sessionCreate = value;
    }

    /**
     * Gets the value of the sessionLastAccessed property.
     * 
     */
    public long getSessionLastAccessed() {
        return sessionLastAccessed;
    }

    /**
     * Sets the value of the sessionLastAccessed property.
     * 
     */
    public void setSessionLastAccessed(long value) {
        this.sessionLastAccessed = value;
    }

    /**
     * Gets the value of the sessionMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSessionMax() {
        return sessionMax;
    }

    /**
     * Sets the value of the sessionMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSessionMax(BigInteger value) {
        this.sessionMax = value;
    }

    /**
     * Gets the value of the origAppId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigAppId() {
        return origAppId;
    }

    /**
     * Sets the value of the origAppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigAppId(String value) {
        this.origAppId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppRoleType }
     * 
     * 
     */
    public List<AppRoleType> getRoles() {
        if (roles == null) {
            roles = new ArrayList<AppRoleType>();
        }
        return this.roles;
    }

}
