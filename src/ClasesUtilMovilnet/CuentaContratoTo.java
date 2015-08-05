/**
 * CuentaContratoTo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ClasesUtilMovilnet;

public class CuentaContratoTo  implements java.io.Serializable {
    private java.lang.String serialDecodificador;

    private java.lang.String estatus;

    private ClasesUtilMovilnet.ModeloTo modelo;

    private java.util.Calendar fechaCreacion;

    private ClasesUtilMovilnet.CargoPeriodicoTo cargoPeriodico;

    private java.lang.String serialTarjetaAcceso;

    private java.util.Calendar fechaFinProgramacion;

    private java.util.Calendar fechaExpiracion;

    private ClasesUtilMovilnet.ClienteTo cliente;

    private ClasesUtilMovilnet.PlanTo plan;

    private ClasesUtilMovilnet.PromocionTo promocion;

    private java.lang.String codigoMoneda;

    private java.util.Calendar fechaActivacion;

    private java.lang.String id;

    private ClasesUtilMovilnet.BalanceTo[] balances;

    private java.lang.String numero;

    private double saldo;

    private java.lang.String proveedorServicio;

    private java.lang.String estatusAnterior;

    private ClasesUtilMovilnet.AgenteTo agente;

    private java.lang.String lenguaje;

    private ClasesUtilMovilnet.LocalidadTo localidad;

    private java.lang.String tecnologia;

    public CuentaContratoTo() {
    }

    public CuentaContratoTo(
           java.lang.String serialDecodificador,
           java.lang.String estatus,
           ClasesUtilMovilnet.ModeloTo modelo,
           java.util.Calendar fechaCreacion,
           ClasesUtilMovilnet.CargoPeriodicoTo cargoPeriodico,
           java.lang.String serialTarjetaAcceso,
           java.util.Calendar fechaFinProgramacion,
           java.util.Calendar fechaExpiracion,
           ClasesUtilMovilnet.ClienteTo cliente,
           ClasesUtilMovilnet.PlanTo plan,
           ClasesUtilMovilnet.PromocionTo promocion,
           java.lang.String codigoMoneda,
           java.util.Calendar fechaActivacion,
           java.lang.String id,
           ClasesUtilMovilnet.BalanceTo[] balances,
           java.lang.String numero,
           double saldo,
           java.lang.String proveedorServicio,
           java.lang.String estatusAnterior,
           ClasesUtilMovilnet.AgenteTo agente,
           java.lang.String lenguaje,
           ClasesUtilMovilnet.LocalidadTo localidad,
           java.lang.String tecnologia) {
           this.serialDecodificador = serialDecodificador;
           this.estatus = estatus;
           this.modelo = modelo;
           this.fechaCreacion = fechaCreacion;
           this.cargoPeriodico = cargoPeriodico;
           this.serialTarjetaAcceso = serialTarjetaAcceso;
           this.fechaFinProgramacion = fechaFinProgramacion;
           this.fechaExpiracion = fechaExpiracion;
           this.cliente = cliente;
           this.plan = plan;
           this.promocion = promocion;
           this.codigoMoneda = codigoMoneda;
           this.fechaActivacion = fechaActivacion;
           this.id = id;
           this.balances = balances;
           this.numero = numero;
           this.saldo = saldo;
           this.proveedorServicio = proveedorServicio;
           this.estatusAnterior = estatusAnterior;
           this.agente = agente;
           this.lenguaje = lenguaje;
           this.localidad = localidad;
           this.tecnologia = tecnologia;
    }


    /**
     * Gets the serialDecodificador value for this CuentaContratoTo.
     * 
     * @return serialDecodificador
     */
    public java.lang.String getSerialDecodificador() {
        return serialDecodificador;
    }


    /**
     * Sets the serialDecodificador value for this CuentaContratoTo.
     * 
     * @param serialDecodificador
     */
    public void setSerialDecodificador(java.lang.String serialDecodificador) {
        this.serialDecodificador = serialDecodificador;
    }


    /**
     * Gets the estatus value for this CuentaContratoTo.
     * 
     * @return estatus
     */
    public java.lang.String getEstatus() {
        return estatus;
    }


    /**
     * Sets the estatus value for this CuentaContratoTo.
     * 
     * @param estatus
     */
    public void setEstatus(java.lang.String estatus) {
        this.estatus = estatus;
    }


    /**
     * Gets the modelo value for this CuentaContratoTo.
     * 
     * @return modelo
     */
    public ClasesUtilMovilnet.ModeloTo getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this CuentaContratoTo.
     * 
     * @param modelo
     */
    public void setModelo(ClasesUtilMovilnet.ModeloTo modelo) {
        this.modelo = modelo;
    }


    /**
     * Gets the fechaCreacion value for this CuentaContratoTo.
     * 
     * @return fechaCreacion
     */
    public java.util.Calendar getFechaCreacion() {
        return fechaCreacion;
    }


    /**
     * Sets the fechaCreacion value for this CuentaContratoTo.
     * 
     * @param fechaCreacion
     */
    public void setFechaCreacion(java.util.Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    /**
     * Gets the cargoPeriodico value for this CuentaContratoTo.
     * 
     * @return cargoPeriodico
     */
    public ClasesUtilMovilnet.CargoPeriodicoTo getCargoPeriodico() {
        return cargoPeriodico;
    }


    /**
     * Sets the cargoPeriodico value for this CuentaContratoTo.
     * 
     * @param cargoPeriodico
     */
    public void setCargoPeriodico(ClasesUtilMovilnet.CargoPeriodicoTo cargoPeriodico) {
        this.cargoPeriodico = cargoPeriodico;
    }


    /**
     * Gets the serialTarjetaAcceso value for this CuentaContratoTo.
     * 
     * @return serialTarjetaAcceso
     */
    public java.lang.String getSerialTarjetaAcceso() {
        return serialTarjetaAcceso;
    }


    /**
     * Sets the serialTarjetaAcceso value for this CuentaContratoTo.
     * 
     * @param serialTarjetaAcceso
     */
    public void setSerialTarjetaAcceso(java.lang.String serialTarjetaAcceso) {
        this.serialTarjetaAcceso = serialTarjetaAcceso;
    }


    /**
     * Gets the fechaFinProgramacion value for this CuentaContratoTo.
     * 
     * @return fechaFinProgramacion
     */
    public java.util.Calendar getFechaFinProgramacion() {
        return fechaFinProgramacion;
    }


    /**
     * Sets the fechaFinProgramacion value for this CuentaContratoTo.
     * 
     * @param fechaFinProgramacion
     */
    public void setFechaFinProgramacion(java.util.Calendar fechaFinProgramacion) {
        this.fechaFinProgramacion = fechaFinProgramacion;
    }


    /**
     * Gets the fechaExpiracion value for this CuentaContratoTo.
     * 
     * @return fechaExpiracion
     */
    public java.util.Calendar getFechaExpiracion() {
        return fechaExpiracion;
    }


    /**
     * Sets the fechaExpiracion value for this CuentaContratoTo.
     * 
     * @param fechaExpiracion
     */
    public void setFechaExpiracion(java.util.Calendar fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }


    /**
     * Gets the cliente value for this CuentaContratoTo.
     * 
     * @return cliente
     */
    public ClasesUtilMovilnet.ClienteTo getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this CuentaContratoTo.
     * 
     * @param cliente
     */
    public void setCliente(ClasesUtilMovilnet.ClienteTo cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the plan value for this CuentaContratoTo.
     * 
     * @return plan
     */
    public ClasesUtilMovilnet.PlanTo getPlan() {
        return plan;
    }


    /**
     * Sets the plan value for this CuentaContratoTo.
     * 
     * @param plan
     */
    public void setPlan(ClasesUtilMovilnet.PlanTo plan) {
        this.plan = plan;
    }


    /**
     * Gets the promocion value for this CuentaContratoTo.
     * 
     * @return promocion
     */
    public ClasesUtilMovilnet.PromocionTo getPromocion() {
        return promocion;
    }


    /**
     * Sets the promocion value for this CuentaContratoTo.
     * 
     * @param promocion
     */
    public void setPromocion(ClasesUtilMovilnet.PromocionTo promocion) {
        this.promocion = promocion;
    }


    /**
     * Gets the codigoMoneda value for this CuentaContratoTo.
     * 
     * @return codigoMoneda
     */
    public java.lang.String getCodigoMoneda() {
        return codigoMoneda;
    }


    /**
     * Sets the codigoMoneda value for this CuentaContratoTo.
     * 
     * @param codigoMoneda
     */
    public void setCodigoMoneda(java.lang.String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }


    /**
     * Gets the fechaActivacion value for this CuentaContratoTo.
     * 
     * @return fechaActivacion
     */
    public java.util.Calendar getFechaActivacion() {
        return fechaActivacion;
    }


    /**
     * Sets the fechaActivacion value for this CuentaContratoTo.
     * 
     * @param fechaActivacion
     */
    public void setFechaActivacion(java.util.Calendar fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }


    /**
     * Gets the id value for this CuentaContratoTo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CuentaContratoTo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the balances value for this CuentaContratoTo.
     * 
     * @return balances
     */
    public ClasesUtilMovilnet.BalanceTo[] getBalances() {
        return balances;
    }


    /**
     * Sets the balances value for this CuentaContratoTo.
     * 
     * @param balances
     */
    public void setBalances(ClasesUtilMovilnet.BalanceTo[] balances) {
        this.balances = balances;
    }

    public ClasesUtilMovilnet.BalanceTo getBalances(int i) {
        return this.balances[i];
    }

    public void setBalances(int i, ClasesUtilMovilnet.BalanceTo _value) {
        this.balances[i] = _value;
    }


    /**
     * Gets the numero value for this CuentaContratoTo.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this CuentaContratoTo.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the saldo value for this CuentaContratoTo.
     * 
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }


    /**
     * Sets the saldo value for this CuentaContratoTo.
     * 
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    /**
     * Gets the proveedorServicio value for this CuentaContratoTo.
     * 
     * @return proveedorServicio
     */
    public java.lang.String getProveedorServicio() {
        return proveedorServicio;
    }


    /**
     * Sets the proveedorServicio value for this CuentaContratoTo.
     * 
     * @param proveedorServicio
     */
    public void setProveedorServicio(java.lang.String proveedorServicio) {
        this.proveedorServicio = proveedorServicio;
    }


    /**
     * Gets the estatusAnterior value for this CuentaContratoTo.
     * 
     * @return estatusAnterior
     */
    public java.lang.String getEstatusAnterior() {
        return estatusAnterior;
    }


    /**
     * Sets the estatusAnterior value for this CuentaContratoTo.
     * 
     * @param estatusAnterior
     */
    public void setEstatusAnterior(java.lang.String estatusAnterior) {
        this.estatusAnterior = estatusAnterior;
    }


    /**
     * Gets the agente value for this CuentaContratoTo.
     * 
     * @return agente
     */
    public ClasesUtilMovilnet.AgenteTo getAgente() {
        return agente;
    }


    /**
     * Sets the agente value for this CuentaContratoTo.
     * 
     * @param agente
     */
    public void setAgente(ClasesUtilMovilnet.AgenteTo agente) {
        this.agente = agente;
    }


    /**
     * Gets the lenguaje value for this CuentaContratoTo.
     * 
     * @return lenguaje
     */
    public java.lang.String getLenguaje() {
        return lenguaje;
    }


    /**
     * Sets the lenguaje value for this CuentaContratoTo.
     * 
     * @param lenguaje
     */
    public void setLenguaje(java.lang.String lenguaje) {
        this.lenguaje = lenguaje;
    }


    /**
     * Gets the localidad value for this CuentaContratoTo.
     * 
     * @return localidad
     */
    public ClasesUtilMovilnet.LocalidadTo getLocalidad() {
        return localidad;
    }


    /**
     * Sets the localidad value for this CuentaContratoTo.
     * 
     * @param localidad
     */
    public void setLocalidad(ClasesUtilMovilnet.LocalidadTo localidad) {
        this.localidad = localidad;
    }


    /**
     * Gets the tecnologia value for this CuentaContratoTo.
     * 
     * @return tecnologia
     */
    public java.lang.String getTecnologia() {
        return tecnologia;
    }


    /**
     * Sets the tecnologia value for this CuentaContratoTo.
     * 
     * @param tecnologia
     */
    public void setTecnologia(java.lang.String tecnologia) {
        this.tecnologia = tecnologia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CuentaContratoTo)) return false;
        CuentaContratoTo other = (CuentaContratoTo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serialDecodificador==null && other.getSerialDecodificador()==null) || 
             (this.serialDecodificador!=null &&
              this.serialDecodificador.equals(other.getSerialDecodificador()))) &&
            ((this.estatus==null && other.getEstatus()==null) || 
             (this.estatus!=null &&
              this.estatus.equals(other.getEstatus()))) &&
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              this.modelo.equals(other.getModelo()))) &&
            ((this.fechaCreacion==null && other.getFechaCreacion()==null) || 
             (this.fechaCreacion!=null &&
              this.fechaCreacion.equals(other.getFechaCreacion()))) &&
            ((this.cargoPeriodico==null && other.getCargoPeriodico()==null) || 
             (this.cargoPeriodico!=null &&
              this.cargoPeriodico.equals(other.getCargoPeriodico()))) &&
            ((this.serialTarjetaAcceso==null && other.getSerialTarjetaAcceso()==null) || 
             (this.serialTarjetaAcceso!=null &&
              this.serialTarjetaAcceso.equals(other.getSerialTarjetaAcceso()))) &&
            ((this.fechaFinProgramacion==null && other.getFechaFinProgramacion()==null) || 
             (this.fechaFinProgramacion!=null &&
              this.fechaFinProgramacion.equals(other.getFechaFinProgramacion()))) &&
            ((this.fechaExpiracion==null && other.getFechaExpiracion()==null) || 
             (this.fechaExpiracion!=null &&
              this.fechaExpiracion.equals(other.getFechaExpiracion()))) &&
            ((this.cliente==null && other.getCliente()==null) || 
             (this.cliente!=null &&
              this.cliente.equals(other.getCliente()))) &&
            ((this.plan==null && other.getPlan()==null) || 
             (this.plan!=null &&
              this.plan.equals(other.getPlan()))) &&
            ((this.promocion==null && other.getPromocion()==null) || 
             (this.promocion!=null &&
              this.promocion.equals(other.getPromocion()))) &&
            ((this.codigoMoneda==null && other.getCodigoMoneda()==null) || 
             (this.codigoMoneda!=null &&
              this.codigoMoneda.equals(other.getCodigoMoneda()))) &&
            ((this.fechaActivacion==null && other.getFechaActivacion()==null) || 
             (this.fechaActivacion!=null &&
              this.fechaActivacion.equals(other.getFechaActivacion()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.balances==null && other.getBalances()==null) || 
             (this.balances!=null &&
              java.util.Arrays.equals(this.balances, other.getBalances()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            this.saldo == other.getSaldo() &&
            ((this.proveedorServicio==null && other.getProveedorServicio()==null) || 
             (this.proveedorServicio!=null &&
              this.proveedorServicio.equals(other.getProveedorServicio()))) &&
            ((this.estatusAnterior==null && other.getEstatusAnterior()==null) || 
             (this.estatusAnterior!=null &&
              this.estatusAnterior.equals(other.getEstatusAnterior()))) &&
            ((this.agente==null && other.getAgente()==null) || 
             (this.agente!=null &&
              this.agente.equals(other.getAgente()))) &&
            ((this.lenguaje==null && other.getLenguaje()==null) || 
             (this.lenguaje!=null &&
              this.lenguaje.equals(other.getLenguaje()))) &&
            ((this.localidad==null && other.getLocalidad()==null) || 
             (this.localidad!=null &&
              this.localidad.equals(other.getLocalidad()))) &&
            ((this.tecnologia==null && other.getTecnologia()==null) || 
             (this.tecnologia!=null &&
              this.tecnologia.equals(other.getTecnologia())));
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
        if (getSerialDecodificador() != null) {
            _hashCode += getSerialDecodificador().hashCode();
        }
        if (getEstatus() != null) {
            _hashCode += getEstatus().hashCode();
        }
        if (getModelo() != null) {
            _hashCode += getModelo().hashCode();
        }
        if (getFechaCreacion() != null) {
            _hashCode += getFechaCreacion().hashCode();
        }
        if (getCargoPeriodico() != null) {
            _hashCode += getCargoPeriodico().hashCode();
        }
        if (getSerialTarjetaAcceso() != null) {
            _hashCode += getSerialTarjetaAcceso().hashCode();
        }
        if (getFechaFinProgramacion() != null) {
            _hashCode += getFechaFinProgramacion().hashCode();
        }
        if (getFechaExpiracion() != null) {
            _hashCode += getFechaExpiracion().hashCode();
        }
        if (getCliente() != null) {
            _hashCode += getCliente().hashCode();
        }
        if (getPlan() != null) {
            _hashCode += getPlan().hashCode();
        }
        if (getPromocion() != null) {
            _hashCode += getPromocion().hashCode();
        }
        if (getCodigoMoneda() != null) {
            _hashCode += getCodigoMoneda().hashCode();
        }
        if (getFechaActivacion() != null) {
            _hashCode += getFechaActivacion().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getBalances() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalances());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalances(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        _hashCode += new Double(getSaldo()).hashCode();
        if (getProveedorServicio() != null) {
            _hashCode += getProveedorServicio().hashCode();
        }
        if (getEstatusAnterior() != null) {
            _hashCode += getEstatusAnterior().hashCode();
        }
        if (getAgente() != null) {
            _hashCode += getAgente().hashCode();
        }
        if (getLenguaje() != null) {
            _hashCode += getLenguaje().hashCode();
        }
        if (getLocalidad() != null) {
            _hashCode += getLocalidad().hashCode();
        }
        if (getTecnologia() != null) {
            _hashCode += getTecnologia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CuentaContratoTo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "CuentaContratoTo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialDecodificador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "serialDecodificador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "estatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "modelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "ModeloTo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaCreacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "fechaCreacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoPeriodico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "cargoPeriodico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "CargoPeriodicoTo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialTarjetaAcceso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "serialTarjetaAcceso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaFinProgramacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "fechaFinProgramacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaExpiracion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "fechaExpiracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "ClienteTo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "plan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "PlanTo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promocion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "promocion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "PromocionTo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoMoneda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "codigoMoneda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaActivacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "fechaActivacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balances");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "balances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "BalanceTo"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "saldo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proveedorServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "proveedorServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estatusAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "estatusAnterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "agente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "AgenteTo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lenguaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "lenguaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "localidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "LocalidadTo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnologia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ClasesUtilMovilnet", "tecnologia"));
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
