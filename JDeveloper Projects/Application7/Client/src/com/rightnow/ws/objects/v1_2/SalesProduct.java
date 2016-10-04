
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.rightnow.ws.base.v1_2.NamedIDDeltaList;
import com.rightnow.ws.base.v1_2.NamedIDHierarchy;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.nullfields.v1_2.SalesProductNullFields;


/**
 * <p>Java class for SalesProduct complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SalesProduct">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AcceptCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdminVisibleInterfaces" type="{urn:base.ws.rightnow.com/v1_2}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{urn:objects.ws.rightnow.com/v1_2}SalesProductOptions" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{urn:objects.ws.rightnow.com/v1_2}LabelList" minOccurs="0"/>
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExcludeFromOfferAdvisor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Folder" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Names" type="{urn:objects.ws.rightnow.com/v1_2}LabelRequiredList" minOccurs="0"/>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RespondCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Schedules" type="{urn:objects.ws.rightnow.com/v1_2}SalesProductScheduleList" minOccurs="0"/>
 *         &lt;element name="ServiceProduct" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}SalesProductNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesProduct", propOrder = {
         "acceptCount", "adminVisibleInterfaces", "attributes", "customFields", "descriptions", "disabled",
         "displayOrder", "excludeFromOfferAdvisor", "folder", "name", "names", "partNumber", "respondCount",
         "schedules", "serviceProduct", "validNullFields"
    })
public class SalesProduct extends RNObject {

    @XmlElement(name = "AcceptCount")
    protected Long acceptCount;
    @XmlElement(name = "AdminVisibleInterfaces", nillable = true)
    protected NamedIDDeltaList adminVisibleInterfaces;
    @XmlElement(name = "Attributes")
    protected SalesProductOptions attributes;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "Descriptions", nillable = true)
    protected LabelList descriptions;
    @XmlElement(name = "Disabled")
    protected Boolean disabled;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "ExcludeFromOfferAdvisor")
    protected Boolean excludeFromOfferAdvisor;
    @XmlElement(name = "Folder", nillable = true)
    protected NamedIDHierarchy folder;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Names")
    protected LabelRequiredList names;
    @XmlElement(name = "PartNumber", nillable = true)
    protected String partNumber;
    @XmlElement(name = "RespondCount")
    protected Integer respondCount;
    @XmlElement(name = "Schedules", nillable = true)
    protected SalesProductScheduleList schedules;
    @XmlElement(name = "ServiceProduct", nillable = true)
    protected NamedIDHierarchy serviceProduct;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected SalesProductNullFields validNullFields;

    /**
     * Gets the value of the acceptCount property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getAcceptCount() {
        return acceptCount;
    }

    /**
     * Sets the value of the acceptCount property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setAcceptCount(Long value) {
        this.acceptCount = value;
    }

    /**
     * Gets the value of the adminVisibleInterfaces property.
     *
     * @return
     *     possible object is
     *     {@link NamedIDDeltaList }
     *
     */
    public NamedIDDeltaList getAdminVisibleInterfaces() {
        return adminVisibleInterfaces;
    }

    /**
     * Sets the value of the adminVisibleInterfaces property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedIDDeltaList }
     *
     */
    public void setAdminVisibleInterfaces(NamedIDDeltaList value) {
        this.adminVisibleInterfaces = value;
    }

    /**
     * Gets the value of the attributes property.
     *
     * @return
     *     possible object is
     *     {@link SalesProductOptions }
     *
     */
    public SalesProductOptions getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     *
     * @param value
     *     allowed object is
     *     {@link SalesProductOptions }
     *
     */
    public void setAttributes(SalesProductOptions value) {
        this.attributes = value;
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
     * Gets the value of the descriptions property.
     *
     * @return
     *     possible object is
     *     {@link LabelList }
     *
     */
    public LabelList getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     *
     * @param value
     *     allowed object is
     *     {@link LabelList }
     *
     */
    public void setDescriptions(LabelList value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the disabled property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the displayOrder property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the excludeFromOfferAdvisor property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isExcludeFromOfferAdvisor() {
        return excludeFromOfferAdvisor;
    }

    /**
     * Sets the value of the excludeFromOfferAdvisor property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setExcludeFromOfferAdvisor(Boolean value) {
        this.excludeFromOfferAdvisor = value;
    }

    /**
     * Gets the value of the folder property.
     *
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *
     */
    public NamedIDHierarchy getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *
     */
    public void setFolder(NamedIDHierarchy value) {
        this.folder = value;
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
     * Gets the value of the names property.
     *
     * @return
     *     possible object is
     *     {@link LabelRequiredList }
     *
     */
    public LabelRequiredList getNames() {
        return names;
    }

    /**
     * Sets the value of the names property.
     *
     * @param value
     *     allowed object is
     *     {@link LabelRequiredList }
     *
     */
    public void setNames(LabelRequiredList value) {
        this.names = value;
    }

    /**
     * Gets the value of the partNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the respondCount property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getRespondCount() {
        return respondCount;
    }

    /**
     * Sets the value of the respondCount property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setRespondCount(Integer value) {
        this.respondCount = value;
    }

    /**
     * Gets the value of the schedules property.
     *
     * @return
     *     possible object is
     *     {@link SalesProductScheduleList }
     *
     */
    public SalesProductScheduleList getSchedules() {
        return schedules;
    }

    /**
     * Sets the value of the schedules property.
     *
     * @param value
     *     allowed object is
     *     {@link SalesProductScheduleList }
     *
     */
    public void setSchedules(SalesProductScheduleList value) {
        this.schedules = value;
    }

    /**
     * Gets the value of the serviceProduct property.
     *
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *
     */
    public NamedIDHierarchy getServiceProduct() {
        return serviceProduct;
    }

    /**
     * Sets the value of the serviceProduct property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *
     */
    public void setServiceProduct(NamedIDHierarchy value) {
        this.serviceProduct = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link SalesProductNullFields }
     *
     */
    public SalesProductNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link SalesProductNullFields }
     *
     */
    public void setValidNullFields(SalesProductNullFields value) {
        this.validNullFields = value;
    }

}
