/**
 * ZonaPostalTo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.movilnet.tvsat.dominio;

public class ZonaPostalTo  implements java.io.Serializable {
    private ve.com.movilnet.tvsat.dominio.SectorTo sector;

    private java.lang.String zonaPostal;

    private java.lang.String id;

    public ZonaPostalTo() {
    }

    public ZonaPostalTo(
           ve.com.movilnet.tvsat.dominio.SectorTo sector,
           java.lang.String zonaPostal,
           java.lang.String id) {
           this.sector = sector;
           this.zonaPostal = zonaPostal;
           this.id = id;
    }


    /**
     * Gets the sector value for this ZonaPostalTo.
     * 
     * @return sector
     */
    public ve.com.movilnet.tvsat.dominio.SectorTo getSector() {
        return sector;
    }


    /**
     * Sets the sector value for this ZonaPostalTo.
     * 
     * @param sector
     */
    public void setSector(ve.com.movilnet.tvsat.dominio.SectorTo sector) {
        this.sector = sector;
    }


    /**
     * Gets the zonaPostal value for this ZonaPostalTo.
     * 
     * @return zonaPostal
     */
    public java.lang.String getZonaPostal() {
        return zonaPostal;
    }


    /**
     * Sets the zonaPostal value for this ZonaPostalTo.
     * 
     * @param zonaPostal
     */
    public void setZonaPostal(java.lang.String zonaPostal) {
        this.zonaPostal = zonaPostal;
    }


    /**
     * Gets the id value for this ZonaPostalTo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ZonaPostalTo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZonaPostalTo)) return false;
        ZonaPostalTo other = (ZonaPostalTo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sector==null && other.getSector()==null) || 
             (this.sector!=null &&
              this.sector.equals(other.getSector()))) &&
            ((this.zonaPostal==null && other.getZonaPostal()==null) || 
             (this.zonaPostal!=null &&
              this.zonaPostal.equals(other.getZonaPostal()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getSector() != null) {
            _hashCode += getSector().hashCode();
        }
        if (getZonaPostal() != null) {
            _hashCode += getZonaPostal().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZonaPostalTo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "ZonaPostalTo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "sector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "SectorTo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zonaPostal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "zonaPostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "id"));
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
