/**
 * ConsultarServicioPorTlfIPTVRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarServicioIPTV;

public class ConsultarServicioPorTlfIPTVRQ  implements java.io.Serializable {
    private java.lang.String areaCode;

    private java.lang.String IDCLIENTEPIC;

    private int numberPhone;

    public ConsultarServicioPorTlfIPTVRQ() {
    }

    public ConsultarServicioPorTlfIPTVRQ(
           java.lang.String areaCode,
           java.lang.String IDCLIENTEPIC,
           int numberPhone) {
           this.areaCode = areaCode;
           this.IDCLIENTEPIC = IDCLIENTEPIC;
           this.numberPhone = numberPhone;
    }


    /**
     * Gets the areaCode value for this ConsultarServicioPorTlfIPTVRQ.
     * 
     * @return areaCode
     */
    public java.lang.String getAreaCode() {
        return areaCode;
    }


    /**
     * Sets the areaCode value for this ConsultarServicioPorTlfIPTVRQ.
     * 
     * @param areaCode
     */
    public void setAreaCode(java.lang.String areaCode) {
        this.areaCode = areaCode;
    }


    /**
     * Gets the IDCLIENTEPIC value for this ConsultarServicioPorTlfIPTVRQ.
     * 
     * @return IDCLIENTEPIC
     */
    public java.lang.String getIDCLIENTEPIC() {
        return IDCLIENTEPIC;
    }


    /**
     * Sets the IDCLIENTEPIC value for this ConsultarServicioPorTlfIPTVRQ.
     * 
     * @param IDCLIENTEPIC
     */
    public void setIDCLIENTEPIC(java.lang.String IDCLIENTEPIC) {
        this.IDCLIENTEPIC = IDCLIENTEPIC;
    }


    /**
     * Gets the numberPhone value for this ConsultarServicioPorTlfIPTVRQ.
     * 
     * @return numberPhone
     */
    public int getNumberPhone() {
        return numberPhone;
    }


    /**
     * Sets the numberPhone value for this ConsultarServicioPorTlfIPTVRQ.
     * 
     * @param numberPhone
     */
    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarServicioPorTlfIPTVRQ)) return false;
        ConsultarServicioPorTlfIPTVRQ other = (ConsultarServicioPorTlfIPTVRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.areaCode==null && other.getAreaCode()==null) || 
             (this.areaCode!=null &&
              this.areaCode.equals(other.getAreaCode()))) &&
            ((this.IDCLIENTEPIC==null && other.getIDCLIENTEPIC()==null) || 
             (this.IDCLIENTEPIC!=null &&
              this.IDCLIENTEPIC.equals(other.getIDCLIENTEPIC()))) &&
            this.numberPhone == other.getNumberPhone();
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
        if (getAreaCode() != null) {
            _hashCode += getAreaCode().hashCode();
        }
        if (getIDCLIENTEPIC() != null) {
            _hashCode += getIDCLIENTEPIC().hashCode();
        }
        _hashCode += getNumberPhone();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarServicioPorTlfIPTVRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicioPorTlfIPTVRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "areaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDCLIENTEPIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "IDCLIENTEPIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "numberPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
