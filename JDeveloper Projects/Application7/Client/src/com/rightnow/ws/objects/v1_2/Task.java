
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.nullfields.v1_2.TaskNullFields;


/**
 * <p>Java class for Task complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Task">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AssignedToAccount" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompletedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Contact" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="DueTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_2}FileAttachmentCommonList" minOccurs="0"/>
 *         &lt;element name="Inherit" type="{urn:objects.ws.rightnow.com/v1_2}InheritOptions" minOccurs="0"/>
 *         &lt;element name="MarketingSettings" type="{urn:objects.ws.rightnow.com/v1_2}TaskMarketingSettings" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_2}NoteList" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PlannedCompletionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Priority" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="SalesSettings" type="{urn:objects.ws.rightnow.com/v1_2}TaskSalesSettings" minOccurs="0"/>
 *         &lt;element name="ServiceSettings" type="{urn:objects.ws.rightnow.com/v1_2}TaskServiceSettings" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_2}StatusWithType" minOccurs="0"/>
 *         &lt;element name="TaskTemplate" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="TaskType" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}TaskNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Task", propOrder = {
         "assignedToAccount", "comment", "completedTime", "contact", "customFields", "dueTime", "fileAttachments",
         "inherit", "marketingSettings", "name", "notes", "organization", "percentComplete", "plannedCompletionTime",
         "priority", "salesSettings", "serviceSettings", "startTime", "statusWithType", "taskTemplate", "taskType",
         "validNullFields"
    })
public class Task extends RNObject {

    @XmlElement(name = "AssignedToAccount", nillable = true)
    protected NamedID assignedToAccount;
    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "CompletedTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completedTime;
    @XmlElement(name = "Contact", nillable = true)
    protected NamedID contact;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "DueTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueTime;
    @XmlElement(name = "FileAttachments", nillable = true)
    protected FileAttachmentCommonList fileAttachments;
    @XmlElement(name = "Inherit")
    protected InheritOptions inherit;
    @XmlElement(name = "MarketingSettings")
    protected TaskMarketingSettings marketingSettings;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Notes", nillable = true)
    protected NoteList notes;
    @XmlElement(name = "Organization", nillable = true)
    protected NamedID organization;
    @XmlElement(name = "PercentComplete", nillable = true)
    protected Integer percentComplete;
    @XmlElement(name = "PlannedCompletionTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedCompletionTime;
    @XmlElement(name = "Priority", nillable = true)
    protected NamedID priority;
    @XmlElement(name = "SalesSettings")
    protected TaskSalesSettings salesSettings;
    @XmlElement(name = "ServiceSettings")
    protected TaskServiceSettings serviceSettings;
    @XmlElement(name = "StartTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "StatusWithType")
    protected StatusWithType statusWithType;
    @XmlElement(name = "TaskTemplate")
    protected NamedID taskTemplate;
    @XmlElement(name = "TaskType", nillable = true)
    protected NamedID taskType;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected TaskNullFields validNullFields;

    /**
     * Gets the value of the assignedToAccount property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getAssignedToAccount() {
        return assignedToAccount;
    }

    /**
     * Sets the value of the assignedToAccount property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setAssignedToAccount(NamedID value) {
        this.assignedToAccount = value;
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
     * Gets the value of the completedTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCompletedTime() {
        return completedTime;
    }

    /**
     * Sets the value of the completedTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCompletedTime(XMLGregorianCalendar value) {
        this.completedTime = value;
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
     * Gets the value of the dueTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDueTime() {
        return dueTime;
    }

    /**
     * Sets the value of the dueTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDueTime(XMLGregorianCalendar value) {
        this.dueTime = value;
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
     * Gets the value of the inherit property.
     *
     * @return
     *     possible object is
     *     {@link InheritOptions }
     *
     */
    public InheritOptions getInherit() {
        return inherit;
    }

    /**
     * Sets the value of the inherit property.
     *
     * @param value
     *     allowed object is
     *     {@link InheritOptions }
     *
     */
    public void setInherit(InheritOptions value) {
        this.inherit = value;
    }

    /**
     * Gets the value of the marketingSettings property.
     *
     * @return
     *     possible object is
     *     {@link TaskMarketingSettings }
     *
     */
    public TaskMarketingSettings getMarketingSettings() {
        return marketingSettings;
    }

    /**
     * Sets the value of the marketingSettings property.
     *
     * @param value
     *     allowed object is
     *     {@link TaskMarketingSettings }
     *
     */
    public void setMarketingSettings(TaskMarketingSettings value) {
        this.marketingSettings = value;
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
     * Gets the value of the percentComplete property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPercentComplete() {
        return percentComplete;
    }

    /**
     * Sets the value of the percentComplete property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPercentComplete(Integer value) {
        this.percentComplete = value;
    }

    /**
     * Gets the value of the plannedCompletionTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPlannedCompletionTime() {
        return plannedCompletionTime;
    }

    /**
     * Sets the value of the plannedCompletionTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setPlannedCompletionTime(XMLGregorianCalendar value) {
        this.plannedCompletionTime = value;
    }

    /**
     * Gets the value of the priority property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setPriority(NamedID value) {
        this.priority = value;
    }

    /**
     * Gets the value of the salesSettings property.
     *
     * @return
     *     possible object is
     *     {@link TaskSalesSettings }
     *
     */
    public TaskSalesSettings getSalesSettings() {
        return salesSettings;
    }

    /**
     * Sets the value of the salesSettings property.
     *
     * @param value
     *     allowed object is
     *     {@link TaskSalesSettings }
     *
     */
    public void setSalesSettings(TaskSalesSettings value) {
        this.salesSettings = value;
    }

    /**
     * Gets the value of the serviceSettings property.
     *
     * @return
     *     possible object is
     *     {@link TaskServiceSettings }
     *
     */
    public TaskServiceSettings getServiceSettings() {
        return serviceSettings;
    }

    /**
     * Sets the value of the serviceSettings property.
     *
     * @param value
     *     allowed object is
     *     {@link TaskServiceSettings }
     *
     */
    public void setServiceSettings(TaskServiceSettings value) {
        this.serviceSettings = value;
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
     * Gets the value of the taskTemplate property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getTaskTemplate() {
        return taskTemplate;
    }

    /**
     * Sets the value of the taskTemplate property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setTaskTemplate(NamedID value) {
        this.taskTemplate = value;
    }

    /**
     * Gets the value of the taskType property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getTaskType() {
        return taskType;
    }

    /**
     * Sets the value of the taskType property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setTaskType(NamedID value) {
        this.taskType = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link TaskNullFields }
     *
     */
    public TaskNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link TaskNullFields }
     *
     */
    public void setValidNullFields(TaskNullFields value) {
        this.validNullFields = value;
    }

}
