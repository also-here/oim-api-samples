
package com.rightnow.ws.nullfields.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetNullFields complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AssetNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Contact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="InstalledDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Organization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Product" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PurchasedDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RetiredDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SLAInstances" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="StatusWithType" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetNullFields")
public class AssetNullFields {

    @XmlAttribute(name = "Contact")
    protected Boolean contact;
    @XmlAttribute(name = "Description")
    protected Boolean description;
    @XmlAttribute(name = "InstalledDate")
    protected Boolean installedDate;
    @XmlAttribute(name = "Organization")
    protected Boolean organization;
    @XmlAttribute(name = "Price")
    protected Boolean price;
    @XmlAttribute(name = "Product")
    protected Boolean product;
    @XmlAttribute(name = "PurchasedDate")
    protected Boolean purchasedDate;
    @XmlAttribute(name = "RetiredDate")
    protected Boolean retiredDate;
    @XmlAttribute(name = "SerialNumber")
    protected Boolean serialNumber;
    @XmlAttribute(name = "SLAInstances")
    protected Boolean slaInstances;
    @XmlAttribute(name = "StatusWithType")
    protected Boolean statusWithType;

    /**
     * Gets the value of the contact property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isContact() {
        if (contact == null) {
            return false;
        } else {
            return contact;
        }
    }

    /**
     * Sets the value of the contact property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setContact(Boolean value) {
        this.contact = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isDescription() {
        if (description == null) {
            return false;
        } else {
            return description;
        }
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Gets the value of the installedDate property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isInstalledDate() {
        if (installedDate == null) {
            return false;
        } else {
            return installedDate;
        }
    }

    /**
     * Sets the value of the installedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setInstalledDate(Boolean value) {
        this.installedDate = value;
    }

    /**
     * Gets the value of the organization property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isOrganization() {
        if (organization == null) {
            return false;
        } else {
            return organization;
        }
    }

    /**
     * Sets the value of the organization property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setOrganization(Boolean value) {
        this.organization = value;
    }

    /**
     * Gets the value of the price property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isPrice() {
        if (price == null) {
            return false;
        } else {
            return price;
        }
    }

    /**
     * Sets the value of the price property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setPrice(Boolean value) {
        this.price = value;
    }

    /**
     * Gets the value of the product property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isProduct() {
        if (product == null) {
            return false;
        } else {
            return product;
        }
    }

    /**
     * Sets the value of the product property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setProduct(Boolean value) {
        this.product = value;
    }

    /**
     * Gets the value of the purchasedDate property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isPurchasedDate() {
        if (purchasedDate == null) {
            return false;
        } else {
            return purchasedDate;
        }
    }

    /**
     * Sets the value of the purchasedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setPurchasedDate(Boolean value) {
        this.purchasedDate = value;
    }

    /**
     * Gets the value of the retiredDate property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isRetiredDate() {
        if (retiredDate == null) {
            return false;
        } else {
            return retiredDate;
        }
    }

    /**
     * Sets the value of the retiredDate property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setRetiredDate(Boolean value) {
        this.retiredDate = value;
    }

    /**
     * Gets the value of the serialNumber property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isSerialNumber() {
        if (serialNumber == null) {
            return false;
        } else {
            return serialNumber;
        }
    }

    /**
     * Sets the value of the serialNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setSerialNumber(Boolean value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the slaInstances property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isSLAInstances() {
        if (slaInstances == null) {
            return false;
        } else {
            return slaInstances;
        }
    }

    /**
     * Sets the value of the slaInstances property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setSLAInstances(Boolean value) {
        this.slaInstances = value;
    }

    /**
     * Gets the value of the statusWithType property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isStatusWithType() {
        if (statusWithType == null) {
            return false;
        } else {
            return statusWithType;
        }
    }

    /**
     * Sets the value of the statusWithType property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setStatusWithType(Boolean value) {
        this.statusWithType = value;
    }

}
