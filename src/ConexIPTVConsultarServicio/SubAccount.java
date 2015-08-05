/**
 * SubAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ConexIPTVConsultarServicio;

public class SubAccount  implements java.io.Serializable {
    private long idSubAccount;

    private java.lang.String idSubAccountIPTV;

    private ve.com.cantv.iptv.bss.webservice.Remedy.Status status;

    private ve.com.cantv.iptv.bss.webservice.Remedy.SubAccountType subAccountType;

    private ConexIPTVConsultarServicio.DeviceSubAccount[] listDeviceSubAccount;

    private ConexIPTVConsultarServicio.ChargeDataRecord[] listChargeDataRecord;

    private ConexIPTVConsultarServicio.SubAccountProduct[] listSubAccountProduct;

    private ConexIPTVConsultarServicio.HitoricalDeviceSubAccount[] listHitoricalDeviceSubAccount;

    public SubAccount() {
    }

    public SubAccount(
           long idSubAccount,
           java.lang.String idSubAccountIPTV,
           ve.com.cantv.iptv.bss.webservice.Remedy.Status status,
           ve.com.cantv.iptv.bss.webservice.Remedy.SubAccountType subAccountType,
           ConexIPTVConsultarServicio.DeviceSubAccount[] listDeviceSubAccount,
           ConexIPTVConsultarServicio.ChargeDataRecord[] listChargeDataRecord,
           ConexIPTVConsultarServicio.SubAccountProduct[] listSubAccountProduct,
           ConexIPTVConsultarServicio.HitoricalDeviceSubAccount[] listHitoricalDeviceSubAccount) {
           this.idSubAccount = idSubAccount;
           this.idSubAccountIPTV = idSubAccountIPTV;
           this.status = status;
           this.subAccountType = subAccountType;
           this.listDeviceSubAccount = listDeviceSubAccount;
           this.listChargeDataRecord = listChargeDataRecord;
           this.listSubAccountProduct = listSubAccountProduct;
           this.listHitoricalDeviceSubAccount = listHitoricalDeviceSubAccount;
    }


    /**
     * Gets the idSubAccount value for this SubAccount.
     * 
     * @return idSubAccount
     */
    public long getIdSubAccount() {
        return idSubAccount;
    }


    /**
     * Sets the idSubAccount value for this SubAccount.
     * 
     * @param idSubAccount
     */
    public void setIdSubAccount(long idSubAccount) {
        this.idSubAccount = idSubAccount;
    }


    /**
     * Gets the idSubAccountIPTV value for this SubAccount.
     * 
     * @return idSubAccountIPTV
     */
    public java.lang.String getIdSubAccountIPTV() {
        return idSubAccountIPTV;
    }


    /**
     * Sets the idSubAccountIPTV value for this SubAccount.
     * 
     * @param idSubAccountIPTV
     */
    public void setIdSubAccountIPTV(java.lang.String idSubAccountIPTV) {
        this.idSubAccountIPTV = idSubAccountIPTV;
    }


    /**
     * Gets the status value for this SubAccount.
     * 
     * @return status
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SubAccount.
     * 
     * @param status
     */
    public void setStatus(ve.com.cantv.iptv.bss.webservice.Remedy.Status status) {
        this.status = status;
    }


    /**
     * Gets the subAccountType value for this SubAccount.
     * 
     * @return subAccountType
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.SubAccountType getSubAccountType() {
        return subAccountType;
    }


    /**
     * Sets the subAccountType value for this SubAccount.
     * 
     * @param subAccountType
     */
    public void setSubAccountType(ve.com.cantv.iptv.bss.webservice.Remedy.SubAccountType subAccountType) {
        this.subAccountType = subAccountType;
    }


    /**
     * Gets the listDeviceSubAccount value for this SubAccount.
     * 
     * @return listDeviceSubAccount
     */
    public ConexIPTVConsultarServicio.DeviceSubAccount[] getListDeviceSubAccount() {
        return listDeviceSubAccount;
    }


    /**
     * Sets the listDeviceSubAccount value for this SubAccount.
     * 
     * @param listDeviceSubAccount
     */
    public void setListDeviceSubAccount(ConexIPTVConsultarServicio.DeviceSubAccount[] listDeviceSubAccount) {
        this.listDeviceSubAccount = listDeviceSubAccount;
    }


    /**
     * Gets the listChargeDataRecord value for this SubAccount.
     * 
     * @return listChargeDataRecord
     */
    public ConexIPTVConsultarServicio.ChargeDataRecord[] getListChargeDataRecord() {
        return listChargeDataRecord;
    }


    /**
     * Sets the listChargeDataRecord value for this SubAccount.
     * 
     * @param listChargeDataRecord
     */
    public void setListChargeDataRecord(ConexIPTVConsultarServicio.ChargeDataRecord[] listChargeDataRecord) {
        this.listChargeDataRecord = listChargeDataRecord;
    }


    /**
     * Gets the listSubAccountProduct value for this SubAccount.
     * 
     * @return listSubAccountProduct
     */
    public ConexIPTVConsultarServicio.SubAccountProduct[] getListSubAccountProduct() {
        return listSubAccountProduct;
    }


    /**
     * Sets the listSubAccountProduct value for this SubAccount.
     * 
     * @param listSubAccountProduct
     */
    public void setListSubAccountProduct(ConexIPTVConsultarServicio.SubAccountProduct[] listSubAccountProduct) {
        this.listSubAccountProduct = listSubAccountProduct;
    }


    /**
     * Gets the listHitoricalDeviceSubAccount value for this SubAccount.
     * 
     * @return listHitoricalDeviceSubAccount
     */
    public ConexIPTVConsultarServicio.HitoricalDeviceSubAccount[] getListHitoricalDeviceSubAccount() {
        return listHitoricalDeviceSubAccount;
    }


    /**
     * Sets the listHitoricalDeviceSubAccount value for this SubAccount.
     * 
     * @param listHitoricalDeviceSubAccount
     */
    public void setListHitoricalDeviceSubAccount(ConexIPTVConsultarServicio.HitoricalDeviceSubAccount[] listHitoricalDeviceSubAccount) {
        this.listHitoricalDeviceSubAccount = listHitoricalDeviceSubAccount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubAccount)) return false;
        SubAccount other = (SubAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idSubAccount == other.getIdSubAccount() &&
            ((this.idSubAccountIPTV==null && other.getIdSubAccountIPTV()==null) || 
             (this.idSubAccountIPTV!=null &&
              this.idSubAccountIPTV.equals(other.getIdSubAccountIPTV()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subAccountType==null && other.getSubAccountType()==null) || 
             (this.subAccountType!=null &&
              this.subAccountType.equals(other.getSubAccountType()))) &&
            ((this.listDeviceSubAccount==null && other.getListDeviceSubAccount()==null) || 
             (this.listDeviceSubAccount!=null &&
              java.util.Arrays.equals(this.listDeviceSubAccount, other.getListDeviceSubAccount()))) &&
            ((this.listChargeDataRecord==null && other.getListChargeDataRecord()==null) || 
             (this.listChargeDataRecord!=null &&
              java.util.Arrays.equals(this.listChargeDataRecord, other.getListChargeDataRecord()))) &&
            ((this.listSubAccountProduct==null && other.getListSubAccountProduct()==null) || 
             (this.listSubAccountProduct!=null &&
              java.util.Arrays.equals(this.listSubAccountProduct, other.getListSubAccountProduct()))) &&
            ((this.listHitoricalDeviceSubAccount==null && other.getListHitoricalDeviceSubAccount()==null) || 
             (this.listHitoricalDeviceSubAccount!=null &&
              java.util.Arrays.equals(this.listHitoricalDeviceSubAccount, other.getListHitoricalDeviceSubAccount())));
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
        _hashCode += new Long(getIdSubAccount()).hashCode();
        if (getIdSubAccountIPTV() != null) {
            _hashCode += getIdSubAccountIPTV().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubAccountType() != null) {
            _hashCode += getSubAccountType().hashCode();
        }
        if (getListDeviceSubAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListDeviceSubAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListDeviceSubAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListChargeDataRecord() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListChargeDataRecord());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListChargeDataRecord(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListSubAccountProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListSubAccountProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListSubAccountProduct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListHitoricalDeviceSubAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListHitoricalDeviceSubAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListHitoricalDeviceSubAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "SubAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSubAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "idSubAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSubAccountIPTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "idSubAccountIPTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "subAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "subAccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listDeviceSubAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "listDeviceSubAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "DeviceSubAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listChargeDataRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "listChargeDataRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "ChargeDataRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listSubAccountProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "listSubAccountProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "SubAccountProduct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listHitoricalDeviceSubAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "listHitoricalDeviceSubAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "HitoricalDeviceSubAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "item"));
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
