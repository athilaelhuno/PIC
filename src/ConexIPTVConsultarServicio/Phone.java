/**
 * Phone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ConexIPTVConsultarServicio;

public class Phone  implements java.io.Serializable {
    private long idPhone;

    private java.lang.String codeArea;

    private long phoneNumber;

    private java.lang.String billingAccount;

    private java.lang.String central;

    public Phone() {
    }

    public Phone(
           long idPhone,
           java.lang.String codeArea,
           long phoneNumber,
           java.lang.String billingAccount,
           java.lang.String central) {
           this.idPhone = idPhone;
           this.codeArea = codeArea;
           this.phoneNumber = phoneNumber;
           this.billingAccount = billingAccount;
           this.central = central;
    }


    /**
     * Gets the idPhone value for this Phone.
     * 
     * @return idPhone
     */
    public long getIdPhone() {
        return idPhone;
    }


    /**
     * Sets the idPhone value for this Phone.
     * 
     * @param idPhone
     */
    public void setIdPhone(long idPhone) {
        this.idPhone = idPhone;
    }


    /**
     * Gets the codeArea value for this Phone.
     * 
     * @return codeArea
     */
    public java.lang.String getCodeArea() {
        return codeArea;
    }


    /**
     * Sets the codeArea value for this Phone.
     * 
     * @param codeArea
     */
    public void setCodeArea(java.lang.String codeArea) {
        this.codeArea = codeArea;
    }


    /**
     * Gets the phoneNumber value for this Phone.
     * 
     * @return phoneNumber
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this Phone.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the billingAccount value for this Phone.
     * 
     * @return billingAccount
     */
    public java.lang.String getBillingAccount() {
        return billingAccount;
    }


    /**
     * Sets the billingAccount value for this Phone.
     * 
     * @param billingAccount
     */
    public void setBillingAccount(java.lang.String billingAccount) {
        this.billingAccount = billingAccount;
    }


    /**
     * Gets the central value for this Phone.
     * 
     * @return central
     */
    public java.lang.String getCentral() {
        return central;
    }


    /**
     * Sets the central value for this Phone.
     * 
     * @param central
     */
    public void setCentral(java.lang.String central) {
        this.central = central;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Phone)) return false;
        Phone other = (Phone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idPhone == other.getIdPhone() &&
            ((this.codeArea==null && other.getCodeArea()==null) || 
             (this.codeArea!=null &&
              this.codeArea.equals(other.getCodeArea()))) &&
            this.phoneNumber == other.getPhoneNumber() &&
            ((this.billingAccount==null && other.getBillingAccount()==null) || 
             (this.billingAccount!=null &&
              this.billingAccount.equals(other.getBillingAccount()))) &&
            ((this.central==null && other.getCentral()==null) || 
             (this.central!=null &&
              this.central.equals(other.getCentral())));
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
        _hashCode += new Long(getIdPhone()).hashCode();
        if (getCodeArea() != null) {
            _hashCode += getCodeArea().hashCode();
        }
        _hashCode += new Long(getPhoneNumber()).hashCode();
        if (getBillingAccount() != null) {
            _hashCode += getBillingAccount().hashCode();
        }
        if (getCentral() != null) {
            _hashCode += getCentral().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Phone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "Phone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "idPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "codeArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "billingAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("central");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "central"));
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
