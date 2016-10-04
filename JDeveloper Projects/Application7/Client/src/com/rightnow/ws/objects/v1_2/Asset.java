
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
import com.rightnow.ws.nullfields.v1_2.AssetNullFields;


/**
 * <p>Java class for Asset complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Asset">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstalledDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Price" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="PurchasedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RetiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SLAInstances" type="{urn:objects.ws.rightnow.com/v1_2}AssetSLAInstanceList" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_2}AssetStatuses" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}AssetNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset", propOrder = {
         "contact", "customFields", "description", "installedDate", "name", "organization", "price", "product",
         "purchasedDate", "retiredDate", "serialNumber", "slaInstances", "statusWithType", "validNullFields"
    })
public class Asset extends RNObject {

    @XmlElement(name = "Contact", nillable = true)
    protected NamedID contact;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "InstalledDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar installedDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Organization", nillable = true)
    protected NamedID organization;
    @XmlElement(name = "Price", nillable = true)
    protected MonetaryValue price;
    @XmlElement(name = "Product", nillable = true)
    protected NamedID product;
    @XmlElement(name = "PurchasedDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purchasedDate;
    @XmlElement(name = "RetiredDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retiredDate;
    @XmlElement(name = "SerialNumber", nillable = true)
    protected String serialNumber;
    @XmlElement(name = "SLAInstances", nillable = true)
    protected AssetSLAInstanceList slaInstances;
    @XmlElement(name = "StatusWithType", nillable = true)
    protected AssetStatuses statusWithType;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected AssetNullFields validNullFields;

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
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the installedDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getInstalledDate() {
        return installedDate;
    }

    /**
     * Sets the value of the installedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setInstalledDate(XMLGregorianCalendar value) {
        this.installedDate = value;
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
     * Gets the value of the product property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setProduct(NamedID value) {
        this.product = value;
    }

    /**
     * Gets the value of the purchasedDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPurchasedDate() {
        return purchasedDate;
    }

    /**
     * Sets the value of the purchasedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setPurchasedDate(XMLGregorianCalendar value) {
        this.purchasedDate = value;
    }

    /**
     * Gets the value of the retiredDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getRetiredDate() {
        return retiredDate;
    }

    /**
     * Sets the value of the retiredDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setRetiredDate(XMLGregorianCalendar value) {
        this.retiredDate = value;
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
     * Gets the value of the slaInstances property.
     *
     * @return
     *     possible object is
     *     {@link AssetSLAInstanceList }
     *
     */
    public AssetSLAInstanceList getSLAInstances() {
        return slaInstances;
    }

    /**
     * Sets the value of the slaInstances property.
     *
     * @param value
     *     allowed object is
     *     {@link AssetSLAInstanceList }
     *
     */
    public void setSLAInstances(AssetSLAInstanceList value) {
        this.slaInstances = value;
    }

    /**
     * Gets the value of the statusWithType property.
     *
     * @return
     *     possible object is
     *     {@link AssetStatuses }
     *
     */
    public AssetStatuses getStatusWithType() {
        return statusWithType;
    }

    /**
     * Sets the value of the statusWithType property.
     *
     * @param value
     *     allowed object is
     *     {@link AssetStatuses }
     *
     */
    public void setStatusWithType(AssetStatuses value) {
        this.statusWithType = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link AssetNullFields }
     *
     */
    public AssetNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link AssetNullFields }
     *
     */
    public void setValidNullFields(AssetNullFields value) {
        this.validNullFields = value;
    }

}
