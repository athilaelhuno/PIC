/**
 * DeviceCatalog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.cantv.iptv.bss.webservice.Remedy;

public class DeviceCatalog  implements java.io.Serializable {
    private long idDeviceCatalog;

    private ve.com.cantv.iptv.bss.webservice.Remedy.DeviceType deviceType;

    private ve.com.cantv.iptv.bss.webservice.Remedy.Model model;

    private java.lang.String features;

    private ve.com.cantv.iptv.bss.webservice.Remedy.Product product;

    private java.lang.String meterialCode;

    public DeviceCatalog() {
    }

    public DeviceCatalog(
           long idDeviceCatalog,
           ve.com.cantv.iptv.bss.webservice.Remedy.DeviceType deviceType,
           ve.com.cantv.iptv.bss.webservice.Remedy.Model model,
           java.lang.String features,
           ve.com.cantv.iptv.bss.webservice.Remedy.Product product,
           java.lang.String meterialCode) {
           this.idDeviceCatalog = idDeviceCatalog;
           this.deviceType = deviceType;
           this.model = model;
           this.features = features;
           this.product = product;
           this.meterialCode = meterialCode;
    }


    /**
     * Gets the idDeviceCatalog value for this DeviceCatalog.
     * 
     * @return idDeviceCatalog
     */
    public long getIdDeviceCatalog() {
        return idDeviceCatalog;
    }


    /**
     * Sets the idDeviceCatalog value for this DeviceCatalog.
     * 
     * @param idDeviceCatalog
     */
    public void setIdDeviceCatalog(long idDeviceCatalog) {
        this.idDeviceCatalog = idDeviceCatalog;
    }


    /**
     * Gets the deviceType value for this DeviceCatalog.
     * 
     * @return deviceType
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.DeviceType getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this DeviceCatalog.
     * 
     * @param deviceType
     */
    public void setDeviceType(ve.com.cantv.iptv.bss.webservice.Remedy.DeviceType deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the model value for this DeviceCatalog.
     * 
     * @return model
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.Model getModel() {
        return model;
    }


    /**
     * Sets the model value for this DeviceCatalog.
     * 
     * @param model
     */
    public void setModel(ve.com.cantv.iptv.bss.webservice.Remedy.Model model) {
        this.model = model;
    }


    /**
     * Gets the features value for this DeviceCatalog.
     * 
     * @return features
     */
    public java.lang.String getFeatures() {
        return features;
    }


    /**
     * Sets the features value for this DeviceCatalog.
     * 
     * @param features
     */
    public void setFeatures(java.lang.String features) {
        this.features = features;
    }


    /**
     * Gets the product value for this DeviceCatalog.
     * 
     * @return product
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.Product getProduct() {
        return product;
    }


    /**
     * Sets the product value for this DeviceCatalog.
     * 
     * @param product
     */
    public void setProduct(ve.com.cantv.iptv.bss.webservice.Remedy.Product product) {
        this.product = product;
    }


    /**
     * Gets the meterialCode value for this DeviceCatalog.
     * 
     * @return meterialCode
     */
    public java.lang.String getMeterialCode() {
        return meterialCode;
    }


    /**
     * Sets the meterialCode value for this DeviceCatalog.
     * 
     * @param meterialCode
     */
    public void setMeterialCode(java.lang.String meterialCode) {
        this.meterialCode = meterialCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceCatalog)) return false;
        DeviceCatalog other = (DeviceCatalog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idDeviceCatalog == other.getIdDeviceCatalog() &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.features==null && other.getFeatures()==null) || 
             (this.features!=null &&
              this.features.equals(other.getFeatures()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.meterialCode==null && other.getMeterialCode()==null) || 
             (this.meterialCode!=null &&
              this.meterialCode.equals(other.getMeterialCode())));
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
        _hashCode += new Long(getIdDeviceCatalog()).hashCode();
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getFeatures() != null) {
            _hashCode += getFeatures().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getMeterialCode() != null) {
            _hashCode += getMeterialCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceCatalog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "deviceCatalog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idDeviceCatalog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "idDeviceCatalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "deviceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "model"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("features");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "features"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "product"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meterialCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "meterialCode"));
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
