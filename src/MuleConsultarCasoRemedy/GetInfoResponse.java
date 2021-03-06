/**
 * GetInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarCasoRemedy;

public class GetInfoResponse  implements java.io.Serializable {
    private UtilsClass.ServiceControlReturn getInfoReturn;

    public GetInfoResponse() {
    }

    public GetInfoResponse(
           UtilsClass.ServiceControlReturn getInfoReturn) {
           this.getInfoReturn = getInfoReturn;
    }


    /**
     * Gets the getInfoReturn value for this GetInfoResponse.
     * 
     * @return getInfoReturn
     */
    public UtilsClass.ServiceControlReturn getGetInfoReturn() {
        return getInfoReturn;
    }


    /**
     * Sets the getInfoReturn value for this GetInfoResponse.
     * 
     * @param getInfoReturn
     */
    public void setGetInfoReturn(UtilsClass.ServiceControlReturn getInfoReturn) {
        this.getInfoReturn = getInfoReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInfoResponse)) return false;
        GetInfoResponse other = (GetInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getInfoReturn==null && other.getGetInfoReturn()==null) || 
             (this.getInfoReturn!=null &&
              this.getInfoReturn.equals(other.getGetInfoReturn())));
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
        if (getGetInfoReturn() != null) {
            _hashCode += getGetInfoReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", ">getInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getInfoReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", "getInfoReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://UtilsClass", "ServiceControlReturn"));
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
