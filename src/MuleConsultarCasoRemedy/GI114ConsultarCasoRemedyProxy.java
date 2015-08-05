package MuleConsultarCasoRemedy;

public class GI114ConsultarCasoRemedyProxy implements MuleConsultarCasoRemedy.GI114ConsultarCasoRemedy_PortType {
  private String _endpoint = null;
  private MuleConsultarCasoRemedy.GI114ConsultarCasoRemedy_PortType gI114ConsultarCasoRemedy_PortType = null;
  
  public GI114ConsultarCasoRemedyProxy() {
    _initGI114ConsultarCasoRemedyProxy();
  }
  
  public GI114ConsultarCasoRemedyProxy(String endpoint) {
    _endpoint = endpoint;
    _initGI114ConsultarCasoRemedyProxy();
  }
  
  private void _initGI114ConsultarCasoRemedyProxy() {
    try {
      gI114ConsultarCasoRemedy_PortType = (new MuleConsultarCasoRemedy.GI114ConsultarCasoRemedy_ServiceLocator()).getGI114ConsultarCasoRemedy();
      if (gI114ConsultarCasoRemedy_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gI114ConsultarCasoRemedy_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gI114ConsultarCasoRemedy_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gI114ConsultarCasoRemedy_PortType != null)
      ((javax.xml.rpc.Stub)gI114ConsultarCasoRemedy_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public MuleConsultarCasoRemedy.GI114ConsultarCasoRemedy_PortType getGI114ConsultarCasoRemedy_PortType() {
    if (gI114ConsultarCasoRemedy_PortType == null)
      _initGI114ConsultarCasoRemedyProxy();
    return gI114ConsultarCasoRemedy_PortType;
  }
  
  public void setLog(boolean in0) throws java.rmi.RemoteException{
    if (gI114ConsultarCasoRemedy_PortType == null)
      _initGI114ConsultarCasoRemedyProxy();
    gI114ConsultarCasoRemedy_PortType.setLog(in0);
  }
  
  public MuleConsultarCasoRemedy.ConsultarCasoRemedyRP consultarCaso(MuleConsultarCasoRemedy.ConsultarCasoRemedyRQ in0) throws java.rmi.RemoteException{
    if (gI114ConsultarCasoRemedy_PortType == null)
      _initGI114ConsultarCasoRemedyProxy();
    return gI114ConsultarCasoRemedy_PortType.consultarCaso(in0);
  }
  
  public void resetStatistics() throws java.rmi.RemoteException{
    if (gI114ConsultarCasoRemedy_PortType == null)
      _initGI114ConsultarCasoRemedyProxy();
    gI114ConsultarCasoRemedy_PortType.resetStatistics();
  }
  
  public UtilsClass.ServiceControlReturn getInfo() throws java.rmi.RemoteException{
    if (gI114ConsultarCasoRemedy_PortType == null)
      _initGI114ConsultarCasoRemedyProxy();
    return gI114ConsultarCasoRemedy_PortType.getInfo();
  }
  
  
}