
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.nullfields.v1_2.PurchasedProductNullFields;


/**
 * <p>Java class for PurchasedProduct complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PurchasedProduct">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Campaign" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="FinalizedByAccount" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="LicenseEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LicenseStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Mailing" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Opportunity" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Price" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="PurchaseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SalesProduct" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}PurchasedProductNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchasedProduct", propOrder = {
         "campaign", "comment", "contact", "customFields", "finalizedByAccount", "licenseEndTime", "licenseStartTime",
         "mailing", "opportunity", "organization", "price", "purchaseTime", "salesProduct", "serialNumber",
         "validNullFields"
    })
public class PurchasedProduct extends RNObject {

    @XmlElement(name = "Campaign", nillable = true)
    protected NamedID campaign;
    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "Contact", nillable = true)
    protected NamedID contact;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "FinalizedByAccount", nillable = true)
    protected NamedID finalizedByAccount;
    @XmlElement(name = "LicenseEndTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar licenseEndTime;
    @XmlElement(name = "LicenseStartTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar licenseStartTime;
    @XmlElement(name = "Mailing", nillable = true)
    protected NamedID mailing;
    @XmlElement(name = "Opportunity", nillable = true)
    protected NamedID opportunity;
    @XmlElement(name = "Organization", nillable = true)
    protected NamedID organization;
    @XmlElement(name = "Price", nillable = true)
    protected MonetaryValue price;
    @XmlElement(name = "PurchaseTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar purchaseTime;
    @XmlElement(name = "SalesProduct", nillable = true)
    protected NamedID salesProduct;
    @XmlElement(name = "SerialNumber", nillable = true)
    protected String serialNumber;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected PurchasedProductNullFields validNullFields;

    /**
     * Gets the value of the campaign property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setCampaign(NamedID value) {
        this.campaign = value;
    }

    /**
     * Gets the value of the comment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComment(String value) {
        this.comment = value;
    }

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
     * Gets the value of the customFields property.
     *
     * @return
     *     possible object is
     *     {@link GenericObject }
     *
     */
    public GenericObject getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     *
     * @param value
     *     allowed object is
     *     {@link GenericObject }
     *
     */
    public void setCustomFields(GenericObject value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the finalizedByAccount property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getFinalizedByAccount() {
        return finalizedByAccount;
    }

    /**
     * Sets the value of the finalizedByAccount property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setFinalizedByAccount(NamedID value) {
        this.finalizedByAccount = value;
    }

    /**
     * Gets the value of the licenseEndTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLicenseEndTime() {
        return licenseEndTime;
    }

    /**
     * Sets the value of the licenseEndTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setLicenseEndTime(XMLGregorianCalendar value) {
        this.licenseEndTime = value;
    }

    /**
     * Gets the value of the licenseStartTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLicenseStartTime() {
        return licenseStartTime;
    }

    /**
     * Sets the value of the licenseStartTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setLicenseStartTime(XMLGregorianCalendar value) {
        this.licenseStartTime = value;
    }

    /**
     * Gets the value of the mailing property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getMailing() {
        return mailing;
    }

    /**
     * Sets the value of the mailing property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setMailing(NamedID value) {
        this.mailing = value;
    }

    /**
     * Gets the value of the opportunity property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getOpportunity() {
        return opportunity;
    }

    /**
     * Sets the value of the opportunity property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setOpportunity(NamedID value) {
        this.opportunity = value;
    }

    /**
     * Gets the value of the organization property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setOrganization(NamedID value) {
        this.organization = value;
    }

    /**
     * Gets the value of the price property.
     *
     * @return
     *     possible object is
     *     {@link MonetaryValue }
     *
     */
    public MonetaryValue getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryValue }
     *
     */
    public void setPrice(MonetaryValue value) {
        this.price = value;
    }

    /**
     * Gets the value of the purchaseTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * Sets the value of the purchaseTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setPurchaseTime(XMLGregorianCalendar value) {
        this.purchaseTime = value;
    }

    /**
     * Gets the value of the salesProduct property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getSalesProduct() {
        return salesProduct;
    }

    /**
     * Sets the value of the salesProduct property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setSalesProduct(NamedID value) {
        this.salesProduct = value;
    }

    /**
     * Gets the value of the serialNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link PurchasedProductNullFields }
     *
     */
    public PurchasedProductNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link PurchasedProductNullFields }
     *
     */
    public void setValidNullFields(PurchasedProductNullFields value) {
        this.validNullFields = value;
    }

}
