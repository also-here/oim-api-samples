
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.nullfields.v1_2.TaskSalesSettingsNullFields;


/**
 * <p>Java class for TaskSalesSettings complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TaskSalesSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Opportunity" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}TaskSalesSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskSalesSettings", propOrder = { "opportunity", "validNullFields" })
public class TaskSalesSettings {

    @XmlElement(name = "Opportunity", nillable = true)
    protected NamedID opportunity;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected TaskSalesSettingsNullFields validNullFields;

    /**
     * Gets the value of the opportunity property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getOpportunity() {
        return opportunity;
    }

    /**
     * Sets the value of the opportunity property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setOpportunity(NamedID value) {
        this.opportunity = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link TaskSalesSettingsNullFields }
     *
     */
    public TaskSalesSettingsNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link TaskSalesSettingsNullFields }
     *
     */
    public void setValidNullFields(TaskSalesSettingsNullFields value) {
        this.validNullFields = value;
    }

}
