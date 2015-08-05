/**
 * SectorTo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.movilnet.tvsat.dominio;

public class SectorTo  implements java.io.Serializable {
    private java.lang.String nombre;

    private java.lang.String clasificacion;

    private ve.com.movilnet.tvsat.dominio.ParroquiaTo parroquia;

    private java.lang.String id;

    public SectorTo() {
    }

    public SectorTo(
           java.lang.String nombre,
           java.lang.String clasificacion,
           ve.com.movilnet.tvsat.dominio.ParroquiaTo parroquia,
           java.lang.String id) {
           this.nombre = nombre;
           this.clasificacion = clasificacion;
           this.parroquia = parroquia;
           this.id = id;
    }


    /**
     * Gets the nombre value for this SectorTo.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this SectorTo.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the clasificacion value for this SectorTo.
     * 
     * @return clasificacion
     */
    public java.lang.String getClasificacion() {
        return clasificacion;
    }


    /**
     * Sets the clasificacion value for this SectorTo.
     * 
     * @param clasificacion
     */
    public void setClasificacion(java.lang.String clasificacion) {
        this.clasificacion = clasificacion;
    }


    /**
     * Gets the parroquia value for this SectorTo.
     * 
     * @return parroquia
     */
    public ve.com.movilnet.tvsat.dominio.ParroquiaTo getParroquia() {
        return parroquia;
    }


    /**
     * Sets the parroquia value for this SectorTo.
     * 
     * @param parroquia
     */
    public void setParroquia(ve.com.movilnet.tvsat.dominio.ParroquiaTo parroquia) {
        this.parroquia = parroquia;
    }


    /**
     * Gets the id value for this SectorTo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this SectorTo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SectorTo)) return false;
        SectorTo other = (SectorTo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.clasificacion==null && other.getClasificacion()==null) || 
             (this.clasificacion!=null &&
              this.clasificacion.equals(other.getClasificacion()))) &&
            ((this.parroquia==null && other.getParroquia()==null) || 
             (this.parroquia!=null &&
              this.parroquia.equals(other.getParroquia()))) &&
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
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getClasificacion() != null) {
            _hashCode += getClasificacion().hashCode();
        }
        if (getParroquia() != null) {
            _hashCode += getParroquia().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SectorTo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "SectorTo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clasificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "clasificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parroquia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "parroquia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dominio.tvsat.movilnet.com.ve/", "ParroquiaTo"));
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
