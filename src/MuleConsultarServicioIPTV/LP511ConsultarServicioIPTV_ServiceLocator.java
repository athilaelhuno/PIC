/**
 * LP511ConsultarServicioIPTV_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarServicioIPTV;

public class LP511ConsultarServicioIPTV_ServiceLocator extends org.apache.axis.client.Service implements MuleConsultarServicioIPTV.LP511ConsultarServicioIPTV_Service {

    public LP511ConsultarServicioIPTV_ServiceLocator() {
    }


    public LP511ConsultarServicioIPTV_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LP511ConsultarServicioIPTV_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LP511ConsultarServicioIPTV
    private java.lang.String LP511ConsultarServicioIPTV_address = "http://picqa03.cantv.com.ve:8801/mule/services/LP511ConsultarServicioIPTV";

    public java.lang.String getLP511ConsultarServicioIPTVAddress() {
        return LP511ConsultarServicioIPTV_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LP511ConsultarServicioIPTVWSDDServiceName = "LP511ConsultarServicioIPTV";

    public java.lang.String getLP511ConsultarServicioIPTVWSDDServiceName() {
        return LP511ConsultarServicioIPTVWSDDServiceName;
    }

    public void setLP511ConsultarServicioIPTVWSDDServiceName(java.lang.String name) {
        LP511ConsultarServicioIPTVWSDDServiceName = name;
    }

    public MuleConsultarServicioIPTV.LP511ConsultarServicioIPTV_PortType getLP511ConsultarServicioIPTV() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LP511ConsultarServicioIPTV_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLP511ConsultarServicioIPTV(endpoint);
    }

    public MuleConsultarServicioIPTV.LP511ConsultarServicioIPTV_PortType getLP511ConsultarServicioIPTV(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            MuleConsultarServicioIPTV.LP511ConsultarServicioIPTVSoapBindingStub _stub = new MuleConsultarServicioIPTV.LP511ConsultarServicioIPTVSoapBindingStub(portAddress, this);
            _stub.setPortName(getLP511ConsultarServicioIPTVWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLP511ConsultarServicioIPTVEndpointAddress(java.lang.String address) {
        LP511ConsultarServicioIPTV_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (MuleConsultarServicioIPTV.LP511ConsultarServicioIPTV_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                MuleConsultarServicioIPTV.LP511ConsultarServicioIPTVSoapBindingStub _stub = new MuleConsultarServicioIPTV.LP511ConsultarServicioIPTVSoapBindingStub(new java.net.URL(LP511ConsultarServicioIPTV_address), this);
                _stub.setPortName(getLP511ConsultarServicioIPTVWSDDServiceName());
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
        if ("LP511ConsultarServicioIPTV".equals(inputPortName)) {
            return getLP511ConsultarServicioIPTV();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "LP511ConsultarServicioIPTV");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "LP511ConsultarServicioIPTV"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LP511ConsultarServicioIPTV".equals(portName)) {
            setLP511ConsultarServicioIPTVEndpointAddress(address);
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
