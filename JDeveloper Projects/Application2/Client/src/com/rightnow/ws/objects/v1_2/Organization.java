
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.NamedIDHierarchy;
import com.rightnow.ws.base.v1_2.NamedIDList;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.nullfields.v1_2.OrganizationNullFields;


/**
 * <p>Java class for Organization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Addresses" type="{urn:objects.ws.rightnow.com/v1_2}TypedAddressList" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_2}Banner" minOccurs="0"/>
 *         &lt;element name="CRMModules" type="{urn:objects.ws.rightnow.com/v1_2}CRMModules" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_2}FileAttachmentCommonList" minOccurs="0"/>
 *         &lt;element name="Industry" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameFurigana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_2}NoteList" minOccurs="0"/>
 *         &lt;element name="NumberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrganizationHierarchy" type="{urn:base.ws.rightnow.com/v1_2}NamedIDList" minOccurs="0"/>
 *         &lt;element name="Parent" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="SalesSettings" type="{urn:objects.ws.rightnow.com/v1_2}OrganizationSalesSettings" minOccurs="0"/>
 *         &lt;element name="ServiceSettings" type="{urn:objects.ws.rightnow.com/v1_2}OrganizationServiceSettings" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}OrganizationNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "addresses",
    "banner",
    "crmModules",
    "customFields",
    "fileAttachments",
    "industry",
    "login",
    "name",
    "nameFurigana",
    "newPassword",
    "notes",
    "numberOfEmployees",
    "organizationHierarchy",
    "parent",
    "salesSettings",
    "serviceSettings",
    "source",
    "validNullFields"
})
public class Organization
    extends RNObject
{

    @XmlElement(name = "Addresses", nillable = true)
    protected TypedAddressList addresses;
    @XmlElement(name = "Banner", nillable = true)
    protected Banner banner;
    @XmlElement(name = "CRMModules")
    protected CRMModules crmModules;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "FileAttachments", nillable = true)
    protected FileAttachmentCommonList fileAttachments;
    @XmlElement(name = "Industry", nillable = true)
    protected NamedID industry;
    @XmlElement(name = "Login", nillable = true)
    protected String login;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NameFurigana", nillable = true)
    protected String nameFurigana;
    @XmlElement(name = "NewPassword", nillable = true)
    protected String newPassword;
    @XmlElement(name = "Notes", nillable = true)
    protected NoteList notes;
    @XmlElement(name = "NumberOfEmployees", nillable = true)
    protected Integer numberOfEmployees;
    @XmlElement(name = "OrganizationHierarchy")
    protected NamedIDList organizationHierarchy;
    @XmlElement(name = "Parent", nillable = true)
    protected NamedIDHierarchy parent;
    @XmlElement(name = "SalesSettings")
    protected OrganizationSalesSettings salesSettings;
    @XmlElement(name = "ServiceSettings")
    protected OrganizationServiceSettings serviceSettings;
    @XmlElement(name = "Source")
    protected NamedIDHierarchy source;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected OrganizationNullFields validNullFields;

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link TypedAddressList }
     *     
     */
    public TypedAddressList getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypedAddressList }
     *     
     */
    public void setAddresses(TypedAddressList value) {
        this.addresses = value;
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
     * Gets the value of the crmModules property.
     * 
     * @return
     *     possible object is
     *     {@link CRMModules }
     *     
     */
    public CRMModules getCRMModules() {
        return crmModules;
    }

    /**
     * Sets the value of the crmModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMModules }
     *     
     */
    public void setCRMModules(CRMModules value) {
        this.crmModules = value;
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
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setIndustry(NamedID value) {
        this.industry = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
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
     * Gets the value of the nameFurigana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFurigana() {
        return nameFurigana;
    }

    /**
     * Sets the value of the nameFurigana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFurigana(String value) {
        this.nameFurigana = value;
    }

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
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
     * Gets the value of the numberOfEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Sets the value of the numberOfEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfEmployees(Integer value) {
        this.numberOfEmployees = value;
    }

    /**
     * Gets the value of the organizationHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *     
     */
    public NamedIDList getOrganizationHierarchy() {
        return organizationHierarchy;
    }

    /**
     * Sets the value of the organizationHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *     
     */
    public void setOrganizationHierarchy(NamedIDList value) {
        this.organizationHierarchy = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public NamedIDHierarchy getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public void setParent(NamedIDHierarchy value) {
        this.parent = value;
    }

    /**
     * Gets the value of the salesSettings property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationSalesSettings }
     *     
     */
    public OrganizationSalesSettings getSalesSettings() {
        return salesSettings;
    }

    /**
     * Sets the value of the salesSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationSalesSettings }
     *     
     */
    public void setSalesSettings(OrganizationSalesSettings value) {
        this.salesSettings = value;
    }

    /**
     * Gets the value of the serviceSettings property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationServiceSettings }
     *     
     */
    public OrganizationServiceSettings getServiceSettings() {
        return serviceSettings;
    }

    /**
     * Sets the value of the serviceSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationServiceSettings }
     *     
     */
    public void setServiceSettings(OrganizationServiceSettings value) {
        this.serviceSettings = value;
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
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationNullFields }
     *     
     */
    public OrganizationNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationNullFields }
     *     
     */
    public void setValidNullFields(OrganizationNullFields value) {
        this.validNullFields = value;
    }

}
