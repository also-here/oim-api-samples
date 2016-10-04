
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
import com.rightnow.ws.nullfields.v1_2.ContactNullFields;


/**
 * <p>Java class for Contact complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{urn:objects.ws.rightnow.com/v1_2}Address" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_2}Banner" minOccurs="0"/>
 *         &lt;element name="ChannelUsernames" type="{urn:objects.ws.rightnow.com/v1_2}ChannelUsernameList" minOccurs="0"/>
 *         &lt;element name="ContactType" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="CRMModules" type="{urn:objects.ws.rightnow.com/v1_2}CRMModules" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Emails" type="{urn:objects.ws.rightnow.com/v1_2}EmailList" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_2}FileAttachmentCommonList" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingSettings" type="{urn:objects.ws.rightnow.com/v1_2}ContactMarketingSettings" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:objects.ws.rightnow.com/v1_2}PersonName" minOccurs="0"/>
 *         &lt;element name="NameFurigana" type="{urn:objects.ws.rightnow.com/v1_2}PersonName" minOccurs="0"/>
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_2}NoteList" minOccurs="0"/>
 *         &lt;element name="OpenIDAccounts" type="{urn:objects.ws.rightnow.com/v1_2}ContactOpenIDAccountList" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="PasswordEmailExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PasswordExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Phones" type="{urn:objects.ws.rightnow.com/v1_2}PhoneList" minOccurs="0"/>
 *         &lt;element name="SalesSettings" type="{urn:objects.ws.rightnow.com/v1_2}ContactSalesSettings" minOccurs="0"/>
 *         &lt;element name="ServiceSettings" type="{urn:objects.ws.rightnow.com/v1_2}ContactServiceSettings" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}ContactNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
         "address", "banner", "channelUsernames", "contactType", "crmModules", "customFields", "disabled", "emails",
         "fileAttachments", "login", "marketingSettings", "name", "nameFurigana", "newPassword", "notes",
         "openIDAccounts", "organization", "passwordEmailExpirationTime", "passwordExpirationTime", "phones",
         "salesSettings", "serviceSettings", "source", "title", "validNullFields"
    })
public class Contact extends RNObject {

    @XmlElement(name = "Address", nillable = true)
    protected Address address;
    @XmlElement(name = "Banner", nillable = true)
    protected Banner banner;
    @XmlElement(name = "ChannelUsernames", nillable = true)
    protected ChannelUsernameList channelUsernames;
    @XmlElement(name = "ContactType", nillable = true)
    protected NamedID contactType;
    @XmlElement(name = "CRMModules")
    protected CRMModules crmModules;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "Disabled")
    protected Boolean disabled;
    @XmlElement(name = "Emails", nillable = true)
    protected EmailList emails;
    @XmlElement(name = "FileAttachments", nillable = true)
    protected FileAttachmentCommonList fileAttachments;
    @XmlElement(name = "Login", nillable = true)
    protected String login;
    @XmlElement(name = "MarketingSettings")
    protected ContactMarketingSettings marketingSettings;
    @XmlElement(name = "Name")
    protected PersonName name;
    @XmlElement(name = "NameFurigana")
    protected PersonName nameFurigana;
    @XmlElement(name = "NewPassword", nillable = true)
    protected String newPassword;
    @XmlElement(name = "Notes", nillable = true)
    protected NoteList notes;
    @XmlElement(name = "OpenIDAccounts")
    protected ContactOpenIDAccountList openIDAccounts;
    @XmlElement(name = "Organization", nillable = true)
    protected NamedID organization;
    @XmlElement(name = "PasswordEmailExpirationTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passwordEmailExpirationTime;
    @XmlElement(name = "PasswordExpirationTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passwordExpirationTime;
    @XmlElement(name = "Phones")
    protected PhoneList phones;
    @XmlElement(name = "SalesSettings")
    protected ContactSalesSettings salesSettings;
    @XmlElement(name = "ServiceSettings")
    protected ContactServiceSettings serviceSettings;
    @XmlElement(name = "Source")
    protected NamedIDHierarchy source;
    @XmlElement(name = "Title", nillable = true)
    protected String title;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected ContactNullFields validNullFields;

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link Address }
     *
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link Address }
     *
     */
    public void setAddress(Address value) {
        this.address = value;
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
     * Gets the value of the channelUsernames property.
     *
     * @return
     *     possible object is
     *     {@link ChannelUsernameList }
     *
     */
    public ChannelUsernameList getChannelUsernames() {
        return channelUsernames;
    }

    /**
     * Sets the value of the channelUsernames property.
     *
     * @param value
     *     allowed object is
     *     {@link ChannelUsernameList }
     *
     */
    public void setChannelUsernames(ChannelUsernameList value) {
        this.channelUsernames = value;
    }

    /**
     * Gets the value of the contactType property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setContactType(NamedID value) {
        this.contactType = value;
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
     * Gets the value of the disabled property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the emails property.
     *
     * @return
     *     possible object is
     *     {@link EmailList }
     *
     */
    public EmailList getEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     *
     * @param value
     *     allowed object is
     *     {@link EmailList }
     *
     */
    public void setEmails(EmailList value) {
        this.emails = value;
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
     * Gets the value of the marketingSettings property.
     *
     * @return
     *     possible object is
     *     {@link ContactMarketingSettings }
     *
     */
    public ContactMarketingSettings getMarketingSettings() {
        return marketingSettings;
    }

    /**
     * Sets the value of the marketingSettings property.
     *
     * @param value
     *     allowed object is
     *     {@link ContactMarketingSettings }
     *
     */
    public void setMarketingSettings(ContactMarketingSettings value) {
        this.marketingSettings = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link PersonName }
     *
     */
    public PersonName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *
     */
    public void setName(PersonName value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameFurigana property.
     *
     * @return
     *     possible object is
     *     {@link PersonName }
     *
     */
    public PersonName getNameFurigana() {
        return nameFurigana;
    }

    /**
     * Sets the value of the nameFurigana property.
     *
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *
     */
    public void setNameFurigana(PersonName value) {
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
     * Gets the value of the openIDAccounts property.
     *
     * @return
     *     possible object is
     *     {@link ContactOpenIDAccountList }
     *
     */
    public ContactOpenIDAccountList getOpenIDAccounts() {
        return openIDAccounts;
    }

    /**
     * Sets the value of the openIDAccounts property.
     *
     * @param value
     *     allowed object is
     *     {@link ContactOpenIDAccountList }
     *
     */
    public void setOpenIDAccounts(ContactOpenIDAccountList value) {
        this.openIDAccounts = value;
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
     * Gets the value of the passwordEmailExpirationTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPasswordEmailExpirationTime() {
        return passwordEmailExpirationTime;
    }

    /**
     * Sets the value of the passwordEmailExpirationTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setPasswordEmailExpirationTime(XMLGregorianCalendar value) {
        this.passwordEmailExpirationTime = value;
    }

    /**
     * Gets the value of the passwordExpirationTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPasswordExpirationTime() {
        return passwordExpirationTime;
    }

    /**
     * Sets the value of the passwordExpirationTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setPasswordExpirationTime(XMLGregorianCalendar value) {
        this.passwordExpirationTime = value;
    }

    /**
     * Gets the value of the phones property.
     *
     * @return
     *     possible object is
     *     {@link PhoneList }
     *
     */
    public PhoneList getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     *
     * @param value
     *     allowed object is
     *     {@link PhoneList }
     *
     */
    public void setPhones(PhoneList value) {
        this.phones = value;
    }

    /**
     * Gets the value of the salesSettings property.
     *
     * @return
     *     possible object is
     *     {@link ContactSalesSettings }
     *
     */
    public ContactSalesSettings getSalesSettings() {
        return salesSettings;
    }

    /**
     * Sets the value of the salesSettings property.
     *
     * @param value
     *     allowed object is
     *     {@link ContactSalesSettings }
     *
     */
    public void setSalesSettings(ContactSalesSettings value) {
        this.salesSettings = value;
    }

    /**
     * Gets the value of the serviceSettings property.
     *
     * @return
     *     possible object is
     *     {@link ContactServiceSettings }
     *
     */
    public ContactServiceSettings getServiceSettings() {
        return serviceSettings;
    }

    /**
     * Sets the value of the serviceSettings property.
     *
     * @param value
     *     allowed object is
     *     {@link ContactServiceSettings }
     *
     */
    public void setServiceSettings(ContactServiceSettings value) {
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
     * Gets the value of the title property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link ContactNullFields }
     *
     */
    public ContactNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link ContactNullFields }
     *
     */
    public void setValidNullFields(ContactNullFields value) {
        this.validNullFields = value;
    }

}
