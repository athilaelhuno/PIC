/**
 * Charge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.cantv.iptv.bss.webservice.Remedy;

public class Charge  implements java.io.Serializable {
    private long idCharge;

    private java.lang.Boolean flag;

    private java.lang.String idChargeKenan;

    private java.lang.Long initialPosition;

    private java.lang.Long finalPosition;

    private java.lang.Long length;

    private java.lang.String descriptionText;

    private java.lang.String displayValue;

    private java.lang.Long chargePosition;

    private java.lang.String iptvProductId;

    private java.lang.Double amount;

    public Charge() {
    }

    public Charge(
           long idCharge,
           java.lang.Boolean flag,
           java.lang.String idChargeKenan,
           java.lang.Long initialPosition,
           java.lang.Long finalPosition,
           java.lang.Long length,
           java.lang.String descriptionText,
           java.lang.String displayValue,
           java.lang.Long chargePosition,
           java.lang.String iptvProductId,
           java.lang.Double amount) {
           this.idCharge = idCharge;
           this.flag = flag;
           this.idChargeKenan = idChargeKenan;
           this.initialPosition = initialPosition;
           this.finalPosition = finalPosition;
           this.length = length;
           this.descriptionText = descriptionText;
           this.displayValue = displayValue;
           this.chargePosition = chargePosition;
           this.iptvProductId = iptvProductId;
           this.amount = amount;
    }


    /**
     * Gets the idCharge value for this Charge.
     * 
     * @return idCharge
     */
    public long getIdCharge() {
        return idCharge;
    }


    /**
     * Sets the idCharge value for this Charge.
     * 
     * @param idCharge
     */
    public void setIdCharge(long idCharge) {
        this.idCharge = idCharge;
    }


    /**
     * Gets the flag value for this Charge.
     * 
     * @return flag
     */
    public java.lang.Boolean getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this Charge.
     * 
     * @param flag
     */
    public void setFlag(java.lang.Boolean flag) {
        this.flag = flag;
    }


    /**
     * Gets the idChargeKenan value for this Charge.
     * 
     * @return idChargeKenan
     */
    public java.lang.String getIdChargeKenan() {
        return idChargeKenan;
    }


    /**
     * Sets the idChargeKenan value for this Charge.
     * 
     * @param idChargeKenan
     */
    public void setIdChargeKenan(java.lang.String idChargeKenan) {
        this.idChargeKenan = idChargeKenan;
    }


    /**
     * Gets the initialPosition value for this Charge.
     * 
     * @return initialPosition
     */
    public java.lang.Long getInitialPosition() {
        return initialPosition;
    }


    /**
     * Sets the initialPosition value for this Charge.
     * 
     * @param initialPosition
     */
    public void setInitialPosition(java.lang.Long initialPosition) {
        this.initialPosition = initialPosition;
    }


    /**
     * Gets the finalPosition value for this Charge.
     * 
     * @return finalPosition
     */
    public java.lang.Long getFinalPosition() {
        return finalPosition;
    }


    /**
     * Sets the finalPosition value for this Charge.
     * 
     * @param finalPosition
     */
    public void setFinalPosition(java.lang.Long finalPosition) {
        this.finalPosition = finalPosition;
    }


    /**
     * Gets the length value for this Charge.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this Charge.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the descriptionText value for this Charge.
     * 
     * @return descriptionText
     */
    public java.lang.String getDescriptionText() {
        return descriptionText;
    }


    /**
     * Sets the descriptionText value for this Charge.
     * 
     * @param descriptionText
     */
    public void setDescriptionText(java.lang.String descriptionText) {
        this.descriptionText = descriptionText;
    }


    /**
     * Gets the displayValue value for this Charge.
     * 
     * @return displayValue
     */
    public java.lang.String getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this Charge.
     * 
     * @param displayValue
     */
    public void setDisplayValue(java.lang.String displayValue) {
        this.displayValue = displayValue;
    }


    /**
     * Gets the chargePosition value for this Charge.
     * 
     * @return chargePosition
     */
    public java.lang.Long getChargePosition() {
        return chargePosition;
    }


    /**
     * Sets the chargePosition value for this Charge.
     * 
     * @param chargePosition
     */
    public void setChargePosition(java.lang.Long chargePosition) {
        this.chargePosition = chargePosition;
    }


    /**
     * Gets the iptvProductId value for this Charge.
     * 
     * @return iptvProductId
     */
    public java.lang.String getIptvProductId() {
        return iptvProductId;
    }


    /**
     * Sets the iptvProductId value for this Charge.
     * 
     * @param iptvProductId
     */
    public void setIptvProductId(java.lang.String iptvProductId) {
        this.iptvProductId = iptvProductId;
    }


    /**
     * Gets the amount value for this Charge.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Charge.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Charge)) return false;
        Charge other = (Charge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idCharge == other.getIdCharge() &&
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag()))) &&
            ((this.idChargeKenan==null && other.getIdChargeKenan()==null) || 
             (this.idChargeKenan!=null &&
              this.idChargeKenan.equals(other.getIdChargeKenan()))) &&
            ((this.initialPosition==null && other.getInitialPosition()==null) || 
             (this.initialPosition!=null &&
              this.initialPosition.equals(other.getInitialPosition()))) &&
            ((this.finalPosition==null && other.getFinalPosition()==null) || 
             (this.finalPosition!=null &&
              this.finalPosition.equals(other.getFinalPosition()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.descriptionText==null && other.getDescriptionText()==null) || 
             (this.descriptionText!=null &&
              this.descriptionText.equals(other.getDescriptionText()))) &&
            ((this.displayValue==null && other.getDisplayValue()==null) || 
             (this.displayValue!=null &&
              this.displayValue.equals(other.getDisplayValue()))) &&
            ((this.chargePosition==null && other.getChargePosition()==null) || 
             (this.chargePosition!=null &&
              this.chargePosition.equals(other.getChargePosition()))) &&
            ((this.iptvProductId==null && other.getIptvProductId()==null) || 
             (this.iptvProductId!=null &&
              this.iptvProductId.equals(other.getIptvProductId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        _hashCode += new Long(getIdCharge()).hashCode();
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        if (getIdChargeKenan() != null) {
            _hashCode += getIdChargeKenan().hashCode();
        }
        if (getInitialPosition() != null) {
            _hashCode += getInitialPosition().hashCode();
        }
        if (getFinalPosition() != null) {
            _hashCode += getFinalPosition().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getDescriptionText() != null) {
            _hashCode += getDescriptionText().hashCode();
        }
        if (getDisplayValue() != null) {
            _hashCode += getDisplayValue().hashCode();
        }
        if (getChargePosition() != null) {
            _hashCode += getChargePosition().hashCode();
        }
        if (getIptvProductId() != null) {
            _hashCode += getIptvProductId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Charge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "charge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "idCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idChargeKenan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "idChargeKenan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "initialPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "finalPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "descriptionText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "displayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargePosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "chargePosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iptvProductId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "iptvProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
