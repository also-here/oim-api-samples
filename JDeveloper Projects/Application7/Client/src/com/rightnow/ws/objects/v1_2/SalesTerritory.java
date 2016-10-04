
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.rightnow.ws.base.v1_2.NamedIDDeltaList;
import com.rightnow.ws.base.v1_2.NamedIDHierarchy;
import com.rightnow.ws.base.v1_2.NamedIDList;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.nullfields.v1_2.SalesTerritoryNullFields;


/**
 * <p>Java class for SalesTerritory complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SalesTerritory">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AdminVisibleInterfaces" type="{urn:base.ws.rightnow.com/v1_2}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Names" type="{urn:objects.ws.rightnow.com/v1_2}LabelRequiredList" minOccurs="0"/>
 *         &lt;element name="Parent" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="TerritoryHierarchy" type="{urn:base.ws.rightnow.com/v1_2}NamedIDList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}SalesTerritoryNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesTerritory", propOrder = {
         "adminVisibleInterfaces", "comment", "disabled", "displayOrder", "name", "names", "parent",
         "territoryHierarchy", "validNullFields"
    })
public class SalesTerritory extends RNObject {

    @XmlElement(name = "AdminVisibleInterfaces", nillable = true)
    protected NamedIDDeltaList adminVisibleInterfaces;
    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "Disabled")
    protected Boolean disabled;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Names")
    protected LabelRequiredList names;
    @XmlElement(name = "Parent", nillable = true)
    protected NamedIDHierarchy parent;
    @XmlElement(name = "TerritoryHierarchy", nillable = true)
    protected NamedIDList territoryHierarchy;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected SalesTerritoryNullFields validNullFields;

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
     * Gets the value of the territoryHierarchy property.
     *
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *
     */
    public NamedIDList getTerritoryHierarchy() {
        return territoryHierarchy;
    }

    /**
     * Sets the value of the territoryHierarchy property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *
     */
    public void setTerritoryHierarchy(NamedIDList value) {
        this.territoryHierarchy = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link SalesTerritoryNullFields }
     *
     */
    public SalesTerritoryNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link SalesTerritoryNullFields }
     *
     */
    public void setValidNullFields(SalesTerritoryNullFields value) {
        this.validNullFields = value;
    }

}
