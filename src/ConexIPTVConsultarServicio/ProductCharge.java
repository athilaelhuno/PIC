/**
 * ProductCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ConexIPTVConsultarServicio;

public class ProductCharge  implements java.io.Serializable {
    private long idProductCharge;

    private ve.com.cantv.iptv.bss.webservice.Remedy.Charge charge;

    public ProductCharge() {
    }

    public ProductCharge(
           long idProductCharge,
           ve.com.cantv.iptv.bss.webservice.Remedy.Charge charge) {
           this.idProductCharge = idProductCharge;
           this.charge = charge;
    }


    /**
     * Gets the idProductCharge value for this ProductCharge.
     * 
     * @return idProductCharge
     */
    public long getIdProductCharge() {
        return idProductCharge;
    }


    /**
     * Sets the idProductCharge value for this ProductCharge.
     * 
     * @param idProductCharge
     */
    public void setIdProductCharge(long idProductCharge) {
        this.idProductCharge = idProductCharge;
    }


    /**
     * Gets the charge value for this ProductCharge.
     * 
     * @return charge
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.Charge getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this ProductCharge.
     * 
     * @param charge
     */
    public void setCharge(ve.com.cantv.iptv.bss.webservice.Remedy.Charge charge) {
        this.charge = charge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductCharge)) return false;
        ProductCharge other = (ProductCharge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idProductCharge == other.getIdProductCharge() &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge())));
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
        _hashCode += new Long(getIdProductCharge()).hashCode();
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductCharge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "ProductCharge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProductCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "idProductCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "charge"));
        elemField.setMinOccurs(0);
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
