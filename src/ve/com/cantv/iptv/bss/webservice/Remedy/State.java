/**
 * State.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.cantv.iptv.bss.webservice.Remedy;

public class State  implements java.io.Serializable {
    private long idState;

    private java.lang.String coEdoAsap;

    private java.lang.String name;

    private java.lang.String nameCapital;

    private java.lang.String coStatData;

    private java.util.Date dateLoad;

    public State() {
    }

    public State(
           long idState,
           java.lang.String coEdoAsap,
           java.lang.String name,
           java.lang.String nameCapital,
           java.lang.String coStatData,
           java.util.Date dateLoad) {
           this.idState = idState;
           this.coEdoAsap = coEdoAsap;
           this.name = name;
           this.nameCapital = nameCapital;
           this.coStatData = coStatData;
           this.dateLoad = dateLoad;
    }


    /**
     * Gets the idState value for this State.
     * 
     * @return idState
     */
    public long getIdState() {
        return idState;
    }


    /**
     * Sets the idState value for this State.
     * 
     * @param idState
     */
    public void setIdState(long idState) {
        this.idState = idState;
    }


    /**
     * Gets the coEdoAsap value for this State.
     * 
     * @return coEdoAsap
     */
    public java.lang.String getCoEdoAsap() {
        return coEdoAsap;
    }


    /**
     * Sets the coEdoAsap value for this State.
     * 
     * @param coEdoAsap
     */
    public void setCoEdoAsap(java.lang.String coEdoAsap) {
        this.coEdoAsap = coEdoAsap;
    }


    /**
     * Gets the name value for this State.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this State.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nameCapital value for this State.
     * 
     * @return nameCapital
     */
    public java.lang.String getNameCapital() {
        return nameCapital;
    }


    /**
     * Sets the nameCapital value for this State.
     * 
     * @param nameCapital
     */
    public void setNameCapital(java.lang.String nameCapital) {
        this.nameCapital = nameCapital;
    }


    /**
     * Gets the coStatData value for this State.
     * 
     * @return coStatData
     */
    public java.lang.String getCoStatData() {
        return coStatData;
    }


    /**
     * Sets the coStatData value for this State.
     * 
     * @param coStatData
     */
    public void setCoStatData(java.lang.String coStatData) {
        this.coStatData = coStatData;
    }


    /**
     * Gets the dateLoad value for this State.
     * 
     * @return dateLoad
     */
    public java.util.Date getDateLoad() {
        return dateLoad;
    }


    /**
     * Sets the dateLoad value for this State.
     * 
     * @param dateLoad
     */
    public void setDateLoad(java.util.Date dateLoad) {
        this.dateLoad = dateLoad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof State)) return false;
        State other = (State) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idState == other.getIdState() &&
            ((this.coEdoAsap==null && other.getCoEdoAsap()==null) || 
             (this.coEdoAsap!=null &&
              this.coEdoAsap.equals(other.getCoEdoAsap()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nameCapital==null && other.getNameCapital()==null) || 
             (this.nameCapital!=null &&
              this.nameCapital.equals(other.getNameCapital()))) &&
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
        _hashCode += new Long(getIdState()).hashCode();
        if (getCoEdoAsap() != null) {
            _hashCode += getCoEdoAsap().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNameCapital() != null) {
            _hashCode += getNameCapital().hashCode();
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
        new org.apache.axis.description.TypeDesc(State.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "state"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "idState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coEdoAsap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "coEdoAsap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameCapital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "nameCapital"));
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
