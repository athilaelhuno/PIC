/**
 * GI114ConsultarCasoRemedy_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarCasoRemedy;

public class GI114ConsultarCasoRemedy_ServiceLocator extends org.apache.axis.client.Service implements MuleConsultarCasoRemedy.GI114ConsultarCasoRemedy_Service {

    public GI114ConsultarCasoRemedy_ServiceLocator() {
    }


    public GI114ConsultarCasoRemedy_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GI114ConsultarCasoRemedy_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GI114ConsultarCasoRemedy
    private java.lang.String GI114ConsultarCasoRemedy_address = "http://picprod04.cantv.com.ve:8080/mule/services/GI114ConsultarCasoRemedy";

    public java.lang.String getGI114ConsultarCasoRemedyAddress() {
        return GI114ConsultarCasoRemedy_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GI114ConsultarCasoRemedyWSDDServiceName = "GI114ConsultarCasoRemedy";

    public java.lang.String getGI114ConsultarCasoRemedyWSDDServiceName() {
        return GI114ConsultarCasoRemedyWSDDServiceName;
    }

    public void setGI114ConsultarCasoRemedyWSDDServiceName(java.lang.String name) {
        GI114ConsultarCasoRemedyWSDDServiceName = name;
    }

    public MuleConsultarCasoRemedy.GI114ConsultarCasoRemedy_PortType getGI114ConsultarCasoRemedy() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GI114ConsultarCasoRemedy_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGI114ConsultarCasoRemedy(endpoint);
    }

    public MuleConsultarCasoRemedy.GI114ConsultarCasoRemedy_PortType getGI114ConsultarCasoRemedy(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            MuleConsultarCasoRemedy.GI114ConsultarCasoRemedySoapBindingStub _stub = new MuleConsultarCasoRemedy.GI114ConsultarCasoRemedySoapBindingStub(portAddress, this);
            _stub.setPortName(getGI114ConsultarCasoRemedyWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGI114ConsultarCasoRemedyEndpointAddress(java.lang.String address) {
        GI114ConsultarCasoRemedy_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (MuleConsultarCasoRemedy.GI114ConsultarCasoRemedy_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                MuleConsultarCasoRemedy.GI114ConsultarCasoRemedySoapBindingStub _stub = new MuleConsultarCasoRemedy.GI114ConsultarCasoRemedySoapBindingStub(new java.net.URL(GI114ConsultarCasoRemedy_address), this);
                _stub.setPortName(getGI114ConsultarCasoRemedyWSDDServiceName());
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
        if ("GI114ConsultarCasoRemedy".equals(inputPortName)) {
            return getGI114ConsultarCasoRemedy();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", "GI114ConsultarCasoRemedy");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", "GI114ConsultarCasoRemedy"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GI114ConsultarCasoRemedy".equals(portName)) {
            setGI114ConsultarCasoRemedyEndpointAddress(address);
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
