
package com.rightnow.ws.nullfields.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HolidayNullFields complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="HolidayNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AdminVisibleInterfaces" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HolidayNullFields")
public class HolidayNullFields {

    @XmlAttribute(name = "AdminVisibleInterfaces")
    protected Boolean adminVisibleInterfaces;

    /**
     * Gets the value of the adminVisibleInterfaces property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isAdminVisibleInterfaces() {
        if (adminVisibleInterfaces == null) {
            return false;
        } else {
            return adminVisibleInterfaces;
        }
    }

    /**
     * Sets the value of the adminVisibleInterfaces property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setAdminVisibleInterfaces(Boolean value) {
        this.adminVisibleInterfaces = value;
    }

}
