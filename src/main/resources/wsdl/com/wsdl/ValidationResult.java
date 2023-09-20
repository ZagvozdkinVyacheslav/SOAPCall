
package com.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationResult"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VALID"/&gt;
 *     &lt;enumeration value="INVALID"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="NOT_FOUND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValidationResult")
@XmlEnum
public enum ValidationResult {

    VALID,
    INVALID,
    ERROR,
    NOT_FOUND;

    public String value() {
        return name();
    }

    public static ValidationResult fromValue(String v) {
        return valueOf(v);
    }

}
