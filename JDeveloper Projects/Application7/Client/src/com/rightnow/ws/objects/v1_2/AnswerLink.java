
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.rightnow.ws.base.v1_2.ActionEnum;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.nullfields.v1_2.AnswerLinkNullFields;


/**
 * <p>Java class for AnswerLink complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AnswerLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LearnedLinkStrength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ManualLinkStrength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ToAnswer" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}AnswerLinkNullFields" minOccurs="0"/>
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
@XmlType(name = "AnswerLink", propOrder = {
         "learnedLinkStrength", "manualLinkStrength", "toAnswer", "validNullFields" })
public class AnswerLink {

    @XmlElement(name = "LearnedLinkStrength", nillable = true)
    protected Integer learnedLinkStrength;
    @XmlElement(name = "ManualLinkStrength")
    protected Integer manualLinkStrength;
    @XmlElement(name = "ToAnswer")
    protected NamedID toAnswer;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected AnswerLinkNullFields validNullFields;
    @XmlAttribute(name = "action")
    protected ActionEnum action;

    /**
     * Gets the value of the learnedLinkStrength property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getLearnedLinkStrength() {
        return learnedLinkStrength;
    }

    /**
     * Sets the value of the learnedLinkStrength property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setLearnedLinkStrength(Integer value) {
        this.learnedLinkStrength = value;
    }

    /**
     * Gets the value of the manualLinkStrength property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getManualLinkStrength() {
        return manualLinkStrength;
    }

    /**
     * Sets the value of the manualLinkStrength property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setManualLinkStrength(Integer value) {
        this.manualLinkStrength = value;
    }

    /**
     * Gets the value of the toAnswer property.
     *
     * @return
     *     possible object is
     *     {@link NamedID }
     *
     */
    public NamedID getToAnswer() {
        return toAnswer;
    }

    /**
     * Sets the value of the toAnswer property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *
     */
    public void setToAnswer(NamedID value) {
        this.toAnswer = value;
    }

    /**
     * Gets the value of the validNullFields property.
     *
     * @return
     *     possible object is
     *     {@link AnswerLinkNullFields }
     *
     */
    public AnswerLinkNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     *
     * @param value
     *     allowed object is
     *     {@link AnswerLinkNullFields }
     *
     */
    public void setValidNullFields(AnswerLinkNullFields value) {
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
