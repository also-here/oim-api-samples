
package com.rightnow.ws.nullfields.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailboxOutgoingEmailSettingsNullFields complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MailboxOutgoingEmailSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FriendlyFromAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FromAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ReplyToAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxOutgoingEmailSettingsNullFields")
public class MailboxOutgoingEmailSettingsNullFields {

    @XmlAttribute(name = "DisplayName")
    protected Boolean displayName;
    @XmlAttribute(name = "FriendlyFromAddress")
    protected Boolean friendlyFromAddress;
    @XmlAttribute(name = "FromAddress")
    protected Boolean fromAddress;
    @XmlAttribute(name = "IsEnabled")
    protected Boolean isEnabled;
    @XmlAttribute(name = "ReplyToAddress")
    protected Boolean replyToAddress;

    /**
     * Gets the value of the displayName property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isDisplayName() {
        if (displayName == null) {
            return false;
        } else {
            return displayName;
        }
    }

    /**
     * Sets the value of the displayName property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDisplayName(Boolean value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the friendlyFromAddress property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isFriendlyFromAddress() {
        if (friendlyFromAddress == null) {
            return false;
        } else {
            return friendlyFromAddress;
        }
    }

    /**
     * Sets the value of the friendlyFromAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setFriendlyFromAddress(Boolean value) {
        this.friendlyFromAddress = value;
    }

    /**
     * Gets the value of the fromAddress property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isFromAddress() {
        if (fromAddress == null) {
            return false;
        } else {
            return fromAddress;
        }
    }

    /**
     * Sets the value of the fromAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setFromAddress(Boolean value) {
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
    public boolean isIsEnabled() {
        if (isEnabled == null) {
            return false;
        } else {
            return isEnabled;
        }
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
     *     {@link Boolean }
     *
     */
    public boolean isReplyToAddress() {
        if (replyToAddress == null) {
            return false;
        } else {
            return replyToAddress;
        }
    }

    /**
     * Sets the value of the replyToAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setReplyToAddress(Boolean value) {
        this.replyToAddress = value;
    }

}
