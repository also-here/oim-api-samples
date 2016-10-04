
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.nullfields.v1_2.ContactServiceSettingsNullFields;


/**
 * <p>Java class for ContactServiceSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactServiceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnswerNotifications" type="{urn:objects.ws.rightnow.com/v1_2}AnswerNotificationList" minOccurs="0"/>
 *         &lt;element name="CategoryNotifications" type="{urn:objects.ws.rightnow.com/v1_2}CategoryNotificationList" minOccurs="0"/>
 *         &lt;element name="ProductNotifications" type="{urn:objects.ws.rightnow.com/v1_2}ProductNotificationList" minOccurs="0"/>
 *         &lt;element name="SLAInstances" type="{urn:objects.ws.rightnow.com/v1_2}SLAInstanceList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}ContactServiceSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactServiceSettings", propOrder = {
    "answerNotifications",
    "categoryNotifications",
    "productNotifications",
    "slaInstances",
    "validNullFields"
})
public class ContactServiceSettings {

    @XmlElement(name = "AnswerNotifications", nillable = true)
    protected AnswerNotificationList answerNotifications;
    @XmlElement(name = "CategoryNotifications", nillable = true)
    protected CategoryNotificationList categoryNotifications;
    @XmlElement(name = "ProductNotifications", nillable = true)
    protected ProductNotificationList productNotifications;
    @XmlElement(name = "SLAInstances", nillable = true)
    protected SLAInstanceList slaInstances;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected ContactServiceSettingsNullFields validNullFields;

    /**
     * Gets the value of the answerNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link AnswerNotificationList }
     *     
     */
    public AnswerNotificationList getAnswerNotifications() {
        return answerNotifications;
    }

    /**
     * Sets the value of the answerNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerNotificationList }
     *     
     */
    public void setAnswerNotifications(AnswerNotificationList value) {
        this.answerNotifications = value;
    }

    /**
     * Gets the value of the categoryNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryNotificationList }
     *     
     */
    public CategoryNotificationList getCategoryNotifications() {
        return categoryNotifications;
    }

    /**
     * Sets the value of the categoryNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryNotificationList }
     *     
     */
    public void setCategoryNotifications(CategoryNotificationList value) {
        this.categoryNotifications = value;
    }

    /**
     * Gets the value of the productNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link ProductNotificationList }
     *     
     */
    public ProductNotificationList getProductNotifications() {
        return productNotifications;
    }

    /**
     * Sets the value of the productNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductNotificationList }
     *     
     */
    public void setProductNotifications(ProductNotificationList value) {
        this.productNotifications = value;
    }

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
     *     {@link ContactServiceSettingsNullFields }
     *     
     */
    public ContactServiceSettingsNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactServiceSettingsNullFields }
     *     
     */
    public void setValidNullFields(ContactServiceSettingsNullFields value) {
        this.validNullFields = value;
    }

}
