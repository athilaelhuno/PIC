/**
 * Device.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.cantv.iptv.bss.webservice.Remedy;

public class Device  implements java.io.Serializable {
    private long idDevice;

    private java.lang.String MACAddress;

    private java.lang.String serial;

    private ve.com.cantv.iptv.bss.webservice.Remedy.DeviceCatalog deviceCatalog;

    private ve.com.cantv.iptv.bss.webservice.Remedy.Status status;

    public Device() {
    }

    public Device(
           long idDevice,
           java.lang.String MACAddress,
           java.lang.String serial,
           ve.com.cantv.iptv.bss.webservice.Remedy.DeviceCatalog deviceCatalog,
           ve.com.cantv.iptv.bss.webservice.Remedy.Status status) {
           this.idDevice = idDevice;
           this.MACAddress = MACAddress;
           this.serial = serial;
           this.deviceCatalog = deviceCatalog;
           this.status = status;
    }


    /**
     * Gets the idDevice value for this Device.
     * 
     * @return idDevice
     */
    public long getIdDevice() {
        return idDevice;
    }


    /**
     * Sets the idDevice value for this Device.
     * 
     * @param idDevice
     */
    public void setIdDevice(long idDevice) {
        this.idDevice = idDevice;
    }


    /**
     * Gets the MACAddress value for this Device.
     * 
     * @return MACAddress
     */
    public java.lang.String getMACAddress() {
        return MACAddress;
    }


    /**
     * Sets the MACAddress value for this Device.
     * 
     * @param MACAddress
     */
    public void setMACAddress(java.lang.String MACAddress) {
        this.MACAddress = MACAddress;
    }


    /**
     * Gets the serial value for this Device.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this Device.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the deviceCatalog value for this Device.
     * 
     * @return deviceCatalog
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.DeviceCatalog getDeviceCatalog() {
        return deviceCatalog;
    }


    /**
     * Sets the deviceCatalog value for this Device.
     * 
     * @param deviceCatalog
     */
    public void setDeviceCatalog(ve.com.cantv.iptv.bss.webservice.Remedy.DeviceCatalog deviceCatalog) {
        this.deviceCatalog = deviceCatalog;
    }


    /**
     * Gets the status value for this Device.
     * 
     * @return status
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Device.
     * 
     * @param status
     */
    public void setStatus(ve.com.cantv.iptv.bss.webservice.Remedy.Status status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Device)) return false;
        Device other = (Device) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idDevice == other.getIdDevice() &&
            ((this.MACAddress==null && other.getMACAddress()==null) || 
             (this.MACAddress!=null &&
              this.MACAddress.equals(other.getMACAddress()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.deviceCatalog==null && other.getDeviceCatalog()==null) || 
             (this.deviceCatalog!=null &&
              this.deviceCatalog.equals(other.getDeviceCatalog()))) &&
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
        _hashCode += new Long(getIdDevice()).hashCode();
        if (getMACAddress() != null) {
            _hashCode += getMACAddress().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getDeviceCatalog() != null) {
            _hashCode += getDeviceCatalog().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Device.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "device"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "idDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MACAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "MACAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceCatalog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "deviceCatalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "deviceCatalog"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
