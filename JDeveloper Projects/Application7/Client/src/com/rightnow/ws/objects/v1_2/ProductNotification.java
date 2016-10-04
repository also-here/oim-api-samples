
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.rightnow.ws.base.v1_2.ActionEnum;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.NamedIDHierarchy;
import com.rightnow.ws.nullfields.v1_2.ProductNotificationNullFields;


/**
 * <p>Java class for ProductNotification complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProductNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Interface" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}ProductNotificationNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{urn:base.ws.rightnow.com/v1_2}ActionEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductNotification", propOrder = { "_interface", "product", "startTime", "validNullFields" })
public class ProductNotification {

    @XmlElement(name = "Interface", nillable = true)
    protected NamedID _interface;
    @XmlElement(name = "Product")
    protected NamedIDHierarchy product;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected ProductNotificationNullFields validNullFields;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

    /**
     * Gets the value of the interface property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setInterface(NamedID value) {
        this._interface = value;
    }

    /**
     * Gets the value of the product property.
     *
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *
     */
    public NamedIDHierarchy getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *
     */
    public void setProduct(NamedIDHierarchy value) {
        this.product = value;
    }

    /**
     * Gets the value of the startTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link ProductNotificationNullFields }
     *
     */
    public ProductNotificationNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link ProductNotificationNullFields }
     *
     */
    public void setValidNullFields(ProductNotificationNullFields value) {
        this.validNullFields = value;
    }

    /**
     * Gets the value of the action property.
     *
     * @return
     *     possible object is
     *     {@link ActionEnum }
     *
     */
    public ActionEnum getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value
     *     allowed object is
     *     {@link ActionEnum }
     *
     */
    public void setAction(ActionEnum value) {
        this.action = value;
    }

}
