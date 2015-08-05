/**
 * ConsultaTarjetaRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarCuentaGeneralMovilnet;

public class ConsultaTarjetaRQ  implements java.io.Serializable {
    private java.lang.String IDCLIENTEPIC;

    private java.lang.String serialTarjeta;

    public ConsultaTarjetaRQ() {
    }

    public ConsultaTarjetaRQ(
           java.lang.String IDCLIENTEPIC,
           java.lang.String serialTarjeta) {
           this.IDCLIENTEPIC = IDCLIENTEPIC;
           this.serialTarjeta = serialTarjeta;
    }


    /**
     * Gets the IDCLIENTEPIC value for this ConsultaTarjetaRQ.
     * 
     * @return IDCLIENTEPIC
     */
    public java.lang.String getIDCLIENTEPIC() {
        return IDCLIENTEPIC;
    }


    /**
     * Sets the IDCLIENTEPIC value for this ConsultaTarjetaRQ.
     * 
     * @param IDCLIENTEPIC
     */
    public void setIDCLIENTEPIC(java.lang.String IDCLIENTEPIC) {
        this.IDCLIENTEPIC = IDCLIENTEPIC;
    }


    /**
     * Gets the serialTarjeta value for this ConsultaTarjetaRQ.
     * 
     * @return serialTarjeta
     */
    public java.lang.String getSerialTarjeta() {
        return serialTarjeta;
    }


    /**
     * Sets the serialTarjeta value for this ConsultaTarjetaRQ.
     * 
     * @param serialTarjeta
     */
    public void setSerialTarjeta(java.lang.String serialTarjeta) {
        this.serialTarjeta = serialTarjeta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaTarjetaRQ)) return false;
        ConsultaTarjetaRQ other = (ConsultaTarjetaRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDCLIENTEPIC==null && other.getIDCLIENTEPIC()==null) || 
             (this.IDCLIENTEPIC!=null &&
              this.IDCLIENTEPIC.equals(other.getIDCLIENTEPIC()))) &&
            ((this.serialTarjeta==null && other.getSerialTarjeta()==null) || 
             (this.serialTarjeta!=null &&
              this.serialTarjeta.equals(other.getSerialTarjeta())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIDCLIENTEPIC() != null) {
            _hashCode += getIDCLIENTEPIC().hashCode();
        }
        if (getSerialTarjeta() != null) {
            _hashCode += getSerialTarjeta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaTarjetaRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaTarjetaRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDCLIENTEPIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "IDCLIENTEPIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "serialTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
