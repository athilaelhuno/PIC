/**
 * CargoPeriodicoTo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ClasesUtilMovilnet;

public class CargoPeriodicoTo  implements java.io.Serializable {
    private java.util.Calendar fechaFin;

    private int diaCobro;

    private java.util.Calendar fechaInicio;

    private java.lang.String id;

    public CargoPeriodicoTo() {
    }

    public CargoPeriodicoTo(
           java.util.Calendar fechaFin,
           int diaCobro,
           java.util.Calendar fechaInicio,
           java.lang.String id) {
           this.fechaFin = fechaFin;
           this.diaCobro = diaCobro;
           this.fechaInicio = fechaInicio;
           this.id = id;
    }


    /**
     * Gets the fechaFin value for this CargoPeriodicoTo.
     * 
     * @return fechaFin
     */
    public java.util.Calendar getFechaFin() {
        return fechaFin;
    }


    /**
     * Sets the fechaFin value for this CargoPeriodicoTo.
     * 
     * @param fechaFin
     */
    public void setFechaFin(java.util.Calendar fechaFin) {
        this.fechaFin = fechaFin;
    }


    /**
     * Gets the diaCobro value for this CargoPeriodicoTo.
     * 
     * @return diaCobro
     */
    public int getDiaCobro() {
        return diaCobro;
    }


    /**
     * Sets the diaCobro value for this CargoPeriodicoTo.
     * 
     * @param diaCobro
     */
    public void setDiaCobro(int diaCobro) {
        this.diaCobro = diaCobro;
    }


    /**
     * Gets the fechaInicio value for this CargoPeriodicoTo.
     * 
     * @return fechaInicio
     */
    public java.util.Calendar getFechaInicio() {
        return fechaInicio;
    }


    /**
     * Sets the fechaInicio value for this CargoPeriodicoTo.
     * 
     * @param fechaInicio
     */
    public void setFechaInicio(java.util.Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    /**
     * Gets the id value for this CargoPeriodicoTo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CargoPeriodicoTo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CargoPeriodicoTo)) return false;
        CargoPeriodicoTo other = (CargoPeriodicoTo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaFin==null && other.getFechaFin()==null) || 
             (this.fechaFin!=null &&
              this.fechaFin.equals(other.getFechaFin()))) &&
            this.diaCobro == other.getDiaCobro() &&
            ((this.fechaInicio==null && other.getFechaInicio()==null) || 
             (this.fechaInicio!=null &&
              this.fechaInicio.equals(other.getFechaInicio()))) &&
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
        if (getFechaFin() != null) {
            _hashCode += getFechaFin().hashCode();
        }
        _hashCode += getDiaCobro();
        if (getFechaInicio() != null) {
            _hashCode += getFechaInicio().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CargoPeriodicoTo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "CargoPeriodicoTo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaFin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "fechaFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diaCobro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "diaCobro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "fechaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
