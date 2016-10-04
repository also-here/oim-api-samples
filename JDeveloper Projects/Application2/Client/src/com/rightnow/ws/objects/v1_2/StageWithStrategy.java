
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.nullfields.v1_2.StageWithStrategyNullFields;


/**
 * <p>Java class for StageWithStrategy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StageWithStrategy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Stage" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Strategy" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}StageWithStrategyNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StageWithStrategy", propOrder = {
    "stage",
    "strategy",
    "validNullFields"
})
public class StageWithStrategy {

    @XmlElement(name = "Stage", nillable = true)
    protected NamedID stage;
    @XmlElement(name = "Strategy", nillable = true)
    protected NamedID strategy;
    @XmlElement(name = "ValidNullFields", nillable = true)
    protected StageWithStrategyNullFields validNullFields;

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setStage(NamedID value) {
        this.stage = value;
    }

    /**
     * Gets the value of the strategy property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getStrategy() {
        return strategy;
    }

    /**
     * Sets the value of the strategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setStrategy(NamedID value) {
        this.strategy = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link StageWithStrategyNullFields }
     *     
     */
    public StageWithStrategyNullFields getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link StageWithStrategyNullFields }
     *     
     */
    public void setValidNullFields(StageWithStrategyNullFields value) {
        this.validNullFields = value;
    }

}
