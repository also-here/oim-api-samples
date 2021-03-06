
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.NamedIDHierarchy;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.nullfields.v1_2.VariableNullFields;


/**
 * <p>Java class for Variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Variable">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Folder" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="InterfaceValues" type="{urn:objects.ws.rightnow.com/v1_2}InterfaceValueList" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchIndexable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}VariableNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variable", propOrder = {
    "displayOrder",
    "folder",
    "interfaceValues",
    "name",
    "searchIndexable",
    "validNullFields"
})
public class Variable
    extends RNObject
{

    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "Folder", nillable = true)
    protected NamedIDHierarchy folder;
    @XmlElement(name = "InterfaceValues", nillable = true)
    protected InterfaceValueList interfaceValues;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SearchIndexable")
    protected Boolean searchIndexable;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected VariableNullFields validNullFields;

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
     * Gets the value of the interfaceValues property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceValueList }
     *     
     */
    public InterfaceValueList getInterfaceValues() {
        return interfaceValues;
    }

    /**
     * Sets the value of the interfaceValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceValueList }
     *     
     */
    public void setInterfaceValues(InterfaceValueList value) {
        this.interfaceValues = value;
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
     * Gets the value of the searchIndexable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchIndexable() {
        return searchIndexable;
    }

    /**
     * Sets the value of the searchIndexable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchIndexable(Boolean value) {
        this.searchIndexable = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link VariableNullFields }
     *     
     */
    public VariableNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableNullFields }
     *     
     */
    public void setValidNullFields(VariableNullFields value) {
        this.validNullFields = value;
    }

}
