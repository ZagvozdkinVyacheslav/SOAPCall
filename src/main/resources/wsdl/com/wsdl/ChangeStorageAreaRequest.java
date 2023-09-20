
package com.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeStorageAreaRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeStorageAreaRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="storageArea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="objectStore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeStorageAreaRequest", propOrder = {
    "documentId",
    "storageArea",
    "objectStore"
})
public class ChangeStorageAreaRequest {

    @XmlElement(required = true)
    protected List<String> documentId;
    @XmlElement(required = true)
    protected String storageArea;
    protected String objectStore;

    /**
     * Gets the value of the documentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDocumentId() {
        if (documentId == null) {
            documentId = new ArrayList<String>();
        }
        return this.documentId;
    }

    /**
     * Gets the value of the storageArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageArea() {
        return storageArea;
    }

    /**
     * Sets the value of the storageArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageArea(String value) {
        this.storageArea = value;
    }

    /**
     * Gets the value of the objectStore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectStore() {
        return objectStore;
    }

    /**
     * Sets the value of the objectStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectStore(String value) {
        this.objectStore = value;
    }

}
