
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.RNObject;


/**
 * <p>Java class for SharedFileAttachmentShared complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharedFileAttachmentShared">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:objects.ws.rightnow.com/v1_2}FileAttachmentShared">
 *       &lt;sequence>
 *         &lt;element name="AttachmentOwner" type="{urn:base.ws.rightnow.com/v1_2}RNObject"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedFileAttachmentShared", propOrder = {
    "attachmentOwner"
})
public class SharedFileAttachmentShared
    extends FileAttachmentShared
{

    @XmlElement(name = "AttachmentOwner", required = true)
    protected RNObject attachmentOwner;

    /**
     * Gets the value of the attachmentOwner property.
     * 
     * @return
     *     possible object is
     *     {@link RNObject }
     *     
     */
    public RNObject getAttachmentOwner() {
        return attachmentOwner;
    }

    /**
     * Sets the value of the attachmentOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObject }
     *     
     */
    public void setAttachmentOwner(RNObject value) {
        this.attachmentOwner = value;
    }

}
