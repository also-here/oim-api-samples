
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.rightnow.ws.nullfields.v1_2.OrganizationServiceSettingsNullFields;


/**
 * <p>Java class for OrganizationServiceSettings complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OrganizationServiceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SLAInstances" type="{urn:objects.ws.rightnow.com/v1_2}SLAInstanceList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}OrganizationServiceSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationServiceSettings", propOrder = { "slaInstances", "validNullFields" })
public class OrganizationServiceSettings {

    @XmlElement(name = "SLAInstances", nillable = true)
    protected SLAInstanceList slaInstances;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected OrganizationServiceSettingsNullFields validNullFields;

    /**
     * Gets the value of the slaInstances property.
     *
     * @return
     *     possible object is
     *     {@link SLAInstanceList }
     *
     */
    public SLAInstanceList getSLAInstances() {
        return slaInstances;
    }

    /**
     * Sets the value of the slaInstances property.
     *
     * @param value
     *     allowed object is
     *     {@link SLAInstanceList }
     *
     */
    public void setSLAInstances(SLAInstanceList value) {
        this.slaInstances = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link OrganizationServiceSettingsNullFields }
     *
     */
    public OrganizationServiceSettingsNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link OrganizationServiceSettingsNullFields }
     *
     */
    public void setValidNullFields(OrganizationServiceSettingsNullFields value) {
        this.validNullFields = value;
    }

}
