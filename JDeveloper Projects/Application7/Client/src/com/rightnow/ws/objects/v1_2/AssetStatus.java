
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.RNObject;


/**
 * <p>Java class for AssetStatus complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AssetStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Names" type="{urn:objects.ws.rightnow.com/v1_2}LabelRequiredList" minOccurs="0"/>
 *         &lt;element name="StatusType" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetStatus", propOrder = { "displayOrder", "name", "names", "statusType" })
public class AssetStatus extends RNObject {

    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Names")
    protected LabelRequiredList names;
    @XmlElement(name = "StatusType")
    protected NamedID statusType;

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
     * Gets the value of the statusType property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getStatusType() {
        return statusType;
    }

    /**
     * Sets the value of the statusType property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setStatusType(NamedID value) {
        this.statusType = value;
    }

}
