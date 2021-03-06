
package com.rightnow.ws.objects.v1_2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryNotificationList complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CategoryNotificationList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryNotificationList" type="{urn:objects.ws.rightnow.com/v1_2}CategoryNotification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryNotificationList", propOrder = { "categoryNotificationList" })
public class CategoryNotificationList {

    @XmlElement(name = "CategoryNotificationList")
    protected List<CategoryNotification> categoryNotificationList;

    /**
     * Gets the value of the categoryNotificationList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryNotificationList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryNotificationList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryNotification }
     *
     *
     */
    public List<CategoryNotification> getCategoryNotificationList() {
        if (categoryNotificationList == null) {
            categoryNotificationList = new ArrayList<CategoryNotification>();
        }
        return this.categoryNotificationList;
    }

}
