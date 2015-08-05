/**
 * TVSAT006ConsultarCuentaGeneralSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarCuentaGeneralMovilnet;

public class TVSAT006ConsultarCuentaGeneralSoapBindingStub extends org.apache.axis.client.Stub implements MuleConsultarCuentaGeneralMovilnet.TVSAT006ConsultarCuentaGeneral_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarCuentasEquipo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaEquipoRQ"), MuleConsultarCuentaGeneralMovilnet.ConsultaEquipoRQ.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaEquipoRP"));
        oper.setReturnClass(MuleConsultarCuentaGeneralMovilnet.ConsultaEquipoRP.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultarCuentasEquipoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarCuentasTarjeta");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaTarjetaRQ"), MuleConsultarCuentaGeneralMovilnet.ConsultaTarjetaRQ.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaTarjetaRP"));
        oper.setReturnClass(MuleConsultarCuentaGeneralMovilnet.ConsultaTarjetaRP.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultarCuentasTarjetaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarCuentasMaximasSeriales");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultarCuentaMaxSerialesRQ"), MuleConsultarCuentaGeneralMovilnet.ConsultarCuentaMaxSerialesRQ.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultarCuentaMaxSerialesRP"));
        oper.setReturnClass(MuleConsultarCuentaGeneralMovilnet.ConsultarCuentaMaxSerialesRP.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultarCuentasMaximasSerialesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarCuentaContrato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaContratosRQ"), MuleConsultarCuentaGeneralMovilnet.ConsultaContratosRQ.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaContratosRP"));
        oper.setReturnClass(MuleConsultarCuentaGeneralMovilnet.ConsultaContratosRP.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultarCuentaContratoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public TVSAT006ConsultarCuentaGeneralSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TVSAT006ConsultarCuentaGeneralSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TVSAT006ConsultarCuentaGeneralSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "AgenteTo");
            cachedSerQNames.add(qName);
            cls = ClasesUtilMovilnet.AgenteTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "BalanceTo");
            cachedSerQNames.add(qName);
            cls = ClasesUtilMovilnet.BalanceTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "CargoPeriodicoTo");
            cachedSerQNames.add(qName);
            cls = ClasesUtilMovilnet.CargoPeriodicoTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "ClienteTo");
            cachedSerQNames.add(qName);
            cls = ClasesUtilMovilnet.ClienteTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "CuentaContratoTo");
            cachedSerQNames.add(qName);
            cls = ClasesUtilMovilnet.CuentaContratoTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "DireccionTo");
            cachedSerQNames.add(qName);
            cls = ClasesUtilMovilnet.DireccionTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "LocalidadTo");
            cachedSerQNames.add(qName);
            cls = ClasesUtilMovilnet.LocalidadTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "ModeloTo");
            cachedSerQNames.add(qName);
            cls = ClasesUtilMovilnet.ModeloTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "NacionalidadTo");
            cachedSerQNames.add(qName);
            cls = ClasesUtilMovilnet.NacionalidadTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "PersonaContactoTo");
            cachedSerQNames.add(qName);
            cls = ClasesUtilMovilnet.PersonaContactoTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "PlanTo");
            cachedSerQNames.add(qName);
            cls = ClasesUtilMovilnet.PlanTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "ProfesionTo");
            cachedSerQNames.add(qName);
            cls = ClasesUtilMovilnet.ProfesionTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "PromocionTo");
            cachedSerQNames.add(qName);
            cls = ClasesUtilMovilnet.PromocionTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "CiudadTo");
            cachedSerQNames.add(qName);
            cls = ve.com.movilnet.tvsat.dominio.CiudadTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "EstadoTo");
            cachedSerQNames.add(qName);
            cls = ve.com.movilnet.tvsat.dominio.EstadoTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "MunicipioTo");
            cachedSerQNames.add(qName);
            cls = ve.com.movilnet.tvsat.dominio.MunicipioTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "ParroquiaTo");
            cachedSerQNames.add(qName);
            cls = ve.com.movilnet.tvsat.dominio.ParroquiaTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "SectorTo");
            cachedSerQNames.add(qName);
            cls = ve.com.movilnet.tvsat.dominio.SectorTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "TipoCalleTo");
            cachedSerQNames.add(qName);
            cls = ve.com.movilnet.tvsat.dominio.TipoCalleTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "TipoEdificacionTo");
            cachedSerQNames.add(qName);
            cls = ve.com.movilnet.tvsat.dominio.TipoEdificacionTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "TipoPisoTo");
            cachedSerQNames.add(qName);
            cls = ve.com.movilnet.tvsat.dominio.TipoPisoTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "TipoViviendaTo");
            cachedSerQNames.add(qName);
            cls = ve.com.movilnet.tvsat.dominio.TipoViviendaTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "ZonaPostalTo");
            cachedSerQNames.add(qName);
            cls = ve.com.movilnet.tvsat.dominio.ZonaPostalTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ArrayOf_tns1_CuentaContratoTo");
            cachedSerQNames.add(qName);
            cls = ClasesUtilMovilnet.CuentaContratoTo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "CuentaContratoTo");
            qName2 = new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaContratosRP");
            cachedSerQNames.add(qName);
            cls = MuleConsultarCuentaGeneralMovilnet.ConsultaContratosRP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaContratosRQ");
            cachedSerQNames.add(qName);
            cls = MuleConsultarCuentaGeneralMovilnet.ConsultaContratosRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaEquipoRP");
            cachedSerQNames.add(qName);
            cls = MuleConsultarCuentaGeneralMovilnet.ConsultaEquipoRP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaEquipoRQ");
            cachedSerQNames.add(qName);
            cls = MuleConsultarCuentaGeneralMovilnet.ConsultaEquipoRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultarCuentaMaxSerialesRP");
            cachedSerQNames.add(qName);
            cls = MuleConsultarCuentaGeneralMovilnet.ConsultarCuentaMaxSerialesRP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultarCuentaMaxSerialesRQ");
            cachedSerQNames.add(qName);
            cls = MuleConsultarCuentaGeneralMovilnet.ConsultarCuentaMaxSerialesRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaTarjetaRP");
            cachedSerQNames.add(qName);
            cls = MuleConsultarCuentaGeneralMovilnet.ConsultaTarjetaRP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaTarjetaRQ");
            cachedSerQNames.add(qName);
            cls = MuleConsultarCuentaGeneralMovilnet.ConsultaTarjetaRQ.class;
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

    public MuleConsultarCuentaGeneralMovilnet.ConsultaEquipoRP consultarCuentasEquipo(MuleConsultarCuentaGeneralMovilnet.ConsultaEquipoRQ in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultarCuentasEquipo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (MuleConsultarCuentaGeneralMovilnet.ConsultaEquipoRP) _resp;
            } catch (java.lang.Exception _exception) {
                return (MuleConsultarCuentaGeneralMovilnet.ConsultaEquipoRP) org.apache.axis.utils.JavaUtils.convert(_resp, MuleConsultarCuentaGeneralMovilnet.ConsultaEquipoRP.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public MuleConsultarCuentaGeneralMovilnet.ConsultaTarjetaRP consultarCuentasTarjeta(MuleConsultarCuentaGeneralMovilnet.ConsultaTarjetaRQ in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultarCuentasTarjeta"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (MuleConsultarCuentaGeneralMovilnet.ConsultaTarjetaRP) _resp;
            } catch (java.lang.Exception _exception) {
                return (MuleConsultarCuentaGeneralMovilnet.ConsultaTarjetaRP) org.apache.axis.utils.JavaUtils.convert(_resp, MuleConsultarCuentaGeneralMovilnet.ConsultaTarjetaRP.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public MuleConsultarCuentaGeneralMovilnet.ConsultarCuentaMaxSerialesRP consultarCuentasMaximasSeriales(MuleConsultarCuentaGeneralMovilnet.ConsultarCuentaMaxSerialesRQ in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultarCuentasMaximasSeriales"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (MuleConsultarCuentaGeneralMovilnet.ConsultarCuentaMaxSerialesRP) _resp;
            } catch (java.lang.Exception _exception) {
                return (MuleConsultarCuentaGeneralMovilnet.ConsultarCuentaMaxSerialesRP) org.apache.axis.utils.JavaUtils.convert(_resp, MuleConsultarCuentaGeneralMovilnet.ConsultarCuentaMaxSerialesRP.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public MuleConsultarCuentaGeneralMovilnet.ConsultaContratosRP consultarCuentaContrato(MuleConsultarCuentaGeneralMovilnet.ConsultaContratosRQ in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultarCuentaContrato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (MuleConsultarCuentaGeneralMovilnet.ConsultaContratosRP) _resp;
            } catch (java.lang.Exception _exception) {
                return (MuleConsultarCuentaGeneralMovilnet.ConsultaContratosRP) org.apache.axis.utils.JavaUtils.convert(_resp, MuleConsultarCuentaGeneralMovilnet.ConsultaContratosRP.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
