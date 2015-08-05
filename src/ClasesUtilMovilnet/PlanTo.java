/**
 * PlanTo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ClasesUtilMovilnet;

public class PlanTo  implements java.io.Serializable {
    private java.util.Calendar fechaActivacion;

    private java.lang.String nombreComercial;

    private java.lang.String nombre;

    private java.lang.String idProductoB;

    private java.lang.String sufijoNombrePlan;

    private java.lang.String idTipoPlan;

    private java.lang.String idProductoC;

    private java.lang.String tipoUnidad;

    private java.lang.String id;

    public PlanTo() {
    }

    public PlanTo(
           java.util.Calendar fechaActivacion,
           java.lang.String nombreComercial,
           java.lang.String nombre,
           java.lang.String idProductoB,
           java.lang.String sufijoNombrePlan,
           java.lang.String idTipoPlan,
           java.lang.String idProductoC,
           java.lang.String tipoUnidad,
           java.lang.String id) {
           this.fechaActivacion = fechaActivacion;
           this.nombreComercial = nombreComercial;
           this.nombre = nombre;
           this.idProductoB = idProductoB;
           this.sufijoNombrePlan = sufijoNombrePlan;
           this.idTipoPlan = idTipoPlan;
           this.idProductoC = idProductoC;
           this.tipoUnidad = tipoUnidad;
           this.id = id;
    }


    /**
     * Gets the fechaActivacion value for this PlanTo.
     * 
     * @return fechaActivacion
     */
    public java.util.Calendar getFechaActivacion() {
        return fechaActivacion;
    }


    /**
     * Sets the fechaActivacion value for this PlanTo.
     * 
     * @param fechaActivacion
     */
    public void setFechaActivacion(java.util.Calendar fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }


    /**
     * Gets the nombreComercial value for this PlanTo.
     * 
     * @return nombreComercial
     */
    public java.lang.String getNombreComercial() {
        return nombreComercial;
    }


    /**
     * Sets the nombreComercial value for this PlanTo.
     * 
     * @param nombreComercial
     */
    public void setNombreComercial(java.lang.String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }


    /**
     * Gets the nombre value for this PlanTo.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this PlanTo.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the idProductoB value for this PlanTo.
     * 
     * @return idProductoB
     */
    public java.lang.String getIdProductoB() {
        return idProductoB;
    }


    /**
     * Sets the idProductoB value for this PlanTo.
     * 
     * @param idProductoB
     */
    public void setIdProductoB(java.lang.String idProductoB) {
        this.idProductoB = idProductoB;
    }


    /**
     * Gets the sufijoNombrePlan value for this PlanTo.
     * 
     * @return sufijoNombrePlan
     */
    public java.lang.String getSufijoNombrePlan() {
        return sufijoNombrePlan;
    }


    /**
     * Sets the sufijoNombrePlan value for this PlanTo.
     * 
     * @param sufijoNombrePlan
     */
    public void setSufijoNombrePlan(java.lang.String sufijoNombrePlan) {
        this.sufijoNombrePlan = sufijoNombrePlan;
    }


    /**
     * Gets the idTipoPlan value for this PlanTo.
     * 
     * @return idTipoPlan
     */
    public java.lang.String getIdTipoPlan() {
        return idTipoPlan;
    }


    /**
     * Sets the idTipoPlan value for this PlanTo.
     * 
     * @param idTipoPlan
     */
    public void setIdTipoPlan(java.lang.String idTipoPlan) {
        this.idTipoPlan = idTipoPlan;
    }


    /**
     * Gets the idProductoC value for this PlanTo.
     * 
     * @return idProductoC
     */
    public java.lang.String getIdProductoC() {
        return idProductoC;
    }


    /**
     * Sets the idProductoC value for this PlanTo.
     * 
     * @param idProductoC
     */
    public void setIdProductoC(java.lang.String idProductoC) {
        this.idProductoC = idProductoC;
    }


    /**
     * Gets the tipoUnidad value for this PlanTo.
     * 
     * @return tipoUnidad
     */
    public java.lang.String getTipoUnidad() {
        return tipoUnidad;
    }


    /**
     * Sets the tipoUnidad value for this PlanTo.
     * 
     * @param tipoUnidad
     */
    public void setTipoUnidad(java.lang.String tipoUnidad) {
        this.tipoUnidad = tipoUnidad;
    }


    /**
     * Gets the id value for this PlanTo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PlanTo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlanTo)) return false;
        PlanTo other = (PlanTo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaActivacion==null && other.getFechaActivacion()==null) || 
             (this.fechaActivacion!=null &&
              this.fechaActivacion.equals(other.getFechaActivacion()))) &&
            ((this.nombreComercial==null && other.getNombreComercial()==null) || 
             (this.nombreComercial!=null &&
              this.nombreComercial.equals(other.getNombreComercial()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.idProductoB==null && other.getIdProductoB()==null) || 
             (this.idProductoB!=null &&
              this.idProductoB.equals(other.getIdProductoB()))) &&
            ((this.sufijoNombrePlan==null && other.getSufijoNombrePlan()==null) || 
             (this.sufijoNombrePlan!=null &&
              this.sufijoNombrePlan.equals(other.getSufijoNombrePlan()))) &&
            ((this.idTipoPlan==null && other.getIdTipoPlan()==null) || 
             (this.idTipoPlan!=null &&
              this.idTipoPlan.equals(other.getIdTipoPlan()))) &&
            ((this.idProductoC==null && other.getIdProductoC()==null) || 
             (this.idProductoC!=null &&
              this.idProductoC.equals(other.getIdProductoC()))) &&
            ((this.tipoUnidad==null && other.getTipoUnidad()==null) || 
             (this.tipoUnidad!=null &&
              this.tipoUnidad.equals(other.getTipoUnidad()))) &&
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
        if (getFechaActivacion() != null) {
            _hashCode += getFechaActivacion().hashCode();
        }
        if (getNombreComercial() != null) {
            _hashCode += getNombreComercial().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getIdProductoB() != null) {
            _hashCode += getIdProductoB().hashCode();
        }
        if (getSufijoNombrePlan() != null) {
            _hashCode += getSufijoNombrePlan().hashCode();
        }
        if (getIdTipoPlan() != null) {
            _hashCode += getIdTipoPlan().hashCode();
        }
        if (getIdProductoC() != null) {
            _hashCode += getIdProductoC().hashCode();
        }
        if (getTipoUnidad() != null) {
            _hashCode += getTipoUnidad().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlanTo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "PlanTo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaActivacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "fechaActivacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreComercial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "nombreComercial"));
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
        elemField.setFieldName("idProductoB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "idProductoB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sufijoNombrePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "sufijoNombrePlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "idTipoPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProductoC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "idProductoC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoUnidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "tipoUnidad"));
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
