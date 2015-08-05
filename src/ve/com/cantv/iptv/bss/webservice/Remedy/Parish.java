/**
 * Parish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.cantv.iptv.bss.webservice.Remedy;

public class Parish  implements java.io.Serializable {
    private long idParish;

    private java.lang.String name;

    private java.lang.String coPrrqAsap;

    private java.lang.String coStatData;

    private java.util.Date dateLoad;

    private ve.com.cantv.iptv.bss.webservice.Remedy.Municipality municipality;

    private ve.com.cantv.iptv.bss.webservice.Remedy.Population population;

    public Parish() {
    }

    public Parish(
           long idParish,
           java.lang.String name,
           java.lang.String coPrrqAsap,
           java.lang.String coStatData,
           java.util.Date dateLoad,
           ve.com.cantv.iptv.bss.webservice.Remedy.Municipality municipality,
           ve.com.cantv.iptv.bss.webservice.Remedy.Population population) {
           this.idParish = idParish;
           this.name = name;
           this.coPrrqAsap = coPrrqAsap;
           this.coStatData = coStatData;
           this.dateLoad = dateLoad;
           this.municipality = municipality;
           this.population = population;
    }


    /**
     * Gets the idParish value for this Parish.
     * 
     * @return idParish
     */
    public long getIdParish() {
        return idParish;
    }


    /**
     * Sets the idParish value for this Parish.
     * 
     * @param idParish
     */
    public void setIdParish(long idParish) {
        this.idParish = idParish;
    }


    /**
     * Gets the name value for this Parish.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Parish.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the coPrrqAsap value for this Parish.
     * 
     * @return coPrrqAsap
     */
    public java.lang.String getCoPrrqAsap() {
        return coPrrqAsap;
    }


    /**
     * Sets the coPrrqAsap value for this Parish.
     * 
     * @param coPrrqAsap
     */
    public void setCoPrrqAsap(java.lang.String coPrrqAsap) {
        this.coPrrqAsap = coPrrqAsap;
    }


    /**
     * Gets the coStatData value for this Parish.
     * 
     * @return coStatData
     */
    public java.lang.String getCoStatData() {
        return coStatData;
    }


    /**
     * Sets the coStatData value for this Parish.
     * 
     * @param coStatData
     */
    public void setCoStatData(java.lang.String coStatData) {
        this.coStatData = coStatData;
    }


    /**
     * Gets the dateLoad value for this Parish.
     * 
     * @return dateLoad
     */
    public java.util.Date getDateLoad() {
        return dateLoad;
    }


    /**
     * Sets the dateLoad value for this Parish.
     * 
     * @param dateLoad
     */
    public void setDateLoad(java.util.Date dateLoad) {
        this.dateLoad = dateLoad;
    }


    /**
     * Gets the municipality value for this Parish.
     * 
     * @return municipality
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.Municipality getMunicipality() {
        return municipality;
    }


    /**
     * Sets the municipality value for this Parish.
     * 
     * @param municipality
     */
    public void setMunicipality(ve.com.cantv.iptv.bss.webservice.Remedy.Municipality municipality) {
        this.municipality = municipality;
    }


    /**
     * Gets the population value for this Parish.
     * 
     * @return population
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.Population getPopulation() {
        return population;
    }


    /**
     * Sets the population value for this Parish.
     * 
     * @param population
     */
    public void setPopulation(ve.com.cantv.iptv.bss.webservice.Remedy.Population population) {
        this.population = population;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Parish)) return false;
        Parish other = (Parish) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idParish == other.getIdParish() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.coPrrqAsap==null && other.getCoPrrqAsap()==null) || 
             (this.coPrrqAsap!=null &&
              this.coPrrqAsap.equals(other.getCoPrrqAsap()))) &&
            ((this.coStatData==null && other.getCoStatData()==null) || 
             (this.coStatData!=null &&
              this.coStatData.equals(other.getCoStatData()))) &&
            ((this.dateLoad==null && other.getDateLoad()==null) || 
             (this.dateLoad!=null &&
              this.dateLoad.equals(other.getDateLoad()))) &&
            ((this.municipality==null && other.getMunicipality()==null) || 
             (this.municipality!=null &&
              this.municipality.equals(other.getMunicipality()))) &&
            ((this.population==null && other.getPopulation()==null) || 
             (this.population!=null &&
              this.population.equals(other.getPopulation())));
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
        _hashCode += new Long(getIdParish()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCoPrrqAsap() != null) {
            _hashCode += getCoPrrqAsap().hashCode();
        }
        if (getCoStatData() != null) {
            _hashCode += getCoStatData().hashCode();
        }
        if (getDateLoad() != null) {
            _hashCode += getDateLoad().hashCode();
        }
        if (getMunicipality() != null) {
            _hashCode += getMunicipality().hashCode();
        }
        if (getPopulation() != null) {
            _hashCode += getPopulation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Parish.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "parish"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idParish");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "idParish"));
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
        elemField.setFieldName("coPrrqAsap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "coPrrqAsap"));
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
        elemField.setFieldName("municipality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "municipality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "municipality"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("population");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "population"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "population"));
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
