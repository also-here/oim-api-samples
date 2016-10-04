
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.nullfields.v1_2.ContactSalesSettingsNullFields;


/**
 * <p>Java class for ContactSalesSettings complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ContactSalesSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcquiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SalesAccount" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}ContactSalesSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactSalesSettings", propOrder = { "acquiredDate", "salesAccount", "validNullFields" })
public class ContactSalesSettings {

    @XmlElement(name = "AcquiredDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acquiredDate;
    @XmlElement(name = "SalesAccount", nillable = true)
    protected NamedID salesAccount;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected ContactSalesSettingsNullFields validNullFields;

    /**
     * Gets the value of the acquiredDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getAcquiredDate() {
        return acquiredDate;
    }

    /**
     * Sets the value of the acquiredDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setAcquiredDate(XMLGregorianCalendar value) {
        this.acquiredDate = value;
    }

    /**
     * Gets the value of the salesAccount property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getSalesAccount() {
        return salesAccount;
    }

    /**
     * Sets the value of the salesAccount property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setSalesAccount(NamedID value) {
        this.salesAccount = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link ContactSalesSettingsNullFields }
     *
     */
    public ContactSalesSettingsNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link ContactSalesSettingsNullFields }
     *
     */
    public void setValidNullFields(ContactSalesSettingsNullFields value) {
        this.validNullFields = value;
    }

}
