
package ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateCustomerIPTVOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateCustomerIPTVOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateCustomerIPTVOutput", propOrder = {
    "isCustomer"
})
public class ValidateCustomerIPTVOutput {

    protected boolean isCustomer;

    /**
     * Gets the value of the isCustomer property.
     * 
     */
    public boolean isIsCustomer() {
        return isCustomer;
    }

    /**
     * Sets the value of the isCustomer property.
     * 
     */
    public void setIsCustomer(boolean value) {
        this.isCustomer = value;
    }

}
