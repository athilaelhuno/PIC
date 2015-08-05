package MuleConsultarCuentaGeneralMovilnet;

public class TVSAT006ConsultarCuentaGeneralProxy implements MuleConsultarCuentaGeneralMovilnet.TVSAT006ConsultarCuentaGeneral_PortType {
  private String _endpoint = null;
  private MuleConsultarCuentaGeneralMovilnet.TVSAT006ConsultarCuentaGeneral_PortType tVSAT006ConsultarCuentaGeneral_PortType = null;
  
  public TVSAT006ConsultarCuentaGeneralProxy() {
    _initTVSAT006ConsultarCuentaGeneralProxy();
  }
  
  public TVSAT006ConsultarCuentaGeneralProxy(String endpoint) {
    _endpoint = endpoint;
    _initTVSAT006ConsultarCuentaGeneralProxy();
  }
  
  private void _initTVSAT006ConsultarCuentaGeneralProxy() {
    try {
      tVSAT006ConsultarCuentaGeneral_PortType = (new MuleConsultarCuentaGeneralMovilnet.TVSAT006ConsultarCuentaGeneral_ServiceLocator()).getTVSAT006ConsultarCuentaGeneral();
      if (tVSAT006ConsultarCuentaGeneral_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tVSAT006ConsultarCuentaGeneral_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tVSAT006ConsultarCuentaGeneral_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tVSAT006ConsultarCuentaGeneral_PortType != null)
      ((javax.xml.rpc.Stub)tVSAT006ConsultarCuentaGeneral_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public MuleConsultarCuentaGeneralMovilnet.TVSAT006ConsultarCuentaGeneral_PortType getTVSAT006ConsultarCuentaGeneral_PortType() {
    if (tVSAT006ConsultarCuentaGeneral_PortType == null)
      _initTVSAT006ConsultarCuentaGeneralProxy();
    return tVSAT006ConsultarCuentaGeneral_PortType;
  }
  
  public MuleConsultarCuentaGeneralMovilnet.ConsultaEquipoRP consultarCuentasEquipo(MuleConsultarCuentaGeneralMovilnet.ConsultaEquipoRQ in0) throws java.rmi.RemoteException{
    if (tVSAT006ConsultarCuentaGeneral_PortType == null)
      _initTVSAT006ConsultarCuentaGeneralProxy();
    return tVSAT006ConsultarCuentaGeneral_PortType.consultarCuentasEquipo(in0);
  }
  
  public MuleConsultarCuentaGeneralMovilnet.ConsultaTarjetaRP consultarCuentasTarjeta(MuleConsultarCuentaGeneralMovilnet.ConsultaTarjetaRQ in0) throws java.rmi.RemoteException{
    if (tVSAT006ConsultarCuentaGeneral_PortType == null)
      _initTVSAT006ConsultarCuentaGeneralProxy();
    return tVSAT006ConsultarCuentaGeneral_PortType.consultarCuentasTarjeta(in0);
  }
  
  public MuleConsultarCuentaGeneralMovilnet.ConsultarCuentaMaxSerialesRP consultarCuentasMaximasSeriales(MuleConsultarCuentaGeneralMovilnet.ConsultarCuentaMaxSerialesRQ in0) throws java.rmi.RemoteException{
    if (tVSAT006ConsultarCuentaGeneral_PortType == null)
      _initTVSAT006ConsultarCuentaGeneralProxy();
    return tVSAT006ConsultarCuentaGeneral_PortType.consultarCuentasMaximasSeriales(in0);
  }
  
  public MuleConsultarCuentaGeneralMovilnet.ConsultaContratosRP consultarCuentaContrato(MuleConsultarCuentaGeneralMovilnet.ConsultaContratosRQ in0) throws java.rmi.RemoteException{
    if (tVSAT006ConsultarCuentaGeneral_PortType == null)
      _initTVSAT006ConsultarCuentaGeneralProxy();
    return tVSAT006ConsultarCuentaGeneral_PortType.consultarCuentaContrato(in0);
  }
  
  
}