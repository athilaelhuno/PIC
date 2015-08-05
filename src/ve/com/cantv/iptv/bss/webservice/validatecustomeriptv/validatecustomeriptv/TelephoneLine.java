
package ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingAccountKenan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeArea" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneLine", propOrder = {
    "billingAccountKenan",
    "codeArea",
    "phoneNumber"
})
public class TelephoneLine {

    @XmlElement(required = true)
    protected String billingAccountKenan;
    protected long codeArea;
    protected long phoneNumber;

    /**
     * Gets the value of the billingAccountKenan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountKenan() {
        return billingAccountKenan;
    }

    /**
     * Sets the value of the billingAccountKenan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountKenan(String value) {
        this.billingAccountKenan = value;
    }

    /**
     * Gets the value of the codeArea property.
     * 
     */
    public long getCodeArea() {
        return codeArea;
    }

    /**
     * Sets the value of the codeArea property.
     * 
     */
    public void setCodeArea(long value) {
        this.codeArea = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     */
    public void setPhoneNumber(long value) {
        this.phoneNumber = value;
    }

}
