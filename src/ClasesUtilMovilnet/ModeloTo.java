/**
 * ModeloTo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ClasesUtilMovilnet;

public class ModeloTo  implements java.io.Serializable {
    private java.lang.String subCategoria;

    private java.lang.String nombre;

    private java.lang.String categoria;

    private java.lang.String codigoSap;

    private java.lang.String id;

    public ModeloTo() {
    }

    public ModeloTo(
           java.lang.String subCategoria,
           java.lang.String nombre,
           java.lang.String categoria,
           java.lang.String codigoSap,
           java.lang.String id) {
           this.subCategoria = subCategoria;
           this.nombre = nombre;
           this.categoria = categoria;
           this.codigoSap = codigoSap;
           this.id = id;
    }


    /**
     * Gets the subCategoria value for this ModeloTo.
     * 
     * @return subCategoria
     */
    public java.lang.String getSubCategoria() {
        return subCategoria;
    }


    /**
     * Sets the subCategoria value for this ModeloTo.
     * 
     * @param subCategoria
     */
    public void setSubCategoria(java.lang.String subCategoria) {
        this.subCategoria = subCategoria;
    }


    /**
     * Gets the nombre value for this ModeloTo.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ModeloTo.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the categoria value for this ModeloTo.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this ModeloTo.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the codigoSap value for this ModeloTo.
     * 
     * @return codigoSap
     */
    public java.lang.String getCodigoSap() {
        return codigoSap;
    }


    /**
     * Sets the codigoSap value for this ModeloTo.
     * 
     * @param codigoSap
     */
    public void setCodigoSap(java.lang.String codigoSap) {
        this.codigoSap = codigoSap;
    }


    /**
     * Gets the id value for this ModeloTo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ModeloTo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModeloTo)) return false;
        ModeloTo other = (ModeloTo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subCategoria==null && other.getSubCategoria()==null) || 
             (this.subCategoria!=null &&
              this.subCategoria.equals(other.getSubCategoria()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            ((this.codigoSap==null && other.getCodigoSap()==null) || 
             (this.codigoSap!=null &&
              this.codigoSap.equals(other.getCodigoSap()))) &&
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
        if (getSubCategoria() != null) {
            _hashCode += getSubCategoria().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        if (getCodigoSap() != null) {
            _hashCode += getCodigoSap().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModeloTo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "ModeloTo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCategoria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "subCategoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "categoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "codigoSap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "id"));
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
