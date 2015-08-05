
package ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidateCustomerIPTVFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "validateCustomerIPTVFault"
})
@XmlRootElement(name = "ValidateCustomerIPTVFault")
public class ValidateCustomerIPTVFault {

    @XmlElement(name = "ValidateCustomerIPTVFault", required = true)
    protected String validateCustomerIPTVFault;

    /**
     * Gets the value of the validateCustomerIPTVFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateCustomerIPTVFault() {
        return validateCustomerIPTVFault;
    }

    /**
     * Sets the value of the validateCustomerIPTVFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateCustomerIPTVFault(String value) {
        this.validateCustomerIPTVFault = value;
    }

}
