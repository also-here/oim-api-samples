
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.NamedIDDeltaList;
import com.rightnow.ws.base.v1_2.NamedIDHierarchyList;
import com.rightnow.ws.base.v1_2.NamedIDList;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.nullfields.v1_2.AnswerNullFields;


/**
 * <p>Java class for Answer complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Answer">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AccessLevels" type="{urn:base.ws.rightnow.com/v1_2}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="AdminLastAccessTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AnswerType" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="AssignedSibling" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="AssignedTo" type="{urn:objects.ws.rightnow.com/v1_2}GroupAccount" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_2}Banner" minOccurs="0"/>
 *         &lt;element name="Categories" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchyList" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommonAttachments" type="{urn:objects.ws.rightnow.com/v1_2}FileAttachmentSharedList" minOccurs="0"/>
 *         &lt;element name="CommonComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="ExpiresDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_2}FileAttachmentAnswerList" minOccurs="0"/>
 *         &lt;element name="GuidedAssistance" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="LastAccessTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastNotificationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Links" type="{urn:objects.ws.rightnow.com/v1_2}AnswerLinkList" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextNotificationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_2}NoteList" minOccurs="0"/>
 *         &lt;element name="OriginalReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionInList" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Products" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchyList" minOccurs="0"/>
 *         &lt;element name="PublishOnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Question" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiblingAnswers" type="{urn:base.ws.rightnow.com/v1_2}NamedIDList" minOccurs="0"/>
 *         &lt;element name="Solution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_2}StatusWithType" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedByAccount" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}AnswerNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Answer", propOrder = {
         "accessLevels", "adminLastAccessTime", "answerType", "assignedSibling", "assignedTo", "banner", "categories",
         "comment", "commonAttachments", "commonComment", "customFields", "expiresDate", "fileAttachments",
         "guidedAssistance", "keywords", "language", "lastAccessTime", "lastNotificationTime", "links", "name",
         "nextNotificationTime", "notes", "originalReferenceNumber", "positionInList", "products", "publishOnDate",
         "question", "siblingAnswers", "solution", "statusWithType", "summary", "updatedByAccount", "url",
         "validNullFields"
    })
public class Answer extends RNObject {

    @XmlElement(name = "AccessLevels", nillable = true)
    protected NamedIDDeltaList accessLevels;
    @XmlElement(name = "AdminLastAccessTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar adminLastAccessTime;
    @XmlElement(name = "AnswerType")
    protected NamedID answerType;
    @XmlElement(name = "AssignedSibling", nillable = true)
    protected NamedID assignedSibling;
    @XmlElement(name = "AssignedTo")
    protected GroupAccount assignedTo;
    @XmlElement(name = "Banner", nillable = true)
    protected Banner banner;
    @XmlElement(name = "Categories", nillable = true)
    protected NamedIDHierarchyList categories;
    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "CommonAttachments", nillable = true)
    protected FileAttachmentSharedList commonAttachments;
    @XmlElement(name = "CommonComment", nillable = true)
    protected String commonComment;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "ExpiresDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiresDate;
    @XmlElement(name = "FileAttachments", nillable = true)
    protected FileAttachmentAnswerList fileAttachments;
    @XmlElement(name = "GuidedAssistance", nillable = true)
    protected NamedID guidedAssistance;
    @XmlElement(name = "Keywords", nillable = true)
    protected String keywords;
    @XmlElement(name = "Language")
    protected NamedID language;
    @XmlElement(name = "LastAccessTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAccessTime;
    @XmlElement(name = "LastNotificationTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastNotificationTime;
    @XmlElement(name = "Links", nillable = true)
    protected AnswerLinkList links;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NextNotificationTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextNotificationTime;
    @XmlElement(name = "Notes", nillable = true)
    protected NoteList notes;
    @XmlElement(name = "OriginalReferenceNumber", nillable = true)
    protected String originalReferenceNumber;
    @XmlElement(name = "PositionInList")
    protected NamedID positionInList;
    @XmlElement(name = "Products", nillable = true)
    protected NamedIDHierarchyList products;
    @XmlElement(name = "PublishOnDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publishOnDate;
    @XmlElement(name = "Question", nillable = true)
    protected String question;
    @XmlElement(name = "SiblingAnswers", nillable = true)
    protected NamedIDList siblingAnswers;
    @XmlElement(name = "Solution", nillable = true)
    protected String solution;
    @XmlElement(name = "StatusWithType")
    protected StatusWithType statusWithType;
    @XmlElement(name = "Summary")
    protected String summary;
    @XmlElement(name = "UpdatedByAccount", nillable = true)
    protected NamedID updatedByAccount;
    @XmlElement(name = "URL", nillable = true)
    protected String url;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected AnswerNullFields validNullFields;

    /**
     * Gets the value of the accessLevels property.
     *
     * @return
     *     possible object is
     *     {@link NamedIDDeltaList }
     *
     */
    public NamedIDDeltaList getAccessLevels() {
        return accessLevels;
    }

    /**
     * Sets the value of the accessLevels property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedIDDeltaList }
     *
     */
    public void setAccessLevels(NamedIDDeltaList value) {
        this.accessLevels = value;
    }

    /**
     * Gets the value of the adminLastAccessTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getAdminLastAccessTime() {
        return adminLastAccessTime;
    }

    /**
     * Sets the value of the adminLastAccessTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setAdminLastAccessTime(XMLGregorianCalendar value) {
        this.adminLastAccessTime = value;
    }

    /**
     * Gets the value of the answerType property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getAnswerType() {
        return answerType;
    }

    /**
     * Sets the value of the answerType property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setAnswerType(NamedID value) {
        this.answerType = value;
    }

    /**
     * Gets the value of the assignedSibling property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getAssignedSibling() {
        return assignedSibling;
    }

    /**
     * Sets the value of the assignedSibling property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setAssignedSibling(NamedID value) {
        this.assignedSibling = value;
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
     * Gets the value of the categories property.
     *
     * @return
     *     possible object is
     *     {@link NamedIDHierarchyList }
     *
     */
    public NamedIDHierarchyList getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchyList }
     *
     */
    public void setCategories(NamedIDHierarchyList value) {
        this.categories = value;
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
     * Gets the value of the commonAttachments property.
     *
     * @return
     *     possible object is
     *     {@link FileAttachmentSharedList }
     *
     */
    public FileAttachmentSharedList getCommonAttachments() {
        return commonAttachments;
    }

    /**
     * Sets the value of the commonAttachments property.
     *
     * @param value
     *     allowed object is
     *     {@link FileAttachmentSharedList }
     *
     */
    public void setCommonAttachments(FileAttachmentSharedList value) {
        this.commonAttachments = value;
    }

    /**
     * Gets the value of the commonComment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCommonComment() {
        return commonComment;
    }

    /**
     * Sets the value of the commonComment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCommonComment(String value) {
        this.commonComment = value;
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
     * Gets the value of the expiresDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getExpiresDate() {
        return expiresDate;
    }

    /**
     * Sets the value of the expiresDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setExpiresDate(XMLGregorianCalendar value) {
        this.expiresDate = value;
    }

    /**
     * Gets the value of the fileAttachments property.
     *
     * @return
     *     possible object is
     *     {@link FileAttachmentAnswerList }
     *
     */
    public FileAttachmentAnswerList getFileAttachments() {
        return fileAttachments;
    }

    /**
     * Sets the value of the fileAttachments property.
     *
     * @param value
     *     allowed object is
     *     {@link FileAttachmentAnswerList }
     *
     */
    public void setFileAttachments(FileAttachmentAnswerList value) {
        this.fileAttachments = value;
    }

    /**
     * Gets the value of the guidedAssistance property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getGuidedAssistance() {
        return guidedAssistance;
    }

    /**
     * Sets the value of the guidedAssistance property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setGuidedAssistance(NamedID value) {
        this.guidedAssistance = value;
    }

    /**
     * Gets the value of the keywords property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKeywords(String value) {
        this.keywords = value;
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
     * Gets the value of the lastAccessTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * Sets the value of the lastAccessTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setLastAccessTime(XMLGregorianCalendar value) {
        this.lastAccessTime = value;
    }

    /**
     * Gets the value of the lastNotificationTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLastNotificationTime() {
        return lastNotificationTime;
    }

    /**
     * Sets the value of the lastNotificationTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setLastNotificationTime(XMLGregorianCalendar value) {
        this.lastNotificationTime = value;
    }

    /**
     * Gets the value of the links property.
     *
     * @return
     *     possible object is
     *     {@link AnswerLinkList }
     *
     */
    public AnswerLinkList getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     *
     * @param value
     *     allowed object is
     *     {@link AnswerLinkList }
     *
     */
    public void setLinks(AnswerLinkList value) {
        this.links = value;
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
     * Gets the value of the nextNotificationTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getNextNotificationTime() {
        return nextNotificationTime;
    }

    /**
     * Sets the value of the nextNotificationTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setNextNotificationTime(XMLGregorianCalendar value) {
        this.nextNotificationTime = value;
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
     * Gets the value of the originalReferenceNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginalReferenceNumber() {
        return originalReferenceNumber;
    }

    /**
     * Sets the value of the originalReferenceNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginalReferenceNumber(String value) {
        this.originalReferenceNumber = value;
    }

    /**
     * Gets the value of the positionInList property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getPositionInList() {
        return positionInList;
    }

    /**
     * Sets the value of the positionInList property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setPositionInList(NamedID value) {
        this.positionInList = value;
    }

    /**
     * Gets the value of the products property.
     *
     * @return
     *     possible object is
     *     {@link NamedIDHierarchyList }
     *
     */
    public NamedIDHierarchyList getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchyList }
     *
     */
    public void setProducts(NamedIDHierarchyList value) {
        this.products = value;
    }

    /**
     * Gets the value of the publishOnDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPublishOnDate() {
        return publishOnDate;
    }

    /**
     * Sets the value of the publishOnDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setPublishOnDate(XMLGregorianCalendar value) {
        this.publishOnDate = value;
    }

    /**
     * Gets the value of the question property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQuestion(String value) {
        this.question = value;
    }

    /**
     * Gets the value of the siblingAnswers property.
     *
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *
     */
    public NamedIDList getSiblingAnswers() {
        return siblingAnswers;
    }

    /**
     * Sets the value of the siblingAnswers property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *
     */
    public void setSiblingAnswers(NamedIDList value) {
        this.siblingAnswers = value;
    }

    /**
     * Gets the value of the solution property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSolution() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSolution(String value) {
        this.solution = value;
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
     * Gets the value of the updatedByAccount property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getUpdatedByAccount() {
        return updatedByAccount;
    }

    /**
     * Sets the value of the updatedByAccount property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setUpdatedByAccount(NamedID value) {
        this.updatedByAccount = value;
    }

    /**
     * Gets the value of the url property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link AnswerNullFields }
     *
     */
    public AnswerNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link AnswerNullFields }
     *
     */
    public void setValidNullFields(AnswerNullFields value) {
        this.validNullFields = value;
    }

}
