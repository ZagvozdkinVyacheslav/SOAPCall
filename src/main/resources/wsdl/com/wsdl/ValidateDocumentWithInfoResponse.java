
package com.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateDocumentWithInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateDocumentWithInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="validateInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ValidateInfo" type="{http://cloud.mos.ru/customWebService2/}ValidateDocumentInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateDocumentWithInfoResponse", propOrder = {
    "documentId",
    "validateInfo"
})
public class ValidateDocumentWithInfoResponse {

    @XmlElement(name = "DocumentId", required = true)
    protected String documentId;
    protected ValidateDocumentWithInfoResponse.ValidateInfo validateInfo;

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
     * Gets the value of the validateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateDocumentWithInfoResponse.ValidateInfo }
     *     
     */
    public ValidateDocumentWithInfoResponse.ValidateInfo getValidateInfo() {
        return validateInfo;
    }

    /**
     * Sets the value of the validateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateDocumentWithInfoResponse.ValidateInfo }
     *     
     */
    public void setValidateInfo(ValidateDocumentWithInfoResponse.ValidateInfo value) {
        this.validateInfo = value;
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
     *         &lt;element name="ValidateInfo" type="{http://cloud.mos.ru/customWebService2/}ValidateDocumentInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "validateInfo"
    })
    public static class ValidateInfo {

        @XmlElement(name = "ValidateInfo")
        protected List<ValidateDocumentInfo> validateInfo;

        /**
         * Gets the value of the validateInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the validateInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValidateInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ValidateDocumentInfo }
         * 
         * 
         */
        public List<ValidateDocumentInfo> getValidateInfo() {
            if (validateInfo == null) {
                validateInfo = new ArrayList<ValidateDocumentInfo>();
            }
            return this.validateInfo;
        }

    }

}
