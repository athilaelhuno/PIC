/**
 * ConsultarCuentaMaxSerialesRP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarCuentaGeneralMovilnet;

public class ConsultarCuentaMaxSerialesRP  implements java.io.Serializable {
    private java.lang.Long maxCuentasDecodificador;

    private java.lang.Long maxCuentasTarjetas;

    private java.lang.String errorMessage;

    private java.lang.String errorCode;

    public ConsultarCuentaMaxSerialesRP() {
    }

    public ConsultarCuentaMaxSerialesRP(
           java.lang.Long maxCuentasDecodificador,
           java.lang.Long maxCuentasTarjetas,
           java.lang.String errorMessage,
           java.lang.String errorCode) {
           this.maxCuentasDecodificador = maxCuentasDecodificador;
           this.maxCuentasTarjetas = maxCuentasTarjetas;
           this.errorMessage = errorMessage;
           this.errorCode = errorCode;
    }


    /**
     * Gets the maxCuentasDecodificador value for this ConsultarCuentaMaxSerialesRP.
     * 
     * @return maxCuentasDecodificador
     */
    public java.lang.Long getMaxCuentasDecodificador() {
        return maxCuentasDecodificador;
    }


    /**
     * Sets the maxCuentasDecodificador value for this ConsultarCuentaMaxSerialesRP.
     * 
     * @param maxCuentasDecodificador
     */
    public void setMaxCuentasDecodificador(java.lang.Long maxCuentasDecodificador) {
        this.maxCuentasDecodificador = maxCuentasDecodificador;
    }


    /**
     * Gets the maxCuentasTarjetas value for this ConsultarCuentaMaxSerialesRP.
     * 
     * @return maxCuentasTarjetas
     */
    public java.lang.Long getMaxCuentasTarjetas() {
        return maxCuentasTarjetas;
    }


    /**
     * Sets the maxCuentasTarjetas value for this ConsultarCuentaMaxSerialesRP.
     * 
     * @param maxCuentasTarjetas
     */
    public void setMaxCuentasTarjetas(java.lang.Long maxCuentasTarjetas) {
        this.maxCuentasTarjetas = maxCuentasTarjetas;
    }


    /**
     * Gets the errorMessage value for this ConsultarCuentaMaxSerialesRP.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ConsultarCuentaMaxSerialesRP.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the errorCode value for this ConsultarCuentaMaxSerialesRP.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ConsultarCuentaMaxSerialesRP.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarCuentaMaxSerialesRP)) return false;
        ConsultarCuentaMaxSerialesRP other = (ConsultarCuentaMaxSerialesRP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maxCuentasDecodificador==null && other.getMaxCuentasDecodificador()==null) || 
             (this.maxCuentasDecodificador!=null &&
              this.maxCuentasDecodificador.equals(other.getMaxCuentasDecodificador()))) &&
            ((this.maxCuentasTarjetas==null && other.getMaxCuentasTarjetas()==null) || 
             (this.maxCuentasTarjetas!=null &&
              this.maxCuentasTarjetas.equals(other.getMaxCuentasTarjetas()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode())));
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
        if (getMaxCuentasDecodificador() != null) {
            _hashCode += getMaxCuentasDecodificador().hashCode();
        }
        if (getMaxCuentasTarjetas() != null) {
            _hashCode += getMaxCuentasTarjetas().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarCuentaMaxSerialesRP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultarCuentaMaxSerialesRP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCuentasDecodificador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "maxCuentasDecodificador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCuentasTarjetas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "maxCuentasTarjetas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "errorCode"));
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
