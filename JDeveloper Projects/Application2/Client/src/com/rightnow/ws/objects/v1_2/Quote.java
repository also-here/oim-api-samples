
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_2.ActionEnum;
import com.rightnow.ws.base.v1_2.ID;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.nullfields.v1_2.QuoteNullFields;


/**
 * <p>Java class for Quote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustedTotal" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_2}FileAttachmentList" minOccurs="0"/>
 *         &lt;element name="Forecasted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1_2}ID" minOccurs="0"/>
 *         &lt;element name="LineItems" type="{urn:objects.ws.rightnow.com/v1_2}QuoteLineItemList" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OfferStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PriceSchedule" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="SentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SentTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Template" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Total" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="UpdatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}QuoteNullFields" minOccurs="0"/>
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
@XmlType(name = "Quote", propOrder = {
    "adjustedTotal",
    "comment",
    "createdTime",
    "customFields",
    "discountPercent",
    "fileAttachments",
    "forecasted",
    "id",
    "lineItems",
    "name",
    "offerEndTime",
    "offerStartTime",
    "priceSchedule",
    "sentTime",
    "sentTo",
    "status",
    "template",
    "total",
    "updatedTime",
    "validNullFields"
})
public class Quote {

    @XmlElement(name = "AdjustedTotal", nillable = true)
    protected MonetaryValue adjustedTotal;
    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "CreatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "DiscountPercent")
    protected Integer discountPercent;
    @XmlElement(name = "FileAttachments", nillable = true)
    protected FileAttachmentList fileAttachments;
    @XmlElement(name = "Forecasted")
    protected Boolean forecasted;
    @XmlElement(name = "ID")
    protected ID id;
    @XmlElement(name = "LineItems", nillable = true)
    protected QuoteLineItemList lineItems;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "OfferEndTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offerEndTime;
    @XmlElement(name = "OfferStartTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offerStartTime;
    @XmlElement(name = "PriceSchedule", nillable = true)
    protected NamedID priceSchedule;
    @XmlElement(name = "SentTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentTime;
    @XmlElement(name = "SentTo", nillable = true)
    protected String sentTo;
    @XmlElement(name = "Status", nillable = true)
    protected NamedID status;
    @XmlElement(name = "Template", nillable = true)
    protected NamedID template;
    @XmlElement(name = "Total", nillable = true)
    protected MonetaryValue total;
    @XmlElement(name = "UpdatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedTime;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected QuoteNullFields validNullFields;
    @XmlAttribute
    protected ActionEnum action;

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
     * Gets the value of the createdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Sets the value of the createdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
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
     * Gets the value of the fileAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link FileAttachmentList }
     *     
     */
    public FileAttachmentList getFileAttachments() {
        return fileAttachments;
    }

    /**
     * Sets the value of the fileAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileAttachmentList }
     *     
     */
    public void setFileAttachments(FileAttachmentList value) {
        this.fileAttachments = value;
    }

    /**
     * Gets the value of the forecasted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecasted() {
        return forecasted;
    }

    /**
     * Sets the value of the forecasted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecasted(Boolean value) {
        this.forecasted = value;
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
     * Gets the value of the lineItems property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteLineItemList }
     *     
     */
    public QuoteLineItemList getLineItems() {
        return lineItems;
    }

    /**
     * Sets the value of the lineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteLineItemList }
     *     
     */
    public void setLineItems(QuoteLineItemList value) {
        this.lineItems = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the offerEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfferEndTime() {
        return offerEndTime;
    }

    /**
     * Sets the value of the offerEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfferEndTime(XMLGregorianCalendar value) {
        this.offerEndTime = value;
    }

    /**
     * Gets the value of the offerStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfferStartTime() {
        return offerStartTime;
    }

    /**
     * Sets the value of the offerStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfferStartTime(XMLGregorianCalendar value) {
        this.offerStartTime = value;
    }

    /**
     * Gets the value of the priceSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getPriceSchedule() {
        return priceSchedule;
    }

    /**
     * Sets the value of the priceSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setPriceSchedule(NamedID value) {
        this.priceSchedule = value;
    }

    /**
     * Gets the value of the sentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentTime() {
        return sentTime;
    }

    /**
     * Sets the value of the sentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentTime(XMLGregorianCalendar value) {
        this.sentTime = value;
    }

    /**
     * Gets the value of the sentTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTo() {
        return sentTo;
    }

    /**
     * Sets the value of the sentTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTo(String value) {
        this.sentTo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setStatus(NamedID value) {
        this.status = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setTemplate(NamedID value) {
        this.template = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryValue }
     *     
     */
    public MonetaryValue getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryValue }
     *     
     */
    public void setTotal(MonetaryValue value) {
        this.total = value;
    }

    /**
     * Gets the value of the updatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedTime() {
        return updatedTime;
    }

    /**
     * Sets the value of the updatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedTime(XMLGregorianCalendar value) {
        this.updatedTime = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteNullFields }
     *     
     */
    public QuoteNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteNullFields }
     *     
     */
    public void setValidNullFields(QuoteNullFields value) {
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
