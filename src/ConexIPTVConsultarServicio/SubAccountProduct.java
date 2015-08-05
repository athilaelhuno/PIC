/**
 * SubAccountProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ConexIPTVConsultarServicio;

public class SubAccountProduct  implements java.io.Serializable {
    private long idSubAccountProduct;

    private ve.com.cantv.iptv.bss.webservice.Remedy.Product product;

    private ve.com.cantv.iptv.bss.webservice.Remedy.Status status;

    private java.util.Date membershipDate;

    private java.util.Date retirementDate;

    public SubAccountProduct() {
    }

    public SubAccountProduct(
           long idSubAccountProduct,
           ve.com.cantv.iptv.bss.webservice.Remedy.Product product,
           ve.com.cantv.iptv.bss.webservice.Remedy.Status status,
           java.util.Date membershipDate,
           java.util.Date retirementDate) {
           this.idSubAccountProduct = idSubAccountProduct;
           this.product = product;
           this.status = status;
           this.membershipDate = membershipDate;
           this.retirementDate = retirementDate;
    }


    /**
     * Gets the idSubAccountProduct value for this SubAccountProduct.
     * 
     * @return idSubAccountProduct
     */
    public long getIdSubAccountProduct() {
        return idSubAccountProduct;
    }


    /**
     * Sets the idSubAccountProduct value for this SubAccountProduct.
     * 
     * @param idSubAccountProduct
     */
    public void setIdSubAccountProduct(long idSubAccountProduct) {
        this.idSubAccountProduct = idSubAccountProduct;
    }


    /**
     * Gets the product value for this SubAccountProduct.
     * 
     * @return product
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.Product getProduct() {
        return product;
    }


    /**
     * Sets the product value for this SubAccountProduct.
     * 
     * @param product
     */
    public void setProduct(ve.com.cantv.iptv.bss.webservice.Remedy.Product product) {
        this.product = product;
    }


    /**
     * Gets the status value for this SubAccountProduct.
     * 
     * @return status
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SubAccountProduct.
     * 
     * @param status
     */
    public void setStatus(ve.com.cantv.iptv.bss.webservice.Remedy.Status status) {
        this.status = status;
    }


    /**
     * Gets the membershipDate value for this SubAccountProduct.
     * 
     * @return membershipDate
     */
    public java.util.Date getMembershipDate() {
        return membershipDate;
    }


    /**
     * Sets the membershipDate value for this SubAccountProduct.
     * 
     * @param membershipDate
     */
    public void setMembershipDate(java.util.Date membershipDate) {
        this.membershipDate = membershipDate;
    }


    /**
     * Gets the retirementDate value for this SubAccountProduct.
     * 
     * @return retirementDate
     */
    public java.util.Date getRetirementDate() {
        return retirementDate;
    }


    /**
     * Sets the retirementDate value for this SubAccountProduct.
     * 
     * @param retirementDate
     */
    public void setRetirementDate(java.util.Date retirementDate) {
        this.retirementDate = retirementDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubAccountProduct)) return false;
        SubAccountProduct other = (SubAccountProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idSubAccountProduct == other.getIdSubAccountProduct() &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.membershipDate==null && other.getMembershipDate()==null) || 
             (this.membershipDate!=null &&
              this.membershipDate.equals(other.getMembershipDate()))) &&
            ((this.retirementDate==null && other.getRetirementDate()==null) || 
             (this.retirementDate!=null &&
              this.retirementDate.equals(other.getRetirementDate())));
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
        _hashCode += new Long(getIdSubAccountProduct()).hashCode();
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMembershipDate() != null) {
            _hashCode += getMembershipDate().hashCode();
        }
        if (getRetirementDate() != null) {
            _hashCode += getRetirementDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubAccountProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "SubAccountProduct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSubAccountProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "idSubAccountProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "product"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("membershipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "membershipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retirementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "retirementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
