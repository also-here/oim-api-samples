
package com.rightnow.ws.objects.v1_2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetSLAInstanceList complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AssetSLAInstanceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetSLAInstanceList" type="{urn:objects.ws.rightnow.com/v1_2}AssetSLAInstance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetSLAInstanceList", propOrder = { "assetSLAInstanceList" })
public class AssetSLAInstanceList {

    @XmlElement(name = "AssetSLAInstanceList")
    protected List<AssetSLAInstance> assetSLAInstanceList;

    /**
     * Gets the value of the assetSLAInstanceList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetSLAInstanceList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetSLAInstanceList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetSLAInstance }
     *
     *
     */
    public List<AssetSLAInstance> getAssetSLAInstanceList() {
        if (assetSLAInstanceList == null) {
            assetSLAInstanceList = new ArrayList<AssetSLAInstance>();
        }
        return this.assetSLAInstanceList;
    }

}
