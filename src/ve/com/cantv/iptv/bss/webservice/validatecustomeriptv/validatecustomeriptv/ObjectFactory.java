
package ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidateCustomerIPTVResponse_QNAME = new QName("http://validatecustomeriptv.webservice.bss.iptv.cantv.com.ve/ValidateCustomerIPTV/", "ValidateCustomerIPTVResponse");
    private final static QName _ValidateCustomerIPTV_QNAME = new QName("http://validatecustomeriptv.webservice.bss.iptv.cantv.com.ve/ValidateCustomerIPTV/", "ValidateCustomerIPTV");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateCustomerIPTVFault }
     * 
     */
    public ValidateCustomerIPTVFault createValidateCustomerIPTVFault() {
        return new ValidateCustomerIPTVFault();
    }

    /**
     * Create an instance of {@link ValidateCustomerIPTVInput }
     * 
     */
    public ValidateCustomerIPTVInput createValidateCustomerIPTVInput() {
        return new ValidateCustomerIPTVInput();
    }

    /**
     * Create an instance of {@link ValidateCustomerIPTVOutput }
     * 
     */
    public ValidateCustomerIPTVOutput createValidateCustomerIPTVOutput() {
        return new ValidateCustomerIPTVOutput();
    }

    /**
     * Create an instance of {@link TelephoneLine }
     * 
     */
    public TelephoneLine createTelephoneLine() {
        return new TelephoneLine();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCustomerIPTVOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validatecustomeriptv.webservice.bss.iptv.cantv.com.ve/ValidateCustomerIPTV/", name = "ValidateCustomerIPTVResponse")
    public JAXBElement<ValidateCustomerIPTVOutput> createValidateCustomerIPTVResponse(ValidateCustomerIPTVOutput value) {
        return new JAXBElement<ValidateCustomerIPTVOutput>(_ValidateCustomerIPTVResponse_QNAME, ValidateCustomerIPTVOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCustomerIPTVInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validatecustomeriptv.webservice.bss.iptv.cantv.com.ve/ValidateCustomerIPTV/", name = "ValidateCustomerIPTV")
    public JAXBElement<ValidateCustomerIPTVInput> createValidateCustomerIPTV(ValidateCustomerIPTVInput value) {
        return new JAXBElement<ValidateCustomerIPTVInput>(_ValidateCustomerIPTV_QNAME, ValidateCustomerIPTVInput.class, null, value);
    }

}
