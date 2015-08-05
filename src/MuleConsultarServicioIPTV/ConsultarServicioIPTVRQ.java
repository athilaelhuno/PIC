/**
 * ConsultarServicioIPTVRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarServicioIPTV;

public class ConsultarServicioIPTVRQ  implements java.io.Serializable {
    private java.lang.String IDCLIENTEPIC;

    private java.lang.String idAccountIPTV;

    public ConsultarServicioIPTVRQ() {
    }

    public ConsultarServicioIPTVRQ(
           java.lang.String IDCLIENTEPIC,
           java.lang.String idAccountIPTV) {
           this.IDCLIENTEPIC = IDCLIENTEPIC;
           this.idAccountIPTV = idAccountIPTV;
    }


    /**
     * Gets the IDCLIENTEPIC value for this ConsultarServicioIPTVRQ.
     * 
     * @return IDCLIENTEPIC
     */
    public java.lang.String getIDCLIENTEPIC() {
        return IDCLIENTEPIC;
    }


    /**
     * Sets the IDCLIENTEPIC value for this ConsultarServicioIPTVRQ.
     * 
     * @param IDCLIENTEPIC
     */
    public void setIDCLIENTEPIC(java.lang.String IDCLIENTEPIC) {
        this.IDCLIENTEPIC = IDCLIENTEPIC;
    }


    /**
     * Gets the idAccountIPTV value for this ConsultarServicioIPTVRQ.
     * 
     * @return idAccountIPTV
     */
    public java.lang.String getIdAccountIPTV() {
        return idAccountIPTV;
    }


    /**
     * Sets the idAccountIPTV value for this ConsultarServicioIPTVRQ.
     * 
     * @param idAccountIPTV
     */
    public void setIdAccountIPTV(java.lang.String idAccountIPTV) {
        this.idAccountIPTV = idAccountIPTV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarServicioIPTVRQ)) return false;
        ConsultarServicioIPTVRQ other = (ConsultarServicioIPTVRQ) obj;
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
            ((this.idAccountIPTV==null && other.getIdAccountIPTV()==null) || 
             (this.idAccountIPTV!=null &&
              this.idAccountIPTV.equals(other.getIdAccountIPTV())));
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
        if (getIdAccountIPTV() != null) {
            _hashCode += getIdAccountIPTV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarServicioIPTVRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicioIPTVRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDCLIENTEPIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "IDCLIENTEPIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAccountIPTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "idAccountIPTV"));
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
