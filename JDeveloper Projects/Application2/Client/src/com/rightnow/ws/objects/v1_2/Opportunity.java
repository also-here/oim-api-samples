
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.NamedIDHierarchy;
import com.rightnow.ws.base.v1_2.NamedIDList;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.nullfields.v1_2.OpportunityNullFields;


/**
 * <p>Java class for Opportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Opportunity">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AccountHierarchy" type="{urn:base.ws.rightnow.com/v1_2}NamedIDList" minOccurs="0"/>
 *         &lt;element name="AssignedToAccount" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_2}Banner" minOccurs="0"/>
 *         &lt;element name="Campaign" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ClosedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ClosedValue" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="CostOfSale" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_2}FileAttachmentCommonList" minOccurs="0"/>
 *         &lt;element name="ForecastCloseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="InitialContactDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Interface" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="LeadRejectDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LeadRejectDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeadRejectReason" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="LostTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ManagerCommit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ManagerValue" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_2}NoteList" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="OtherContacts" type="{urn:objects.ws.rightnow.com/v1_2}OpportunityContactList" minOccurs="0"/>
 *         &lt;element name="PrimaryContact" type="{urn:objects.ws.rightnow.com/v1_2}OpportunityContact" minOccurs="0"/>
 *         &lt;element name="Quotes" type="{urn:objects.ws.rightnow.com/v1_2}QuoteList" minOccurs="0"/>
 *         &lt;element name="RecallTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReturnValue" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="SalesRepresentativeCommit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesRepresentativeValue" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="StageWithStrategy" type="{urn:objects.ws.rightnow.com/v1_2}StageWithStrategy" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_2}StatusWithType" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Survey" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Territory" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="TerritoryHierarchy" type="{urn:base.ws.rightnow.com/v1_2}NamedIDList" minOccurs="0"/>
 *         &lt;element name="WinLossDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WinLossReason" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}OpportunityNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opportunity", propOrder = {
    "accountHierarchy",
    "assignedToAccount",
    "banner",
    "campaign",
    "closedTime",
    "closedValue",
    "costOfSale",
    "customFields",
    "fileAttachments",
    "forecastCloseDate",
    "initialContactDate",
    "_interface",
    "leadRejectDateTime",
    "leadRejectDescription",
    "leadRejectReason",
    "lostTime",
    "managerCommit",
    "managerValue",
    "name",
    "notes",
    "organization",
    "otherContacts",
    "primaryContact",
    "quotes",
    "recallTime",
    "returnValue",
    "salesRepresentativeCommit",
    "salesRepresentativeValue",
    "source",
    "stageWithStrategy",
    "statusWithType",
    "summary",
    "survey",
    "territory",
    "territoryHierarchy",
    "winLossDescription",
    "winLossReason",
    "validNullFields"
})
public class Opportunity
    extends RNObject
{

    @XmlElement(name = "AccountHierarchy", nillable = true)
    protected NamedIDList accountHierarchy;
    @XmlElement(name = "AssignedToAccount", nillable = true)
    protected NamedIDHierarchy assignedToAccount;
    @XmlElement(name = "Banner", nillable = true)
    protected Banner banner;
    @XmlElement(name = "Campaign", nillable = true)
    protected NamedID campaign;
    @XmlElement(name = "ClosedTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closedTime;
    @XmlElement(name = "ClosedValue", nillable = true)
    protected MonetaryValue closedValue;
    @XmlElement(name = "CostOfSale", nillable = true)
    protected MonetaryValue costOfSale;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "FileAttachments", nillable = true)
    protected FileAttachmentCommonList fileAttachments;
    @XmlElement(name = "ForecastCloseDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar forecastCloseDate;
    @XmlElement(name = "InitialContactDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initialContactDate;
    @XmlElement(name = "Interface")
    protected NamedID _interface;
    @XmlElement(name = "LeadRejectDateTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar leadRejectDateTime;
    @XmlElement(name = "LeadRejectDescription", nillable = true)
    protected String leadRejectDescription;
    @XmlElement(name = "LeadRejectReason", nillable = true)
    protected NamedID leadRejectReason;
    @XmlElement(name = "LostTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lostTime;
    @XmlElement(name = "ManagerCommit")
    protected Boolean managerCommit;
    @XmlElement(name = "ManagerValue", nillable = true)
    protected MonetaryValue managerValue;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Notes", nillable = true)
    protected NoteList notes;
    @XmlElement(name = "Organization", nillable = true)
    protected NamedID organization;
    @XmlElement(name = "OtherContacts", nillable = true)
    protected OpportunityContactList otherContacts;
    @XmlElement(name = "PrimaryContact", nillable = true)
    protected OpportunityContact primaryContact;
    @XmlElement(name = "Quotes", nillable = true)
    protected QuoteList quotes;
    @XmlElement(name = "RecallTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recallTime;
    @XmlElement(name = "ReturnValue", nillable = true)
    protected MonetaryValue returnValue;
    @XmlElement(name = "SalesRepresentativeCommit")
    protected Boolean salesRepresentativeCommit;
    @XmlElement(name = "SalesRepresentativeValue", nillable = true)
    protected MonetaryValue salesRepresentativeValue;
    @XmlElement(name = "Source")
    protected NamedIDHierarchy source;
    @XmlElement(name = "StageWithStrategy")
    protected StageWithStrategy stageWithStrategy;
    @XmlElement(name = "StatusWithType")
    protected StatusWithType statusWithType;
    @XmlElement(name = "Summary", nillable = true)
    protected String summary;
    @XmlElement(name = "Survey", nillable = true)
    protected NamedID survey;
    @XmlElement(name = "Territory", nillable = true)
    protected NamedIDHierarchy territory;
    @XmlElement(name = "TerritoryHierarchy", nillable = true)
    protected NamedIDList territoryHierarchy;
    @XmlElement(name = "WinLossDescription", nillable = true)
    protected String winLossDescription;
    @XmlElement(name = "WinLossReason", nillable = true)
    protected NamedID winLossReason;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected OpportunityNullFields validNullFields;

    /**
     * Gets the value of the accountHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *     
     */
    public NamedIDList getAccountHierarchy() {
        return accountHierarchy;
    }

    /**
     * Sets the value of the accountHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *     
     */
    public void setAccountHierarchy(NamedIDList value) {
        this.accountHierarchy = value;
    }

    /**
     * Gets the value of the assignedToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public NamedIDHierarchy getAssignedToAccount() {
        return assignedToAccount;
    }

    /**
     * Sets the value of the assignedToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public void setAssignedToAccount(NamedIDHierarchy value) {
        this.assignedToAccount = value;
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
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setCampaign(NamedID value) {
        this.campaign = value;
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
     * Gets the value of the closedValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryValue }
     *     
     */
    public MonetaryValue getClosedValue() {
        return closedValue;
    }

    /**
     * Sets the value of the closedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryValue }
     *     
     */
    public void setClosedValue(MonetaryValue value) {
        this.closedValue = value;
    }

    /**
     * Gets the value of the costOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryValue }
     *     
     */
    public MonetaryValue getCostOfSale() {
        return costOfSale;
    }

    /**
     * Sets the value of the costOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryValue }
     *     
     */
    public void setCostOfSale(MonetaryValue value) {
        this.costOfSale = value;
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
     * Gets the value of the fileAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link FileAttachmentCommonList }
     *     
     */
    public FileAttachmentCommonList getFileAttachments() {
        return fileAttachments;
    }

    /**
     * Sets the value of the fileAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileAttachmentCommonList }
     *     
     */
    public void setFileAttachments(FileAttachmentCommonList value) {
        this.fileAttachments = value;
    }

    /**
     * Gets the value of the forecastCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForecastCloseDate() {
        return forecastCloseDate;
    }

    /**
     * Sets the value of the forecastCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForecastCloseDate(XMLGregorianCalendar value) {
        this.forecastCloseDate = value;
    }

    /**
     * Gets the value of the initialContactDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialContactDate() {
        return initialContactDate;
    }

    /**
     * Sets the value of the initialContactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialContactDate(XMLGregorianCalendar value) {
        this.initialContactDate = value;
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
     * Gets the value of the leadRejectDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeadRejectDateTime() {
        return leadRejectDateTime;
    }

    /**
     * Sets the value of the leadRejectDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeadRejectDateTime(XMLGregorianCalendar value) {
        this.leadRejectDateTime = value;
    }

    /**
     * Gets the value of the leadRejectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadRejectDescription() {
        return leadRejectDescription;
    }

    /**
     * Sets the value of the leadRejectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadRejectDescription(String value) {
        this.leadRejectDescription = value;
    }

    /**
     * Gets the value of the leadRejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getLeadRejectReason() {
        return leadRejectReason;
    }

    /**
     * Sets the value of the leadRejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setLeadRejectReason(NamedID value) {
        this.leadRejectReason = value;
    }

    /**
     * Gets the value of the lostTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLostTime() {
        return lostTime;
    }

    /**
     * Sets the value of the lostTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLostTime(XMLGregorianCalendar value) {
        this.lostTime = value;
    }

    /**
     * Gets the value of the managerCommit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManagerCommit() {
        return managerCommit;
    }

    /**
     * Sets the value of the managerCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManagerCommit(Boolean value) {
        this.managerCommit = value;
    }

    /**
     * Gets the value of the managerValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryValue }
     *     
     */
    public MonetaryValue getManagerValue() {
        return managerValue;
    }

    /**
     * Sets the value of the managerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryValue }
     *     
     */
    public void setManagerValue(MonetaryValue value) {
        this.managerValue = value;
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
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link NoteList }
     *     
     */
    public NoteList getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteList }
     *     
     */
    public void setNotes(NoteList value) {
        this.notes = value;
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
     *     {@link OpportunityContactList }
     *     
     */
    public OpportunityContactList getOtherContacts() {
        return otherContacts;
    }

    /**
     * Sets the value of the otherContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityContactList }
     *     
     */
    public void setOtherContacts(OpportunityContactList value) {
        this.otherContacts = value;
    }

    /**
     * Gets the value of the primaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityContact }
     *     
     */
    public OpportunityContact getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Sets the value of the primaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityContact }
     *     
     */
    public void setPrimaryContact(OpportunityContact value) {
        this.primaryContact = value;
    }

    /**
     * Gets the value of the quotes property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteList }
     *     
     */
    public QuoteList getQuotes() {
        return quotes;
    }

    /**
     * Sets the value of the quotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteList }
     *     
     */
    public void setQuotes(QuoteList value) {
        this.quotes = value;
    }

    /**
     * Gets the value of the recallTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecallTime() {
        return recallTime;
    }

    /**
     * Sets the value of the recallTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecallTime(XMLGregorianCalendar value) {
        this.recallTime = value;
    }

    /**
     * Gets the value of the returnValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryValue }
     *     
     */
    public MonetaryValue getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryValue }
     *     
     */
    public void setReturnValue(MonetaryValue value) {
        this.returnValue = value;
    }

    /**
     * Gets the value of the salesRepresentativeCommit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesRepresentativeCommit() {
        return salesRepresentativeCommit;
    }

    /**
     * Sets the value of the salesRepresentativeCommit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesRepresentativeCommit(Boolean value) {
        this.salesRepresentativeCommit = value;
    }

    /**
     * Gets the value of the salesRepresentativeValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryValue }
     *     
     */
    public MonetaryValue getSalesRepresentativeValue() {
        return salesRepresentativeValue;
    }

    /**
     * Sets the value of the salesRepresentativeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryValue }
     *     
     */
    public void setSalesRepresentativeValue(MonetaryValue value) {
        this.salesRepresentativeValue = value;
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
     * Gets the value of the stageWithStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link StageWithStrategy }
     *     
     */
    public StageWithStrategy getStageWithStrategy() {
        return stageWithStrategy;
    }

    /**
     * Sets the value of the stageWithStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StageWithStrategy }
     *     
     */
    public void setStageWithStrategy(StageWithStrategy value) {
        this.stageWithStrategy = value;
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
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the survey property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getSurvey() {
        return survey;
    }

    /**
     * Sets the value of the survey property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setSurvey(NamedID value) {
        this.survey = value;
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
     * Gets the value of the territoryHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *     
     */
    public NamedIDList getTerritoryHierarchy() {
        return territoryHierarchy;
    }

    /**
     * Sets the value of the territoryHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *     
     */
    public void setTerritoryHierarchy(NamedIDList value) {
        this.territoryHierarchy = value;
    }

    /**
     * Gets the value of the winLossDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinLossDescription() {
        return winLossDescription;
    }

    /**
     * Sets the value of the winLossDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinLossDescription(String value) {
        this.winLossDescription = value;
    }

    /**
     * Gets the value of the winLossReason property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getWinLossReason() {
        return winLossReason;
    }

    /**
     * Sets the value of the winLossReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setWinLossReason(NamedID value) {
        this.winLossReason = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityNullFields }
     *     
     */
    public OpportunityNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityNullFields }
     *     
     */
    public void setValidNullFields(OpportunityNullFields value) {
        this.validNullFields = value;
    }

}
