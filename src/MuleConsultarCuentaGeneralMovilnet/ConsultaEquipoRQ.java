/**
 * ConsultaEquipoRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarCuentaGeneralMovilnet;

public class ConsultaEquipoRQ  implements java.io.Serializable {
    private java.lang.String serialDecodificador;

    private java.lang.String IDCLIENTEPIC;

    public ConsultaEquipoRQ() {
    }

    public ConsultaEquipoRQ(
           java.lang.String serialDecodificador,
           java.lang.String IDCLIENTEPIC) {
           this.serialDecodificador = serialDecodificador;
           this.IDCLIENTEPIC = IDCLIENTEPIC;
    }


    /**
     * Gets the serialDecodificador value for this ConsultaEquipoRQ.
     * 
     * @return serialDecodificador
     */
    public java.lang.String getSerialDecodificador() {
        return serialDecodificador;
    }


    /**
     * Sets the serialDecodificador value for this ConsultaEquipoRQ.
     * 
     * @param serialDecodificador
     */
    public void setSerialDecodificador(java.lang.String serialDecodificador) {
        this.serialDecodificador = serialDecodificador;
    }


    /**
     * Gets the IDCLIENTEPIC value for this ConsultaEquipoRQ.
     * 
     * @return IDCLIENTEPIC
     */
    public java.lang.String getIDCLIENTEPIC() {
        return IDCLIENTEPIC;
    }


    /**
     * Sets the IDCLIENTEPIC value for this ConsultaEquipoRQ.
     * 
     * @param IDCLIENTEPIC
     */
    public void setIDCLIENTEPIC(java.lang.String IDCLIENTEPIC) {
        this.IDCLIENTEPIC = IDCLIENTEPIC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaEquipoRQ)) return false;
        ConsultaEquipoRQ other = (ConsultaEquipoRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serialDecodificador==null && other.getSerialDecodificador()==null) || 
             (this.serialDecodificador!=null &&
              this.serialDecodificador.equals(other.getSerialDecodificador()))) &&
            ((this.IDCLIENTEPIC==null && other.getIDCLIENTEPIC()==null) || 
             (this.IDCLIENTEPIC!=null &&
              this.IDCLIENTEPIC.equals(other.getIDCLIENTEPIC())));
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
        if (getSerialDecodificador() != null) {
            _hashCode += getSerialDecodificador().hashCode();
        }
        if (getIDCLIENTEPIC() != null) {
            _hashCode += getIDCLIENTEPIC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaEquipoRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaEquipoRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialDecodificador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "serialDecodificador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDCLIENTEPIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "IDCLIENTEPIC"));
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
