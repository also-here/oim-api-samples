
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesProductOptions complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SalesProductOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HasSerialNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSalesProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsServiceProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesProductOptions", propOrder = { "hasSerialNumber", "isSalesProduct", "isServiceProduct" })
public class SalesProductOptions {

    @XmlElement(name = "HasSerialNumber")
    protected Boolean hasSerialNumber;
    @XmlElement(name = "IsSalesProduct")
    protected Boolean isSalesProduct;
    @XmlElement(name = "IsServiceProduct")
    protected Boolean isServiceProduct;

    /**
     * Gets the value of the hasSerialNumber property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isHasSerialNumber() {
        return hasSerialNumber;
    }

    /**
     * Sets the value of the hasSerialNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setHasSerialNumber(Boolean value) {
        this.hasSerialNumber = value;
    }

    /**
     * Gets the value of the isSalesProduct property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsSalesProduct() {
        return isSalesProduct;
    }

    /**
     * Sets the value of the isSalesProduct property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsSalesProduct(Boolean value) {
        this.isSalesProduct = value;
    }

    /**
     * Gets the value of the isServiceProduct property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsServiceProduct() {
        return isServiceProduct;
    }

    /**
     * Sets the value of the isServiceProduct property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsServiceProduct(Boolean value) {
        this.isServiceProduct = value;
    }

}
