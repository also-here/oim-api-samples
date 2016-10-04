
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.NamedIDHierarchy;
import com.rightnow.ws.nullfields.v1_2.AccountSalesSettingsNullFields;


/**
 * <p>Java class for AccountSalesSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountSalesSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultCurrency" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Territory" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}AccountSalesSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSalesSettings", propOrder = {
    "defaultCurrency",
    "territory",
    "validNullFields"
})
public class AccountSalesSettings {

    @XmlElement(name = "DefaultCurrency")
    protected NamedID defaultCurrency;
    @XmlElement(name = "Territory", nillable = true)
    protected NamedIDHierarchy territory;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected AccountSalesSettingsNullFields validNullFields;

    /**
     * Gets the value of the defaultCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getDefaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Sets the value of the defaultCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setDefaultCurrency(NamedID value) {
        this.defaultCurrency = value;
    }

    /**
     * Gets the value of the territory property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public NamedIDHierarchy getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public void setTerritory(NamedIDHierarchy value) {
        this.territory = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSalesSettingsNullFields }
     *     
     */
    public AccountSalesSettingsNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSalesSettingsNullFields }
     *     
     */
    public void setValidNullFields(AccountSalesSettingsNullFields value) {
        this.validNullFields = value;
    }

}
