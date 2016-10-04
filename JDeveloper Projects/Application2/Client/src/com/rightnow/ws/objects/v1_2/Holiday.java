
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_2.NamedIDDeltaList;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.nullfields.v1_2.HolidayNullFields;


/**
 * <p>Java class for Holiday complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Holiday">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AdminVisibleInterfaces" type="{urn:base.ws.rightnow.com/v1_2}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HolidayDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}HolidayNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Holiday", propOrder = {
    "adminVisibleInterfaces",
    "displayOrder",
    "holidayDate",
    "name",
    "validNullFields"
})
public class Holiday
    extends RNObject
{

    @XmlElement(name = "AdminVisibleInterfaces", nillable = true)
    protected NamedIDDeltaList adminVisibleInterfaces;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "HolidayDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar holidayDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected HolidayNullFields validNullFields;

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
     * Gets the value of the holidayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHolidayDate() {
        return holidayDate;
    }

    /**
     * Sets the value of the holidayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHolidayDate(XMLGregorianCalendar value) {
        this.holidayDate = value;
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
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link HolidayNullFields }
     *     
     */
    public HolidayNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link HolidayNullFields }
     *     
     */
    public void setValidNullFields(HolidayNullFields value) {
        this.validNullFields = value;
    }

}
