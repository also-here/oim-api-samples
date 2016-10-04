
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.rightnow.ws.base.v1_2.ActionEnum;
import com.rightnow.ws.base.v1_2.ID;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.nullfields.v1_2.QuoteLineItemNullFields;


/**
 * <p>Java class for QuoteLineItem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="QuoteLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustedPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustedPrice" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="AdjustedTotal" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1_2}ID" minOccurs="0"/>
 *         &lt;element name="OriginalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPrice" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}QuoteLineItemNullFields" minOccurs="0"/>
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
@XmlType(name = "QuoteLineItem", propOrder = {
         "adjustedDescription", "adjustedName", "adjustedPartNumber", "adjustedPrice", "adjustedTotal", "comment",
         "customFields", "discountPercent", "displayOrder", "id", "originalDescription", "originalName",
         "originalPartNumber", "originalPrice", "product", "quantity", "validNullFields"
    })
public class QuoteLineItem {

    @XmlElement(name = "AdjustedDescription", nillable = true)
    protected String adjustedDescription;
    @XmlElement(name = "AdjustedName", nillable = true)
    protected String adjustedName;
    @XmlElement(name = "AdjustedPartNumber", nillable = true)
    protected String adjustedPartNumber;
    @XmlElement(name = "AdjustedPrice", nillable = true)
    protected MonetaryValue adjustedPrice;
    @XmlElement(name = "AdjustedTotal", nillable = true)
    protected MonetaryValue adjustedTotal;
    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "DiscountPercent")
    protected Integer discountPercent;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "ID")
    protected ID id;
    @XmlElement(name = "OriginalDescription", nillable = true)
    protected String originalDescription;
    @XmlElement(name = "OriginalName", nillable = true)
    protected String originalName;
    @XmlElement(name = "OriginalPartNumber", nillable = true)
    protected String originalPartNumber;
    @XmlElement(name = "OriginalPrice")
    protected MonetaryValue originalPrice;
    @XmlElement(name = "Product", nillable = true)
    protected NamedID product;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected QuoteLineItemNullFields validNullFields;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

    /**
     * Gets the value of the adjustedDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdjustedDescription() {
        return adjustedDescription;
    }

    /**
     * Sets the value of the adjustedDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdjustedDescription(String value) {
        this.adjustedDescription = value;
    }

    /**
     * Gets the value of the adjustedName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdjustedName() {
        return adjustedName;
    }

    /**
     * Sets the value of the adjustedName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdjustedName(String value) {
        this.adjustedName = value;
    }

    /**
     * Gets the value of the adjustedPartNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdjustedPartNumber() {
        return adjustedPartNumber;
    }

    /**
     * Sets the value of the adjustedPartNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdjustedPartNumber(String value) {
        this.adjustedPartNumber = value;
    }

    /**
     * Gets the value of the adjustedPrice property.
     *
     * @return
     *     possible object is
     *     {@link MonetaryValue }
     *
     */
    public MonetaryValue getAdjustedPrice() {
        return adjustedPrice;
    }

    /**
     * Sets the value of the adjustedPrice property.
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryValue }
     *
     */
    public void setAdjustedPrice(MonetaryValue value) {
        this.adjustedPrice = value;
    }

    /**
     * Gets the value of the adjustedTotal property.
     *
     * @return
     *     possible object is
     *     {@link MonetaryValue }
     *
     */
    public MonetaryValue getAdjustedTotal() {
        return adjustedTotal;
    }

    /**
     * Sets the value of the adjustedTotal property.
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryValue }
     *
     */
    public void setAdjustedTotal(MonetaryValue value) {
        this.adjustedTotal = value;
    }

    /**
     * Gets the value of the comment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the customFields property.
     *
     * @return
     *     possible object is
     *     {@link GenericObject }
     *
     */
    public GenericObject getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     *
     * @param value
     *     allowed object is
     *     {@link GenericObject }
     *
     */
    public void setCustomFields(GenericObject value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the discountPercent property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setDiscountPercent(Integer value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the displayOrder property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link ID }
     *
     */
    public ID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link ID }
     *
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Gets the value of the originalDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginalDescription() {
        return originalDescription;
    }

    /**
     * Sets the value of the originalDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginalDescription(String value) {
        this.originalDescription = value;
    }

    /**
     * Gets the value of the originalName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginalName() {
        return originalName;
    }

    /**
     * Sets the value of the originalName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginalName(String value) {
        this.originalName = value;
    }

    /**
     * Gets the value of the originalPartNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginalPartNumber() {
        return originalPartNumber;
    }

    /**
     * Sets the value of the originalPartNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginalPartNumber(String value) {
        this.originalPartNumber = value;
    }

    /**
     * Gets the value of the originalPrice property.
     *
     * @return
     *     possible object is
     *     {@link MonetaryValue }
     *
     */
    public MonetaryValue getOriginalPrice() {
        return originalPrice;
    }

    /**
     * Sets the value of the originalPrice property.
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryValue }
     *
     */
    public void setOriginalPrice(MonetaryValue value) {
        this.originalPrice = value;
    }

    /**
     * Gets the value of the product property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setProduct(NamedID value) {
        this.product = value;
    }

    /**
     * Gets the value of the quantity property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link QuoteLineItemNullFields }
     *
     */
    public QuoteLineItemNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link QuoteLineItemNullFields }
     *
     */
    public void setValidNullFields(QuoteLineItemNullFields value) {
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
