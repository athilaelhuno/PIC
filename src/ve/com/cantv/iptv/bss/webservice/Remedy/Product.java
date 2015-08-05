/**
 * Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.cantv.iptv.bss.webservice.Remedy;

import ConexIPTVConsultarServicio.ProductCharge;


public class Product  implements java.io.Serializable {
    private long idProduct;

    private ProductType productType;

    private java.lang.String idMiddleware;

    private java.util.Date startDate;

    private java.util.Date endDate;

    private Status status;

    private java.lang.String description;

    private java.lang.String codProduct;

    private boolean isPrincipal;

    private java.lang.String productName;

    private java.lang.String mappingProductId;

    private ProductCharge[] listProductCharge;

    public Product() {
    }

    public Product(
           long idProduct,
           ProductType productType,
           java.lang.String idMiddleware,
           java.util.Date startDate,
           java.util.Date endDate,
           Status status,
           java.lang.String description,
           java.lang.String codProduct,
           boolean isPrincipal,
           java.lang.String productName,
           java.lang.String mappingProductId,
           ConexIPTVConsultarServicio.ProductCharge[] listProductCharge) {
           this.idProduct = idProduct;
           this.productType = productType;
           this.idMiddleware = idMiddleware;
           this.startDate = startDate;
           this.endDate = endDate;
           this.status = status;
           this.description = description;
           this.codProduct = codProduct;
           this.isPrincipal = isPrincipal;
           this.productName = productName;
           this.mappingProductId = mappingProductId;
           this.listProductCharge = listProductCharge;
    }


    /**
     * Gets the idProduct value for this Product.
     * 
     * @return idProduct
     */
    public long getIdProduct() {
        return idProduct;
    }


    /**
     * Sets the idProduct value for this Product.
     * 
     * @param idProduct
     */
    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }


    /**
     * Gets the productType value for this Product.
     * 
     * @return productType
     */
    public ProductType getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this Product.
     * 
     * @param productType
     */
    public void setProductType(ProductType productType) {
        this.productType = productType;
    }


    /**
     * Gets the idMiddleware value for this Product.
     * 
     * @return idMiddleware
     */
    public java.lang.String getIdMiddleware() {
        return idMiddleware;
    }


    /**
     * Sets the idMiddleware value for this Product.
     * 
     * @param idMiddleware
     */
    public void setIdMiddleware(java.lang.String idMiddleware) {
        this.idMiddleware = idMiddleware;
    }


    /**
     * Gets the startDate value for this Product.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Product.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this Product.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Product.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the status value for this Product.
     * 
     * @return status
     */
    public Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Product.
     * 
     * @param status
     */
    public void setStatus(Status status) {
        this.status = status;
    }


    /**
     * Gets the description value for this Product.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Product.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the codProduct value for this Product.
     * 
     * @return codProduct
     */
    public java.lang.String getCodProduct() {
        return codProduct;
    }


    /**
     * Sets the codProduct value for this Product.
     * 
     * @param codProduct
     */
    public void setCodProduct(java.lang.String codProduct) {
        this.codProduct = codProduct;
    }


    /**
     * Gets the isPrincipal value for this Product.
     * 
     * @return isPrincipal
     */
    public boolean isIsPrincipal() {
        return isPrincipal;
    }


    /**
     * Sets the isPrincipal value for this Product.
     * 
     * @param isPrincipal
     */
    public void setIsPrincipal(boolean isPrincipal) {
        this.isPrincipal = isPrincipal;
    }


    /**
     * Gets the productName value for this Product.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this Product.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the mappingProductId value for this Product.
     * 
     * @return mappingProductId
     */
    public java.lang.String getMappingProductId() {
        return mappingProductId;
    }


    /**
     * Sets the mappingProductId value for this Product.
     * 
     * @param mappingProductId
     */
    public void setMappingProductId(java.lang.String mappingProductId) {
        this.mappingProductId = mappingProductId;
    }


    /**
     * Gets the listProductCharge value for this Product.
     * 
     * @return listProductCharge
     */
    public ConexIPTVConsultarServicio.ProductCharge[] getListProductCharge() {
        return listProductCharge;
    }


    /**
     * Sets the listProductCharge value for this Product.
     * 
     * @param listProductCharge
     */
    public void setListProductCharge(ConexIPTVConsultarServicio.ProductCharge[] listProductCharge) {
        this.listProductCharge = listProductCharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idProduct == other.getIdProduct() &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.idMiddleware==null && other.getIdMiddleware()==null) || 
             (this.idMiddleware!=null &&
              this.idMiddleware.equals(other.getIdMiddleware()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.codProduct==null && other.getCodProduct()==null) || 
             (this.codProduct!=null &&
              this.codProduct.equals(other.getCodProduct()))) &&
            this.isPrincipal == other.isIsPrincipal() &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.mappingProductId==null && other.getMappingProductId()==null) || 
             (this.mappingProductId!=null &&
              this.mappingProductId.equals(other.getMappingProductId()))) &&
            ((this.listProductCharge==null && other.getListProductCharge()==null) || 
             (this.listProductCharge!=null &&
              java.util.Arrays.equals(this.listProductCharge, other.getListProductCharge())));
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
        _hashCode += new Long(getIdProduct()).hashCode();
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getIdMiddleware() != null) {
            _hashCode += getIdMiddleware().hashCode();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCodProduct() != null) {
            _hashCode += getCodProduct().hashCode();
        }
        _hashCode += (isIsPrincipal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getMappingProductId() != null) {
            _hashCode += getMappingProductId().hashCode();
        }
        if (getListProductCharge() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListProductCharge());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListProductCharge(), i);
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
        new org.apache.axis.description.TypeDesc(Product.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "IdProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "productType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "productType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idMiddleware");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "idMiddleware"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "codProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "isPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappingProductId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "mappingProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listProductCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "listProductCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "ProductCharge"));
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
