/**
 * ConsultaContratosRP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarCuentaGeneralMovilnet;

public class ConsultaContratosRP  implements java.io.Serializable {
    private java.lang.String numeroCuentaContrato;

    private java.lang.String errorCode;

    private java.lang.String errorMessage;

    public ConsultaContratosRP() {
    }

    public ConsultaContratosRP(
           java.lang.String numeroCuentaContrato,
           java.lang.String errorCode,
           java.lang.String errorMessage) {
           this.numeroCuentaContrato = numeroCuentaContrato;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the numeroCuentaContrato value for this ConsultaContratosRP.
     * 
     * @return numeroCuentaContrato
     */
    public java.lang.String getNumeroCuentaContrato() {
        return numeroCuentaContrato;
    }


    /**
     * Sets the numeroCuentaContrato value for this ConsultaContratosRP.
     * 
     * @param numeroCuentaContrato
     */
    public void setNumeroCuentaContrato(java.lang.String numeroCuentaContrato) {
        this.numeroCuentaContrato = numeroCuentaContrato;
    }


    /**
     * Gets the errorCode value for this ConsultaContratosRP.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ConsultaContratosRP.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this ConsultaContratosRP.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ConsultaContratosRP.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaContratosRP)) return false;
        ConsultaContratosRP other = (ConsultaContratosRP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroCuentaContrato==null && other.getNumeroCuentaContrato()==null) || 
             (this.numeroCuentaContrato!=null &&
              this.numeroCuentaContrato.equals(other.getNumeroCuentaContrato()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage())));
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
        if (getNumeroCuentaContrato() != null) {
            _hashCode += getNumeroCuentaContrato().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaContratosRP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultaContratosRP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCuentaContrato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "numeroCuentaContrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "errorMessage"));
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
