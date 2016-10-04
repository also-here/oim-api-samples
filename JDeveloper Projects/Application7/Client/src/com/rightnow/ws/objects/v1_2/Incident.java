
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.NamedIDHierarchy;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.nullfields.v1_2.IncidentNullFields;


/**
 * <p>Java class for Incident complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Incident">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Asset" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="AssignedTo" type="{urn:objects.ws.rightnow.com/v1_2}GroupAccount" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_2}Banner" minOccurs="0"/>
 *         &lt;element name="BilledMinutes" type="{urn:objects.ws.rightnow.com/v1_2}TimeBilledList" minOccurs="0"/>
 *         &lt;element name="Category" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Channel" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ChatQueue" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ClosedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreatedByAccount" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="Disposition" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_2}FileAttachmentIncidentList" minOccurs="0"/>
 *         &lt;element name="InitialResponseDueTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InitialSolutionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Interface" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Language" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="LastResponseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Mailbox" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Mailing" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="OtherContacts" type="{urn:objects.ws.rightnow.com/v1_2}IncidentContactList" minOccurs="0"/>
 *         &lt;element name="PrimaryContact" type="{urn:objects.ws.rightnow.com/v1_2}IncidentContact" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Queue" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResolutionInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResponseInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Severity" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="SLAInstance" type="{urn:objects.ws.rightnow.com/v1_2}AssignedSLAInstance" minOccurs="0"/>
 *         &lt;element name="SmartSenseCustomer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SmartSenseStaff" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_2}StatusWithType" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Threads" type="{urn:objects.ws.rightnow.com/v1_2}ThreadList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}IncidentNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Incident", propOrder = {
         "asset", "assignedTo", "banner", "billedMinutes", "category", "channel", "chatQueue", "closedTime",
         "createdByAccount", "customFields", "disposition", "fileAttachments", "initialResponseDueTime",
         "initialSolutionTime", "_interface", "language", "lastResponseTime", "mailbox", "mailing", "organization",
         "otherContacts", "primaryContact", "product", "queue", "referenceNumber", "resolutionInterval",
         "responseInterval", "severity", "slaInstance", "smartSenseCustomer", "smartSenseStaff", "source",
         "statusWithType", "subject", "threads", "validNullFields"
    })
public class Incident extends RNObject {

    @XmlElement(name = "Asset", nillable = true)
    protected NamedID asset;
    @XmlElement(name = "AssignedTo")
    protected GroupAccount assignedTo;
    @XmlElement(name = "Banner")
    protected Banner banner;
    @XmlElement(name = "BilledMinutes", nillable = true)
    protected TimeBilledList billedMinutes;
    @XmlElement(name = "Category", nillable = true)
    protected NamedIDHierarchy category;
    @XmlElement(name = "Channel", nillable = true)
    protected NamedID channel;
    @XmlElement(name = "ChatQueue", nillable = true)
    protected NamedID chatQueue;
    @XmlElement(name = "ClosedTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closedTime;
    @XmlElement(name = "CreatedByAccount", nillable = true)
    protected NamedID createdByAccount;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "Disposition", nillable = true)
    protected NamedIDHierarchy disposition;
    @XmlElement(name = "FileAttachments", nillable = true)
    protected FileAttachmentIncidentList fileAttachments;
    @XmlElement(name = "InitialResponseDueTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialResponseDueTime;
    @XmlElement(name = "InitialSolutionTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialSolutionTime;
    @XmlElement(name = "Interface")
    protected NamedID _interface;
    @XmlElement(name = "Language", nillable = true)
    protected NamedID language;
    @XmlElement(name = "LastResponseTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastResponseTime;
    @XmlElement(name = "Mailbox", nillable = true)
    protected NamedID mailbox;
    @XmlElement(name = "Mailing", nillable = true)
    protected NamedID mailing;
    @XmlElement(name = "Organization", nillable = true)
    protected NamedID organization;
    @XmlElement(name = "OtherContacts", nillable = true)
    protected IncidentContactList otherContacts;
    @XmlElement(name = "PrimaryContact")
    protected IncidentContact primaryContact;
    @XmlElement(name = "Product", nillable = true)
    protected NamedIDHierarchy product;
    @XmlElement(name = "Queue", nillable = true)
    protected NamedID queue;
    @XmlElement(name = "ReferenceNumber")
    protected String referenceNumber;
    @XmlElement(name = "ResolutionInterval", nillable = true)
    protected Integer resolutionInterval;
    @XmlElement(name = "ResponseInterval", nillable = true)
    protected Integer responseInterval;
    @XmlElement(name = "Severity", nillable = true)
    protected NamedID severity;
    @XmlElement(name = "SLAInstance", nillable = true)
    protected AssignedSLAInstance slaInstance;
    @XmlElement(name = "SmartSenseCustomer", nillable = true)
    protected Integer smartSenseCustomer;
    @XmlElement(name = "SmartSenseStaff", nillable = true)
    protected Integer smartSenseStaff;
    @XmlElement(name = "Source")
    protected NamedIDHierarchy source;
    @XmlElement(name = "StatusWithType")
    protected StatusWithType statusWithType;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;
    @XmlElement(name = "Threads")
    protected ThreadList threads;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected IncidentNullFields validNullFields;

    /**
     * Gets the value of the asset property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setAsset(NamedID value) {
        this.asset = value;
    }

    /**
     * Gets the value of the assignedTo property.
     *
     * @return
     *     possible object is
     *     {@link GroupAccount }
     *
     */
    public GroupAccount getAssignedTo() {
        return assignedTo;
    }

    /**
     * Sets the value of the assignedTo property.
     *
     * @param value
     *     allowed object is
     *     {@link GroupAccount }
     *
     */
    public void setAssignedTo(GroupAccount value) {
        this.assignedTo = value;
    }

    /**
     * Gets the value of the banner property.
     *
     * @return
     *     possible object is
     *     {@link Banner }
     *
     */
    public Banner getBanner() {
        return banner;
    }

    /**
     * Sets the value of the banner property.
     *
     * @param value
     *     allowed object is
     *     {@link Banner }
     *
     */
    public void setBanner(Banner value) {
        this.banner = value;
    }

    /**
     * Gets the value of the billedMinutes property.
     *
     * @return
     *     possible object is
     *     {@link TimeBilledList }
     *
     */
    public TimeBilledList getBilledMinutes() {
        return billedMinutes;
    }

    /**
     * Sets the value of the billedMinutes property.
     *
     * @param value
     *     allowed object is
     *     {@link TimeBilledList }
     *
     */
    public void setBilledMinutes(TimeBilledList value) {
        this.billedMinutes = value;
    }

    /**
     * Gets the value of the category property.
     *
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *
     */
    public NamedIDHierarchy getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *
     */
    public void setCategory(NamedIDHierarchy value) {
        this.category = value;
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
     * Gets the value of the chatQueue property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getChatQueue() {
        return chatQueue;
    }

    /**
     * Sets the value of the chatQueue property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setChatQueue(NamedID value) {
        this.chatQueue = value;
    }

    /**
     * Gets the value of the closedTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getClosedTime() {
        return closedTime;
    }

    /**
     * Sets the value of the closedTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setClosedTime(XMLGregorianCalendar value) {
        this.closedTime = value;
    }

    /**
     * Gets the value of the createdByAccount property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getCreatedByAccount() {
        return createdByAccount;
    }

    /**
     * Sets the value of the createdByAccount property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setCreatedByAccount(NamedID value) {
        this.createdByAccount = value;
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
     * Gets the value of the disposition property.
     *
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *
     */
    public NamedIDHierarchy getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *
     */
    public void setDisposition(NamedIDHierarchy value) {
        this.disposition = value;
    }

    /**
     * Gets the value of the fileAttachments property.
     *
     * @return
     *     possible object is
     *     {@link FileAttachmentIncidentList }
     *
     */
    public FileAttachmentIncidentList getFileAttachments() {
        return fileAttachments;
    }

    /**
     * Sets the value of the fileAttachments property.
     *
     * @param value
     *     allowed object is
     *     {@link FileAttachmentIncidentList }
     *
     */
    public void setFileAttachments(FileAttachmentIncidentList value) {
        this.fileAttachments = value;
    }

    /**
     * Gets the value of the initialResponseDueTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getInitialResponseDueTime() {
        return initialResponseDueTime;
    }

    /**
     * Sets the value of the initialResponseDueTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setInitialResponseDueTime(XMLGregorianCalendar value) {
        this.initialResponseDueTime = value;
    }

    /**
     * Gets the value of the initialSolutionTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getInitialSolutionTime() {
        return initialSolutionTime;
    }

    /**
     * Sets the value of the initialSolutionTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setInitialSolutionTime(XMLGregorianCalendar value) {
        this.initialSolutionTime = value;
    }

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
     * Gets the value of the language property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setLanguage(NamedID value) {
        this.language = value;
    }

    /**
     * Gets the value of the lastResponseTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLastResponseTime() {
        return lastResponseTime;
    }

    /**
     * Sets the value of the lastResponseTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setLastResponseTime(XMLGregorianCalendar value) {
        this.lastResponseTime = value;
    }

    /**
     * Gets the value of the mailbox property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getMailbox() {
        return mailbox;
    }

    /**
     * Sets the value of the mailbox property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setMailbox(NamedID value) {
        this.mailbox = value;
    }

    /**
     * Gets the value of the mailing property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getMailing() {
        return mailing;
    }

    /**
     * Sets the value of the mailing property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setMailing(NamedID value) {
        this.mailing = value;
    }

    /**
     * Gets the value of the organization property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setOrganization(NamedID value) {
        this.organization = value;
    }

    /**
     * Gets the value of the otherContacts property.
     *
     * @return
     *     possible object is
     *     {@link IncidentContactList }
     *
     */
    public IncidentContactList getOtherContacts() {
        return otherContacts;
    }

    /**
     * Sets the value of the otherContacts property.
     *
     * @param value
     *     allowed object is
     *     {@link IncidentContactList }
     *
     */
    public void setOtherContacts(IncidentContactList value) {
        this.otherContacts = value;
    }

    /**
     * Gets the value of the primaryContact property.
     *
     * @return
     *     possible object is
     *     {@link IncidentContact }
     *
     */
    public IncidentContact getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Sets the value of the primaryContact property.
     *
     * @param value
     *     allowed object is
     *     {@link IncidentContact }
     *
     */
    public void setPrimaryContact(IncidentContact value) {
        this.primaryContact = value;
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
     * Gets the value of the queue property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setQueue(NamedID value) {
        this.queue = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the resolutionInterval property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getResolutionInterval() {
        return resolutionInterval;
    }

    /**
     * Sets the value of the resolutionInterval property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setResolutionInterval(Integer value) {
        this.resolutionInterval = value;
    }

    /**
     * Gets the value of the responseInterval property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getResponseInterval() {
        return responseInterval;
    }

    /**
     * Sets the value of the responseInterval property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setResponseInterval(Integer value) {
        this.responseInterval = value;
    }

    /**
     * Gets the value of the severity property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setSeverity(NamedID value) {
        this.severity = value;
    }

    /**
     * Gets the value of the slaInstance property.
     *
     * @return
     *     possible object is
     *     {@link AssignedSLAInstance }
     *
     */
    public AssignedSLAInstance getSLAInstance() {
        return slaInstance;
    }

    /**
     * Sets the value of the slaInstance property.
     *
     * @param value
     *     allowed object is
     *     {@link AssignedSLAInstance }
     *
     */
    public void setSLAInstance(AssignedSLAInstance value) {
        this.slaInstance = value;
    }

    /**
     * Gets the value of the smartSenseCustomer property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSmartSenseCustomer() {
        return smartSenseCustomer;
    }

    /**
     * Sets the value of the smartSenseCustomer property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSmartSenseCustomer(Integer value) {
        this.smartSenseCustomer = value;
    }

    /**
     * Gets the value of the smartSenseStaff property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSmartSenseStaff() {
        return smartSenseStaff;
    }

    /**
     * Sets the value of the smartSenseStaff property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSmartSenseStaff(Integer value) {
        this.smartSenseStaff = value;
    }

    /**
     * Gets the value of the source property.
     *
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *
     */
    public NamedIDHierarchy getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *
     */
    public void setSource(NamedIDHierarchy value) {
        this.source = value;
    }

    /**
     * Gets the value of the statusWithType property.
     *
     * @return
     *     possible object is
     *     {@link StatusWithType }
     *
     */
    public StatusWithType getStatusWithType() {
        return statusWithType;
    }

    /**
     * Sets the value of the statusWithType property.
     *
     * @param value
     *     allowed object is
     *     {@link StatusWithType }
     *
     */
    public void setStatusWithType(StatusWithType value) {
        this.statusWithType = value;
    }

    /**
     * Gets the value of the subject property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the threads property.
     *
     * @return
     *     possible object is
     *     {@link ThreadList }
     *
     */
    public ThreadList getThreads() {
        return threads;
    }

    /**
     * Sets the value of the threads property.
     *
     * @param value
     *     allowed object is
     *     {@link ThreadList }
     *
     */
    public void setThreads(ThreadList value) {
        this.threads = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link IncidentNullFields }
     *
     */
    public IncidentNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link IncidentNullFields }
     *
     */
    public void setValidNullFields(IncidentNullFields value) {
        this.validNullFields = value;
    }

}
