
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.nullfields.v1_2.MailboxIncomingEmailSettingsNullFields;


/**
 * <p>Java class for MailboxIncomingEmailSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailboxIncomingEmailSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ForceReplyBetweenLines" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ForwardRejectMessageAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}MailboxIncomingEmailSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxIncomingEmailSettings", propOrder = {
    "forceReplyBetweenLines",
    "forwardRejectMessageAddress",
    "isEnabled",
    "validNullFields"
})
public class MailboxIncomingEmailSettings {

    @XmlElement(name = "ForceReplyBetweenLines", nillable = true)
    protected Boolean forceReplyBetweenLines;
    @XmlElement(name = "ForwardRejectMessageAddress", nillable = true)
    protected String forwardRejectMessageAddress;
    @XmlElement(name = "IsEnabled", nillable = true)
    protected Boolean isEnabled;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected MailboxIncomingEmailSettingsNullFields validNullFields;

    /**
     * Gets the value of the forceReplyBetweenLines property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceReplyBetweenLines() {
        return forceReplyBetweenLines;
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
     *     {@link String }
     *     
     */
    public String getForwardRejectMessageAddress() {
        return forwardRejectMessageAddress;
    }

    /**
     * Sets the value of the forwardRejectMessageAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardRejectMessageAddress(String value) {
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
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link MailboxIncomingEmailSettingsNullFields }
     *     
     */
    public MailboxIncomingEmailSettingsNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxIncomingEmailSettingsNullFields }
     *     
     */
    public void setValidNullFields(MailboxIncomingEmailSettingsNullFields value) {
        this.validNullFields = value;
    }

}
