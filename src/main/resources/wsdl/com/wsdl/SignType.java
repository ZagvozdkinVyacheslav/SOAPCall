
package com.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for signType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="signType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CADES"/&gt;
 *     &lt;enumeration value="XMLDSIG"/&gt;
 *     &lt;enumeration value="XADES"/&gt;
 *     &lt;enumeration value="EIS"/&gt;
 *     &lt;enumeration value="DEFERRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "signType")
@XmlEnum
public enum SignType {

    CADES,
    XMLDSIG,
    XADES,
    EIS,
    DEFERRED;

    public String value() {
        return name();
    }

    public static SignType fromValue(String v) {
        return valueOf(v);
    }

}
