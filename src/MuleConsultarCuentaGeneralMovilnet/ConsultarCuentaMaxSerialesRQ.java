/**
 * ConsultarCuentaMaxSerialesRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarCuentaGeneralMovilnet;

public class ConsultarCuentaMaxSerialesRQ  implements java.io.Serializable {
    private java.lang.String IDCLIENTEPIC;

    private java.lang.String idPlan;

    private java.lang.String tipoCliente;

    public ConsultarCuentaMaxSerialesRQ() {
    }

    public ConsultarCuentaMaxSerialesRQ(
           java.lang.String IDCLIENTEPIC,
           java.lang.String idPlan,
           java.lang.String tipoCliente) {
           this.IDCLIENTEPIC = IDCLIENTEPIC;
           this.idPlan = idPlan;
           this.tipoCliente = tipoCliente;
    }


    /**
     * Gets the IDCLIENTEPIC value for this ConsultarCuentaMaxSerialesRQ.
     * 
     * @return IDCLIENTEPIC
     */
    public java.lang.String getIDCLIENTEPIC() {
        return IDCLIENTEPIC;
    }


    /**
     * Sets the IDCLIENTEPIC value for this ConsultarCuentaMaxSerialesRQ.
     * 
     * @param IDCLIENTEPIC
     */
    public void setIDCLIENTEPIC(java.lang.String IDCLIENTEPIC) {
        this.IDCLIENTEPIC = IDCLIENTEPIC;
    }


    /**
     * Gets the idPlan value for this ConsultarCuentaMaxSerialesRQ.
     * 
     * @return idPlan
     */
    public java.lang.String getIdPlan() {
        return idPlan;
    }


    /**
     * Sets the idPlan value for this ConsultarCuentaMaxSerialesRQ.
     * 
     * @param idPlan
     */
    public void setIdPlan(java.lang.String idPlan) {
        this.idPlan = idPlan;
    }


    /**
     * Gets the tipoCliente value for this ConsultarCuentaMaxSerialesRQ.
     * 
     * @return tipoCliente
     */
    public java.lang.String getTipoCliente() {
        return tipoCliente;
    }


    /**
     * Sets the tipoCliente value for this ConsultarCuentaMaxSerialesRQ.
     * 
     * @param tipoCliente
     */
    public void setTipoCliente(java.lang.String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarCuentaMaxSerialesRQ)) return false;
        ConsultarCuentaMaxSerialesRQ other = (ConsultarCuentaMaxSerialesRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDCLIENTEPIC==null && other.getIDCLIENTEPIC()==null) || 
             (this.IDCLIENTEPIC!=null &&
              this.IDCLIENTEPIC.equals(other.getIDCLIENTEPIC()))) &&
            ((this.idPlan==null && other.getIdPlan()==null) || 
             (this.idPlan!=null &&
              this.idPlan.equals(other.getIdPlan()))) &&
            ((this.tipoCliente==null && other.getTipoCliente()==null) || 
             (this.tipoCliente!=null &&
              this.tipoCliente.equals(other.getTipoCliente())));
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
        if (getIDCLIENTEPIC() != null) {
            _hashCode += getIDCLIENTEPIC().hashCode();
        }
        if (getIdPlan() != null) {
            _hashCode += getIdPlan().hashCode();
        }
        if (getTipoCliente() != null) {
            _hashCode += getTipoCliente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarCuentaMaxSerialesRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "ConsultarCuentaMaxSerialesRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDCLIENTEPIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "IDCLIENTEPIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "idPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarCuentaGeneralMovilnet", "tipoCliente"));
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
