
package com.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Permission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Permission"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GranteeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccessRights" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Permission", propOrder = {
    "granteeName",
    "accessRights"
})
public class Permission {

    @XmlElement(name = "GranteeName", required = true)
    protected String granteeName;
    @XmlElement(name = "AccessRights", required = true)
    protected List<String> accessRights;

    /**
     * Gets the value of the granteeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGranteeName() {
        return granteeName;
    }

    /**
     * Sets the value of the granteeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGranteeName(String value) {
        this.granteeName = value;
    }

    /**
     * Gets the value of the accessRights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessRights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessRights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccessRights() {
        if (accessRights == null) {
            accessRights = new ArrayList<String>();
        }
        return this.accessRights;
    }

}
