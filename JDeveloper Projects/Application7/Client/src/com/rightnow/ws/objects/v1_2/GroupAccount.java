
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.nullfields.v1_2.GroupAccountNullFields;


/**
 * <p>Java class for GroupAccount complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GroupAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="StaffGroup" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}GroupAccountNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupAccount", propOrder = { "account", "staffGroup", "validNullFields" })
public class GroupAccount {

    @XmlElement(name = "Account", nillable = true)
    protected NamedID account;
    @XmlElement(name = "StaffGroup", nillable = true)
    protected NamedID staffGroup;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected GroupAccountNullFields validNullFields;

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
     * Gets the value of the staffGroup property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getStaffGroup() {
        return staffGroup;
    }

    /**
     * Sets the value of the staffGroup property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setStaffGroup(NamedID value) {
        this.staffGroup = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link GroupAccountNullFields }
     *
     */
    public GroupAccountNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link GroupAccountNullFields }
     *
     */
    public void setValidNullFields(GroupAccountNullFields value) {
        this.validNullFields = value;
    }

}
