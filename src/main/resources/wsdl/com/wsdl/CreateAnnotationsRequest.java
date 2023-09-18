
package com.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateAnnotationsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateAnnotationsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartAnnotationRequest" type="{http://cloud.mos.ru/customWebService2/}PartAnnotationRequest" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateAnnotationsRequest", propOrder = {
    "partAnnotationRequest"
})
@XmlSeeAlso({
    CreateMultipleAnnotationsRequest.class
})
public abstract class CreateAnnotationsRequest {

    @XmlElement(name = "PartAnnotationRequest", required = true)
    protected List<PartAnnotationRequest> partAnnotationRequest;

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
     * {@link PartAnnotationRequest }
     * 
     * 
     */
    public List<PartAnnotationRequest> getPartAnnotationRequest() {
        if (partAnnotationRequest == null) {
            partAnnotationRequest = new ArrayList<PartAnnotationRequest>();
        }
        return this.partAnnotationRequest;
    }

}
