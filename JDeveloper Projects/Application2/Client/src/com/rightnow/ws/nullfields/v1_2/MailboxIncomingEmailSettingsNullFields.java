
package com.rightnow.ws.nullfields.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailboxIncomingEmailSettingsNullFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailboxIncomingEmailSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ForceReplyBetweenLines" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ForwardRejectMessageAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxIncomingEmailSettingsNullFields")
public class MailboxIncomingEmailSettingsNullFields {

    @XmlAttribute(name = "ForceReplyBetweenLines")
    protected Boolean forceReplyBetweenLines;
    @XmlAttribute(name = "ForwardRejectMessageAddress")
    protected Boolean forwardRejectMessageAddress;
    @XmlAttribute(name = "IsEnabled")
    protected Boolean isEnabled;

    /**
     * Gets the value of the forceReplyBetweenLines property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForceReplyBetweenLines() {
        if (forceReplyBetweenLines == null) {
            return false;
        } else {
            return forceReplyBetweenLines;
        }
    }

    /**
     * Sets the value of the forceReplyBetweenLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceReplyBetweenLines(Boolean value) {
        this.forceReplyBetweenLines = value;
    }

    /**
     * Gets the value of the forwardRejectMessageAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForwardRejectMessageAddress() {
        if (forwardRejectMessageAddress == null) {
            return false;
        } else {
            return forwardRejectMessageAddress;
        }
    }

    /**
     * Sets the value of the forwardRejectMessageAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForwardRejectMessageAddress(Boolean value) {
        this.forwardRejectMessageAddress = value;
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

}
