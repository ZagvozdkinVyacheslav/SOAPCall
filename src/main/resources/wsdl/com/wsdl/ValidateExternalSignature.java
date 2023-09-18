
package com.wsdl;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateExternalSignature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateExternalSignature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SignatureContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="DocumentContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="CreateAdvanced" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateExternalSignature", propOrder = {
    "signatureContent",
    "documentContent",
    "createAdvanced"
})
public class ValidateExternalSignature {

    @XmlElement(name = "SignatureContent", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler signatureContent;
    @XmlElement(name = "DocumentContent")
    @XmlMimeType("application/octet-stream")
    protected DataHandler documentContent;
    @XmlElement(name = "CreateAdvanced", defaultValue = "false")
    protected boolean createAdvanced;

    /**
     * Gets the value of the signatureContent property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getSignatureContent() {
        return signatureContent;
    }

    /**
     * Sets the value of the signatureContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setSignatureContent(DataHandler value) {
        this.signatureContent = value;
    }

    /**
     * Gets the value of the documentContent property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getDocumentContent() {
        return documentContent;
    }

    /**
     * Sets the value of the documentContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setDocumentContent(DataHandler value) {
        this.documentContent = value;
    }

    /**
     * Gets the value of the createAdvanced property.
     * 
     */
    public boolean isCreateAdvanced() {
        return createAdvanced;
    }

    /**
     * Sets the value of the createAdvanced property.
     * 
     */
    public void setCreateAdvanced(boolean value) {
        this.createAdvanced = value;
    }

}
