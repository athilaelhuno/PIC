/**
 * ParroquiaTo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.movilnet.tvsat.dominio;

public class ParroquiaTo  implements java.io.Serializable {
    private ve.com.movilnet.tvsat.dominio.MunicipioTo municipioTo;

    private java.lang.String nombre;

    private ve.com.movilnet.tvsat.dominio.CiudadTo ciudadTo;

    private java.lang.String id;

    public ParroquiaTo() {
    }

    public ParroquiaTo(
           ve.com.movilnet.tvsat.dominio.MunicipioTo municipioTo,
           java.lang.String nombre,
           ve.com.movilnet.tvsat.dominio.CiudadTo ciudadTo,
           java.lang.String id) {
           this.municipioTo = municipioTo;
           this.nombre = nombre;
           this.ciudadTo = ciudadTo;
           this.id = id;
    }


    /**
     * Gets the municipioTo value for this ParroquiaTo.
     * 
     * @return municipioTo
     */
    public ve.com.movilnet.tvsat.dominio.MunicipioTo getMunicipioTo() {
        return municipioTo;
    }


    /**
     * Sets the municipioTo value for this ParroquiaTo.
     * 
     * @param municipioTo
     */
    public void setMunicipioTo(ve.com.movilnet.tvsat.dominio.MunicipioTo municipioTo) {
        this.municipioTo = municipioTo;
    }


    /**
     * Gets the nombre value for this ParroquiaTo.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ParroquiaTo.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the ciudadTo value for this ParroquiaTo.
     * 
     * @return ciudadTo
     */
    public ve.com.movilnet.tvsat.dominio.CiudadTo getCiudadTo() {
        return ciudadTo;
    }


    /**
     * Sets the ciudadTo value for this ParroquiaTo.
     * 
     * @param ciudadTo
     */
    public void setCiudadTo(ve.com.movilnet.tvsat.dominio.CiudadTo ciudadTo) {
        this.ciudadTo = ciudadTo;
    }


    /**
     * Gets the id value for this ParroquiaTo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ParroquiaTo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParroquiaTo)) return false;
        ParroquiaTo other = (ParroquiaTo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.municipioTo==null && other.getMunicipioTo()==null) || 
             (this.municipioTo!=null &&
              this.municipioTo.equals(other.getMunicipioTo()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.ciudadTo==null && other.getCiudadTo()==null) || 
             (this.ciudadTo!=null &&
              this.ciudadTo.equals(other.getCiudadTo()))) &&
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
        if (getMunicipioTo() != null) {
            _hashCode += getMunicipioTo().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getCiudadTo() != null) {
            _hashCode += getCiudadTo().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParroquiaTo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "ParroquiaTo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipioTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "municipioTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "MunicipioTo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciudadTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "ciudadTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "CiudadTo"));
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
