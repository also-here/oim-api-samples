
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.nullfields.v1_2.TaskMarketingSettingsNullFields;


/**
 * <p>Java class for TaskMarketingSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskMarketingSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Campaign" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Document" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Mailing" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Survey" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}TaskMarketingSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskMarketingSettings", propOrder = {
    "campaign",
    "document",
    "mailing",
    "survey",
    "validNullFields"
})
public class TaskMarketingSettings {

    @XmlElement(name = "Campaign", nillable = true)
    protected NamedID campaign;
    @XmlElement(name = "Document", nillable = true)
    protected NamedID document;
    @XmlElement(name = "Mailing", nillable = true)
    protected NamedID mailing;
    @XmlElement(name = "Survey", nillable = true)
    protected NamedID survey;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected TaskMarketingSettingsNullFields validNullFields;

    /**
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setCampaign(NamedID value) {
        this.campaign = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setDocument(NamedID value) {
        this.document = value;
    }

    /**
     * Gets the value of the mailing property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getMailing() {
        return mailing;
    }

    /**
     * Sets the value of the mailing property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setMailing(NamedID value) {
        this.mailing = value;
    }

    /**
     * Gets the value of the survey property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getSurvey() {
        return survey;
    }

    /**
     * Sets the value of the survey property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setSurvey(NamedID value) {
        this.survey = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link TaskMarketingSettingsNullFields }
     *     
     */
    public TaskMarketingSettingsNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskMarketingSettingsNullFields }
     *     
     */
    public void setValidNullFields(TaskMarketingSettingsNullFields value) {
        this.validNullFields = value;
    }

}
