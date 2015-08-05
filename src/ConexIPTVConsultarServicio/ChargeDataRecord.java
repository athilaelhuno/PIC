/**
 * ChargeDataRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ConexIPTVConsultarServicio;

public class ChargeDataRecord  implements java.io.Serializable {
    private long idChargeDataRecord;

    private java.util.Date purchaseTime;

    private java.util.Date endTime;

    private java.lang.Double amount;

    private java.lang.String description;

    private java.lang.Long idMovie;

    private java.lang.Long contentType;

    private java.lang.String contentCode;

    private java.lang.String contentName;

    private java.lang.Long billMode;

    public ChargeDataRecord() {
    }

    public ChargeDataRecord(
           long idChargeDataRecord,
           java.util.Date purchaseTime,
           java.util.Date endTime,
           java.lang.Double amount,
           java.lang.String description,
           java.lang.Long idMovie,
           java.lang.Long contentType,
           java.lang.String contentCode,
           java.lang.String contentName,
           java.lang.Long billMode) {
           this.idChargeDataRecord = idChargeDataRecord;
           this.purchaseTime = purchaseTime;
           this.endTime = endTime;
           this.amount = amount;
           this.description = description;
           this.idMovie = idMovie;
           this.contentType = contentType;
           this.contentCode = contentCode;
           this.contentName = contentName;
           this.billMode = billMode;
    }


    /**
     * Gets the idChargeDataRecord value for this ChargeDataRecord.
     * 
     * @return idChargeDataRecord
     */
    public long getIdChargeDataRecord() {
        return idChargeDataRecord;
    }


    /**
     * Sets the idChargeDataRecord value for this ChargeDataRecord.
     * 
     * @param idChargeDataRecord
     */
    public void setIdChargeDataRecord(long idChargeDataRecord) {
        this.idChargeDataRecord = idChargeDataRecord;
    }


    /**
     * Gets the purchaseTime value for this ChargeDataRecord.
     * 
     * @return purchaseTime
     */
    public java.util.Date getPurchaseTime() {
        return purchaseTime;
    }


    /**
     * Sets the purchaseTime value for this ChargeDataRecord.
     * 
     * @param purchaseTime
     */
    public void setPurchaseTime(java.util.Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }


    /**
     * Gets the endTime value for this ChargeDataRecord.
     * 
     * @return endTime
     */
    public java.util.Date getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this ChargeDataRecord.
     * 
     * @param endTime
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the amount value for this ChargeDataRecord.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ChargeDataRecord.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the description value for this ChargeDataRecord.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ChargeDataRecord.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the idMovie value for this ChargeDataRecord.
     * 
     * @return idMovie
     */
    public java.lang.Long getIdMovie() {
        return idMovie;
    }


    /**
     * Sets the idMovie value for this ChargeDataRecord.
     * 
     * @param idMovie
     */
    public void setIdMovie(java.lang.Long idMovie) {
        this.idMovie = idMovie;
    }


    /**
     * Gets the contentType value for this ChargeDataRecord.
     * 
     * @return contentType
     */
    public java.lang.Long getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this ChargeDataRecord.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.Long contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the contentCode value for this ChargeDataRecord.
     * 
     * @return contentCode
     */
    public java.lang.String getContentCode() {
        return contentCode;
    }


    /**
     * Sets the contentCode value for this ChargeDataRecord.
     * 
     * @param contentCode
     */
    public void setContentCode(java.lang.String contentCode) {
        this.contentCode = contentCode;
    }


    /**
     * Gets the contentName value for this ChargeDataRecord.
     * 
     * @return contentName
     */
    public java.lang.String getContentName() {
        return contentName;
    }


    /**
     * Sets the contentName value for this ChargeDataRecord.
     * 
     * @param contentName
     */
    public void setContentName(java.lang.String contentName) {
        this.contentName = contentName;
    }


    /**
     * Gets the billMode value for this ChargeDataRecord.
     * 
     * @return billMode
     */
    public java.lang.Long getBillMode() {
        return billMode;
    }


    /**
     * Sets the billMode value for this ChargeDataRecord.
     * 
     * @param billMode
     */
    public void setBillMode(java.lang.Long billMode) {
        this.billMode = billMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeDataRecord)) return false;
        ChargeDataRecord other = (ChargeDataRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idChargeDataRecord == other.getIdChargeDataRecord() &&
            ((this.purchaseTime==null && other.getPurchaseTime()==null) || 
             (this.purchaseTime!=null &&
              this.purchaseTime.equals(other.getPurchaseTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.idMovie==null && other.getIdMovie()==null) || 
             (this.idMovie!=null &&
              this.idMovie.equals(other.getIdMovie()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.contentCode==null && other.getContentCode()==null) || 
             (this.contentCode!=null &&
              this.contentCode.equals(other.getContentCode()))) &&
            ((this.contentName==null && other.getContentName()==null) || 
             (this.contentName!=null &&
              this.contentName.equals(other.getContentName()))) &&
            ((this.billMode==null && other.getBillMode()==null) || 
             (this.billMode!=null &&
              this.billMode.equals(other.getBillMode())));
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
        _hashCode += new Long(getIdChargeDataRecord()).hashCode();
        if (getPurchaseTime() != null) {
            _hashCode += getPurchaseTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIdMovie() != null) {
            _hashCode += getIdMovie().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getContentCode() != null) {
            _hashCode += getContentCode().hashCode();
        }
        if (getContentName() != null) {
            _hashCode += getContentName().hashCode();
        }
        if (getBillMode() != null) {
            _hashCode += getBillMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeDataRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "ChargeDataRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idChargeDataRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "idChargeDataRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "purchaseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idMovie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "idMovie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "contentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "contentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "contentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "billMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
