/**
 * DeviceSubAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.cantv.iptv.bss.webservice.Remedy;

public class DeviceSubAccount  implements java.io.Serializable {
    private long idDeviceSubAccount;

    private Device device;

    private java.util.Date startDate;

    private java.util.Date endDate;

    private Status status;

    public DeviceSubAccount() {
    }

    public DeviceSubAccount(
           long idDeviceSubAccount,
           Device device,
           java.util.Date startDate,
           java.util.Date endDate,
           Status status) {
           this.idDeviceSubAccount = idDeviceSubAccount;
           this.device = device;
           this.startDate = startDate;
           this.endDate = endDate;
           this.status = status;
    }


    /**
     * Gets the idDeviceSubAccount value for this DeviceSubAccount.
     * 
     * @return idDeviceSubAccount
     */
    public long getIdDeviceSubAccount() {
        return idDeviceSubAccount;
    }


    /**
     * Sets the idDeviceSubAccount value for this DeviceSubAccount.
     * 
     * @param idDeviceSubAccount
     */
    public void setIdDeviceSubAccount(long idDeviceSubAccount) {
        this.idDeviceSubAccount = idDeviceSubAccount;
    }


    /**
     * Gets the device value for this DeviceSubAccount.
     * 
     * @return device
     */
    public Device getDevice() {
        return device;
    }


    /**
     * Sets the device value for this DeviceSubAccount.
     * 
     * @param device
     */
    public void setDevice(Device device) {
        this.device = device;
    }


    /**
     * Gets the startDate value for this DeviceSubAccount.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this DeviceSubAccount.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this DeviceSubAccount.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DeviceSubAccount.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the status value for this DeviceSubAccount.
     * 
     * @return status
     */
    public Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DeviceSubAccount.
     * 
     * @param status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceSubAccount)) return false;
        DeviceSubAccount other = (DeviceSubAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idDeviceSubAccount == other.getIdDeviceSubAccount() &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        _hashCode += new Long(getIdDeviceSubAccount()).hashCode();
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceSubAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "deviceSubAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idDeviceSubAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "idDeviceSubAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "device"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
