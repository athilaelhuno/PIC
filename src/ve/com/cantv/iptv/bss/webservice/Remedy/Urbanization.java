/**
 * Urbanization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.cantv.iptv.bss.webservice.Remedy;

public class Urbanization  implements java.io.Serializable {
    private long idUrbanization;

    private java.lang.String name;

    private java.lang.String coStatData;

    private java.util.Date dateLoad;

    private java.lang.String previousName;

    public Urbanization() {
    }

    public Urbanization(
           long idUrbanization,
           java.lang.String name,
           java.lang.String coStatData,
           java.util.Date dateLoad,
           java.lang.String previousName) {
           this.idUrbanization = idUrbanization;
           this.name = name;
           this.coStatData = coStatData;
           this.dateLoad = dateLoad;
           this.previousName = previousName;
    }


    /**
     * Gets the idUrbanization value for this Urbanization.
     * 
     * @return idUrbanization
     */
    public long getIdUrbanization() {
        return idUrbanization;
    }


    /**
     * Sets the idUrbanization value for this Urbanization.
     * 
     * @param idUrbanization
     */
    public void setIdUrbanization(long idUrbanization) {
        this.idUrbanization = idUrbanization;
    }


    /**
     * Gets the name value for this Urbanization.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Urbanization.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the coStatData value for this Urbanization.
     * 
     * @return coStatData
     */
    public java.lang.String getCoStatData() {
        return coStatData;
    }


    /**
     * Sets the coStatData value for this Urbanization.
     * 
     * @param coStatData
     */
    public void setCoStatData(java.lang.String coStatData) {
        this.coStatData = coStatData;
    }


    /**
     * Gets the dateLoad value for this Urbanization.
     * 
     * @return dateLoad
     */
    public java.util.Date getDateLoad() {
        return dateLoad;
    }


    /**
     * Sets the dateLoad value for this Urbanization.
     * 
     * @param dateLoad
     */
    public void setDateLoad(java.util.Date dateLoad) {
        this.dateLoad = dateLoad;
    }


    /**
     * Gets the previousName value for this Urbanization.
     * 
     * @return previousName
     */
    public java.lang.String getPreviousName() {
        return previousName;
    }


    /**
     * Sets the previousName value for this Urbanization.
     * 
     * @param previousName
     */
    public void setPreviousName(java.lang.String previousName) {
        this.previousName = previousName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Urbanization)) return false;
        Urbanization other = (Urbanization) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idUrbanization == other.getIdUrbanization() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.coStatData==null && other.getCoStatData()==null) || 
             (this.coStatData!=null &&
              this.coStatData.equals(other.getCoStatData()))) &&
            ((this.dateLoad==null && other.getDateLoad()==null) || 
             (this.dateLoad!=null &&
              this.dateLoad.equals(other.getDateLoad()))) &&
            ((this.previousName==null && other.getPreviousName()==null) || 
             (this.previousName!=null &&
              this.previousName.equals(other.getPreviousName())));
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
        _hashCode += new Long(getIdUrbanization()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCoStatData() != null) {
            _hashCode += getCoStatData().hashCode();
        }
        if (getDateLoad() != null) {
            _hashCode += getDateLoad().hashCode();
        }
        if (getPreviousName() != null) {
            _hashCode += getPreviousName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Urbanization.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "urbanization"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idUrbanization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "idUrbanization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coStatData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "coStatData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateLoad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "dateLoad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "previousName"));
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
