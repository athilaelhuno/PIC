package MuleConsultarServicioIPTV;

public class LP511ConsultarServicioIPTVProxy implements MuleConsultarServicioIPTV.LP511ConsultarServicioIPTV_PortType {
  private String _endpoint = null;
  private MuleConsultarServicioIPTV.LP511ConsultarServicioIPTV_PortType lP511ConsultarServicioIPTV_PortType = null;
  
  public LP511ConsultarServicioIPTVProxy() {
    _initLP511ConsultarServicioIPTVProxy();
  }
  
  public LP511ConsultarServicioIPTVProxy(String endpoint) {
    _endpoint = endpoint;
    _initLP511ConsultarServicioIPTVProxy();
  }
  
  private void _initLP511ConsultarServicioIPTVProxy() {
    try {
      lP511ConsultarServicioIPTV_PortType = (new MuleConsultarServicioIPTV.LP511ConsultarServicioIPTV_ServiceLocator()).getLP511ConsultarServicioIPTV();
      if (lP511ConsultarServicioIPTV_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)lP511ConsultarServicioIPTV_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)lP511ConsultarServicioIPTV_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (lP511ConsultarServicioIPTV_PortType != null)
      ((javax.xml.rpc.Stub)lP511ConsultarServicioIPTV_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public MuleConsultarServicioIPTV.LP511ConsultarServicioIPTV_PortType getLP511ConsultarServicioIPTV_PortType() {
    if (lP511ConsultarServicioIPTV_PortType == null)
      _initLP511ConsultarServicioIPTVProxy();
    return lP511ConsultarServicioIPTV_PortType;
  }
  
  public MuleConsultarServicioIPTV.ConsultarServicioIPTVRP consultarServicio(MuleConsultarServicioIPTV.ConsultarServicioIPTVRQ in0) throws java.rmi.RemoteException{
    if (lP511ConsultarServicioIPTV_PortType == null)
      _initLP511ConsultarServicioIPTVProxy();
    return lP511ConsultarServicioIPTV_PortType.consultarServicio(in0);
  }
  
  public MuleConsultarServicioIPTV.ConsultarServicioPorTlfIPTVRP consultarServicioPorTlf(MuleConsultarServicioIPTV.ConsultarServicioPorTlfIPTVRQ in0) throws java.rmi.RemoteException{
    if (lP511ConsultarServicioIPTV_PortType == null)
      _initLP511ConsultarServicioIPTVProxy();
    return lP511ConsultarServicioIPTV_PortType.consultarServicioPorTlf(in0);
  }
  
  
}