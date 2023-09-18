
package com.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateMultipleAnnotationsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateMultipleAnnotationsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cloud.mos.ru/customWebService2/}CreateAnnotationsRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FailOnErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMultipleAnnotationsRequest", propOrder = {
    "failOnErrors"
})
public class CreateMultipleAnnotationsRequest
    extends CreateAnnotationsRequest
{

    @XmlElement(name = "FailOnErrors", defaultValue = "true")
    protected Boolean failOnErrors;

    /**
     * Gets the value of the failOnErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailOnErrors() {
        return failOnErrors;
    }

    /**
     * Sets the value of the failOnErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailOnErrors(Boolean value) {
        this.failOnErrors = value;
    }

}
