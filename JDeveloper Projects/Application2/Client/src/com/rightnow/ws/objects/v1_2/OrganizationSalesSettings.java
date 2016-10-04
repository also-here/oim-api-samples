
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.nullfields.v1_2.OrganizationSalesSettingsNullFields;


/**
 * <p>Java class for OrganizationSalesSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationSalesSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcquiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SalesAccount" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="TotalRevenue" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}OrganizationSalesSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationSalesSettings", propOrder = {
    "acquiredDate",
    "salesAccount",
    "totalRevenue",
    "validNullFields"
})
public class OrganizationSalesSettings {

    @XmlElement(name = "AcquiredDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acquiredDate;
    @XmlElement(name = "SalesAccount", nillable = true)
    protected NamedID salesAccount;
    @XmlElement(name = "TotalRevenue", nillable = true)
    protected MonetaryValue totalRevenue;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected OrganizationSalesSettingsNullFields validNullFields;

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
     * Gets the value of the totalRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryValue }
     *     
     */
    public MonetaryValue getTotalRevenue() {
        return totalRevenue;
    }

    /**
     * Sets the value of the totalRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryValue }
     *     
     */
    public void setTotalRevenue(MonetaryValue value) {
        this.totalRevenue = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationSalesSettingsNullFields }
     *     
     */
    public OrganizationSalesSettingsNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationSalesSettingsNullFields }
     *     
     */
    public void setValidNullFields(OrganizationSalesSettingsNullFields value) {
        this.validNullFields = value;
    }

}
