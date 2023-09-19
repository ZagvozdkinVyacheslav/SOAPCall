
package com.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateDefferedAnnotationsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateDefferedAnnotationsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AllSignCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HttpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PartAnnotationRequest" type="{http://cloud.mos.ru/customWebService2/}AnnotationRequest" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDefferedAnnotationsRequest", propOrder = {
    "taskId",
    "allSignCount",
    "httpAddress",
    "partAnnotationRequest"
})
public class CreateDefferedAnnotationsRequest {

    @XmlElement(name = "TaskId")
    protected String taskId;
    @XmlElement(name = "AllSignCount")
    protected int allSignCount;
    @XmlElement(name = "HttpAddress", required = true)
    protected String httpAddress;
    @XmlElement(name = "PartAnnotationRequest", required = true)
    protected List<AnnotationRequest> partAnnotationRequest;

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the allSignCount property.
     * 
     */
    public int getAllSignCount() {
        return allSignCount;
    }

    /**
     * Sets the value of the allSignCount property.
     * 
     */
    public void setAllSignCount(int value) {
        this.allSignCount = value;
    }

    /**
     * Gets the value of the httpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpAddress() {
        return httpAddress;
    }

    /**
     * Sets the value of the httpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpAddress(String value) {
        this.httpAddress = value;
    }

    /**
     * Gets the value of the partAnnotationRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partAnnotationRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartAnnotationRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnotationRequest }
     * 
     * 
     */
    public List<AnnotationRequest> getPartAnnotationRequest() {
        if (partAnnotationRequest == null) {
            partAnnotationRequest = new ArrayList<AnnotationRequest>();
        }
        return this.partAnnotationRequest;
    }

}
