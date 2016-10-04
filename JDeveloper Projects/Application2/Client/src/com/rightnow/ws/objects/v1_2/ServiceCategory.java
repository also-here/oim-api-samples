
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.NamedIDDeltaList;
import com.rightnow.ws.base.v1_2.NamedIDHierarchy;
import com.rightnow.ws.base.v1_2.NamedIDList;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.nullfields.v1_2.ServiceCategoryNullFields;


/**
 * <p>Java class for ServiceCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCategory">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AdminVisibleInterfaces" type="{urn:base.ws.rightnow.com/v1_2}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="CategoryHierarchy" type="{urn:base.ws.rightnow.com/v1_2}NamedIDList" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{urn:objects.ws.rightnow.com/v1_2}LabelList" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EndUserVisibleInterfaces" type="{urn:base.ws.rightnow.com/v1_2}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Names" type="{urn:objects.ws.rightnow.com/v1_2}LabelRequiredList" minOccurs="0"/>
 *         &lt;element name="Parent" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="ProductLinks" type="{urn:objects.ws.rightnow.com/v1_2}ServiceProductList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}ServiceCategoryNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCategory", propOrder = {
    "adminVisibleInterfaces",
    "categoryHierarchy",
    "descriptions",
    "displayOrder",
    "endUserVisibleInterfaces",
    "name",
    "names",
    "parent",
    "productLinks",
    "validNullFields"
})
public class ServiceCategory
    extends RNObject
{

    @XmlElement(name = "AdminVisibleInterfaces", nillable = true)
    protected NamedIDDeltaList adminVisibleInterfaces;
    @XmlElement(name = "CategoryHierarchy")
    protected NamedIDList categoryHierarchy;
    @XmlElement(name = "Descriptions", nillable = true)
    protected LabelList descriptions;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "EndUserVisibleInterfaces", nillable = true)
    protected NamedIDDeltaList endUserVisibleInterfaces;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Names")
    protected LabelRequiredList names;
    @XmlElement(name = "Parent", nillable = true)
    protected NamedIDHierarchy parent;
    @XmlElement(name = "ProductLinks", nillable = true)
    protected ServiceProductList productLinks;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected ServiceCategoryNullFields validNullFields;

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
     * Gets the value of the categoryHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *     
     */
    public NamedIDList getCategoryHierarchy() {
        return categoryHierarchy;
    }

    /**
     * Sets the value of the categoryHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *     
     */
    public void setCategoryHierarchy(NamedIDList value) {
        this.categoryHierarchy = value;
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
     * Gets the value of the endUserVisibleInterfaces property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDDeltaList }
     *     
     */
    public NamedIDDeltaList getEndUserVisibleInterfaces() {
        return endUserVisibleInterfaces;
    }

    /**
     * Sets the value of the endUserVisibleInterfaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDDeltaList }
     *     
     */
    public void setEndUserVisibleInterfaces(NamedIDDeltaList value) {
        this.endUserVisibleInterfaces = value;
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
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public NamedIDHierarchy getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public void setParent(NamedIDHierarchy value) {
        this.parent = value;
    }

    /**
     * Gets the value of the productLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProductList }
     *     
     */
    public ServiceProductList getProductLinks() {
        return productLinks;
    }

    /**
     * Sets the value of the productLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProductList }
     *     
     */
    public void setProductLinks(ServiceProductList value) {
        this.productLinks = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCategoryNullFields }
     *     
     */
    public ServiceCategoryNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCategoryNullFields }
     *     
     */
    public void setValidNullFields(ServiceCategoryNullFields value) {
        this.validNullFields = value;
    }

}
