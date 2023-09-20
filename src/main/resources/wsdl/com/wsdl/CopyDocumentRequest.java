
package com.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CopyDocumentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CopyDocumentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="targetURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="targetOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyDocumentRequest", propOrder = {
    "documentId",
    "targetURL",
    "targetOS",
    "targetUsername",
    "targetPassword"
})
public class CopyDocumentRequest {

    @XmlElement(required = true)
    protected String documentId;
    @XmlElement(required = true)
    protected String targetURL;
    protected String targetOS;
    protected String targetUsername;
    protected String targetPassword;

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the targetURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetURL() {
        return targetURL;
    }

    /**
     * Sets the value of the targetURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetURL(String value) {
        this.targetURL = value;
    }

    /**
     * Gets the value of the targetOS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetOS() {
        return targetOS;
    }

    /**
     * Sets the value of the targetOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetOS(String value) {
        this.targetOS = value;
    }

    /**
     * Gets the value of the targetUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetUsername() {
        return targetUsername;
    }

    /**
     * Sets the value of the targetUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetUsername(String value) {
        this.targetUsername = value;
    }

    /**
     * Gets the value of the targetPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPassword() {
        return targetPassword;
    }

    /**
     * Sets the value of the targetPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPassword(String value) {
        this.targetPassword = value;
    }

}
