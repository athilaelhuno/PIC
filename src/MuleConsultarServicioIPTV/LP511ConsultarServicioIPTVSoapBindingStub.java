/**
 * LP511ConsultarServicioIPTVSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarServicioIPTV;

public class LP511ConsultarServicioIPTVSoapBindingStub extends org.apache.axis.client.Stub implements MuleConsultarServicioIPTV.LP511ConsultarServicioIPTV_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarServicio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicioIPTVRQ"), MuleConsultarServicioIPTV.ConsultarServicioIPTVRQ.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicioIPTVRP"));
        oper.setReturnClass(MuleConsultarServicioIPTV.ConsultarServicioIPTVRP.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicioReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarServicioPorTlf");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicioPorTlfIPTVRQ"), MuleConsultarServicioIPTV.ConsultarServicioPorTlfIPTVRQ.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicioPorTlfIPTVRP"));
        oper.setReturnClass(MuleConsultarServicioIPTV.ConsultarServicioPorTlfIPTVRP.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicioPorTlfReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

    }

    public LP511ConsultarServicioIPTVSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public LP511ConsultarServicioIPTVSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public LP511ConsultarServicioIPTVSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "ChargeDataRecord");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.ChargeDataRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "DeviceSubAccount");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.DeviceSubAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "HitoricalDeviceSubAccount");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.HitoricalDeviceSubAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "ParishUrbanization");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.ParishUrbanization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "Phone");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.Phone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "ProductCharge");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.ProductCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "Status");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "SubAccount");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.SubAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "SubAccountProduct");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.SubAccountProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ArrayOf_tns1_ChargeDataRecord");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.ChargeDataRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "ChargeDataRecord");
            qName2 = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ArrayOf_tns1_DeviceSubAccount");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.DeviceSubAccount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "DeviceSubAccount");
            qName2 = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ArrayOf_tns1_HitoricalDeviceSubAccount");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.HitoricalDeviceSubAccount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "HitoricalDeviceSubAccount");
            qName2 = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ArrayOf_tns1_ProductCharge");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.ProductCharge[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "ProductCharge");
            qName2 = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ArrayOf_tns1_SubAccount");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.SubAccount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "SubAccount");
            qName2 = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ArrayOf_tns1_SubAccountProduct");
            cachedSerQNames.add(qName);
            cls = ConexIPTVConsultarServicio.SubAccountProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "SubAccountProduct");
            qName2 = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicioIPTVRP");
            cachedSerQNames.add(qName);
            cls = MuleConsultarServicioIPTV.ConsultarServicioIPTVRP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicioIPTVRQ");
            cachedSerQNames.add(qName);
            cls = MuleConsultarServicioIPTV.ConsultarServicioIPTVRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicioPorTlfIPTVRP");
            cachedSerQNames.add(qName);
            cls = MuleConsultarServicioIPTV.ConsultarServicioPorTlfIPTVRP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicioPorTlfIPTVRQ");
            cachedSerQNames.add(qName);
            cls = MuleConsultarServicioIPTV.ConsultarServicioPorTlfIPTVRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "brand");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.Brand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "charge");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.Charge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "device");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.Device.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "deviceCatalog");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.DeviceCatalog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "deviceSubAccount");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.DeviceSubAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "deviceType");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.DeviceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "model");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.Model.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "municipality");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.Municipality.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "packageType");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.PackageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "parish");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.Parish.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "population");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.Population.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "product");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "productType");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.ProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "reason");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.Reason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "state");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.State.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "status");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "subAccountType");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.SubAccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "urbanization");
            cachedSerQNames.add(qName);
            cls = ve.com.cantv.iptv.bss.webservice.Remedy.Urbanization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public MuleConsultarServicioIPTV.ConsultarServicioIPTVRP consultarServicio(MuleConsultarServicioIPTV.ConsultarServicioIPTVRQ in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (MuleConsultarServicioIPTV.ConsultarServicioIPTVRP) _resp;
            } catch (java.lang.Exception _exception) {
                return (MuleConsultarServicioIPTV.ConsultarServicioIPTVRP) org.apache.axis.utils.JavaUtils.convert(_resp, MuleConsultarServicioIPTV.ConsultarServicioIPTVRP.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public MuleConsultarServicioIPTV.ConsultarServicioPorTlfIPTVRP consultarServicioPorTlf(MuleConsultarServicioIPTV.ConsultarServicioPorTlfIPTVRQ in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicioPorTlf"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (MuleConsultarServicioIPTV.ConsultarServicioPorTlfIPTVRP) _resp;
            } catch (java.lang.Exception _exception) {
                return (MuleConsultarServicioIPTV.ConsultarServicioPorTlfIPTVRP) org.apache.axis.utils.JavaUtils.convert(_resp, MuleConsultarServicioIPTV.ConsultarServicioPorTlfIPTVRP.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
