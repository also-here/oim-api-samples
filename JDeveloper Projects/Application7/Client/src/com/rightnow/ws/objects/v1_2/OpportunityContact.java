
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.nullfields.v1_2.OpportunityContactNullFields;


/**
 * <p>Java class for OpportunityContact complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OpportunityContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ContactRole" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}OpportunityContactNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityContact", propOrder = { "contact", "contactRole", "validNullFields" })
@XmlSeeAlso({ OpportunityContactDelta.class })
public class OpportunityContact {

    @XmlElement(name = "Contact")
    protected NamedID contact;
    @XmlElement(name = "ContactRole", nillable = true)
    protected NamedID contactRole;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected OpportunityContactNullFields validNullFields;

    /**
     * Gets the value of the contact property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setContact(NamedID value) {
        this.contact = value;
    }

    /**
     * Gets the value of the contactRole property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getContactRole() {
        return contactRole;
    }

    /**
     * Sets the value of the contactRole property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setContactRole(NamedID value) {
        this.contactRole = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link OpportunityContactNullFields }
     *
     */
    public OpportunityContactNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link OpportunityContactNullFields }
     *
     */
    public void setValidNullFields(OpportunityContactNullFields value) {
        this.validNullFields = value;
    }

}
