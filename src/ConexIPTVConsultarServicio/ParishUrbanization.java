/**
 * ParishUrbanization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ConexIPTVConsultarServicio;

public class ParishUrbanization  implements java.io.Serializable {
    private long idParishUrbanization;

    private ve.com.cantv.iptv.bss.webservice.Remedy.Parish parish;

    private ve.com.cantv.iptv.bss.webservice.Remedy.Urbanization urbanization;

    public ParishUrbanization() {
    }

    public ParishUrbanization(
           long idParishUrbanization,
           ve.com.cantv.iptv.bss.webservice.Remedy.Parish parish,
           ve.com.cantv.iptv.bss.webservice.Remedy.Urbanization urbanization) {
           this.idParishUrbanization = idParishUrbanization;
           this.parish = parish;
           this.urbanization = urbanization;
    }


    /**
     * Gets the idParishUrbanization value for this ParishUrbanization.
     * 
     * @return idParishUrbanization
     */
    public long getIdParishUrbanization() {
        return idParishUrbanization;
    }


    /**
     * Sets the idParishUrbanization value for this ParishUrbanization.
     * 
     * @param idParishUrbanization
     */
    public void setIdParishUrbanization(long idParishUrbanization) {
        this.idParishUrbanization = idParishUrbanization;
    }


    /**
     * Gets the parish value for this ParishUrbanization.
     * 
     * @return parish
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.Parish getParish() {
        return parish;
    }


    /**
     * Sets the parish value for this ParishUrbanization.
     * 
     * @param parish
     */
    public void setParish(ve.com.cantv.iptv.bss.webservice.Remedy.Parish parish) {
        this.parish = parish;
    }


    /**
     * Gets the urbanization value for this ParishUrbanization.
     * 
     * @return urbanization
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.Urbanization getUrbanization() {
        return urbanization;
    }


    /**
     * Sets the urbanization value for this ParishUrbanization.
     * 
     * @param urbanization
     */
    public void setUrbanization(ve.com.cantv.iptv.bss.webservice.Remedy.Urbanization urbanization) {
        this.urbanization = urbanization;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParishUrbanization)) return false;
        ParishUrbanization other = (ParishUrbanization) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idParishUrbanization == other.getIdParishUrbanization() &&
            ((this.parish==null && other.getParish()==null) || 
             (this.parish!=null &&
              this.parish.equals(other.getParish()))) &&
            ((this.urbanization==null && other.getUrbanization()==null) || 
             (this.urbanization!=null &&
              this.urbanization.equals(other.getUrbanization())));
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
        _hashCode += new Long(getIdParishUrbanization()).hashCode();
        if (getParish() != null) {
            _hashCode += getParish().hashCode();
        }
        if (getUrbanization() != null) {
            _hashCode += getUrbanization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParishUrbanization.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "ParishUrbanization"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idParishUrbanization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "idParishUrbanization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parish");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "parish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "parish"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urbanization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "urbanization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "urbanization"));
        elemField.setMinOccurs(0);
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
