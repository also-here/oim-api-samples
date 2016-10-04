
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.nullfields.v1_2.AddressNullFields;


/**
 * <p>Java class for Address complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrProvince" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}AddressNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
         "city", "country", "postalCode", "stateOrProvince", "street", "validNullFields" })
@XmlSeeAlso({ TypedAddress.class })
public class Address {

    @XmlElement(name = "City", nillable = true)
    protected String city;
    @XmlElement(name = "Country", nillable = true)
    protected NamedID country;
    @XmlElement(name = "PostalCode", nillable = true)
    protected String postalCode;
    @XmlElement(name = "StateOrProvince", nillable = true)
    protected NamedID stateOrProvince;
    @XmlElement(name = "Street", nillable = true)
    protected String street;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected AddressNullFields validNullFields;

    /**
     * Gets the value of the city property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setCountry(NamedID value) {
        this.country = value;
    }

    /**
     * Gets the value of the postalCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the stateOrProvince property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the value of the stateOrProvince property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setStateOrProvince(NamedID value) {
        this.stateOrProvince = value;
    }

    /**
     * Gets the value of the street property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link AddressNullFields }
     *
     */
    public AddressNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link AddressNullFields }
     *
     */
    public void setValidNullFields(AddressNullFields value) {
        this.validNullFields = value;
    }

}
