
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.rightnow.ws.base.v1_2.ActionEnum;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.nullfields.v1_2.ChannelUsernameNullFields;


/**
 * <p>Java class for ChannelUsername complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ChannelUsername">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Channel" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ChannelType" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="UserNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}ChannelUsernameNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{urn:base.ws.rightnow.com/v1_2}ActionEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelUsername", propOrder = {
         "channel", "channelType", "userNumber", "username", "validNullFields" })
public class ChannelUsername {

    @XmlElement(name = "Channel")
    protected NamedID channel;
    @XmlElement(name = "ChannelType")
    protected NamedID channelType;
    @XmlElement(name = "UserNumber", nillable = true)
    protected String userNumber;
    @XmlElement(name = "Username", nillable = true)
    protected String username;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected ChannelUsernameNullFields validNullFields;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

    /**
     * Gets the value of the channel property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setChannel(NamedID value) {
        this.channel = value;
    }

    /**
     * Gets the value of the channelType property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setChannelType(NamedID value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the userNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserNumber() {
        return userNumber;
    }

    /**
     * Sets the value of the userNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserNumber(String value) {
        this.userNumber = value;
    }

    /**
     * Gets the value of the username property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link ChannelUsernameNullFields }
     *
     */
    public ChannelUsernameNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link ChannelUsernameNullFields }
     *
     */
    public void setValidNullFields(ChannelUsernameNullFields value) {
        this.validNullFields = value;
    }

    /**
     * Gets the value of the action property.
     *
     * @return
     *     possible object is
     *     {@link ActionEnum }
     *
     */
    public ActionEnum getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value
     *     allowed object is
     *     {@link ActionEnum }
     *
     */
    public void setAction(ActionEnum value) {
        this.action = value;
    }

}
