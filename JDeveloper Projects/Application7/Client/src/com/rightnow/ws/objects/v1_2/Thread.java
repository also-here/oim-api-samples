
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
import com.rightnow.ws.nullfields.v1_2.ThreadNullFields;


/**
 * <p>Java class for Thread complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Thread">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Channel" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Contact" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ContentType" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EntryType" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1_2}ID" minOccurs="0"/>
 *         &lt;element name="MailHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}ThreadNullFields" minOccurs="0"/>
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
@XmlType(name = "Thread", propOrder = {
         "account", "channel", "contact", "contentType", "createdTime", "displayOrder", "entryType", "id", "mailHeader",
         "text", "validNullFields"
    })
public class Thread {

    @XmlElement(name = "Account", nillable = true)
    protected NamedID account;
    @XmlElement(name = "Channel", nillable = true)
    protected NamedID channel;
    @XmlElement(name = "Contact", nillable = true)
    protected NamedID contact;
    @XmlElement(name = "ContentType")
    protected NamedID contentType;
    @XmlElement(name = "CreatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "EntryType")
    protected NamedID entryType;
    @XmlElement(name = "ID")
    protected ID id;
    @XmlElement(name = "MailHeader", nillable = true)
    protected String mailHeader;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected ThreadNullFields validNullFields;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

    /**
     * Gets the value of the account property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setAccount(NamedID value) {
        this.account = value;
    }

    /**
     * Gets the value of the channel property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setChannel(NamedID value) {
        this.channel = value;
    }

    /**
     * Gets the value of the contact property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setContact(NamedID value) {
        this.contact = value;
    }

    /**
     * Gets the value of the contentType property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setContentType(NamedID value) {
        this.contentType = value;
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
     * Gets the value of the entryType property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getEntryType() {
        return entryType;
    }

    /**
     * Sets the value of the entryType property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setEntryType(NamedID value) {
        this.entryType = value;
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
     * Gets the value of the mailHeader property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMailHeader() {
        return mailHeader;
    }

    /**
     * Sets the value of the mailHeader property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMailHeader(String value) {
        this.mailHeader = value;
    }

    /**
     * Gets the value of the text property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link ThreadNullFields }
     *
     */
    public ThreadNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link ThreadNullFields }
     *
     */
    public void setValidNullFields(ThreadNullFields value) {
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
