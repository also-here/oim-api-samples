
package com.rightnow.ws.nullfields.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssignedSLAInstanceNullFields complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AssignedSLAInstanceNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="NameOfSLA" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignedSLAInstanceNullFields")
public class AssignedSLAInstanceNullFields {

    @XmlAttribute(name = "NameOfSLA")
    protected Boolean nameOfSLA;

    /**
     * Gets the value of the nameOfSLA property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isNameOfSLA() {
        if (nameOfSLA == null) {
            return false;
        } else {
            return nameOfSLA;
        }
    }

    /**
     * Sets the value of the nameOfSLA property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setNameOfSLA(Boolean value) {
        this.nameOfSLA = value;
    }

}
