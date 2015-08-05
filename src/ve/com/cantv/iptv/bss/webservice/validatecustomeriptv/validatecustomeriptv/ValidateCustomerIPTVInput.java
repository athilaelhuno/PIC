
package ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateCustomerIPTVInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateCustomerIPTVInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telephoneLine" type="{http://validatecustomeriptv.webservice.bss.iptv.cantv.com.ve/ValidateCustomerIPTV/}TelephoneLine"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateCustomerIPTVInput", propOrder = {
    "idAccount",
    "telephoneLine"
})
public class ValidateCustomerIPTVInput {

    @XmlElement(required = true)
    protected String idAccount;
    @XmlElement(required = true)
    protected TelephoneLine telephoneLine;

    /**
     * Gets the value of the idAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAccount() {
        return idAccount;
    }

    /**
     * Sets the value of the idAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAccount(String value) {
        this.idAccount = value;
    }

    /**
     * Gets the value of the telephoneLine property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneLine }
     *     
     */
    public TelephoneLine getTelephoneLine() {
        return telephoneLine;
    }

    /**
     * Sets the value of the telephoneLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneLine }
     *     
     */
    public void setTelephoneLine(TelephoneLine value) {
        this.telephoneLine = value;
    }

}
