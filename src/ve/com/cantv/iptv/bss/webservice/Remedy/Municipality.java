/**
 * Municipality.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.cantv.iptv.bss.webservice.Remedy;

public class Municipality  implements java.io.Serializable {
    private long idMunicipality;

    private java.lang.String coMuncAsap;

    private java.lang.String name;

    private java.lang.String nameCapital;

    private java.lang.String coStatData;

    private ve.com.cantv.iptv.bss.webservice.Remedy.State state;

    private java.util.Date dateLoad;

    private java.lang.String inReg;

    public Municipality() {
    }

    public Municipality(
           long idMunicipality,
           java.lang.String coMuncAsap,
           java.lang.String name,
           java.lang.String nameCapital,
           java.lang.String coStatData,
           ve.com.cantv.iptv.bss.webservice.Remedy.State state,
           java.util.Date dateLoad,
           java.lang.String inReg) {
           this.idMunicipality = idMunicipality;
           this.coMuncAsap = coMuncAsap;
           this.name = name;
           this.nameCapital = nameCapital;
           this.coStatData = coStatData;
           this.state = state;
           this.dateLoad = dateLoad;
           this.inReg = inReg;
    }


    /**
     * Gets the idMunicipality value for this Municipality.
     * 
     * @return idMunicipality
     */
    public long getIdMunicipality() {
        return idMunicipality;
    }


    /**
     * Sets the idMunicipality value for this Municipality.
     * 
     * @param idMunicipality
     */
    public void setIdMunicipality(long idMunicipality) {
        this.idMunicipality = idMunicipality;
    }


    /**
     * Gets the coMuncAsap value for this Municipality.
     * 
     * @return coMuncAsap
     */
    public java.lang.String getCoMuncAsap() {
        return coMuncAsap;
    }


    /**
     * Sets the coMuncAsap value for this Municipality.
     * 
     * @param coMuncAsap
     */
    public void setCoMuncAsap(java.lang.String coMuncAsap) {
        this.coMuncAsap = coMuncAsap;
    }


    /**
     * Gets the name value for this Municipality.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Municipality.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nameCapital value for this Municipality.
     * 
     * @return nameCapital
     */
    public java.lang.String getNameCapital() {
        return nameCapital;
    }


    /**
     * Sets the nameCapital value for this Municipality.
     * 
     * @param nameCapital
     */
    public void setNameCapital(java.lang.String nameCapital) {
        this.nameCapital = nameCapital;
    }


    /**
     * Gets the coStatData value for this Municipality.
     * 
     * @return coStatData
     */
    public java.lang.String getCoStatData() {
        return coStatData;
    }


    /**
     * Sets the coStatData value for this Municipality.
     * 
     * @param coStatData
     */
    public void setCoStatData(java.lang.String coStatData) {
        this.coStatData = coStatData;
    }


    /**
     * Gets the state value for this Municipality.
     * 
     * @return state
     */
    public ve.com.cantv.iptv.bss.webservice.Remedy.State getState() {
        return state;
    }


    /**
     * Sets the state value for this Municipality.
     * 
     * @param state
     */
    public void setState(ve.com.cantv.iptv.bss.webservice.Remedy.State state) {
        this.state = state;
    }


    /**
     * Gets the dateLoad value for this Municipality.
     * 
     * @return dateLoad
     */
    public java.util.Date getDateLoad() {
        return dateLoad;
    }


    /**
     * Sets the dateLoad value for this Municipality.
     * 
     * @param dateLoad
     */
    public void setDateLoad(java.util.Date dateLoad) {
        this.dateLoad = dateLoad;
    }


    /**
     * Gets the inReg value for this Municipality.
     * 
     * @return inReg
     */
    public java.lang.String getInReg() {
        return inReg;
    }


    /**
     * Sets the inReg value for this Municipality.
     * 
     * @param inReg
     */
    public void setInReg(java.lang.String inReg) {
        this.inReg = inReg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Municipality)) return false;
        Municipality other = (Municipality) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idMunicipality == other.getIdMunicipality() &&
            ((this.coMuncAsap==null && other.getCoMuncAsap()==null) || 
             (this.coMuncAsap!=null &&
              this.coMuncAsap.equals(other.getCoMuncAsap()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nameCapital==null && other.getNameCapital()==null) || 
             (this.nameCapital!=null &&
              this.nameCapital.equals(other.getNameCapital()))) &&
            ((this.coStatData==null && other.getCoStatData()==null) || 
             (this.coStatData!=null &&
              this.coStatData.equals(other.getCoStatData()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.dateLoad==null && other.getDateLoad()==null) || 
             (this.dateLoad!=null &&
              this.dateLoad.equals(other.getDateLoad()))) &&
            ((this.inReg==null && other.getInReg()==null) || 
             (this.inReg!=null &&
              this.inReg.equals(other.getInReg())));
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
        _hashCode += new Long(getIdMunicipality()).hashCode();
        if (getCoMuncAsap() != null) {
            _hashCode += getCoMuncAsap().hashCode();
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getDateLoad() != null) {
            _hashCode += getDateLoad().hashCode();
        }
        if (getInReg() != null) {
            _hashCode += getInReg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Municipality.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "municipality"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idMunicipality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "idMunicipality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coMuncAsap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "coMuncAsap"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "state"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateLoad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "dateLoad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inReg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.bss.iptv.cantv.com.ve/Remedy/", "inReg"));
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
