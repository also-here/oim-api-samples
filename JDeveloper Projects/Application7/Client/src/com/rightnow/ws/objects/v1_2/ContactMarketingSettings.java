
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.NamedIDDeltaList;
import com.rightnow.ws.nullfields.v1_2.ContactMarketingSettingsNullFields;


/**
 * <p>Java class for ContactMarketingSettings complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ContactMarketingSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactLists" type="{urn:base.ws.rightnow.com/v1_2}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="EmailFormat" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="MarketingOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarketingOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingOrganizationNameAlt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurveyOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}ContactMarketingSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMarketingSettings", propOrder = {
         "contactLists", "emailFormat", "marketingOptIn", "marketingOrganizationName", "marketingOrganizationNameAlt",
         "surveyOptIn", "validNullFields"
    })
public class ContactMarketingSettings {

    @XmlElement(name = "ContactLists", nillable = true)
    protected NamedIDDeltaList contactLists;
    @XmlElement(name = "EmailFormat", nillable = true)
    protected NamedID emailFormat;
    @XmlElement(name = "MarketingOptIn", nillable = true)
    protected Boolean marketingOptIn;
    @XmlElement(name = "MarketingOrganizationName", nillable = true)
    protected String marketingOrganizationName;
    @XmlElement(name = "MarketingOrganizationNameAlt", nillable = true)
    protected String marketingOrganizationNameAlt;
    @XmlElement(name = "SurveyOptIn", nillable = true)
    protected Boolean surveyOptIn;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected ContactMarketingSettingsNullFields validNullFields;

    /**
     * Gets the value of the contactLists property.
     *
     * @return
     *     possible object is
     *     {@link NamedIDDeltaList }
     *
     */
    public NamedIDDeltaList getContactLists() {
        return contactLists;
    }

    /**
     * Sets the value of the contactLists property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedIDDeltaList }
     *
     */
    public void setContactLists(NamedIDDeltaList value) {
        this.contactLists = value;
    }

    /**
     * Gets the value of the emailFormat property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getEmailFormat() {
        return emailFormat;
    }

    /**
     * Sets the value of the emailFormat property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setEmailFormat(NamedID value) {
        this.emailFormat = value;
    }

    /**
     * Gets the value of the marketingOptIn property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isMarketingOptIn() {
        return marketingOptIn;
    }

    /**
     * Sets the value of the marketingOptIn property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMarketingOptIn(Boolean value) {
        this.marketingOptIn = value;
    }

    /**
     * Gets the value of the marketingOrganizationName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarketingOrganizationName() {
        return marketingOrganizationName;
    }

    /**
     * Sets the value of the marketingOrganizationName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarketingOrganizationName(String value) {
        this.marketingOrganizationName = value;
    }

    /**
     * Gets the value of the marketingOrganizationNameAlt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarketingOrganizationNameAlt() {
        return marketingOrganizationNameAlt;
    }

    /**
     * Sets the value of the marketingOrganizationNameAlt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarketingOrganizationNameAlt(String value) {
        this.marketingOrganizationNameAlt = value;
    }

    /**
     * Gets the value of the surveyOptIn property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isSurveyOptIn() {
        return surveyOptIn;
    }

    /**
     * Sets the value of the surveyOptIn property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setSurveyOptIn(Boolean value) {
        this.surveyOptIn = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link ContactMarketingSettingsNullFields }
     *
     */
    public ContactMarketingSettingsNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link ContactMarketingSettingsNullFields }
     *
     */
    public void setValidNullFields(ContactMarketingSettingsNullFields value) {
        this.validNullFields = value;
    }

}
