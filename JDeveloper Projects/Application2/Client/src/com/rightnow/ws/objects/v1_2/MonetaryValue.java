
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.nullfields.v1_2.MonetaryValueNullFields;


/**
 * <p>Java class for MonetaryValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Currency" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}MonetaryValueNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryValue", propOrder = {
    "currency",
    "exchangeRate",
    "value",
    "validNullFields"
})
public class MonetaryValue {

    @XmlElement(name = "Currency")
    protected NamedID currency;
    @XmlElement(name = "ExchangeRate", nillable = true)
    protected NamedID exchangeRate;
    @XmlElement(name = "Value")
    protected Double value;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected MonetaryValueNullFields validNullFields;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setCurrency(NamedID value) {
        this.currency = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setExchangeRate(NamedID value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryValueNullFields }
     *     
     */
    public MonetaryValueNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryValueNullFields }
     *     
     */
    public void setValidNullFields(MonetaryValueNullFields value) {
        this.validNullFields = value;
    }

}
