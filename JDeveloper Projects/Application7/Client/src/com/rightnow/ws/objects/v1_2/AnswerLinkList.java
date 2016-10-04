
package com.rightnow.ws.objects.v1_2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnswerLinkList complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AnswerLinkList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnswerLinkList" type="{urn:objects.ws.rightnow.com/v1_2}AnswerLink" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerLinkList", propOrder = { "answerLinkList" })
public class AnswerLinkList {

    @XmlElement(name = "AnswerLinkList")
    protected List<AnswerLink> answerLinkList;

    /**
     * Gets the value of the answerLinkList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the answerLinkList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnswerLinkList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnswerLink }
     *
     *
     */
    public List<AnswerLink> getAnswerLinkList() {
        if (answerLinkList == null) {
            answerLinkList = new ArrayList<AnswerLink>();
        }
        return this.answerLinkList;
    }

}
