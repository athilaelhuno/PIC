/**
 * ConsultarCasoRemedyRP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarCasoRemedy;

public class ConsultarCasoRemedyRP  implements java.io.Serializable {
    private java.lang.String resultado;

    private java.lang.Integer registros;

    private java.lang.String desctripcion;

    private java.lang.String creado;

    private java.lang.String error;

    private java.lang.String estado;

    private java.lang.String caso;

    private java.lang.String categoria;

    public ConsultarCasoRemedyRP() {
    }

    public ConsultarCasoRemedyRP(
           java.lang.String resultado,
           java.lang.Integer registros,
           java.lang.String desctripcion,
           java.lang.String creado,
           java.lang.String error,
           java.lang.String estado,
           java.lang.String caso,
           java.lang.String categoria) {
           this.resultado = resultado;
           this.registros = registros;
           this.desctripcion = desctripcion;
           this.creado = creado;
           this.error = error;
           this.estado = estado;
           this.caso = caso;
           this.categoria = categoria;
    }


    /**
     * Gets the resultado value for this ConsultarCasoRemedyRP.
     * 
     * @return resultado
     */
    public java.lang.String getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this ConsultarCasoRemedyRP.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.String resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the registros value for this ConsultarCasoRemedyRP.
     * 
     * @return registros
     */
    public java.lang.Integer getRegistros() {
        return registros;
    }


    /**
     * Sets the registros value for this ConsultarCasoRemedyRP.
     * 
     * @param registros
     */
    public void setRegistros(java.lang.Integer registros) {
        this.registros = registros;
    }


    /**
     * Gets the desctripcion value for this ConsultarCasoRemedyRP.
     * 
     * @return desctripcion
     */
    public java.lang.String getDesctripcion() {
        return desctripcion;
    }


    /**
     * Sets the desctripcion value for this ConsultarCasoRemedyRP.
     * 
     * @param desctripcion
     */
    public void setDesctripcion(java.lang.String desctripcion) {
        this.desctripcion = desctripcion;
    }


    /**
     * Gets the creado value for this ConsultarCasoRemedyRP.
     * 
     * @return creado
     */
    public java.lang.String getCreado() {
        return creado;
    }


    /**
     * Sets the creado value for this ConsultarCasoRemedyRP.
     * 
     * @param creado
     */
    public void setCreado(java.lang.String creado) {
        this.creado = creado;
    }


    /**
     * Gets the error value for this ConsultarCasoRemedyRP.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this ConsultarCasoRemedyRP.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the estado value for this ConsultarCasoRemedyRP.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this ConsultarCasoRemedyRP.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the caso value for this ConsultarCasoRemedyRP.
     * 
     * @return caso
     */
    public java.lang.String getCaso() {
        return caso;
    }


    /**
     * Sets the caso value for this ConsultarCasoRemedyRP.
     * 
     * @param caso
     */
    public void setCaso(java.lang.String caso) {
        this.caso = caso;
    }


    /**
     * Gets the categoria value for this ConsultarCasoRemedyRP.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this ConsultarCasoRemedyRP.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarCasoRemedyRP)) return false;
        ConsultarCasoRemedyRP other = (ConsultarCasoRemedyRP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado()))) &&
            ((this.registros==null && other.getRegistros()==null) || 
             (this.registros!=null &&
              this.registros.equals(other.getRegistros()))) &&
            ((this.desctripcion==null && other.getDesctripcion()==null) || 
             (this.desctripcion!=null &&
              this.desctripcion.equals(other.getDesctripcion()))) &&
            ((this.creado==null && other.getCreado()==null) || 
             (this.creado!=null &&
              this.creado.equals(other.getCreado()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.caso==null && other.getCaso()==null) || 
             (this.caso!=null &&
              this.caso.equals(other.getCaso()))) &&
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria())));
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
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        if (getRegistros() != null) {
            _hashCode += getRegistros().hashCode();
        }
        if (getDesctripcion() != null) {
            _hashCode += getDesctripcion().hashCode();
        }
        if (getCreado() != null) {
            _hashCode += getCreado().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getCaso() != null) {
            _hashCode += getCaso().hashCode();
        }
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarCasoRemedyRP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", "ConsultarCasoRemedyRP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", "resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", "registros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desctripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", "desctripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", "creado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", "caso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCasoRemedy", "categoria"));
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
