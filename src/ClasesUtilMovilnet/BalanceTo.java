/**
 * BalanceTo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ClasesUtilMovilnet;

public class BalanceTo  implements java.io.Serializable {
    private double monto;

    private java.lang.String tipoBalance;

    private java.lang.String nombreComercial;

    private java.lang.String nombre;

    private java.lang.String indAjuste;

    private java.util.Calendar fechaExpiracion;

    private java.lang.String indDecimal;

    private java.lang.String unidad;

    private java.lang.String indImpuesto;

    private double balanceDisponible;

    private int factorConversion;

    private java.lang.String id;

    public BalanceTo() {
    }

    public BalanceTo(
           double monto,
           java.lang.String tipoBalance,
           java.lang.String nombreComercial,
           java.lang.String nombre,
           java.lang.String indAjuste,
           java.util.Calendar fechaExpiracion,
           java.lang.String indDecimal,
           java.lang.String unidad,
           java.lang.String indImpuesto,
           double balanceDisponible,
           int factorConversion,
           java.lang.String id) {
           this.monto = monto;
           this.tipoBalance = tipoBalance;
           this.nombreComercial = nombreComercial;
           this.nombre = nombre;
           this.indAjuste = indAjuste;
           this.fechaExpiracion = fechaExpiracion;
           this.indDecimal = indDecimal;
           this.unidad = unidad;
           this.indImpuesto = indImpuesto;
           this.balanceDisponible = balanceDisponible;
           this.factorConversion = factorConversion;
           this.id = id;
    }


    /**
     * Gets the monto value for this BalanceTo.
     * 
     * @return monto
     */
    public double getMonto() {
        return monto;
    }


    /**
     * Sets the monto value for this BalanceTo.
     * 
     * @param monto
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }


    /**
     * Gets the tipoBalance value for this BalanceTo.
     * 
     * @return tipoBalance
     */
    public java.lang.String getTipoBalance() {
        return tipoBalance;
    }


    /**
     * Sets the tipoBalance value for this BalanceTo.
     * 
     * @param tipoBalance
     */
    public void setTipoBalance(java.lang.String tipoBalance) {
        this.tipoBalance = tipoBalance;
    }


    /**
     * Gets the nombreComercial value for this BalanceTo.
     * 
     * @return nombreComercial
     */
    public java.lang.String getNombreComercial() {
        return nombreComercial;
    }


    /**
     * Sets the nombreComercial value for this BalanceTo.
     * 
     * @param nombreComercial
     */
    public void setNombreComercial(java.lang.String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }


    /**
     * Gets the nombre value for this BalanceTo.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this BalanceTo.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the indAjuste value for this BalanceTo.
     * 
     * @return indAjuste
     */
    public java.lang.String getIndAjuste() {
        return indAjuste;
    }


    /**
     * Sets the indAjuste value for this BalanceTo.
     * 
     * @param indAjuste
     */
    public void setIndAjuste(java.lang.String indAjuste) {
        this.indAjuste = indAjuste;
    }


    /**
     * Gets the fechaExpiracion value for this BalanceTo.
     * 
     * @return fechaExpiracion
     */
    public java.util.Calendar getFechaExpiracion() {
        return fechaExpiracion;
    }


    /**
     * Sets the fechaExpiracion value for this BalanceTo.
     * 
     * @param fechaExpiracion
     */
    public void setFechaExpiracion(java.util.Calendar fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }


    /**
     * Gets the indDecimal value for this BalanceTo.
     * 
     * @return indDecimal
     */
    public java.lang.String getIndDecimal() {
        return indDecimal;
    }


    /**
     * Sets the indDecimal value for this BalanceTo.
     * 
     * @param indDecimal
     */
    public void setIndDecimal(java.lang.String indDecimal) {
        this.indDecimal = indDecimal;
    }


    /**
     * Gets the unidad value for this BalanceTo.
     * 
     * @return unidad
     */
    public java.lang.String getUnidad() {
        return unidad;
    }


    /**
     * Sets the unidad value for this BalanceTo.
     * 
     * @param unidad
     */
    public void setUnidad(java.lang.String unidad) {
        this.unidad = unidad;
    }


    /**
     * Gets the indImpuesto value for this BalanceTo.
     * 
     * @return indImpuesto
     */
    public java.lang.String getIndImpuesto() {
        return indImpuesto;
    }


    /**
     * Sets the indImpuesto value for this BalanceTo.
     * 
     * @param indImpuesto
     */
    public void setIndImpuesto(java.lang.String indImpuesto) {
        this.indImpuesto = indImpuesto;
    }


    /**
     * Gets the balanceDisponible value for this BalanceTo.
     * 
     * @return balanceDisponible
     */
    public double getBalanceDisponible() {
        return balanceDisponible;
    }


    /**
     * Sets the balanceDisponible value for this BalanceTo.
     * 
     * @param balanceDisponible
     */
    public void setBalanceDisponible(double balanceDisponible) {
        this.balanceDisponible = balanceDisponible;
    }


    /**
     * Gets the factorConversion value for this BalanceTo.
     * 
     * @return factorConversion
     */
    public int getFactorConversion() {
        return factorConversion;
    }


    /**
     * Sets the factorConversion value for this BalanceTo.
     * 
     * @param factorConversion
     */
    public void setFactorConversion(int factorConversion) {
        this.factorConversion = factorConversion;
    }


    /**
     * Gets the id value for this BalanceTo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this BalanceTo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceTo)) return false;
        BalanceTo other = (BalanceTo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.monto == other.getMonto() &&
            ((this.tipoBalance==null && other.getTipoBalance()==null) || 
             (this.tipoBalance!=null &&
              this.tipoBalance.equals(other.getTipoBalance()))) &&
            ((this.nombreComercial==null && other.getNombreComercial()==null) || 
             (this.nombreComercial!=null &&
              this.nombreComercial.equals(other.getNombreComercial()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.indAjuste==null && other.getIndAjuste()==null) || 
             (this.indAjuste!=null &&
              this.indAjuste.equals(other.getIndAjuste()))) &&
            ((this.fechaExpiracion==null && other.getFechaExpiracion()==null) || 
             (this.fechaExpiracion!=null &&
              this.fechaExpiracion.equals(other.getFechaExpiracion()))) &&
            ((this.indDecimal==null && other.getIndDecimal()==null) || 
             (this.indDecimal!=null &&
              this.indDecimal.equals(other.getIndDecimal()))) &&
            ((this.unidad==null && other.getUnidad()==null) || 
             (this.unidad!=null &&
              this.unidad.equals(other.getUnidad()))) &&
            ((this.indImpuesto==null && other.getIndImpuesto()==null) || 
             (this.indImpuesto!=null &&
              this.indImpuesto.equals(other.getIndImpuesto()))) &&
            this.balanceDisponible == other.getBalanceDisponible() &&
            this.factorConversion == other.getFactorConversion() &&
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
        _hashCode += new Double(getMonto()).hashCode();
        if (getTipoBalance() != null) {
            _hashCode += getTipoBalance().hashCode();
        }
        if (getNombreComercial() != null) {
            _hashCode += getNombreComercial().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getIndAjuste() != null) {
            _hashCode += getIndAjuste().hashCode();
        }
        if (getFechaExpiracion() != null) {
            _hashCode += getFechaExpiracion().hashCode();
        }
        if (getIndDecimal() != null) {
            _hashCode += getIndDecimal().hashCode();
        }
        if (getUnidad() != null) {
            _hashCode += getUnidad().hashCode();
        }
        if (getIndImpuesto() != null) {
            _hashCode += getIndImpuesto().hashCode();
        }
        _hashCode += new Double(getBalanceDisponible()).hashCode();
        _hashCode += getFactorConversion();
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceTo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "BalanceTo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "monto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "tipoBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("indAjuste");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "indAjuste"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaExpiracion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "fechaExpiracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indDecimal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "indDecimal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "unidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indImpuesto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "indImpuesto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceDisponible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "balanceDisponible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factorConversion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "factorConversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
