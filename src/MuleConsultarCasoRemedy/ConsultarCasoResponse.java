/**
 * ConsultarCasoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarCasoRemedy;

public class ConsultarCasoResponse  implements java.io.Serializable {
    private MuleConsultarCasoRemedy.ConsultarCasoRemedyRP consultarCasoReturn;

    public ConsultarCasoResponse() {
    }

    public ConsultarCasoResponse(
           MuleConsultarCasoRemedy.ConsultarCasoRemedyRP consultarCasoReturn) {
           this.consultarCasoReturn = consultarCasoReturn;
    }


    /**
     * Gets the consultarCasoReturn value for this ConsultarCasoResponse.
     * 
     * @return consultarCasoReturn
     */
    public MuleConsultarCasoRemedy.ConsultarCasoRemedyRP getConsultarCasoReturn() {
        return consultarCasoReturn;
    }


    /**
     * Sets the consultarCasoReturn value for this ConsultarCasoResponse.
     * 
     * @param consultarCasoReturn
     */
    public void setConsultarCasoReturn(MuleConsultarCasoRemedy.ConsultarCasoRemedyRP consultarCasoReturn) {
        this.consultarCasoReturn = consultarCasoReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarCasoResponse)) return false;
        ConsultarCasoResponse other = (ConsultarCasoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consultarCasoReturn==null && other.getConsultarCasoReturn()==null) || 
             (this.consultarCasoReturn!=null &&
              this.consultarCasoReturn.equals(other.getConsultarCasoReturn())));
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
        if (getConsultarCasoReturn() != null) {
            _hashCode += getConsultarCasoReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarCasoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", ">ConsultarCasoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consultarCasoReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", "ConsultarCasoReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", "ConsultarCasoRemedyRP"));
        elemField.setNillable(false);
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
