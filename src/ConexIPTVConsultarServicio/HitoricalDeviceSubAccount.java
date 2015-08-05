/**
 * HitoricalDeviceSubAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ConexIPTVConsultarServicio;

public class HitoricalDeviceSubAccount  implements java.io.Serializable {
    private long idHistoricalDeviceSubAccount;

    private ve.com.cantv.iptv.bss.webservice.Remedy.DeviceSubAccount deviceSubAccount;

    private java.lang.String responsible;

    private java.util.Date changeDate;

    private ve.com.cantv.iptv.bss.webservice.Remedy.Status status;

    private ve.com.cantv.iptv.bss.webservice.Remedy.Reason reason;

    public HitoricalDeviceSubAccount() {
    }

    public HitoricalDeviceSubAccount(
           long idHistoricalDeviceSubAccount,
           ve.com.cantv.iptv.bss.webservice.Remedy.DeviceSubAccount deviceSubAccount,
           java.lang.String responsible,
           java.util.Date changeDate,
           ve.com.cantv.iptv.bss.webservice.Remedy.Status status,
           ve.com.cantv.iptv.bss.webservice.Remedy.Reason reason) {
           this.idHistoricalDeviceSubAccount = idHistoricalDeviceSubAccount;
           this.deviceSubAccount = deviceSubAccount;
           this.responsible = responsible;
           this.changeDate = changeDate;
           this.status = status;
           this.reason = reason;
    }


    /**
     * Gets the idHistoricalDeviceSubAccount value for this HitoricalDeviceSubAccount.
     * 
     * @return idHistoricalDeviceSubAccount
     */
    public long getIdHistoricalDeviceSubAccount() {
        return idHistoricalDeviceSubAccount;
    }


    /**
     * Sets the idHistoricalDeviceSubAccount value for this HitoricalDeviceSubAccount.
     * 
     * @param idHistoricalDeviceSubAccount
     */
    public void setIdHistoricalDeviceSubAccount(long idHistoricalDeviceSubAccount) {
        this.idHistoricalDeviceSubAccount = idHistoricalDeviceSubAccount;
    }


    /**
     * Gets the deviceSubAccount value for this HitoricalDeviceSubAccount.
     * 
     * @return deviceSubAccount
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.DeviceSubAccount getDeviceSubAccount() {
        return deviceSubAccount;
    }


    /**
     * Sets the deviceSubAccount value for this HitoricalDeviceSubAccount.
     * 
     * @param deviceSubAccount
     */
    public void setDeviceSubAccount(ve.com.cantv.iptv.bss.webservice.Remedy.DeviceSubAccount deviceSubAccount) {
        this.deviceSubAccount = deviceSubAccount;
    }


    /**
     * Gets the responsible value for this HitoricalDeviceSubAccount.
     * 
     * @return responsible
     */
    public java.lang.String getResponsible() {
        return responsible;
    }


    /**
     * Sets the responsible value for this HitoricalDeviceSubAccount.
     * 
     * @param responsible
     */
    public void setResponsible(java.lang.String responsible) {
        this.responsible = responsible;
    }


    /**
     * Gets the changeDate value for this HitoricalDeviceSubAccount.
     * 
     * @return changeDate
     */
    public java.util.Date getChangeDate() {
        return changeDate;
    }


    /**
     * Sets the changeDate value for this HitoricalDeviceSubAccount.
     * 
     * @param changeDate
     */
    public void setChangeDate(java.util.Date changeDate) {
        this.changeDate = changeDate;
    }


    /**
     * Gets the status value for this HitoricalDeviceSubAccount.
     * 
     * @return status
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this HitoricalDeviceSubAccount.
     * 
     * @param status
     */
    public void setStatus(ve.com.cantv.iptv.bss.webservice.Remedy.Status status) {
        this.status = status;
    }


    /**
     * Gets the reason value for this HitoricalDeviceSubAccount.
     * 
     * @return reason
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.Reason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this HitoricalDeviceSubAccount.
     * 
     * @param reason
     */
    public void setReason(ve.com.cantv.iptv.bss.webservice.Remedy.Reason reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HitoricalDeviceSubAccount)) return false;
        HitoricalDeviceSubAccount other = (HitoricalDeviceSubAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idHistoricalDeviceSubAccount == other.getIdHistoricalDeviceSubAccount() &&
            ((this.deviceSubAccount==null && other.getDeviceSubAccount()==null) || 
             (this.deviceSubAccount!=null &&
              this.deviceSubAccount.equals(other.getDeviceSubAccount()))) &&
            ((this.responsible==null && other.getResponsible()==null) || 
             (this.responsible!=null &&
              this.responsible.equals(other.getResponsible()))) &&
            ((this.changeDate==null && other.getChangeDate()==null) || 
             (this.changeDate!=null &&
              this.changeDate.equals(other.getChangeDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        _hashCode += new Long(getIdHistoricalDeviceSubAccount()).hashCode();
        if (getDeviceSubAccount() != null) {
            _hashCode += getDeviceSubAccount().hashCode();
        }
        if (getResponsible() != null) {
            _hashCode += getResponsible().hashCode();
        }
        if (getChangeDate() != null) {
            _hashCode += getChangeDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HitoricalDeviceSubAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "HitoricalDeviceSubAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idHistoricalDeviceSubAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "idHistoricalDeviceSubAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSubAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "deviceSubAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "deviceSubAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "responsible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "changeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "reason"));
        elemField.setMinOccurs(0);
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
