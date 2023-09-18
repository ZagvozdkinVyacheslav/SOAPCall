
package com.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateDocumentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateDocumentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Document" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="SSOID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DocumentClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FromSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="properties" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Property" type="{http://cloud.mos.ru/customWebService2/}Property" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServerStore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDocumentRequest", propOrder = {
    "document",
    "ssoid",
    "documentClass",
    "fromSystemCode",
    "urn",
    "path",
    "properties",
    "server",
    "serverStore"
})
public class CreateDocumentRequest {

    @XmlElement(name = "Document", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler document;
    @XmlElement(name = "SSOID", required = true)
    protected String ssoid;
    @XmlElement(name = "DocumentClass", required = true)
    protected String documentClass;
    @XmlElement(name = "FromSystemCode")
    protected String fromSystemCode;
    @XmlElement(name = "URN")
    protected String urn;
    @XmlElement(name = "Path")
    protected String path;
    protected CreateDocumentRequest.Properties properties;
    @XmlElement(name = "Server")
    protected String server;
    @XmlElement(name = "ServerStore")
    protected String serverStore;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setDocument(DataHandler value) {
        this.document = value;
    }

    /**
     * Gets the value of the ssoid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSOID() {
        return ssoid;
    }

    /**
     * Sets the value of the ssoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSOID(String value) {
        this.ssoid = value;
    }

    /**
     * Gets the value of the documentClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentClass() {
        return documentClass;
    }

    /**
     * Sets the value of the documentClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentClass(String value) {
        this.documentClass = value;
    }

    /**
     * Gets the value of the fromSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromSystemCode() {
        return fromSystemCode;
    }

    /**
     * Sets the value of the fromSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromSystemCode(String value) {
        this.fromSystemCode = value;
    }

    /**
     * Gets the value of the urn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURN() {
        return urn;
    }

    /**
     * Sets the value of the urn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURN(String value) {
        this.urn = value;
    }

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
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link CreateDocumentRequest.Properties }
     *     
     */
    public CreateDocumentRequest.Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateDocumentRequest.Properties }
     *     
     */
    public void setProperties(CreateDocumentRequest.Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServer(String value) {
        this.server = value;
    }

    /**
     * Gets the value of the serverStore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerStore() {
        return serverStore;
    }

    /**
     * Sets the value of the serverStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerStore(String value) {
        this.serverStore = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Property" type="{http://cloud.mos.ru/customWebService2/}Property" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "property"
    })
    public static class Properties {

        @XmlElement(name = "Property")
        protected List<Property> property;

        /**
         * Gets the value of the property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Property }
         * 
         * 
         */
        public List<Property> getProperty() {
            if (property == null) {
                property = new ArrayList<Property>();
            }
            return this.property;
        }

    }

}
