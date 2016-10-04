
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.nullfields.v1_2.MailboxNullFields;


/**
 * <p>Java class for Mailbox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mailbox">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="IncomingEmailSettings" type="{urn:objects.ws.rightnow.com/v1_2}MailboxIncomingEmailSettings" minOccurs="0"/>
 *         &lt;element name="Interface" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutgoingEmailSettings" type="{urn:objects.ws.rightnow.com/v1_2}MailboxOutgoingEmailSettings" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}MailboxNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mailbox", propOrder = {
    "incomingEmailSettings",
    "_interface",
    "isDefault",
    "name",
    "outgoingEmailSettings",
    "type",
    "validNullFields"
})
@XmlSeeAlso({
    MarketingMailbox.class,
    ServiceMailbox.class
})
public class Mailbox
    extends RNObject
{

    @XmlElement(name = "IncomingEmailSettings", nillable = true)
    protected MailboxIncomingEmailSettings incomingEmailSettings;
    @XmlElement(name = "Interface", nillable = true)
    protected NamedID _interface;
    @XmlElement(name = "IsDefault", nillable = true)
    protected Boolean isDefault;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "OutgoingEmailSettings", nillable = true)
    protected MailboxOutgoingEmailSettings outgoingEmailSettings;
    @XmlElement(name = "Type", nillable = true)
    protected NamedID type;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected MailboxNullFields validNullFields;

    /**
     * Gets the value of the incomingEmailSettings property.
     * 
     * @return
     *     possible object is
     *     {@link MailboxIncomingEmailSettings }
     *     
     */
    public MailboxIncomingEmailSettings getIncomingEmailSettings() {
        return incomingEmailSettings;
    }

    /**
     * Sets the value of the incomingEmailSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxIncomingEmailSettings }
     *     
     */
    public void setIncomingEmailSettings(MailboxIncomingEmailSettings value) {
        this.incomingEmailSettings = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setInterface(NamedID value) {
        this._interface = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the outgoingEmailSettings property.
     * 
     * @return
     *     possible object is
     *     {@link MailboxOutgoingEmailSettings }
     *     
     */
    public MailboxOutgoingEmailSettings getOutgoingEmailSettings() {
        return outgoingEmailSettings;
    }

    /**
     * Sets the value of the outgoingEmailSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxOutgoingEmailSettings }
     *     
     */
    public void setOutgoingEmailSettings(MailboxOutgoingEmailSettings value) {
        this.outgoingEmailSettings = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setType(NamedID value) {
        this.type = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link MailboxNullFields }
     *     
     */
    public MailboxNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxNullFields }
     *     
     */
    public void setValidNullFields(MailboxNullFields value) {
        this.validNullFields = value;
    }

}
