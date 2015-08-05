/**
 * Population.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.cantv.iptv.bss.webservice.Remedy;

public class Population  implements java.io.Serializable {
    private long idPopulation;

    private java.lang.String name;

    private java.lang.String coPoblAsap;

    private java.lang.String coStatData;

    private java.util.Date dateLoad;

    public Population() {
    }

    public Population(
           long idPopulation,
           java.lang.String name,
           java.lang.String coPoblAsap,
           java.lang.String coStatData,
           java.util.Date dateLoad) {
           this.idPopulation = idPopulation;
           this.name = name;
           this.coPoblAsap = coPoblAsap;
           this.coStatData = coStatData;
           this.dateLoad = dateLoad;
    }


    /**
     * Gets the idPopulation value for this Population.
     * 
     * @return idPopulation
     */
    public long getIdPopulation() {
        return idPopulation;
    }


    /**
     * Sets the idPopulation value for this Population.
     * 
     * @param idPopulation
     */
    public void setIdPopulation(long idPopulation) {
        this.idPopulation = idPopulation;
    }


    /**
     * Gets the name value for this Population.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Population.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the coPoblAsap value for this Population.
     * 
     * @return coPoblAsap
     */
    public java.lang.String getCoPoblAsap() {
        return coPoblAsap;
    }


    /**
     * Sets the coPoblAsap value for this Population.
     * 
     * @param coPoblAsap
     */
    public void setCoPoblAsap(java.lang.String coPoblAsap) {
        this.coPoblAsap = coPoblAsap;
    }


    /**
     * Gets the coStatData value for this Population.
     * 
     * @return coStatData
     */
    public java.lang.String getCoStatData() {
        return coStatData;
    }


    /**
     * Sets the coStatData value for this Population.
     * 
     * @param coStatData
     */
    public void setCoStatData(java.lang.String coStatData) {
        this.coStatData = coStatData;
    }


    /**
     * Gets the dateLoad value for this Population.
     * 
     * @return dateLoad
     */
    public java.util.Date getDateLoad() {
        return dateLoad;
    }


    /**
     * Sets the dateLoad value for this Population.
     * 
     * @param dateLoad
     */
    public void setDateLoad(java.util.Date dateLoad) {
        this.dateLoad = dateLoad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Population)) return false;
        Population other = (Population) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idPopulation == other.getIdPopulation() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.coPoblAsap==null && other.getCoPoblAsap()==null) || 
             (this.coPoblAsap!=null &&
              this.coPoblAsap.equals(other.getCoPoblAsap()))) &&
            ((this.coStatData==null && other.getCoStatData()==null) || 
             (this.coStatData!=null &&
              this.coStatData.equals(other.getCoStatData()))) &&
            ((this.dateLoad==null && other.getDateLoad()==null) || 
             (this.dateLoad!=null &&
              this.dateLoad.equals(other.getDateLoad())));
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
        _hashCode += new Long(getIdPopulation()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCoPoblAsap() != null) {
            _hashCode += getCoPoblAsap().hashCode();
        }
        if (getCoStatData() != null) {
            _hashCode += getCoStatData().hashCode();
        }
        if (getDateLoad() != null) {
            _hashCode += getDateLoad().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Population.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "population"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPopulation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "idPopulation"));
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
        elemField.setFieldName("coPoblAsap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "coPoblAsap"));
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
