
package com.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetParentFolderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetParentFolderRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Store" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetParentFolderRequest", propOrder = {
    "path",
    "store"
})
public class GetParentFolderRequest {

    @XmlElement(name = "Path", required = true)
    protected String path;
    @XmlElement(name = "Store")
    protected String store;

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the store property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStore() {
        return store;
    }

    /**
     * Sets the value of the store property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStore(String value) {
        this.store = value;
    }

}
