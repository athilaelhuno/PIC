/**
 * TVSAT006ConsultarCuentaGeneral_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarCuentaGeneralMovilnet;

public class TVSAT006ConsultarCuentaGeneral_ServiceLocator extends org.apache.axis.client.Service implements MuleConsultarCuentaGeneralMovilnet.TVSAT006ConsultarCuentaGeneral_Service {

    public TVSAT006ConsultarCuentaGeneral_ServiceLocator() {
    }


    public TVSAT006ConsultarCuentaGeneral_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TVSAT006ConsultarCuentaGeneral_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TVSAT006ConsultarCuentaGeneral
    private java.lang.String TVSAT006ConsultarCuentaGeneral_address = "http://picprod04.cantv.com.ve:8080/mule/services/TVSAT006ConsultarCuentaGeneral";

    public java.lang.String getTVSAT006ConsultarCuentaGeneralAddress() {
        return TVSAT006ConsultarCuentaGeneral_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TVSAT006ConsultarCuentaGeneralWSDDServiceName = "TVSAT006ConsultarCuentaGeneral";

    public java.lang.String getTVSAT006ConsultarCuentaGeneralWSDDServiceName() {
        return TVSAT006ConsultarCuentaGeneralWSDDServiceName;
    }

    public void setTVSAT006ConsultarCuentaGeneralWSDDServiceName(java.lang.String name) {
        TVSAT006ConsultarCuentaGeneralWSDDServiceName = name;
    }

    public MuleConsultarCuentaGeneralMovilnet.TVSAT006ConsultarCuentaGeneral_PortType getTVSAT006ConsultarCuentaGeneral() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TVSAT006ConsultarCuentaGeneral_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTVSAT006ConsultarCuentaGeneral(endpoint);
    }

    public MuleConsultarCuentaGeneralMovilnet.TVSAT006ConsultarCuentaGeneral_PortType getTVSAT006ConsultarCuentaGeneral(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            MuleConsultarCuentaGeneralMovilnet.TVSAT006ConsultarCuentaGeneralSoapBindingStub _stub = new MuleConsultarCuentaGeneralMovilnet.TVSAT006ConsultarCuentaGeneralSoapBindingStub(portAddress, this);
            _stub.setPortName(getTVSAT006ConsultarCuentaGeneralWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTVSAT006ConsultarCuentaGeneralEndpointAddress(java.lang.String address) {
        TVSAT006ConsultarCuentaGeneral_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (MuleConsultarCuentaGeneralMovilnet.TVSAT006ConsultarCuentaGeneral_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                MuleConsultarCuentaGeneralMovilnet.TVSAT006ConsultarCuentaGeneralSoapBindingStub _stub = new MuleConsultarCuentaGeneralMovilnet.TVSAT006ConsultarCuentaGeneralSoapBindingStub(new java.net.URL(TVSAT006ConsultarCuentaGeneral_address), this);
                _stub.setPortName(getTVSAT006ConsultarCuentaGeneralWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TVSAT006ConsultarCuentaGeneral".equals(inputPortName)) {
            return getTVSAT006ConsultarCuentaGeneral();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "TVSAT006ConsultarCuentaGeneral");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "TVSAT006ConsultarCuentaGeneral"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TVSAT006ConsultarCuentaGeneral".equals(portName)) {
            setTVSAT006ConsultarCuentaGeneralEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
