
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.rightnow.ws.nullfields.v1_2.MailboxOutgoingEmailSettingsNullFields;


/**
 * <p>Java class for MailboxOutgoingEmailSettings complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MailboxOutgoingEmailSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FriendlyFromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReplyToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}MailboxOutgoingEmailSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxOutgoingEmailSettings", propOrder = {
         "displayName", "friendlyFromAddress", "fromAddress", "isEnabled", "replyToAddress", "validNullFields"
    })
public class MailboxOutgoingEmailSettings {

    @XmlElement(name = "DisplayName", nillable = true)
    protected String displayName;
    @XmlElement(name = "FriendlyFromAddress", nillable = true)
    protected String friendlyFromAddress;
    @XmlElement(name = "FromAddress", nillable = true)
    protected String fromAddress;
    @XmlElement(name = "IsEnabled", nillable = true)
    protected Boolean isEnabled;
    @XmlElement(name = "ReplyToAddress", nillable = true)
    protected String replyToAddress;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected MailboxOutgoingEmailSettingsNullFields validNullFields;

    /**
     * Gets the value of the displayName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the friendlyFromAddress property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFriendlyFromAddress() {
        return friendlyFromAddress;
    }

    /**
     * Sets the value of the friendlyFromAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFriendlyFromAddress(String value) {
        this.friendlyFromAddress = value;
    }

    /**
     * Gets the value of the fromAddress property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * Sets the value of the fromAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFromAddress(String value) {
        this.fromAddress = value;
    }

    /**
     * Gets the value of the isEnabled property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Sets the value of the isEnabled property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }

    /**
     * Gets the value of the replyToAddress property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReplyToAddress() {
        return replyToAddress;
    }

    /**
     * Sets the value of the replyToAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReplyToAddress(String value) {
        this.replyToAddress = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link MailboxOutgoingEmailSettingsNullFields }
     *
     */
    public MailboxOutgoingEmailSettingsNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link MailboxOutgoingEmailSettingsNullFields }
     *
     */
    public void setValidNullFields(MailboxOutgoingEmailSettingsNullFields value) {
        this.validNullFields = value;
    }

}
