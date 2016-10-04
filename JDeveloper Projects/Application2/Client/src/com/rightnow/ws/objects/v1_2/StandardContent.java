
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.NamedIDDeltaList;
import com.rightnow.ws.base.v1_2.NamedIDHierarchy;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.nullfields.v1_2.StandardContentNullFields;


/**
 * <p>Java class for StandardContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardContent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AdminVisibleInterfaces" type="{urn:base.ws.rightnow.com/v1_2}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{urn:objects.ws.rightnow.com/v1_2}StandardContentAttributes" minOccurs="0"/>
 *         &lt;element name="ContentValues" type="{urn:objects.ws.rightnow.com/v1_2}StandardContentContentValueList" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Folder" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="HotKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usage" type="{urn:objects.ws.rightnow.com/v1_2}StandardContentUsage" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}StandardContentNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardContent", propOrder = {
    "adminVisibleInterfaces",
    "attributes",
    "contentValues",
    "displayOrder",
    "folder",
    "hotKey",
    "name",
    "usage",
    "validNullFields"
})
public class StandardContent
    extends RNObject
{

    @XmlElement(name = "AdminVisibleInterfaces", nillable = true)
    protected NamedIDDeltaList adminVisibleInterfaces;
    @XmlElement(name = "Attributes")
    protected StandardContentAttributes attributes;
    @XmlElement(name = "ContentValues", nillable = true)
    protected StandardContentContentValueList contentValues;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "Folder", nillable = true)
    protected NamedIDHierarchy folder;
    @XmlElement(name = "HotKey", nillable = true)
    protected String hotKey;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Usage")
    protected StandardContentUsage usage;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected StandardContentNullFields validNullFields;

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
     *     {@link StandardContentAttributes }
     *     
     */
    public StandardContentAttributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardContentAttributes }
     *     
     */
    public void setAttributes(StandardContentAttributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the contentValues property.
     * 
     * @return
     *     possible object is
     *     {@link StandardContentContentValueList }
     *     
     */
    public StandardContentContentValueList getContentValues() {
        return contentValues;
    }

    /**
     * Sets the value of the contentValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardContentContentValueList }
     *     
     */
    public void setContentValues(StandardContentContentValueList value) {
        this.contentValues = value;
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
     * Gets the value of the hotKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotKey() {
        return hotKey;
    }

    /**
     * Sets the value of the hotKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotKey(String value) {
        this.hotKey = value;
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
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link StandardContentUsage }
     *     
     */
    public StandardContentUsage getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardContentUsage }
     *     
     */
    public void setUsage(StandardContentUsage value) {
        this.usage = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link StandardContentNullFields }
     *     
     */
    public StandardContentNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardContentNullFields }
     *     
     */
    public void setValidNullFields(StandardContentNullFields value) {
        this.validNullFields = value;
    }

}
