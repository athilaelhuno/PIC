/**
 * ConsultarServicioIPTVRP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MuleConsultarServicioIPTV;

public class ConsultarServicioIPTVRP  implements java.io.Serializable {
    private java.lang.String cedula;

    private long idAddress;

    private ConexIPTVConsultarServicio.ParishUrbanization parishUrbanization;

    private java.lang.Long idAccountContract;

    private java.lang.String idSubscriber;

    private java.lang.String idAccountIPTV;

    private long idAccount;

    private java.lang.String errorCode;

    private java.lang.String avenue;

    private java.lang.String betweenThis;

    private java.lang.String residence;

    private java.lang.String nationality;

    private java.lang.String reference;

    private ConexIPTVConsultarServicio.SubAccount[] listSubAccount;

    private java.lang.String errorDescription;

    private ConexIPTVConsultarServicio.Status status;

    private java.util.Calendar createDate;

    private java.lang.String place;

    private java.lang.String name;

    private java.lang.String cuentaFacturable;

    private java.lang.String betweenThat;

    private ConexIPTVConsultarServicio.Phone phone;

    private java.lang.String direccion;

    private java.lang.String plant;

    public ConsultarServicioIPTVRP() {
    }

    public ConsultarServicioIPTVRP(
           java.lang.String cedula,
           long idAddress,
           ConexIPTVConsultarServicio.ParishUrbanization parishUrbanization,
           java.lang.Long idAccountContract,
           java.lang.String idSubscriber,
           java.lang.String idAccountIPTV,
           long idAccount,
           java.lang.String errorCode,
           java.lang.String avenue,
           java.lang.String betweenThis,
           java.lang.String residence,
           java.lang.String nationality,
           java.lang.String reference,
           ConexIPTVConsultarServicio.SubAccount[] listSubAccount,
           java.lang.String errorDescription,
           ConexIPTVConsultarServicio.Status status,
           java.util.Calendar createDate,
           java.lang.String place,
           java.lang.String name,
           java.lang.String cuentaFacturable,
           java.lang.String betweenThat,
           ConexIPTVConsultarServicio.Phone phone,
           java.lang.String direccion,
           java.lang.String plant) {
           this.cedula = cedula;
           this.idAddress = idAddress;
           this.parishUrbanization = parishUrbanization;
           this.idAccountContract = idAccountContract;
           this.idSubscriber = idSubscriber;
           this.idAccountIPTV = idAccountIPTV;
           this.idAccount = idAccount;
           this.errorCode = errorCode;
           this.avenue = avenue;
           this.betweenThis = betweenThis;
           this.residence = residence;
           this.nationality = nationality;
           this.reference = reference;
           this.listSubAccount = listSubAccount;
           this.errorDescription = errorDescription;
           this.status = status;
           this.createDate = createDate;
           this.place = place;
           this.name = name;
           this.cuentaFacturable = cuentaFacturable;
           this.betweenThat = betweenThat;
           this.phone = phone;
           this.direccion = direccion;
           this.plant = plant;
    }


    /**
     * Gets the cedula value for this ConsultarServicioIPTVRP.
     * 
     * @return cedula
     */
    public java.lang.String getCedula() {
        return cedula;
    }


    /**
     * Sets the cedula value for this ConsultarServicioIPTVRP.
     * 
     * @param cedula
     */
    public void setCedula(java.lang.String cedula) {
        this.cedula = cedula;
    }


    /**
     * Gets the idAddress value for this ConsultarServicioIPTVRP.
     * 
     * @return idAddress
     */
    public long getIdAddress() {
        return idAddress;
    }


    /**
     * Sets the idAddress value for this ConsultarServicioIPTVRP.
     * 
     * @param idAddress
     */
    public void setIdAddress(long idAddress) {
        this.idAddress = idAddress;
    }


    /**
     * Gets the parishUrbanization value for this ConsultarServicioIPTVRP.
     * 
     * @return parishUrbanization
     */
    public ConexIPTVConsultarServicio.ParishUrbanization getParishUrbanization() {
        return parishUrbanization;
    }


    /**
     * Sets the parishUrbanization value for this ConsultarServicioIPTVRP.
     * 
     * @param parishUrbanization
     */
    public void setParishUrbanization(ConexIPTVConsultarServicio.ParishUrbanization parishUrbanization) {
        this.parishUrbanization = parishUrbanization;
    }


    /**
     * Gets the idAccountContract value for this ConsultarServicioIPTVRP.
     * 
     * @return idAccountContract
     */
    public java.lang.Long getIdAccountContract() {
        return idAccountContract;
    }


    /**
     * Sets the idAccountContract value for this ConsultarServicioIPTVRP.
     * 
     * @param idAccountContract
     */
    public void setIdAccountContract(java.lang.Long idAccountContract) {
        this.idAccountContract = idAccountContract;
    }


    /**
     * Gets the idSubscriber value for this ConsultarServicioIPTVRP.
     * 
     * @return idSubscriber
     */
    public java.lang.String getIdSubscriber() {
        return idSubscriber;
    }


    /**
     * Sets the idSubscriber value for this ConsultarServicioIPTVRP.
     * 
     * @param idSubscriber
     */
    public void setIdSubscriber(java.lang.String idSubscriber) {
        this.idSubscriber = idSubscriber;
    }


    /**
     * Gets the idAccountIPTV value for this ConsultarServicioIPTVRP.
     * 
     * @return idAccountIPTV
     */
    public java.lang.String getIdAccountIPTV() {
        return idAccountIPTV;
    }


    /**
     * Sets the idAccountIPTV value for this ConsultarServicioIPTVRP.
     * 
     * @param idAccountIPTV
     */
    public void setIdAccountIPTV(java.lang.String idAccountIPTV) {
        this.idAccountIPTV = idAccountIPTV;
    }


    /**
     * Gets the idAccount value for this ConsultarServicioIPTVRP.
     * 
     * @return idAccount
     */
    public long getIdAccount() {
        return idAccount;
    }


    /**
     * Sets the idAccount value for this ConsultarServicioIPTVRP.
     * 
     * @param idAccount
     */
    public void setIdAccount(long idAccount) {
        this.idAccount = idAccount;
    }


    /**
     * Gets the errorCode value for this ConsultarServicioIPTVRP.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ConsultarServicioIPTVRP.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the avenue value for this ConsultarServicioIPTVRP.
     * 
     * @return avenue
     */
    public java.lang.String getAvenue() {
        return avenue;
    }


    /**
     * Sets the avenue value for this ConsultarServicioIPTVRP.
     * 
     * @param avenue
     */
    public void setAvenue(java.lang.String avenue) {
        this.avenue = avenue;
    }


    /**
     * Gets the betweenThis value for this ConsultarServicioIPTVRP.
     * 
     * @return betweenThis
     */
    public java.lang.String getBetweenThis() {
        return betweenThis;
    }


    /**
     * Sets the betweenThis value for this ConsultarServicioIPTVRP.
     * 
     * @param betweenThis
     */
    public void setBetweenThis(java.lang.String betweenThis) {
        this.betweenThis = betweenThis;
    }


    /**
     * Gets the residence value for this ConsultarServicioIPTVRP.
     * 
     * @return residence
     */
    public java.lang.String getResidence() {
        return residence;
    }


    /**
     * Sets the residence value for this ConsultarServicioIPTVRP.
     * 
     * @param residence
     */
    public void setResidence(java.lang.String residence) {
        this.residence = residence;
    }


    /**
     * Gets the nationality value for this ConsultarServicioIPTVRP.
     * 
     * @return nationality
     */
    public java.lang.String getNationality() {
        return nationality;
    }


    /**
     * Sets the nationality value for this ConsultarServicioIPTVRP.
     * 
     * @param nationality
     */
    public void setNationality(java.lang.String nationality) {
        this.nationality = nationality;
    }


    /**
     * Gets the reference value for this ConsultarServicioIPTVRP.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this ConsultarServicioIPTVRP.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the listSubAccount value for this ConsultarServicioIPTVRP.
     * 
     * @return listSubAccount
     */
    public ConexIPTVConsultarServicio.SubAccount[] getListSubAccount() {
        return listSubAccount;
    }


    /**
     * Sets the listSubAccount value for this ConsultarServicioIPTVRP.
     * 
     * @param listSubAccount
     */
    public void setListSubAccount(ConexIPTVConsultarServicio.SubAccount[] listSubAccount) {
        this.listSubAccount = listSubAccount;
    }


    /**
     * Gets the errorDescription value for this ConsultarServicioIPTVRP.
     * 
     * @return errorDescription
     */
    public java.lang.String getErrorDescription() {
        return errorDescription;
    }


    /**
     * Sets the errorDescription value for this ConsultarServicioIPTVRP.
     * 
     * @param errorDescription
     */
    public void setErrorDescription(java.lang.String errorDescription) {
        this.errorDescription = errorDescription;
    }


    /**
     * Gets the status value for this ConsultarServicioIPTVRP.
     * 
     * @return status
     */
    public ConexIPTVConsultarServicio.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ConsultarServicioIPTVRP.
     * 
     * @param status
     */
    public void setStatus(ConexIPTVConsultarServicio.Status status) {
        this.status = status;
    }


    /**
     * Gets the createDate value for this ConsultarServicioIPTVRP.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this ConsultarServicioIPTVRP.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the place value for this ConsultarServicioIPTVRP.
     * 
     * @return place
     */
    public java.lang.String getPlace() {
        return place;
    }


    /**
     * Sets the place value for this ConsultarServicioIPTVRP.
     * 
     * @param place
     */
    public void setPlace(java.lang.String place) {
        this.place = place;
    }


    /**
     * Gets the name value for this ConsultarServicioIPTVRP.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ConsultarServicioIPTVRP.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the cuentaFacturable value for this ConsultarServicioIPTVRP.
     * 
     * @return cuentaFacturable
     */
    public java.lang.String getCuentaFacturable() {
        return cuentaFacturable;
    }


    /**
     * Sets the cuentaFacturable value for this ConsultarServicioIPTVRP.
     * 
     * @param cuentaFacturable
     */
    public void setCuentaFacturable(java.lang.String cuentaFacturable) {
        this.cuentaFacturable = cuentaFacturable;
    }


    /**
     * Gets the betweenThat value for this ConsultarServicioIPTVRP.
     * 
     * @return betweenThat
     */
    public java.lang.String getBetweenThat() {
        return betweenThat;
    }


    /**
     * Sets the betweenThat value for this ConsultarServicioIPTVRP.
     * 
     * @param betweenThat
     */
    public void setBetweenThat(java.lang.String betweenThat) {
        this.betweenThat = betweenThat;
    }


    /**
     * Gets the phone value for this ConsultarServicioIPTVRP.
     * 
     * @return phone
     */
    public ConexIPTVConsultarServicio.Phone getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this ConsultarServicioIPTVRP.
     * 
     * @param phone
     */
    public void setPhone(ConexIPTVConsultarServicio.Phone phone) {
        this.phone = phone;
    }


    /**
     * Gets the direccion value for this ConsultarServicioIPTVRP.
     * 
     * @return direccion
     */
    public java.lang.String getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this ConsultarServicioIPTVRP.
     * 
     * @param direccion
     */
    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the plant value for this ConsultarServicioIPTVRP.
     * 
     * @return plant
     */
    public java.lang.String getPlant() {
        return plant;
    }


    /**
     * Sets the plant value for this ConsultarServicioIPTVRP.
     * 
     * @param plant
     */
    public void setPlant(java.lang.String plant) {
        this.plant = plant;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarServicioIPTVRP)) return false;
        ConsultarServicioIPTVRP other = (ConsultarServicioIPTVRP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cedula==null && other.getCedula()==null) || 
             (this.cedula!=null &&
              this.cedula.equals(other.getCedula()))) &&
            this.idAddress == other.getIdAddress() &&
            ((this.parishUrbanization==null && other.getParishUrbanization()==null) || 
             (this.parishUrbanization!=null &&
              this.parishUrbanization.equals(other.getParishUrbanization()))) &&
            ((this.idAccountContract==null && other.getIdAccountContract()==null) || 
             (this.idAccountContract!=null &&
              this.idAccountContract.equals(other.getIdAccountContract()))) &&
            ((this.idSubscriber==null && other.getIdSubscriber()==null) || 
             (this.idSubscriber!=null &&
              this.idSubscriber.equals(other.getIdSubscriber()))) &&
            ((this.idAccountIPTV==null && other.getIdAccountIPTV()==null) || 
             (this.idAccountIPTV!=null &&
              this.idAccountIPTV.equals(other.getIdAccountIPTV()))) &&
            this.idAccount == other.getIdAccount() &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.avenue==null && other.getAvenue()==null) || 
             (this.avenue!=null &&
              this.avenue.equals(other.getAvenue()))) &&
            ((this.betweenThis==null && other.getBetweenThis()==null) || 
             (this.betweenThis!=null &&
              this.betweenThis.equals(other.getBetweenThis()))) &&
            ((this.residence==null && other.getResidence()==null) || 
             (this.residence!=null &&
              this.residence.equals(other.getResidence()))) &&
            ((this.nationality==null && other.getNationality()==null) || 
             (this.nationality!=null &&
              this.nationality.equals(other.getNationality()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.listSubAccount==null && other.getListSubAccount()==null) || 
             (this.listSubAccount!=null &&
              java.util.Arrays.equals(this.listSubAccount, other.getListSubAccount()))) &&
            ((this.errorDescription==null && other.getErrorDescription()==null) || 
             (this.errorDescription!=null &&
              this.errorDescription.equals(other.getErrorDescription()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.place==null && other.getPlace()==null) || 
             (this.place!=null &&
              this.place.equals(other.getPlace()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.cuentaFacturable==null && other.getCuentaFacturable()==null) || 
             (this.cuentaFacturable!=null &&
              this.cuentaFacturable.equals(other.getCuentaFacturable()))) &&
            ((this.betweenThat==null && other.getBetweenThat()==null) || 
             (this.betweenThat!=null &&
              this.betweenThat.equals(other.getBetweenThat()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            ((this.plant==null && other.getPlant()==null) || 
             (this.plant!=null &&
              this.plant.equals(other.getPlant())));
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
        if (getCedula() != null) {
            _hashCode += getCedula().hashCode();
        }
        _hashCode += new Long(getIdAddress()).hashCode();
        if (getParishUrbanization() != null) {
            _hashCode += getParishUrbanization().hashCode();
        }
        if (getIdAccountContract() != null) {
            _hashCode += getIdAccountContract().hashCode();
        }
        if (getIdSubscriber() != null) {
            _hashCode += getIdSubscriber().hashCode();
        }
        if (getIdAccountIPTV() != null) {
            _hashCode += getIdAccountIPTV().hashCode();
        }
        _hashCode += new Long(getIdAccount()).hashCode();
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getAvenue() != null) {
            _hashCode += getAvenue().hashCode();
        }
        if (getBetweenThis() != null) {
            _hashCode += getBetweenThis().hashCode();
        }
        if (getResidence() != null) {
            _hashCode += getResidence().hashCode();
        }
        if (getNationality() != null) {
            _hashCode += getNationality().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getListSubAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListSubAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListSubAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorDescription() != null) {
            _hashCode += getErrorDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getPlace() != null) {
            _hashCode += getPlace().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCuentaFacturable() != null) {
            _hashCode += getCuentaFacturable().hashCode();
        }
        if (getBetweenThat() != null) {
            _hashCode += getBetweenThat().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        if (getPlant() != null) {
            _hashCode += getPlant().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarServicioIPTVRP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "ConsultarServicioIPTVRP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cedula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "cedula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "idAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parishUrbanization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "parishUrbanization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "ParishUrbanization"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAccountContract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "idAccountContract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSubscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "idSubscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAccountIPTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "idAccountIPTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "idAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avenue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "avenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betweenThis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "betweenThis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "residence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "nationality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listSubAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "listSubAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "SubAccount"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "errorDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "Status"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("place");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentaFacturable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "cuentaFacturable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betweenThat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "betweenThat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ConexIPTVConsultarServicio", "Phone"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "direccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://MuleConsultarServicioIPTV", "plant"));
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
