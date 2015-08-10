package clases;

import org.apache.log4j.Logger;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import muleconsultarordenivr.AP719ConsultarOrdenIVRProxy;
import muleconsultarordenivr.ConsultarOrdenIVRRQ;
import obtenerMovimientosCent.*;
import org.asteriskjava.fastagi.*;
import response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.F2V5_NAP_Asc_obtenerSaldoCuenta_RP;
import ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv.TelephoneLine;
import ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv.ValidateCustomerIPTV;
import ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv.ValidateCustomerIPTVFault_Exception;
import ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv.ValidateCustomerIPTV_Service;
import com.cantv.sacas.integracion.obtenerHistoriaTelefono.CwsObtenerHistoriaTelefonoIntegracionPortTypeProxy;
import com.cantv.sacas.integracion.obtenerHistoriaTelefono.xsd.CbObtenerHistoriaTelefonoRP;
import com.cantv.sacas.integracion.obtenerHistoriaTelefono.xsd.CbObtenerHistoriaTelefonoRQ;
import consultarcliente.CU683ConsultarClienteBOSSProxy;
import consultarcliente.ConsultarClienteRP;
import consultarcliente.ConsultarClienteRQ;
import ClasesUtilMovilnet.AgenteTo;
import ClasesUtilMovilnet.BalanceTo;
import ClasesUtilMovilnet.CargoPeriodicoTo;
import ClasesUtilMovilnet.ClienteTo;
import ClasesUtilMovilnet.CuentaContratoTo;
import ClasesUtilMovilnet.DireccionTo;
import ClasesUtilMovilnet.LocalidadTo;
import ClasesUtilMovilnet.ModeloTo;
import ClasesUtilMovilnet.NacionalidadTo;
import ClasesUtilMovilnet.PersonaContactoTo;
import ClasesUtilMovilnet.PlanTo;
import ClasesUtilMovilnet.ProfesionTo;
import ClasesUtilMovilnet.PromocionTo;
import MuleConsultarCasoRemedy.ConsultarCasoRemedyRP;
import MuleConsultarCasoRemedy.ConsultarCasoRemedyRQ;
import MuleConsultarCasoRemedy.GI114ConsultarCasoRemedyProxy;
import MuleConsultarCuentaGeneralMovilnet.ConsultaTarjetaRP;
import MuleConsultarCuentaGeneralMovilnet.ConsultaTarjetaRQ;
import MuleConsultarCuentaGeneralMovilnet.TVSAT006ConsultarCuentaGeneralProxy;
import NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuentaProxy;
import NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse;
import NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element;
import ObtenerTipoTarifa_pkg.LP502ObtenerTipoTarifaProxy;
import ObtenerTipoTarifa_pkg.ObtenerTipoTarifaRP;
import ObtenerTipoTarifa_pkg.ObtenerTipoTarifaRQ;
import Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.F2V5_NAP_Asc_obtenerSaldoCuenta_RQ;
import canonicoconsultarordenivr.ConsultarOrdenIVRRP;
import cantv.arquitectura.asc.contratos.exceptions.*;

public class ConsultNumber extends BaseAgiScript {
	static Logger log = Logger.getLogger("debugLogger");
	private int servicio = 0;

	private boolean CONTINUAR = false;
	
	/***
	 * GENERALES
	 */
	private String CODIGO_DE_AREA = "";
	private String CODIGO_RETORNO = "";
	private String TELEFONO = "";
	/***
	 * GENERALES
	 */
	
	
	/***
	 * TIPO TARIFA
	*/
	private String INDICADOR_SERVICIO = "";
	private String SOCIAL = "";
	
	/***
	 * TIPO TARIFA
	 */
	
	/***
	 * OBTENER MOVIMIENTOS
	 */
	
	private String FECHA_DE_LA_DEUDA_1 = "";
	private String DIA_FECHA_DE_LA_DEUDA_1 = "";
	private String MES_FECHA_DE_LA_DEUDA_1 = "";
	private String ANIO_FECHA_DE_LA_DEUDA_1 = "";
	private String MONTO_DE_LA_DEUDA_1 = "";
	
	private String FECHA_DE_LA_DEUDA_2 = "";
	private String DIA_FECHA_DE_LA_DEUDA_2 = "";
	private String MES_FECHA_DE_LA_DEUDA_2 = "";
	private String ANIO_FECHA_DE_LA_DEUDA_2 = "";
	private String MONTO_DE_LA_DEUDA_2 = "";
	
	private String FECHA_DE_LA_DEUDA_3 = "";
	private String DIA_FECHA_DE_LA_DEUDA_3 = "";
	private String MES_FECHA_DE_LA_DEUDA_3 = "";
	private String ANIO_FECHA_DE_LA_DEUDA_3 = "";
	private String MONTO_DE_LA_DEUDA_3 = "";
	
	private String FECHA_DE_LA_DEUDA_4 = "";
	private String DIA_FECHA_DE_LA_DEUDA_4 = "";
	private String MES_FECHA_DE_LA_DEUDA_4 = "";
	private String ANIO_FECHA_DE_LA_DEUDA_4 = "";
	private String MONTO_DE_LA_DEUDA_4 = "";
	
	private String FECHA_DE_LA_DEUDA_5 = "";
	private String DIA_FECHA_DE_LA_DEUDA_5 = "";
	private String MES_FECHA_DE_LA_DEUDA_5 = "";
	private String ANIO_FECHA_DE_LA_DEUDA_5 = "";
	private String MONTO_DE_LA_DEUDA_5 = "";
	
	private String FECHA_DE_LA_DEUDA_6 = "";
	private String DIA_FECHA_DE_LA_DEUDA_6 = "";
	private String MES_FECHA_DE_LA_DEUDA_6 = "";
	private String ANIO_FECHA_DE_LA_DEUDA_6 = "";
	private String MONTO_DE_LA_DEUDA_6 = "";
	
	private String MONTO_TOTAL_PENDIENTE = "";
	private String NOMBRE_DEL_CLIENTE = "";
	private String TIPO_CLIENTE = "";
	private String TIPO_SERVICIO = "";
	
	private String FECHA_VENCIMIENTO_DE_FACTURA = "";
	private String DIA_FECHA_VENCIMIENTO_DE_FACTURA = "";
	private String MES_FECHA_VENCIMIENTO_DE_FACTURA = "";
	private String ANIO_FECHA_VENCIMIENTO_DE_FACTURA = "";
	private String MONTO_MORA_A_30_DIAS = "";
	
	private String FECHA_DE_LA_MORA_A_30_DIAS = "";
	private String DIA_FECHA_DE_LA_MORA_A_30_DIAS = "";
	private String MES_FECHA_DE_LA_MORA_A_30_DIAS = "";
	private String ANIO_FECHA_DE_LA_MORA_A_30_DIAS = "";
	private String MONTO_MORA_A_60_DIAS = "";
	
	private String FECHA_DE_LA_MORA_60_DIAS = "";
	private String DIA_FECHA_DE_LA_MORA_60_DIAS = "";
	private String MES_FECHA_DE_LA_MORA_60_DIAS = "";
	private String ANIO_FECHA_DE_LA_MORA_60_DIAS = "";
	private String MONTO_MORA_A_90_DIAS = "";
	
	private String FECHA_DE_LA_MORA_90_DIAS = "";
	private String DIA_FECHA_DE_LA_MORA_90_DIAS = "";
	private String MES_FECHA_DE_LA_MORA_90_DIAS = "";
	private String ANIO_FECHA_DE_LA_MORA_90_DIAS = "";
	
	private String FECHA_ULTIMA_FACTURA = "";
	private String DIA_FECHA_ULTIMA_FACTURA = "";
	private String MES_FECHA_ULTIMA_FACTURA = "";
	private String ANIO_FECHA_ULTIMA_FACTURA = "";
	
	private String INDICADOR_DE_INFORMACION_CONVENIO = "";
	private String NUMERO_DE_CUENTA = "";
	private String MONTO_DEL_SALDO_CONVENIO = "";
	private String MONTO_DEL_CONVENIO = "";
	private String CANTIDAD_DE_GIROS = "";
	private String MONTO_DEL_GIRO_DE_CONVENIO = "";
	private String CANTIDAD_DE_GIROS_VENCIDOS = "";
	
	private String FECHA_DEL_VENCIDO = "";
	private String DIA_FECHA_DEL_VENCIDO = "";
	private String MES_FECHA_DEL_VENCIDO = "";
	private String ANIO_FECHA_DEL_VENCIDO = "";
	private String INDICADOR_TELEFONO_ACTIVO = "";
	
	private String FECHA_NOTIFICADOR = "";
	private String DIA_FECHA_NOTIFICADOR = "";
	private String MES_FECHA_NOTIFICADOR = "";
	private String ANIO_FECHA_NOTIFICADOR = "";
	private String INDICADOR_CORTE_RECONEXION = "";
	private String CANTIDAD_DE_LLAMADAS = "";
	private String INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO = "";
	private String MONTO_DEL_LIMITE_DE_CREDITO = "";
	private String MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO = "";
	private String MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE = "";
	/***
	 * OBTENER MOVIMIENTOS
	 */
	
	
	/***
	 * ESTATUS DE LINEA
	 */
	private String CEDULA_ASAP = "";
	private String CODIGO_ASAP = "";
	private String CODIGO_BOSS = "";
	private String DESCRIPCION_ASAP = "";
	private String DESCRIPCION_BOSS = "";
	private String FECHA_ORDEN = "";
	private String ANIO_FECHA_ORDEN = "";
	private String MES_FECHA_ORDEN = "";
	private String DIA_FECHA_ORDEN = "";
	private String NUMERO_TELEFONO = "";
	private String ORDEN_ASAP = "";
	private String ORDEN_BOSS = "";
	private String STATUS_ORDEN = "";
	private String VALIDEZ_ORDEN = "";
	private String STATUS_ORDEN_ASAP = "";
	private String TIEMPO_MAYOR_360 = "";
	/***
	 * ESTATUS DE LINEA
	 */
	
	
	/***
	 * ESTATUS AVERIA
	 */
	
	private String CODIGO_ERROR = "";
	private String ESTATUS = "";
	private String FECHA_CANCELACION = "";
	private String FECHA_REPORTE = "";
	private String HORA_CANCELACION = "";
	private String HORA_REPORTE = "";
	private String MENSAJE_ERROR = "";
	private String NUMERO_INCIDENTE = "";
	private String TIEMPO_MAYOR_72 = "";
	/***
	 * ESTATUS AVERIA
	 */
	
	
	
	private String APELLIDO = "";
	private String ASAPDATA = "";
	private String CATAS = "";
	private String CLTTYPE = "";
	private String ERROR = "";
	private String FECORTE = "";
	private String FECPAGO = "";
	private String LOGIN = "";
	private String MARSKPLAN = "";
	private String MASKSTATUS = "";
	private String MTOPAGO = "";
	private String N_ERROR = "";
	private String NOMBRE = "";
	private String NOMBRE_JURIDICO = "";
	private String PAYMEDIA  = "";
	private String PLAN = "";
	private String STATUS = "";
	private String STATUSREASON = "";
	private String TIPO =   "";
	private String TOTALBALANCE =  "";
	
	
	
	/***
	 * TVSAT
	 */
	private String ERROR_CODE =   "";
	private String ERROR_MESSAGE =   "";
	private String NUMERO =   "";
	private String SALDO =   "";
	
	private String SERIAL_DECODIFICADOR =    "";
	private String FECHA_CREACION =    "";
	private String SERIAL_TARJETA_ACCESO =    "";
	private String FECHA_FIN_PROGRAMACION =    "";
	private String FECHA_EXPIRACION =    "";
	private String CLIENTE_CARGO =    "";
	private String CLIENTE_CORREO_ELECTRONICO =    "";
	private String CLIENTE_DOCUMENTO_ID =    "";
	private String CLIENTE_EXTENSION_OFICINA =    "";
	private String CLIENTE_FECHA_INGRESO_EMPRESA =    "";
	private String CLIENTE_FECHA_NACIMIENTO =    "";
	private String CLIENTE_GENERO =    "";
	private String CLIENTE_NOMBRE_EMPRESA =    "";
	private String CLIENTE_PRIMER_APELLIDO =    "";
	private String CLIENTE_PRIMER_NOMBRE =    "";
	private String CLIENTE_SEGUNDO_APELLIDO =    "";
	private String CLIENTE_SEGUNDO_NOMBRE =    "";
	private String CLIENTE_TELEFONO_HABITACION =    "";
	private String CLIENTE_TELEFONO_OFICINA =    "";
	private String CLIENTE_TIPO_CLIENTE =    "";
	private String CLIENTE_TIPO_DOCUMENTO =    "";
	private String CLIENTE_TITULO =    "";
	private String CODIGO_MONEDA =    "";
	private String FECHA_ACTIVACION =    "";
	private String ID =    "";
	private String PROVEEDOR_SERVICIO =    "";
	private String ESTATUS_ANTERIOR =    "";
	private String LENGUAJE  =    "";
	private String TECNOLOGIA =    "";
	
	
	
	/***
	 * TVSAT
	 */
	
	
	
	/***
	 * REMEDY
	 */
	private String CASO =    "";
	private String CATEGORIA =    "";
	private String CREADO =    "";
	private String DESCRIPCION =    "";
	private String ESTADO =    "";
	private String REGISTROS =    "";
	private String RESULTADO =    "";
	/***
	 * REMEDY
	 */
	
	
	/**
	 * OBTENER SALDO CUENTA
	 */
	
	private String SALDO_ACTUAL =    "";
	private String SALDO_VENCIDO =    "";
	private String FECHA_ULTIMA_FACTURACION =    "";
	private String ANIO_FECHA_ULTIMA_FACTURACION =    "";
	private String MES_FECHA_ULTIMA_FACTURACION =    "";
	private String DIA_FECHA_ULTIMA_FACTURACION =    "";
	/**
	 * OBTENER SALDO CUENTA
	 */
	
	

	@Override
	public void service(AgiRequest request, AgiChannel arg1) throws AgiException {
		
		if(!request.getParameter("SERVICIO").equalsIgnoreCase("")){
			servicio = Integer.parseInt(request.getParameter("SERVICIO"));
			CONTINUAR = true;
		}else{
			log.info("NO EXISTE UN SERVICIO ASIGNADO");
			throw new AgiException("NO EXISTE UN SERVICIO ASIGNADO");
		}
		
		if (CONTINUAR) {
			// Lama al servicio correspondiente
			switch (servicio) {
			case 1:// Consulta Obtener Movimientos
//				if (obtenerMovimietos(request.getParameter("COD"), request.getParameter("NUMDES"))) {
//					setVariable("CONTINUAR", "1");
//				} else {
//					setVariable("CONTINUAR", "0");
//				}
				break;
			case 2: // Consulta Obtener Tipo Tarifa
				obtenerTipoTarifa(request.getParameter("COD"), request.getParameter("NUMDES"));
				
				log.info("CODIGO DE AREA RECIBIDO: "+request.getParameter("COD"));
				log.info("NUMERO DE TELEFONO RECIBIDO: "+request.getParameter("NUMDES"));
				
				
				setVariable("CODIGO_DE_AREA", CODIGO_DE_AREA);
				setVariable("CODIGO_RETORNO", CODIGO_RETORNO);
				setVariable("INDICADOR_SERVICIO", INDICADOR_SERVICIO);
				setVariable("SOCIAL", SOCIAL);
				setVariable("TELEFONO", TELEFONO);
				
				log.info("CODIGO_DE_AREA: "+CODIGO_DE_AREA);
				log.info("CODIGO_RETORNO: "+CODIGO_RETORNO);
				log.info("INDICADOR_SERVICIO: "+INDICADOR_SERVICIO);
				log.info("SOCIAL: "+SOCIAL);
				log.info("TELEFONO: "+TELEFONO);
				break;
			case 3:// Obtener Movimientos
				log.info("CODIGO DE AREA RECIBIDO: "+request.getParameter("COD"));
				log.info("NUMERO DE TELEFONO RECIBIDO: "+request.getParameter("NUMDES"));
				
				obtenerMovimientos(request.getParameter("COD"), request.getParameter("NUMDES"));

				setVariable("INDICADOR_CORTE_RECONEXION", INDICADOR_CORTE_RECONEXION);
				setVariable("CODIGO_DE_AREA",CODIGO_DE_AREA);
				setVariable("TELEFONO",TELEFONO);
				setVariable("FECHA_DE_LA_DEUDA_1",FECHA_DE_LA_DEUDA_1);
				setVariable("DIA_FECHA_DE_LA_DEUDA_1",DIA_FECHA_DE_LA_DEUDA_1);
				setVariable("MES_FECHA_DE_LA_DEUDA_1",MES_FECHA_DE_LA_DEUDA_1);
				setVariable("ANIO_FECHA_DE_LA_DEUDA_1",ANIO_FECHA_DE_LA_DEUDA_1);
				setVariable("MONTO_DE_LA_DEUDA_1",MONTO_DE_LA_DEUDA_1);
				setVariable("FECHA_DE_LA_DEUDA_2",FECHA_DE_LA_DEUDA_2);
				setVariable("DIA_FECHA_DE_LA_DEUDA_2",DIA_FECHA_DE_LA_DEUDA_2);
				setVariable("MES_FECHA_DE_LA_DEUDA_2",MES_FECHA_DE_LA_DEUDA_2);
				setVariable("ANIO_FECHA_DE_LA_DEUDA_2",ANIO_FECHA_DE_LA_DEUDA_2);
				setVariable("MONTO_DE_LA_DEUDA_2",MONTO_DE_LA_DEUDA_2);
				setVariable("FECHA_DE_LA_DEUDA_3",FECHA_DE_LA_DEUDA_3);
				setVariable("DIA_FECHA_DE_LA_DEUDA_3",DIA_FECHA_DE_LA_DEUDA_3);
				setVariable("MES_FECHA_DE_LA_DEUDA_3",MES_FECHA_DE_LA_DEUDA_3);
				setVariable("ANIO_FECHA_DE_LA_DEUDA_3",ANIO_FECHA_DE_LA_DEUDA_3);
				setVariable("MONTO_DE_LA_DEUDA_3",MONTO_DE_LA_DEUDA_3);
				setVariable("FECHA_DE_LA_DEUDA_4",FECHA_DE_LA_DEUDA_4);
				setVariable("DIA_FECHA_DE_LA_DEUDA_4",DIA_FECHA_DE_LA_DEUDA_4);
				setVariable("MES_FECHA_DE_LA_DEUDA_4",MES_FECHA_DE_LA_DEUDA_4);
				setVariable("ANIO_FECHA_DE_LA_DEUDA_4",ANIO_FECHA_DE_LA_DEUDA_4);
				setVariable("MONTO_DE_LA_DEUDA_4",MONTO_DE_LA_DEUDA_4);
				setVariable("DIA_FECHA_DE_LA_DEUDA_5",FECHA_DE_LA_DEUDA_5);
				setVariable("MES_FECHA_DE_LA_DEUDA_5",MES_FECHA_DE_LA_DEUDA_5);
				setVariable("ANIO_FECHA_DE_LA_DEUDA_5",ANIO_FECHA_DE_LA_DEUDA_5);
				setVariable("MONTO_DE_LA_DEUDA_5",MONTO_DE_LA_DEUDA_5);
				setVariable("FECHA_DE_LA_DEUDA_6",FECHA_DE_LA_DEUDA_6);
				setVariable("DIA_FECHA_DE_LA_DEUDA_6",DIA_FECHA_DE_LA_DEUDA_6);
				setVariable("MES_FECHA_DE_LA_DEUDA_6",MES_FECHA_DE_LA_DEUDA_6);
				setVariable("ANIO_FECHA_DE_LA_DEUDA_6",ANIO_FECHA_DE_LA_DEUDA_6);
				setVariable("MONTO_DE_LA_DEUDA_6",MONTO_DE_LA_DEUDA_6);
				setVariable("MONTO_TOTAL_PENDIENTE",MONTO_TOTAL_PENDIENTE);
				setVariable("NOMBRE_DEL_CLIENTE",NOMBRE_DEL_CLIENTE);
				setVariable("TIPO_CLIENTE",TIPO_CLIENTE);
				setVariable("TIPO_SERVICIO",TIPO_SERVICIO);
				setVariable("FECHA_VENCIMIENTO_DE_FACTURA",FECHA_VENCIMIENTO_DE_FACTURA);
				setVariable("DIA_FECHA_VENCIMIENTO_DE_FACTURA",DIA_FECHA_VENCIMIENTO_DE_FACTURA);
				setVariable("MES_FECHA_VENCIMIENTO_DE_FACTURA",MES_FECHA_VENCIMIENTO_DE_FACTURA);
				setVariable("ANIO_FECHA_VENCIMIENTO_DE_FACTURA",ANIO_FECHA_VENCIMIENTO_DE_FACTURA);
				setVariable("MONTO_MORA_A_30_DIAS",MONTO_MORA_A_30_DIAS);
				setVariable("FECHA_DE_LA_MORA_A_30_DIAS",FECHA_DE_LA_MORA_A_30_DIAS);
				setVariable("DIA_FECHA_DE_LA_MORA_A_30_DIAS",DIA_FECHA_DE_LA_MORA_A_30_DIAS);
				setVariable("MES_FECHA_DE_LA_MORA_A_30_DIAS",MES_FECHA_DE_LA_MORA_A_30_DIAS);
				setVariable("ANIO_FECHA_DE_LA_MORA_A_30_DIAS",ANIO_FECHA_DE_LA_MORA_A_30_DIAS);
				setVariable("MONTO_MORA_A_60_DIAS",MONTO_MORA_A_60_DIAS);
				setVariable("FECHA_DE_LA_MORA_A_60_DIAS",FECHA_DE_LA_MORA_60_DIAS);
				setVariable("DIA_FECHA_DE_LA_MORA_60_DIAS",DIA_FECHA_DE_LA_MORA_60_DIAS);
				setVariable("MES_FECHA_DE_LA_MORA_60_DIAS",MES_FECHA_DE_LA_MORA_60_DIAS);
				setVariable("ANIO_FECHA_DE_LA_MORA_60_DIAS",ANIO_FECHA_DE_LA_MORA_60_DIAS);
				setVariable("MONTO_MORA_A_90_DIAS",MONTO_MORA_A_90_DIAS);
				setVariable("FECHA_DE_LA_MORA_90_DIAS",FECHA_DE_LA_MORA_90_DIAS);
				setVariable("DIA_FECHA_DE_LA_MORA_90_DIAS",DIA_FECHA_DE_LA_MORA_90_DIAS);
				setVariable("MES_FECHA_DE_LA_MORA_90_DIAS",MES_FECHA_DE_LA_MORA_90_DIAS);
				setVariable("ANIO_FECHA_DE_LA_MORA_90_DIAS",ANIO_FECHA_DE_LA_MORA_90_DIAS);
				setVariable("INDICADOR_DE_INFORMACION_CONVENIO",INDICADOR_DE_INFORMACION_CONVENIO);
				setVariable("NUMERO_DE_CUENTA",NUMERO_DE_CUENTA);
				setVariable("MONTO_DEL_SALDO_CONVENIO",MONTO_DEL_SALDO_CONVENIO);
				setVariable("MONTO_DEL_CONVENIO",MONTO_DEL_CONVENIO);
				setVariable("CANTIDAD_DE_GIROS",CANTIDAD_DE_GIROS);
				setVariable("MONTO_DEL_GIRO_DE_CONVENIO",MONTO_DEL_GIRO_DE_CONVENIO);
				setVariable("CANTIDAD_DE_GIROS_VENCIDOS",CANTIDAD_DE_GIROS_VENCIDOS);
				setVariable("FECHA_DEL_VENCIDO",FECHA_DEL_VENCIDO);
				setVariable("DIA_FECHA_DEL_VENCIDO",DIA_FECHA_DEL_VENCIDO);
				setVariable("MES_FECHA_DEL_VENCIDO",MES_FECHA_DEL_VENCIDO);
				setVariable("ANIO_FECHA_DEL_VENCIDO",ANIO_FECHA_DEL_VENCIDO);
				setVariable("FECHA_NOTIFICADOR",FECHA_NOTIFICADOR);
				setVariable("DIA_FECHA_NOTIFICADOR",DIA_FECHA_NOTIFICADOR);
				setVariable("MES_FECHA_NOTIFICADOR",MES_FECHA_NOTIFICADOR);
				setVariable("ANIO_FECHA_NOTIFICADOR",ANIO_FECHA_NOTIFICADOR);
				setVariable("INDICADOR_CORTE_RECONEXION",INDICADOR_CORTE_RECONEXION);
				setVariable("CANTIDAD_DE_LLAMADAS",CANTIDAD_DE_LLAMADAS);
				setVariable("CODIGO_RETORNO",CODIGO_RETORNO);
				setVariable("INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO",INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO);
				setVariable("MONTO_DEL_LIMITE_DE_CREDITO",MONTO_DEL_LIMITE_DE_CREDITO);
				setVariable("MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO",MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO);
				setVariable("MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE",MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE);
				setVariable("INDICADOR_TELEFONO_ACTIVO", INDICADOR_TELEFONO_ACTIVO);
				
				setVariable("FECHA_ULTIMA_FACTURA", FECHA_ULTIMA_FACTURA);
				setVariable("DIA_FECHA_ULTIMA_FACTURA", DIA_FECHA_ULTIMA_FACTURA);
				setVariable("MES_FECHA_ULTIMA_FACTURA", MES_FECHA_ULTIMA_FACTURA);
				setVariable("ANIO_FECHA_ULTIMA_FACTURA", ANIO_FECHA_ULTIMA_FACTURA);
				
				
				
				log.info("CODIGO_DE_AREA: "+CODIGO_DE_AREA);
				log.info("TELEFONO: "+TELEFONO);
				log.info("INDICADOR_TELEFONO_ACTIVO: "+INDICADOR_TELEFONO_ACTIVO);
				log.info("FECHA_DE_LA_DEUDA_1: "+FECHA_DE_LA_DEUDA_1);
				log.info("DIA_FECHA_DE_LA_DEUDA_1: "+DIA_FECHA_DE_LA_DEUDA_1);
				log.info("MES_FECHA_DE_LA_DEUDA_1: "+MES_FECHA_DE_LA_DEUDA_1);
				log.info("ANIO_FECHA_DE_LA_DEUDA_1: "+ANIO_FECHA_DE_LA_DEUDA_1);
				log.info("MONTO_DE_LA_DEUDA_1: "+MONTO_DE_LA_DEUDA_1);
				log.info("FECHA_DE_LA_DEUDA_2: "+FECHA_DE_LA_DEUDA_2);
				log.info("DIA_FECHA_DE_LA_DEUDA_2: "+DIA_FECHA_DE_LA_DEUDA_2);
				log.info("MES_FECHA_DE_LA_DEUDA_2: "+MES_FECHA_DE_LA_DEUDA_2);
				log.info("ANIO_FECHA_DE_LA_DEUDA_2: "+ANIO_FECHA_DE_LA_DEUDA_2);
				log.info("MONTO_DE_LA_DEUDA_2: "+MONTO_DE_LA_DEUDA_2);
				log.info("FECHA_DE_LA_DEUDA_3: "+FECHA_DE_LA_DEUDA_3);
				log.info("DIA_FECHA_DE_LA_DEUDA_3: "+DIA_FECHA_DE_LA_DEUDA_3);
				log.info("MES_FECHA_DE_LA_DEUDA_3: "+MES_FECHA_DE_LA_DEUDA_3);
				log.info("ANIO_FECHA_DE_LA_DEUDA_3: "+ANIO_FECHA_DE_LA_DEUDA_3);
				log.info("MONTO_DE_LA_DEUDA_3: "+MONTO_DE_LA_DEUDA_3);
				log.info("FECHA_DE_LA_DEUDA_4: "+FECHA_DE_LA_DEUDA_4);
				log.info("DIA_FECHA_DE_LA_DEUDA_4: "+DIA_FECHA_DE_LA_DEUDA_4);
				log.info("MES_FECHA_DE_LA_DEUDA_4: "+MES_FECHA_DE_LA_DEUDA_4);
				log.info("ANIO_FECHA_DE_LA_DEUDA_4: "+ANIO_FECHA_DE_LA_DEUDA_4);
				log.info("MONTO_DE_LA_DEUDA_4: "+MONTO_DE_LA_DEUDA_4);
				log.info("FECHA_DE_LA_DEUDA_5: "+FECHA_DE_LA_DEUDA_5);
				log.info("DIA_FECHA_DE_LA_DEUDA_5: "+DIA_FECHA_DE_LA_DEUDA_5);
				log.info("MES_FECHA_DE_LA_DEUDA_5: "+MES_FECHA_DE_LA_DEUDA_5);
				log.info("ANIO_FECHA_DE_LA_DEUDA_5: "+ANIO_FECHA_DE_LA_DEUDA_5);
				log.info("MONTO_DE_LA_DEUDA_5: "+MONTO_DE_LA_DEUDA_5);
				log.info("FECHA_DE_LA_DEUDA_6: "+FECHA_DE_LA_DEUDA_6);
				log.info("DIA_FECHA_DE_LA_DEUDA_6: "+DIA_FECHA_DE_LA_DEUDA_6);
				log.info("MES_FECHA_DE_LA_DEUDA_6: "+MES_FECHA_DE_LA_DEUDA_6);
				log.info("ANIO_FECHA_DE_LA_DEUDA_6: "+ANIO_FECHA_DE_LA_DEUDA_6);
				log.info("MONTO_DE_LA_DEUDA_6: "+MONTO_DE_LA_DEUDA_6);
				log.info("MONTO_TOTAL_PENDIENTE: "+MONTO_TOTAL_PENDIENTE);
				log.info("NOMBRE_DEL_CLIENTE: "+NOMBRE_DEL_CLIENTE);
				log.info("TIPO_CLIENTE: "+TIPO_CLIENTE);
				log.info("TIPO_SERVICIO: "+TIPO_SERVICIO);
				log.info("FECHA_VENCIMIENTO_DE_FACTURA: "+FECHA_VENCIMIENTO_DE_FACTURA);
				log.info("DIA_FECHA_VENCIMIENTO_DE_FACTURA: "+DIA_FECHA_VENCIMIENTO_DE_FACTURA);
				log.info("MES_FECHA_VENCIMIENTO_DE_FACTURA: "+MES_FECHA_VENCIMIENTO_DE_FACTURA);
				log.info("ANIO_FECHA_VENCIMIENTO_DE_FACTURA: "+ANIO_FECHA_VENCIMIENTO_DE_FACTURA);
				
				log.info("MONTO_MORA_A_30_DIAS: "+MONTO_MORA_A_30_DIAS);
				log.info("FECHA_DE_LA_MORA_A_30_DIAS: "+FECHA_DE_LA_MORA_A_30_DIAS);
				log.info("DIA_FECHA_DE_LA_MORA_A_30_DIAS: "+DIA_FECHA_DE_LA_MORA_A_30_DIAS);
				log.info("MES_FECHA_DE_LA_MORA_A_30_DIAS: "+MES_FECHA_DE_LA_MORA_A_30_DIAS);
				log.info("ANIO_FECHA_DE_LA_MORA_A_30_DIAS: "+ANIO_FECHA_DE_LA_MORA_A_30_DIAS);
				
				log.info("MONTO_MORA_A_60_DIAS: "+MONTO_MORA_A_60_DIAS);
				log.info("FECHA_DE_LA_MORA_A_60_DIAS: "+FECHA_DE_LA_MORA_60_DIAS);
				log.info("DIA_FECHA_DE_LA_MORA_60_DIAS: "+DIA_FECHA_DE_LA_MORA_60_DIAS);
				log.info("MES_FECHA_DE_LA_MORA_60_DIAS: "+MES_FECHA_DE_LA_MORA_60_DIAS);
				log.info("ANIO_FECHA_DE_LA_MORA_60_DIAS: "+ANIO_FECHA_DE_LA_MORA_60_DIAS);
				
				log.info("MONTO_MORA_A_90_DIAS: "+MONTO_MORA_A_90_DIAS);
				log.info("FECHA_DE_LA_MORA_90_DIAS: "+FECHA_DE_LA_MORA_90_DIAS);
				log.info("DIA_FECHA_DE_LA_MORA_90_DIAS: "+DIA_FECHA_DE_LA_MORA_90_DIAS);
				log.info("MES_FECHA_DE_LA_MORA_90_DIAS: "+MES_FECHA_DE_LA_MORA_90_DIAS);
				log.info("ANIO_FECHA_DE_LA_MORA_90_DIAS: "+ANIO_FECHA_DE_LA_MORA_90_DIAS);
				
				log.info("INDICADOR_DE_INFORMACION_CONVENIO: "+INDICADOR_DE_INFORMACION_CONVENIO);
				log.info("NUMERO_DE_CUENTA: "+NUMERO_DE_CUENTA);
				log.info("MONTO_DEL_SALDO_CONVENIO: "+MONTO_DEL_SALDO_CONVENIO);
				log.info("MONTO_DEL_CONVENIO: "+MONTO_DEL_CONVENIO);
				log.info("CANTIDAD_DE_GIROS: "+CANTIDAD_DE_GIROS);
				log.info("MONTO_DEL_GIRO_DE_CONVENIO: "+MONTO_DEL_GIRO_DE_CONVENIO);
				log.info("CANTIDAD_DE_GIROS_VENCIDOS: "+CANTIDAD_DE_GIROS_VENCIDOS);
				
				log.info("FECHA_DEL_VENCIDO: "+FECHA_DEL_VENCIDO);
				log.info("DIA_FECHA_DEL_VENCIDO: "+DIA_FECHA_DEL_VENCIDO);
				log.info("MES_FECHA_DEL_VENCIDO: "+MES_FECHA_DEL_VENCIDO);
				log.info("ANIO_FECHA_DEL_VENCIDO: "+ANIO_FECHA_DEL_VENCIDO);
				
				
				log.info("FECHA_NOTIFICADOR: "+FECHA_NOTIFICADOR);
				log.info("DIA_FECHA_NOTIFICADOR: "+DIA_FECHA_NOTIFICADOR);
				log.info("MES_FECHA_NOTIFICADOR: "+MES_FECHA_NOTIFICADOR);
				log.info("ANIO_FECHA_NOTIFICADOR: "+ANIO_FECHA_NOTIFICADOR);
				
				
				log.info("FECHA_ULTIMA_FACTURA: "+FECHA_ULTIMA_FACTURA);
				log.info("DIA_FECHA_ULTIMA_FACTURA: "+DIA_FECHA_ULTIMA_FACTURA);
				log.info("MES_FECHA_ULTIMA_FACTURA: "+MES_FECHA_ULTIMA_FACTURA);
				log.info("ANIO_FECHA_ULTIMA_FACTURA: "+ANIO_FECHA_ULTIMA_FACTURA);
				
				
				log.info("INDICADOR_CORTE_RECONEXION: "+INDICADOR_CORTE_RECONEXION);
				log.info("CANTIDAD_DE_LLAMADAS: "+CANTIDAD_DE_LLAMADAS);
				log.info("CODIGO_RETORNO: "+CODIGO_RETORNO);
				log.info("INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO: "+INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO);
				log.info("MONTO_DEL_LIMITE_DE_CREDITO: "+MONTO_DEL_LIMITE_DE_CREDITO);
				log.info("MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO: "+MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO);
				log.info("MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE"+MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE);
					
				
				break;
			case 4: // Consulta Orden IVR
//				if(request.getParameter("ID_ORDEN").equalsIgnoreCase("")){
//					log.info("**********SIN NUMERO DE ORDEN**********");
//					log.info("CODIGO DE AREA RECIBIDO: "+request.getParameter("COD"));
//					log.info("NUMERO DE TELEFONO RECIBIDO: "+request.getParameter("NUMDES"));
//					consultarOrdenIVR(request.getParameter("COD"), request.getParameter("NUMDES"));
//				}else{
//					log.info("**********CON NUMERO DE ORDEN**********");
//					log.info("NUMERO DE ID_ORDEN: "+request.getParameter("ID_ORDEN"));
//					consultarOrdenIVR(request.getParameter("ID_ORDEN"), null, null);
//				}
//				
//				
//				setVariable("CEDULA_ASAP", CEDULA_ASAP);
//				setVariable("CODIGO_ASAP", CODIGO_ASAP);
//				setVariable("CODIGO_BOSS", CODIGO_BOSS);
//				setVariable("DESCRIPCION_ASAP",DESCRIPCION_ASAP);
//				setVariable("DESCRIPCION_BOSS",DESCRIPCION_BOSS);
//				setVariable("FECHA_ORDEN",FECHA_ORDEN);
//				setVariable("DIA_FECHA_ORDEN",DIA_FECHA_ORDEN);
//				setVariable("MES_FECHA_ORDEN",MES_FECHA_ORDEN);
//				setVariable("ANIO_FECHA_ORDEN",ANIO_FECHA_ORDEN);
//				setVariable("NUMERO_TELEFONO",NUMERO_TELEFONO);
//				setVariable("ORDEN_ASAP",ORDEN_ASAP);
//				setVariable("ORDEN_BOSS",ORDEN_BOSS);
//				setVariable("STATUS_ORDEN",STATUS_ORDEN);
//				setVariable("STATUS_ORDEN_ASAP",STATUS_ORDEN_ASAP);
//				setVariable("VALIDEZ_ORDEN",VALIDEZ_ORDEN);
//				
//				log.info("CEDULA_ASAP: "+ CEDULA_ASAP);
//				log.info("CODIGO_ASAP: "+ CODIGO_ASAP);
//				log.info("CODIGO_BOSS: "+ CODIGO_BOSS);
//				log.info("DESCRIPCION_ASAP: "+DESCRIPCION_ASAP);
//				log.info("DESCRIPCION_BOSS: "+DESCRIPCION_BOSS);
//				log.info("FECHA_ORDEN: "+FECHA_ORDEN);
//				log.info("DIA_FECHA_ORDEN: "+DIA_FECHA_ORDEN);
//				log.info("MES_FECHA_ORDEN: "+MES_FECHA_ORDEN);
//				log.info("ANIO_FECHA_ORDEN: "+ANIO_FECHA_ORDEN);
//				log.info("NUMERO_TELEFONO: "+NUMERO_TELEFONO);
//				log.info("ORDEN_ASAP: "+ORDEN_ASAP);
//				log.info("ORDEN_BOSS: "+ORDEN_BOSS);
//				log.info("STATUS_ORDEN: "+STATUS_ORDEN);
//				log.info("STATUS_ORDEN_ASAP: "+STATUS_ORDEN_ASAP);
//				log.info("VALIDEZ_ORDEN: "+VALIDEZ_ORDEN);
				break;
			case 5: // Consulta Estatus de internet
				log.info("CODIGO DE AREA RECIBIDO: "+request.getParameter("COD"));
				log.info("NUMERO DE TELEFONO RECIBIDO: "+request.getParameter("NUMDES"));
				consultarOrdenIVR(request.getParameter("COD"), request.getParameter("NUMDES"));
				
				setVariable("CEDULA_ASAP", CEDULA_ASAP);
				setVariable("CODIGO_ASAP", CODIGO_ASAP);
				setVariable("CODIGO_BOSS", CODIGO_BOSS);
				setVariable("DESCRIPCION_ASAP",DESCRIPCION_ASAP);
				setVariable("DESCRIPCION_BOSS",DESCRIPCION_BOSS);
				setVariable("FECHA_ORDEN",FECHA_ORDEN);
				setVariable("DIA_FECHA_ORDEN",DIA_FECHA_ORDEN);
				setVariable("MES_FECHA_ORDEN",MES_FECHA_ORDEN);
				setVariable("ANIO_FECHA_ORDEN",ANIO_FECHA_ORDEN);
				setVariable("NUMERO_TELEFONO",NUMERO_TELEFONO);
				setVariable("ORDEN_ASAP",ORDEN_ASAP);
				setVariable("ORDEN_BOSS",ORDEN_BOSS);
				setVariable("STATUS_ORDEN",STATUS_ORDEN);
				setVariable("STATUS_ORDEN_ASAP",STATUS_ORDEN_ASAP);
				setVariable("VALIDEZ_ORDEN",VALIDEZ_ORDEN);
				setVariable("TIEMPO_MAYOR_360",TIEMPO_MAYOR_360);
				
				
				log.info("CEDULA_ASAP: "+ CEDULA_ASAP);
				log.info("CODIGO_ASAP: "+ CODIGO_ASAP);
				log.info("CODIGO_BOSS: "+ CODIGO_BOSS);
				log.info("DESCRIPCION_ASAP: "+DESCRIPCION_ASAP);
				log.info("DESCRIPCION_BOSS: "+DESCRIPCION_BOSS);
				log.info("FECHA_ORDEN: "+FECHA_ORDEN);
				log.info("DIA_FECHA_ORDEN: "+DIA_FECHA_ORDEN);
				log.info("MES_FECHA_ORDEN: "+MES_FECHA_ORDEN);
				log.info("ANIO_FECHA_ORDEN: "+ANIO_FECHA_ORDEN);
				log.info("NUMERO_TELEFONO: "+NUMERO_TELEFONO);
				log.info("ORDEN_ASAP: "+ORDEN_ASAP);
				log.info("ORDEN_BOSS: "+ORDEN_BOSS);
				log.info("STATUS_ORDEN: "+STATUS_ORDEN);
				log.info("STATUS_ORDEN_ASAP: "+STATUS_ORDEN_ASAP);
				log.info("VALIDEZ_ORDEN: "+VALIDEZ_ORDEN);
				log.info("TIEMPO_MAYOR_360: "+TIEMPO_MAYOR_360);
				
				break;
			case 6: // SACAS
				log.info("CODIGO DE AREA RECIBIDO: "+request.getParameter("COD"));
				log.info("NUMERO DE TELEFONO RECIBIDO: "+request.getParameter("NUMDES"));
				obtenerHistoriaTelefonoIntegracion(request.getParameter("COD"), request.getParameter("NUMDES"), "Integracion", "_intmpsanp");
				
				setVariable("CODIGO_ERROR",CODIGO_ERROR);
				setVariable("ESTATUS",ESTATUS);
				setVariable("FECHA_CANCELACION",FECHA_CANCELACION);
				setVariable("FECHA_REPORTE",FECHA_REPORTE);
				setVariable("HORA_CANCELACION",HORA_CANCELACION);
				setVariable("HORA_REPORTE",HORA_REPORTE);
				setVariable("MENSAJE_ERROR",MENSAJE_ERROR);
				setVariable("NUMERO_INCIDENTE",NUMERO_INCIDENTE);
				setVariable("TIPO_SERVICIO",TIPO_SERVICIO);
				setVariable("TIEMPO_MAYOR_72",TIEMPO_MAYOR_72);
				
				
				log.info("CODIGO_ERROR: "+CODIGO_ERROR);
				log.info("ESTATUS: "+ESTATUS);
				log.info("FECHA_CANCELACION: "+FECHA_CANCELACION);
				log.info("FECHA_REPORTE: "+FECHA_REPORTE);
				log.info("HORA_CANCELACION: "+HORA_CANCELACION);
				log.info("HORA_REPORTE: "+HORA_REPORTE);
				log.info("MENSAJE_ERROR: "+MENSAJE_ERROR);
				log.info("NUMERO_INCIDENTE: "+NUMERO_INCIDENTE);
				log.info("TIPO_SERVICIO: "+TIPO_SERVICIO);
				log.info("TIEMPO_MAYOR_72: "+TIEMPO_MAYOR_72);
				break;
			case 7:// Consulta cliente BOSS
				log.info("ESTE ES EL NUMERO DE CEDULA: "+request.getParameter("ID_CLIENTE"));
				
				consultarClienteBOSS(request.getParameter("ID_CLIENTE"));
				
				
				setVariable("APELLIDO",APELLIDO);
				setVariable("ASAPDATA",ASAPDATA);
				setVariable("CATAS",CATAS);
				setVariable("CLTTYPE",CLTTYPE);
				setVariable("ERROR",ERROR);
				setVariable("FECORTE",FECORTE);
				setVariable("FECPAGO",FECPAGO);
				setVariable("LOGIN",LOGIN);
				setVariable("MARSKPLAN",MARSKPLAN);
				setVariable("MASKSTATUS",MASKSTATUS);
				setVariable("MTOPAGO",MTOPAGO);
				setVariable("N_ERROR",N_ERROR);
				setVariable("NOMBRE",NOMBRE);
				setVariable("NOMBRE_JURIDICO",NOMBRE_JURIDICO);
				setVariable("PAYMEDIA",PAYMEDIA);
				setVariable("PLAN",PLAN);
				setVariable("STATUS",STATUS);
				setVariable("STATUSREASON",STATUSREASON);
				setVariable("TIPO",TIPO);
				setVariable("TOTALBALANCE",TOTALBALANCE);
				
				
				
				log.info("APELLIDO: "+APELLIDO);
				log.info("ASAPDATA: "+ASAPDATA);
				log.info("CATAS: "+CATAS);
				log.info("CLTTYPE: "+CLTTYPE);
				log.info("ERROR: "+ERROR);
				log.info("FECORTE: "+FECORTE);
				log.info("FECPAGO: "+FECPAGO);
				log.info("LOGIN: "+LOGIN);
				log.info("MARSKPLAN: "+MARSKPLAN);
				log.info("MASKSTATUS: "+MASKSTATUS);
				log.info("MTOPAGO: "+MTOPAGO);
				log.info("N_ERROR: "+N_ERROR);
				log.info("NOMBRE: "+NOMBRE);
				log.info("NOMBRE_JURIDICO: "+NOMBRE_JURIDICO);
				log.info("PAYMEDIA: "+PAYMEDIA);
				log.info("PLAN: "+PLAN);
				log.info("STATUS: "+STATUS);
				log.info("STATUSREASON: "+STATUSREASON);
				log.info("TIPO: "+TIPO);
				log.info("TOTALBALANCE: "+TOTALBALANCE);
				
				break;
			case 8: //REMEDY
				if(request.getParameter("NUM_CEDULA") != null && !request.getParameter("NUM_CEDULA").equalsIgnoreCase("")){
					log.info("NUMERO DE CEDULA: "+request.getParameter("NUM_CEDULA"));
					consultaCasoRemedy(request.getParameter("NUM_CEDULA"), null, null);
				}else{
					log.info("NUMERO DE TELEFONO: "+request.getParameter("COD")+request.getParameter("NUMDES"));
					consultaCasoRemedy(null, request.getParameter("COD"), request.getParameter("NUMDES"));
				}
				
				
				setVariable("CASO",CASO);
				setVariable("CATEGORIA",CATEGORIA);
				setVariable("CREADO",CREADO);
				setVariable("DESCRIPCION",DESCRIPCION);
				setVariable("ERROR",ERROR);
				setVariable("ESTADO",ESTADO);
				setVariable("REGISTROS",REGISTROS);
				setVariable("RESULTADO",RESULTADO);
				setVariable("TIEMPO_MAYOR_72",TIEMPO_MAYOR_72);
				
				log.info("CASO: "+CASO);
				log.info("CATEGORIA: "+CATEGORIA);
				log.info("CREADO: "+CREADO);
				log.info("DESCRIPCION: "+DESCRIPCION);
				log.info("ERROR: "+ERROR);
				log.info("ESTADO: "+ESTADO);
				log.info("REGISTROS: "+REGISTROS);
				log.info("RESULTADO: "+RESULTADO);
				log.info("TIEMPO_MAYOR_72: "+TIEMPO_MAYOR_72);
				
				break;
			case 9://TVSAT
				log.info("NUMERO DE LA TARJETA: "+request.getParameter("NUM_TARJETA"));
				tvsatConsultarCuentaGeneral(request.getParameter("NUM_TARJETA"));
				
				
				setVariable("SERIAL_DECODIFICADOR",SERIAL_DECODIFICADOR);
				setVariable("ESTATUS",ESTATUS);
				setVariable("FECHA_CREACION",FECHA_CREACION);
				setVariable("SERIAL_TARJETA_ACCESO",SERIAL_TARJETA_ACCESO);
				setVariable("FECHA_FIN_PROGRAMACION",FECHA_FIN_PROGRAMACION);
				setVariable("FECHA_EXPIRACION",FECHA_EXPIRACION);
				setVariable("CLIENTE_CARGO",CLIENTE_CARGO);
				setVariable("CLIENTE_CORREO_ELECTRONICO",CLIENTE_CORREO_ELECTRONICO);
				setVariable("CLIENTE_DOCUMENTO_ID",CLIENTE_DOCUMENTO_ID);
				setVariable("CLIENTE_EXTENSION_OFICINA",CLIENTE_EXTENSION_OFICINA);
				setVariable("CLIENTE_FECHA_INGRESO_EMPRESA",CLIENTE_FECHA_INGRESO_EMPRESA);
				setVariable("CLIENTE_FECHA_NACIMIENTO",CLIENTE_FECHA_NACIMIENTO);
				setVariable("CLIENTE_GENERO",CLIENTE_GENERO);
				setVariable("CLIENTE_NOMBRE_EMPRESA",CLIENTE_NOMBRE_EMPRESA);
				setVariable("CLIENTE_PRIMER_APELLIDO",CLIENTE_PRIMER_APELLIDO);
				setVariable("CLIENTE_PRIMER_NOMBRE",CLIENTE_PRIMER_NOMBRE);
				setVariable("CLIENTE_SEGUNDO_APELLIDO",CLIENTE_SEGUNDO_APELLIDO);
				setVariable("CLIENTE_SEGUNDO_NOMBRE",CLIENTE_SEGUNDO_NOMBRE);
				setVariable("CLIENTE_TELEFONO_HABITACION",CLIENTE_TELEFONO_HABITACION);
				setVariable("CLIENTE_TELEFONO_OFICINA",CLIENTE_TELEFONO_OFICINA);
				setVariable("CLIENTE_TIPO_CLIENTE",CLIENTE_TIPO_CLIENTE);
				setVariable("CLIENTE_TIPO_DOCUMENTO",CLIENTE_TIPO_DOCUMENTO);
				setVariable("CLIENTE_TITULO",CLIENTE_TITULO);
				setVariable("CODIGO_MONEDA",CODIGO_MONEDA);
				setVariable("FECHA_ACTIVACION",FECHA_ACTIVACION);
				setVariable("ID",ID);
				setVariable("NUMERO",NUMERO);
				setVariable("SALDO",SALDO);
				setVariable("PROVEEDOR_SERVICIO",PROVEEDOR_SERVICIO);
				setVariable("ESTATUS_ANTERIOR",ESTATUS_ANTERIOR);
				setVariable("LENGUAJE",LENGUAJE);
				setVariable("TECNOLOGIA",TECNOLOGIA);
				setVariable("ERROR_CODE",ERROR_CODE);
				setVariable("ERROR_MESSAGE",ERROR_MESSAGE);
				
				log.info("SERIAL_DECODIFICADOR: "+SERIAL_DECODIFICADOR);
				log.info("ESTATUS: "+ESTATUS);
				log.info("FECHA_CREACION: "+FECHA_CREACION);
				log.info("SERIAL_TARJETA_ACCESO: "+SERIAL_TARJETA_ACCESO);
				log.info("FECHA_FIN_PROGRAMACION: "+FECHA_FIN_PROGRAMACION);
				log.info("FECHA_EXPIRACION: "+FECHA_EXPIRACION);
				log.info("CLIENTE_CARGO: "+CLIENTE_CARGO);
				log.info("CLIENTE_CORREO_ELECTRONICO: "+CLIENTE_CORREO_ELECTRONICO);
				log.info("CLIENTE_DOCUMENTO_ID: "+CLIENTE_DOCUMENTO_ID);
				log.info("CLIENTE_EXTENSION_OFICINA: "+CLIENTE_EXTENSION_OFICINA);
				log.info("CLIENTE_FECHA_INGRESO_EMPRESA: "+CLIENTE_FECHA_INGRESO_EMPRESA);
				log.info("CLIENTE_FECHA_NACIMIENTO: "+CLIENTE_FECHA_NACIMIENTO);
				log.info("CLIENTE_GENERO: "+CLIENTE_GENERO);
				log.info("CLIENTE_NOMBRE_EMPRESA: "+CLIENTE_NOMBRE_EMPRESA);
				log.info("CLIENTE_PRIMER_APELLIDO: "+CLIENTE_PRIMER_APELLIDO);
				log.info("CLIENTE_PRIMER_NOMBRE: "+CLIENTE_PRIMER_NOMBRE);
				log.info("CLIENTE_SEGUNDO_APELLIDO: "+CLIENTE_SEGUNDO_APELLIDO);
				log.info("CLIENTE_SEGUNDO_NOMBRE: "+CLIENTE_SEGUNDO_NOMBRE);
				log.info("CLIENTE_TELEFONO_HABITACION: "+CLIENTE_TELEFONO_HABITACION);
				log.info("CLIENTE_TELEFONO_OFICINA: "+CLIENTE_TELEFONO_OFICINA);
				log.info("CLIENTE_TITULO: "+CLIENTE_TITULO);
				log.info("CLIENTE_TIPO_CLIENTE: "+CLIENTE_TIPO_CLIENTE);
				log.info("CLIENTE_TIPO_DOCUMENTO: "+CLIENTE_TIPO_DOCUMENTO);
				log.info("CODIGO_MONEDA: "+CODIGO_MONEDA);
				log.info("FECHA_ACTIVACION: "+FECHA_ACTIVACION);
				log.info("ID: "+ID);
				log.info("NUMERO: "+NUMERO);
				log.info("SALDO: "+SALDO);
				log.info("PROVEEDOR_SERVICIO: "+PROVEEDOR_SERVICIO);
				log.info("ESTATUS_ANTERIOR: "+ESTATUS_ANTERIOR);
				log.info("LENGUAJE: "+LENGUAJE);
				log.info("TECNOLOGIA: "+TECNOLOGIA);
				log.info("ERROR_CODE: "+ERROR_CODE);
				log.info("ERROR_MESSAGE: "+ERROR_MESSAGE);
				
				break;
			case 10: //IPTV
				log.info("NUMERO DE TELEFONO: "+request.getParameter("COD")+request.getParameter("NUMDES"));
				
				if(consultarIPTV(request.getParameter("COD"), request.getParameter("NUMDES"))){
					log.info("SE DEVUELVE CONTRINUAR IGUAL A 1");
					setVariable("CONTINUAR", "1");
				}else{
					log.info("SE DEVUELVE CONTRINUAR IGUAL A 0");
					setVariable("CONTINUAR", "0");
				}
				break;
			case 11: //OBTENER SALDO CONSULTA
				log.info("NUMERO DE TELEFONO: "+request.getParameter("COD")+request.getParameter("NUMDES"));
				
				obtenerSaldoCuenta(request.getParameter("COD"), request.getParameter("NUMDES"));
				
				setVariable("SALDO_ACTUAL",SALDO_ACTUAL);
				setVariable("SALDO_VENCIDO",SALDO_VENCIDO);
				setVariable("CODIGO_DE_AREA",CODIGO_DE_AREA);
				setVariable("TELEFONO",TELEFONO);
				setVariable("FECHA_ULTIMA_FACTURACION",FECHA_ULTIMA_FACTURACION);
				setVariable("ANIO_FECHA_ULTIMA_FACTURACION",ANIO_FECHA_ULTIMA_FACTURACION);
				setVariable("MES_FECHA_ULTIMA_FACTURACION",MES_FECHA_ULTIMA_FACTURACION);
				setVariable("DIA_FECHA_ULTIMA_FACTURACION",DIA_FECHA_ULTIMA_FACTURACION);
				
				log.info("SALDO_ACTUAL: "+SALDO_ACTUAL);
				log.info("SALDO_VENCIDO: "+SALDO_VENCIDO);
				log.info("CODIGO_DE_AREA: "+CODIGO_DE_AREA);
				log.info("TELEFONO: "+TELEFONO);
				log.info("FECHA_ULTIMA_FACTURACION: "+FECHA_ULTIMA_FACTURACION);
				log.info("ANIO_FECHA_ULTIMA_FACTURACION: "+ANIO_FECHA_ULTIMA_FACTURACION);
				log.info("MES_FECHA_ULTIMA_FACTURACION: "+MES_FECHA_ULTIMA_FACTURACION);
				log.info("DIA_FECHA_ULTIMA_FACTURACION: "+DIA_FECHA_ULTIMA_FACTURACION);
				
				
				break;
			}
			
		} else {
			throw new AgiException("Uno de los parametros esta vacio o es null");
		}
	}

	/**
	 * Numero 01 Metodo para consultar si el cliente es residencial o juridico,
	 * tambien se verifica si el servicio del cliente esta activo
	 * 
	 * @return booleano verdadero o falso
	 */
//	public boolean obtenerMovimietos(String codigoDeArea,String numeroTelefonico) throws AgiException {
//		F2V5IVRAscObtenerMovimientosRP response = null;
//		// http://picprod.cantv.com.ve:8080/axis/services/PG558_obtenerMovimientosII?wsdl
//		try {
//			Serviciof2V5_IVR_Asc_obtenerMovimientosProxy proxy = new Serviciof2V5_IVR_Asc_obtenerMovimientosProxy();
//			F2V5IVRAscObtenerMovimientosRQ parametros = new F2V5IVRAscObtenerMovimientosRQ();
//			parametros.setAREA_CODE(Long.parseLong(codigoDeArea));
//			parametros.setTELNUM(Long.parseLong(numeroTelefonico));
//			response = proxy.obtenerMovimientos(parametros);
//		} catch (SystemException e) {
//			e.printStackTrace();
//		} catch (ApplicationException e) {
//			e.printStackTrace();
//		} catch (AxisFault e) {
//			e.printStackTrace();
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//		} catch (RemoteException e) {
//			e.printStackTrace();
//			return false;
//		}
//		log.info(response.getNOMBRE_DEL_CLIENTE());
//		log.info(response.getTIPO_CLIENTE());
//		log.info("VENCIDO: "+response.getFECHA_DEL_VENCIDO());
//		log.info("VENCIDO FACTURA: "+response.getFECHA_VENCIMIENTO_DE_FACTURA());
//		
//		
//		if (response.getINDICADOR_TELEFONO_ACTIVO().equalsIgnoreCase("S")){
//			log.info("Esta Activo");
//			return true;
//		}
//		return false;
//	}

	/***
	 * Numero 02 
	 * 
	 * obtenerTipoTarifa
	 * 
	 * @param codigoDeArea
	 * @param numeroTelefonico
	 * @return
	 */
	public void obtenerTipoTarifa(String codigoDeArea,String numDestino) {
		ObtenerTipoTarifaRP responseTarifa = null;
		LP502ObtenerTipoTarifaProxy proxyTarifa = new LP502ObtenerTipoTarifaProxy();
		ObtenerTipoTarifaRQ requestTarifa = new ObtenerTipoTarifaRQ();
		requestTarifa.setAREA_CODE(Long.parseLong(codigoDeArea));
		requestTarifa.setTELNUM(Long.parseLong(numDestino));
		try {
			responseTarifa = proxyTarifa.obtenerTipoTarifa(requestTarifa);
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (ApplicationException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		CODIGO_DE_AREA = responseTarifa.getCODIGO_DE_AREA().toString();
		CODIGO_RETORNO = responseTarifa.getCODIGO_RETORNO().toString();
		INDICADOR_SERVICIO = responseTarifa.getINDICADOR_SERVICIO();
		SOCIAL = responseTarifa.getSOCIAL();
		TELEFONO = responseTarifa.getTELEFONO().toString();
		
		log.info("CODIGO_DE_AREA: "+CODIGO_DE_AREA);
		log.info("CODIGO_RETORNO: "+CODIGO_RETORNO);
		log.info("INDICADOR_SERVICIO: "+INDICADOR_SERVICIO);
		log.info("SOCIAL: "+SOCIAL);
		log.info("TELEFONO: "+TELEFONO);
	}

	/***
	 * obtenerMovimientos
	 * 
	 * @param codigoDeArea
	 * @param numDestino
	 * @return void
	 */
	public void obtenerMovimientos(String codigoDeArea, String numDestino) {
		F2V5IVRAscObtenerMovimientosRQ request = new F2V5IVRAscObtenerMovimientosRQ();
		F2V5IVRAscObtenerMovimientosRP response = null;
		
		Serviciof2V5_IVR_Asc_obtenerMovimientosProxy proxyObtenerMovimientos = new Serviciof2V5_IVR_Asc_obtenerMovimientosProxy();
		
		request.setAREA_CODE(Long.parseLong(codigoDeArea)); //se setea el codigo de area
		request.setTELNUM(Long.parseLong(numDestino)); // se setea el numero de telefono
		
		try {
			response = proxyObtenerMovimientos.obtenerMovimientos(request);//se envia el request al WS
			if(response.getCODIGO_DE_AREA() != null){
				CODIGO_DE_AREA = response.getCODIGO_DE_AREA().toString();
			}
			
			if(response.getTELEFONO() != null){
				TELEFONO = response.getTELEFONO().toString();
			}
			
			
			
			FECHA_DE_LA_DEUDA_1 = response.getFECHA_DE_LA_DEUDA_1();
			if(response.getFECHA_DE_LA_DEUDA_1().length() == 6 && !response.getFECHA_DE_LA_DEUDA_1().equalsIgnoreCase("000000")){
				int ANIO_DEUDA1 = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_1().subSequence(0, 4).toString());
				int MES_DEUDA1 = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_1().subSequence(4, 6).toString());
				//int DIA_DEUDA = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_1().subSequence(6, 8).toString());
				Calendar calendar_FECHA_DEUDA_1 = new GregorianCalendar(ANIO_DEUDA1,MES_DEUDA1-1,1);
				ANIO_FECHA_DE_LA_DEUDA_1 = String.valueOf(calendar_FECHA_DEUDA_1.get(Calendar.YEAR));
				MES_FECHA_DE_LA_DEUDA_1 = String.valueOf(calendar_FECHA_DEUDA_1.get(Calendar.MONTH)+1);
				DIA_FECHA_DE_LA_DEUDA_1 = String.valueOf(calendar_FECHA_DEUDA_1.get(Calendar.DAY_OF_MONTH));
			}else{
				ANIO_FECHA_DE_LA_DEUDA_1 = "0";
				MES_FECHA_DE_LA_DEUDA_1 = "0";
				DIA_FECHA_DE_LA_DEUDA_1 = "0";
			}
			if(response.getMONTO_DE_LA_DEUDA_1() != 0){
				String ENTERO_MONTO_DE_LA_DEUDA_1 = response.getMONTO_DE_LA_DEUDA_1().toString().subSequence(0,response.getMONTO_DE_LA_DEUDA_1().toString().length()-2 ).toString();
				String DECIMAL_MONTO_DE_LA_DEUDA_1 = response.getMONTO_DE_LA_DEUDA_1().toString().subSequence(response.getMONTO_DE_LA_DEUDA_1().toString().length()-2,  response.getMONTO_DE_LA_DEUDA_1().toString().length()).toString();
				MONTO_DE_LA_DEUDA_1 = ENTERO_MONTO_DE_LA_DEUDA_1+"."+DECIMAL_MONTO_DE_LA_DEUDA_1;
			}else{
				MONTO_DE_LA_DEUDA_1 = response.getMONTO_DE_LA_DEUDA_1().toString();
			}
			
			
			FECHA_DE_LA_DEUDA_2 = response.getFECHA_DE_LA_DEUDA_2();
			if(response.getFECHA_DE_LA_DEUDA_2().length() == 6 && !response.getFECHA_DE_LA_DEUDA_2().equalsIgnoreCase("000000")) {
				int ANIO_DEUDA2 = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_2().subSequence(0, 4).toString());
				int MES_DEUDA2 = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_2().subSequence(4, 6).toString());
				//int DIA_DEUDA = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_1().subSequence(6, 8).toString());
				Calendar calendar_FECHA_DEUDA_2 = new GregorianCalendar(ANIO_DEUDA2,MES_DEUDA2-1,1);
				ANIO_FECHA_DE_LA_DEUDA_2 = String.valueOf(calendar_FECHA_DEUDA_2.get(Calendar.YEAR));
				MES_FECHA_DE_LA_DEUDA_2 = String.valueOf(calendar_FECHA_DEUDA_2.get(Calendar.MONTH)+1);
				//DIA_FECHA_DE_LA_DEUDA_2 = String.valueOf(calendar_FECHA_DEUDA_2.get(Calendar.DAY_OF_MONTH));
			}else{
				ANIO_FECHA_DE_LA_DEUDA_2 = "0";
				MES_FECHA_DE_LA_DEUDA_2 = "0";
				DIA_FECHA_DE_LA_DEUDA_2 = "0";
			}
			
			if(response.getMONTO_DE_LA_DEUDA_2() != 0){
				String ENTERO_MONTO_DE_LA_DEUDA_2 = response.getMONTO_DE_LA_DEUDA_2().toString().subSequence(0,response.getMONTO_DE_LA_DEUDA_2().toString().length()-2 ).toString();
				String DECIMAL_MONTO_DE_LA_DEUDA_2 = response.getMONTO_DE_LA_DEUDA_2().toString().subSequence(response.getMONTO_DE_LA_DEUDA_2().toString().length()-2,  response.getMONTO_DE_LA_DEUDA_2().toString().length()).toString();
				MONTO_DE_LA_DEUDA_2 = ENTERO_MONTO_DE_LA_DEUDA_2+"."+DECIMAL_MONTO_DE_LA_DEUDA_2;
			}else{
				MONTO_DE_LA_DEUDA_2 = response.getMONTO_DE_LA_DEUDA_2().toString();
			}
			
			
			
			FECHA_DE_LA_DEUDA_3 = response.getFECHA_DE_LA_DEUDA_3();
			if(response.getFECHA_DE_LA_DEUDA_3().length() == 6 && !response.getFECHA_DE_LA_DEUDA_3().equalsIgnoreCase("000000")){
				int ANIO_DEUDA3 = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_3().subSequence(0, 4).toString());
				int MES_DEUDA3 = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_3().subSequence(4, 6).toString());
				//int DIA_DEUDA = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_1().subSequence(6, 8).toString());
				Calendar calendar_FECHA_DEUDA_3 = new GregorianCalendar(ANIO_DEUDA3,MES_DEUDA3-1,1);
				ANIO_FECHA_DE_LA_DEUDA_3 = String.valueOf(calendar_FECHA_DEUDA_3.get(Calendar.YEAR));
				MES_FECHA_DE_LA_DEUDA_3 = String.valueOf(calendar_FECHA_DEUDA_3.get(Calendar.MONTH)+1);
				DIA_FECHA_DE_LA_DEUDA_3 = String.valueOf(calendar_FECHA_DEUDA_3.get(Calendar.DAY_OF_MONTH));
			}else{
				ANIO_FECHA_DE_LA_DEUDA_3 = "0";
				MES_FECHA_DE_LA_DEUDA_3 = "0";
				DIA_FECHA_DE_LA_DEUDA_3 = "0";
			}
			
			if(response.getMONTO_DE_LA_DEUDA_3() != 0){
				String ENTERO_MONTO_DE_LA_DEUDA_3 = response.getMONTO_DE_LA_DEUDA_3().toString().subSequence(0,response.getMONTO_DE_LA_DEUDA_3().toString().length()-2 ).toString();
				String DECIMAL_MONTO_DE_LA_DEUDA_3 = response.getMONTO_DE_LA_DEUDA_3().toString().subSequence(response.getMONTO_DE_LA_DEUDA_3().toString().length()-2,  response.getMONTO_DE_LA_DEUDA_3().toString().length()).toString();
				MONTO_DE_LA_DEUDA_3 = ENTERO_MONTO_DE_LA_DEUDA_3+"."+DECIMAL_MONTO_DE_LA_DEUDA_3;
			}else{
				MONTO_DE_LA_DEUDA_3 = response.getMONTO_DE_LA_DEUDA_1().toString();
			}
			
			
			
			FECHA_DE_LA_DEUDA_4 = response.getFECHA_DE_LA_DEUDA_4();
			if(response.getFECHA_DE_LA_DEUDA_4().length() == 6 && !response.getFECHA_DE_LA_DEUDA_4().equalsIgnoreCase("000000")){
				int ANIO_DEUDA4 = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_4().subSequence(0, 4).toString());
				int MES_DEUDA4 = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_4().subSequence(4, 6).toString());
				//int DIA_DEUDA = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_1().subSequence(6, 8).toString());
				Calendar calendar_FECHA_DEUDA_4 = new GregorianCalendar(ANIO_DEUDA4,MES_DEUDA4-1,1);
				ANIO_FECHA_DE_LA_DEUDA_4 = String.valueOf(calendar_FECHA_DEUDA_4.get(Calendar.YEAR));
				MES_FECHA_DE_LA_DEUDA_4 = String.valueOf(calendar_FECHA_DEUDA_4.get(Calendar.MONTH)+1);
				DIA_FECHA_DE_LA_DEUDA_4 = String.valueOf(calendar_FECHA_DEUDA_4.get(Calendar.DAY_OF_MONTH));
			}else{
				ANIO_FECHA_DE_LA_DEUDA_4 = "0";
				MES_FECHA_DE_LA_DEUDA_4 = "0";
				DIA_FECHA_DE_LA_DEUDA_4 = "0";
			}
			
			if(response.getMONTO_DE_LA_DEUDA_4() != 0){
				String ENTERO_MONTO_DE_LA_DEUDA_4 = response.getMONTO_DE_LA_DEUDA_4().toString().subSequence(0,response.getMONTO_DE_LA_DEUDA_4().toString().length()-2 ).toString();
				String DECIMAL_MONTO_DE_LA_DEUDA_4 = response.getMONTO_DE_LA_DEUDA_4().toString().subSequence(response.getMONTO_DE_LA_DEUDA_4().toString().length()-2,  response.getMONTO_DE_LA_DEUDA_4().toString().length()).toString();
				MONTO_DE_LA_DEUDA_4 = ENTERO_MONTO_DE_LA_DEUDA_4+"."+DECIMAL_MONTO_DE_LA_DEUDA_4;
			}else{
				MONTO_DE_LA_DEUDA_4 = response.getMONTO_DE_LA_DEUDA_4().toString();
			}
			
			
			FECHA_DE_LA_DEUDA_5 = response.getFECHA_DE_LA_DEUDA_5();
			if(response.getFECHA_DE_LA_DEUDA_5().length() == 6 && !response.getFECHA_DE_LA_DEUDA_5().equalsIgnoreCase("000000")){
				int ANIO_DEUDA5 = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_5().subSequence(0, 4).toString());
				int MES_DEUDA5 = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_5().subSequence(4, 6).toString());
				//int DIA_DEUDA = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_1().subSequence(6, 8).toString());
				Calendar calendar_FECHA_DEUDA_5 = new GregorianCalendar(ANIO_DEUDA5,MES_DEUDA5-1,1);
				ANIO_FECHA_DE_LA_DEUDA_5 = String.valueOf(calendar_FECHA_DEUDA_5.get(Calendar.YEAR));
				MES_FECHA_DE_LA_DEUDA_5 = String.valueOf(calendar_FECHA_DEUDA_5.get(Calendar.MONTH)+1);
				DIA_FECHA_DE_LA_DEUDA_5 = String.valueOf(calendar_FECHA_DEUDA_5.get(Calendar.DAY_OF_MONTH));
			}else{
				ANIO_FECHA_DE_LA_DEUDA_5 = "0";
				MES_FECHA_DE_LA_DEUDA_5 = "0";
				DIA_FECHA_DE_LA_DEUDA_5 = "0";
			}
			if(response.getMONTO_DE_LA_DEUDA_5() != 0){
				String ENTERO_MONTO_DE_LA_DEUDA_5 = response.getMONTO_DE_LA_DEUDA_5().toString().subSequence(0,response.getMONTO_DE_LA_DEUDA_5().toString().length()-2 ).toString();
				String DECIMAL_MONTO_DE_LA_DEUDA_5 = response.getMONTO_DE_LA_DEUDA_5().toString().subSequence(response.getMONTO_DE_LA_DEUDA_5().toString().length()-2,  response.getMONTO_DE_LA_DEUDA_5().toString().length()).toString();
				MONTO_DE_LA_DEUDA_5 = ENTERO_MONTO_DE_LA_DEUDA_5+"."+DECIMAL_MONTO_DE_LA_DEUDA_5;
			}else{
				MONTO_DE_LA_DEUDA_5 = response.getMONTO_DE_LA_DEUDA_5().toString();
			}
			
			
			FECHA_DE_LA_DEUDA_6 = response.getFECHA_DE_LA_DEUDA_6();
			if(response.getFECHA_DE_LA_DEUDA_6().length() == 6 && !response.getFECHA_DE_LA_DEUDA_6().equalsIgnoreCase("000000")){
				int ANIO_DEUDA6 = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_6().subSequence(0, 4).toString());
				int MES_DEUDA6 = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_6().subSequence(4, 6).toString());
				//int DIA_DEUDA = Integer.parseInt(response.getFECHA_DE_LA_DEUDA_1().subSequence(6, 8).toString());
				Calendar calendar_FECHA_DEUDA_6 = new GregorianCalendar(ANIO_DEUDA6,MES_DEUDA6-1,1);
				ANIO_FECHA_DE_LA_DEUDA_6 = String.valueOf(calendar_FECHA_DEUDA_6.get(Calendar.YEAR));
				MES_FECHA_DE_LA_DEUDA_6 = String.valueOf(calendar_FECHA_DEUDA_6.get(Calendar.MONTH)+1);
				DIA_FECHA_DE_LA_DEUDA_6 = String.valueOf(calendar_FECHA_DEUDA_6.get(Calendar.DAY_OF_MONTH));
			}else{
				ANIO_FECHA_DE_LA_DEUDA_6 = "0";
				MES_FECHA_DE_LA_DEUDA_6 = "0";
				DIA_FECHA_DE_LA_DEUDA_6 = "0";
			}
			if(response.getMONTO_DE_LA_DEUDA_6() != 0){
				String ENTERO_MONTO_DE_LA_DEUDA_6 = response.getMONTO_DE_LA_DEUDA_6().toString().subSequence(0,response.getMONTO_DE_LA_DEUDA_6().toString().length()-2 ).toString();
				String DECIMAL_MONTO_DE_LA_DEUDA_6 = response.getMONTO_DE_LA_DEUDA_6().toString().subSequence(response.getMONTO_DE_LA_DEUDA_6().toString().length()-2,  response.getMONTO_DE_LA_DEUDA_6().toString().length()).toString();
				MONTO_DE_LA_DEUDA_6 = ENTERO_MONTO_DE_LA_DEUDA_6+"."+DECIMAL_MONTO_DE_LA_DEUDA_6;
			}else{
				MONTO_DE_LA_DEUDA_6 = response.getMONTO_DE_LA_DEUDA_6().toString();
			}
			
			
			if(response.getMONTO_TOTAL_PENDIENTE() != 0){
				String ENTERO_MONTO_TOTAL_PENDIENTE = response.getMONTO_TOTAL_PENDIENTE().toString().subSequence(0,response.getMONTO_TOTAL_PENDIENTE().toString().length()-2 ).toString();
				String DECIMAL_MONTO_TOTAL_PENDIENTE = response.getMONTO_TOTAL_PENDIENTE().toString().subSequence(response.getMONTO_TOTAL_PENDIENTE().toString().length()-2,  response.getMONTO_TOTAL_PENDIENTE().toString().length()).toString();
				MONTO_TOTAL_PENDIENTE = ENTERO_MONTO_TOTAL_PENDIENTE+"."+DECIMAL_MONTO_TOTAL_PENDIENTE;
			}else{
				MONTO_TOTAL_PENDIENTE = response.getMONTO_TOTAL_PENDIENTE().toString();
			}
			
			NOMBRE_DEL_CLIENTE = response.getNOMBRE_DEL_CLIENTE();
			TIPO_CLIENTE = response.getTIPO_CLIENTE();
			TIPO_SERVICIO = response.getTIPO_SERVICIO();
			
			FECHA_VENCIMIENTO_DE_FACTURA = response.getFECHA_VENCIMIENTO_DE_FACTURA();
			
			FECHA_VENCIMIENTO_DE_FACTURA = response.getFECHA_VENCIMIENTO_DE_FACTURA();
			if(response.getFECHA_VENCIMIENTO_DE_FACTURA().length() == 8 && !response.getFECHA_VENCIMIENTO_DE_FACTURA().equalsIgnoreCase("00000000")){
				int ANIO_FACT = Integer.parseInt(response.getFECHA_VENCIMIENTO_DE_FACTURA().subSequence(0, 4).toString());
				int MES_FACT = Integer.parseInt(response.getFECHA_VENCIMIENTO_DE_FACTURA().subSequence(4, 6).toString());
				int DIA_FACT = Integer.parseInt(response.getFECHA_VENCIMIENTO_DE_FACTURA().subSequence(6, 8).toString());
				Calendar calendar_FECHA_VENCIMIENTO_DE_FACTURA = new GregorianCalendar(ANIO_FACT,MES_FACT-1,DIA_FACT);
				ANIO_FECHA_VENCIMIENTO_DE_FACTURA = String.valueOf(calendar_FECHA_VENCIMIENTO_DE_FACTURA.get(Calendar.YEAR));
				MES_FECHA_VENCIMIENTO_DE_FACTURA = String.valueOf(calendar_FECHA_VENCIMIENTO_DE_FACTURA.get(Calendar.MONTH)+1);
				DIA_FECHA_VENCIMIENTO_DE_FACTURA = String.valueOf(calendar_FECHA_VENCIMIENTO_DE_FACTURA.get(Calendar.DAY_OF_MONTH));
			}else{
				ANIO_FECHA_VENCIMIENTO_DE_FACTURA = "0";
				MES_FECHA_VENCIMIENTO_DE_FACTURA = "0";
				DIA_FECHA_VENCIMIENTO_DE_FACTURA = "0";
			}
			
			
			
			if(response.getMONTO_MORA_A_30_DIAS() != 0){
				String ENTERO_MONTO_MORA_A_30_DIAS = response.getMONTO_MORA_A_30_DIAS().toString().subSequence(0,response.getMONTO_MORA_A_30_DIAS().toString().length()-2 ).toString();
				String DECIMAL_MONTO_MORA_A_30_DIAS = response.getMONTO_MORA_A_30_DIAS().toString().subSequence(response.getMONTO_MORA_A_30_DIAS().toString().length()-2,  response.getMONTO_MORA_A_30_DIAS().toString().length()).toString();
				MONTO_MORA_A_30_DIAS = ENTERO_MONTO_MORA_A_30_DIAS+"."+DECIMAL_MONTO_MORA_A_30_DIAS;
			}else{
				MONTO_MORA_A_30_DIAS = response.getMONTO_MORA_A_30_DIAS().toString();
			}
			FECHA_DE_LA_MORA_A_30_DIAS = response.getFECHA_DE_LA_MORA_A_30_DIAS();
			
			if(response.getFECHA_DE_LA_MORA_A_30_DIAS().length() == 6 && !response.getFECHA_DE_LA_MORA_A_30_DIAS().equalsIgnoreCase("000000")){
				int ANIO_MORA = Integer.parseInt(response.getFECHA_DE_LA_MORA_A_30_DIAS().subSequence(0, 4).toString());
				int MES_MORA = Integer.parseInt(response.getFECHA_DE_LA_MORA_A_30_DIAS().subSequence(4, 6).toString());
				//int DIA_MORA = Integer.parseInt(response.getFECHA_DE_LA_MORA_A_30_DIAS().subSequence(6, 8).toString());
				Calendar calendar_FECHA_DE_LA_MORA_A_30_DIAS = new GregorianCalendar(ANIO_MORA,MES_MORA-1,1);
				ANIO_FECHA_DE_LA_MORA_A_30_DIAS = String.valueOf(calendar_FECHA_DE_LA_MORA_A_30_DIAS.get(Calendar.YEAR));
				MES_FECHA_DE_LA_MORA_A_30_DIAS = String.valueOf(calendar_FECHA_DE_LA_MORA_A_30_DIAS.get(Calendar.MONTH)+1);
				DIA_FECHA_DE_LA_MORA_A_30_DIAS = String.valueOf(calendar_FECHA_DE_LA_MORA_A_30_DIAS.get(Calendar.DAY_OF_MONTH));
			}else{
				ANIO_FECHA_DE_LA_MORA_A_30_DIAS = "0";
				MES_FECHA_DE_LA_MORA_A_30_DIAS = "0";
				DIA_FECHA_DE_LA_MORA_A_30_DIAS = "0";
			}
			
			
			if(response.getMONTO_MORA_A_60_DIAS() != 0){
				String ENTERO_MONTO_MORA_A_60_DIAS = response.getMONTO_MORA_A_60_DIAS().toString().subSequence(0,response.getMONTO_MORA_A_60_DIAS().toString().length()-2 ).toString();
				String DECIMAL_MONTO_MORA_A_60_DIAS = response.getMONTO_MORA_A_60_DIAS().toString().subSequence(response.getMONTO_MORA_A_60_DIAS().toString().length()-2,  response.getMONTO_MORA_A_60_DIAS().toString().length()).toString();
				MONTO_MORA_A_60_DIAS = ENTERO_MONTO_MORA_A_60_DIAS+"."+DECIMAL_MONTO_MORA_A_60_DIAS;
			}else{
				MONTO_MORA_A_60_DIAS = response.getMONTO_MORA_A_60_DIAS().toString();
			}
			FECHA_DE_LA_MORA_60_DIAS = response.getFECHA_DE_LA_MORA_60_DIAS();
			
			if(response.getFECHA_DE_LA_MORA_60_DIAS().length() == 6 && !response.getFECHA_DE_LA_MORA_60_DIAS().equalsIgnoreCase("000000")){
				int ANIO_MORA_60 = Integer.parseInt(response.getFECHA_DE_LA_MORA_60_DIAS().subSequence(0, 4).toString());
				int MES_MORA_60 = Integer.parseInt(response.getFECHA_DE_LA_MORA_60_DIAS().subSequence(4, 6).toString());
				//int DIA_MORA = Integer.parseInt(response.getFECHA_DE_LA_MORA_A_30_DIAS().subSequence(6, 8).toString());
				Calendar calendar_FECHA_DE_LA_MORA_60_DIAS = new GregorianCalendar(ANIO_MORA_60,MES_MORA_60-1,1);
				ANIO_FECHA_DE_LA_MORA_60_DIAS = String.valueOf(calendar_FECHA_DE_LA_MORA_60_DIAS.get(Calendar.YEAR));
				MES_FECHA_DE_LA_MORA_60_DIAS = String.valueOf(calendar_FECHA_DE_LA_MORA_60_DIAS.get(Calendar.MONTH)+1);
				DIA_FECHA_DE_LA_MORA_60_DIAS = String.valueOf(calendar_FECHA_DE_LA_MORA_60_DIAS.get(Calendar.DAY_OF_MONTH));
			}else{
				ANIO_FECHA_DE_LA_MORA_60_DIAS = "0";
				MES_FECHA_DE_LA_MORA_60_DIAS = "0";
				DIA_FECHA_DE_LA_MORA_60_DIAS = "0";
			}
			
			
			if(response.getMONTO_MORA_A_90_DIAS() != 0){
				String ENTERO_MONTO_MORA_A_90_DIAS = response.getMONTO_MORA_A_90_DIAS().toString().subSequence(0,response.getMONTO_MORA_A_90_DIAS().toString().length()-2 ).toString();
				String DECIMAL_MONTO_MORA_A_90_DIAS = response.getMONTO_MORA_A_90_DIAS().toString().subSequence(response.getMONTO_MORA_A_90_DIAS().toString().length()-2,  response.getMONTO_MORA_A_90_DIAS().toString().length()).toString();
				MONTO_MORA_A_90_DIAS = ENTERO_MONTO_MORA_A_90_DIAS+"."+DECIMAL_MONTO_MORA_A_90_DIAS;
			}else{
				MONTO_MORA_A_90_DIAS = response.getMONTO_MORA_A_30_DIAS().toString();
			}
			FECHA_DE_LA_MORA_90_DIAS = response.getFECHA_DE_LA_MORA_90_DIAS();
			
			if(response.getFECHA_DE_LA_MORA_90_DIAS().length() == 6 && !response.getFECHA_DE_LA_MORA_90_DIAS().equalsIgnoreCase("000000")){
				int ANIO_MORA_90 = Integer.parseInt(response.getFECHA_DE_LA_MORA_90_DIAS().subSequence(0, 4).toString());
				int MES_MORA_90 = Integer.parseInt(response.getFECHA_DE_LA_MORA_90_DIAS().subSequence(4, 6).toString());
				//int DIA_MORA = Integer.parseInt(response.getFECHA_DE_LA_MORA_A_30_DIAS().subSequence(6, 8).toString());
				Calendar calendar_FECHA_DE_LA_MORA_90_DIAS = new GregorianCalendar(ANIO_MORA_90,MES_MORA_90-1,1);
				ANIO_FECHA_DE_LA_MORA_90_DIAS = String.valueOf(calendar_FECHA_DE_LA_MORA_90_DIAS.get(Calendar.YEAR));
				MES_FECHA_DE_LA_MORA_90_DIAS = String.valueOf(calendar_FECHA_DE_LA_MORA_90_DIAS.get(Calendar.MONTH)+1);
				DIA_FECHA_DE_LA_MORA_90_DIAS = String.valueOf(calendar_FECHA_DE_LA_MORA_90_DIAS.get(Calendar.DAY_OF_MONTH));
			}else{
				ANIO_FECHA_DE_LA_MORA_90_DIAS = "0";
				MES_FECHA_DE_LA_MORA_90_DIAS = "0";
				DIA_FECHA_DE_LA_MORA_90_DIAS = "0";
			}
			
			FECHA_ULTIMA_FACTURA = response.getFECHA_ULTIMA_FACTURA();
			if(response.getFECHA_ULTIMA_FACTURA().length() == 8 && !response.getFECHA_ULTIMA_FACTURA().equalsIgnoreCase("00000000")){
				int ANIO_ULTIMA = Integer.parseInt(response.getFECHA_ULTIMA_FACTURA().subSequence(0, 4).toString());
				int MES_ULTIMA = Integer.parseInt(response.getFECHA_ULTIMA_FACTURA().subSequence(4, 6).toString());
				int DIA_ULTIMA = Integer.parseInt(response.getFECHA_ULTIMA_FACTURA().subSequence(6, 8).toString());
				Calendar calendar_FECHA_DE_LA_MORA_90_DIAS = new GregorianCalendar(ANIO_ULTIMA,MES_ULTIMA-1,DIA_ULTIMA);
				ANIO_FECHA_ULTIMA_FACTURA = String.valueOf(calendar_FECHA_DE_LA_MORA_90_DIAS.get(Calendar.YEAR));
				MES_FECHA_ULTIMA_FACTURA = String.valueOf(calendar_FECHA_DE_LA_MORA_90_DIAS.get(Calendar.MONTH)+1);
				DIA_FECHA_ULTIMA_FACTURA= String.valueOf(calendar_FECHA_DE_LA_MORA_90_DIAS.get(Calendar.DAY_OF_MONTH));
			}else{
				ANIO_FECHA_ULTIMA_FACTURA = "0";
				MES_FECHA_ULTIMA_FACTURA = "0";
				DIA_FECHA_ULTIMA_FACTURA = "0";
			}
			
			INDICADOR_DE_INFORMACION_CONVENIO = response.getINDICADOR_DE_INFORMACION_CONVENIO();
			NUMERO_DE_CUENTA = response.getNUMERO_DE_CUENTA();
			
			
			if(response.getMONTO_DEL_SALDO_CONVENIO() != 0){
				String ENTERO_MONTO_DEL_SALDO_CONVENIO = response.getMONTO_DEL_SALDO_CONVENIO().toString().subSequence(0,response.getMONTO_DEL_SALDO_CONVENIO().toString().length()-2 ).toString();
				String DECIMAL_MONTO_DEL_SALDO_CONVENIO = response.getMONTO_DEL_SALDO_CONVENIO().toString().subSequence(response.getMONTO_DEL_SALDO_CONVENIO().toString().length()-2,  response.getMONTO_DEL_SALDO_CONVENIO().toString().length()).toString();
				MONTO_DEL_SALDO_CONVENIO = ENTERO_MONTO_DEL_SALDO_CONVENIO+"."+DECIMAL_MONTO_DEL_SALDO_CONVENIO;
			}else{
				MONTO_DEL_SALDO_CONVENIO = response.getMONTO_DEL_SALDO_CONVENIO().toString();
			}
			
			if(response.getMONTO_DEL_CONVENIO() != 0){
				String ENTERO_MONTO_DEL_CONVENIO = response.getMONTO_DEL_CONVENIO().toString().subSequence(0,response.getMONTO_DEL_CONVENIO().toString().length()-2 ).toString();
				String DECIMAL_MONTO_DEL_CONVENIO = response.getMONTO_DEL_CONVENIO().toString().subSequence(response.getMONTO_DEL_CONVENIO().toString().length()-2,  response.getMONTO_DEL_CONVENIO().toString().length()).toString();
				MONTO_DEL_CONVENIO = ENTERO_MONTO_DEL_CONVENIO+"."+DECIMAL_MONTO_DEL_CONVENIO;
			}else{
				MONTO_DEL_CONVENIO = response.getMONTO_DEL_CONVENIO().toString();
			}
			CANTIDAD_DE_GIROS = response.getCANTIDAD_DE_GIROS().toString();
			
			if(response.getMONTO_DEL_GIRO_DE_CONVENIO() != 0){
				String ENTERO_MONTO_DEL_GIRO_DE_CONVENIO = response.getMONTO_DEL_GIRO_DE_CONVENIO().toString().subSequence(0,response.getMONTO_DEL_GIRO_DE_CONVENIO().toString().length()-2 ).toString();
				String DECIMAL_MONTO_DEL_GIRO_DE_CONVENIO = response.getMONTO_DEL_GIRO_DE_CONVENIO().toString().subSequence(response.getMONTO_DEL_GIRO_DE_CONVENIO().toString().length()-2,  response.getMONTO_DEL_GIRO_DE_CONVENIO().toString().length()).toString();
				MONTO_DEL_GIRO_DE_CONVENIO = ENTERO_MONTO_DEL_GIRO_DE_CONVENIO+"."+DECIMAL_MONTO_DEL_GIRO_DE_CONVENIO;
			}else{
				MONTO_DEL_GIRO_DE_CONVENIO = response.getMONTO_DEL_GIRO_DE_CONVENIO().toString();
			}
			CANTIDAD_DE_GIROS_VENCIDOS = response.getCANTIDAD_DE_GIROS_VENCIDOS().toString();
			
			FECHA_DEL_VENCIDO = response.getFECHA_DEL_VENCIDO();
			if(response.getFECHA_DEL_VENCIDO().length() == 8 && !response.getFECHA_DEL_VENCIDO().equalsIgnoreCase("00000000")){
				int ANIO_VENCIDO = Integer.parseInt(response.getFECHA_DEL_VENCIDO().subSequence(0, 4).toString());
				int MES_VENCIDO = Integer.parseInt(response.getFECHA_DEL_VENCIDO().subSequence(4, 6).toString());
				int DIA_VENCIDO = Integer.parseInt(response.getFECHA_DEL_VENCIDO().subSequence(6, 8).toString());
				Calendar calendar_FECHA_DEL_VENCIDO = new GregorianCalendar(ANIO_VENCIDO,MES_VENCIDO-1,DIA_VENCIDO);
				ANIO_FECHA_DEL_VENCIDO = String.valueOf(calendar_FECHA_DEL_VENCIDO.get(Calendar.YEAR));
				MES_FECHA_DEL_VENCIDO = String.valueOf(calendar_FECHA_DEL_VENCIDO.get(Calendar.MONTH)+1);
				DIA_FECHA_DEL_VENCIDO = String.valueOf(calendar_FECHA_DEL_VENCIDO.get(Calendar.DAY_OF_MONTH));
			}else{
				ANIO_FECHA_DEL_VENCIDO = "0";
				MES_FECHA_DEL_VENCIDO = "0";
				DIA_FECHA_DEL_VENCIDO = "0";
			}
			
			INDICADOR_TELEFONO_ACTIVO = response.getINDICADOR_TELEFONO_ACTIVO();
			
			if(response.getFECHA_NOTIFICADOR() != null){
				FECHA_NOTIFICADOR = response.getFECHA_NOTIFICADOR();
				if(response.getFECHA_NOTIFICADOR().length() == 8 && !response.getFECHA_NOTIFICADOR().equalsIgnoreCase("00000000")){
					int ANIO_NOTI = Integer.parseInt(response.getFECHA_NOTIFICADOR().subSequence(0, 4).toString());
					int MES_NOTI = Integer.parseInt(response.getFECHA_NOTIFICADOR().subSequence(4, 6).toString());
					int DIA_NOTI = Integer.parseInt(response.getFECHA_NOTIFICADOR().subSequence(6, 8).toString());
					Calendar calendar_FECHA_NOTIFICADOR = new GregorianCalendar(ANIO_NOTI,MES_NOTI-1,DIA_NOTI);
					ANIO_FECHA_NOTIFICADOR = String.valueOf(calendar_FECHA_NOTIFICADOR.get(Calendar.YEAR));
					MES_FECHA_NOTIFICADOR = String.valueOf(calendar_FECHA_NOTIFICADOR.get(Calendar.MONTH)+1);
					DIA_FECHA_NOTIFICADOR = String.valueOf(calendar_FECHA_NOTIFICADOR.get(Calendar.DAY_OF_MONTH));
				}else{
					ANIO_FECHA_NOTIFICADOR = "0";
					MES_FECHA_NOTIFICADOR = "0";
					DIA_FECHA_NOTIFICADOR = "0";
				}
			}
			
			
			INDICADOR_CORTE_RECONEXION = response.getINDICADOR_CORTE_RECONEXION();
			
			if(response.getCANTIDAD_DE_LLAMADAS() != null){
				CANTIDAD_DE_LLAMADAS = response.getCANTIDAD_DE_LLAMADAS().toString();
			}
			CODIGO_RETORNO = response.getCODIGO_RETORNO().toString();
			INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO = response.getINDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO();
			
			if(response.getMONTO_DEL_LIMITE_DE_CREDITO() != null){
				if(response.getMONTO_DEL_LIMITE_DE_CREDITO() != 0){
					String ENTERO_MONTO_DEL_LIMITE_DE_CREDITO = response.getMONTO_DEL_LIMITE_DE_CREDITO().toString().subSequence(0,response.getMONTO_DEL_LIMITE_DE_CREDITO().toString().length()-2 ).toString();
					String DECIMAL_MONTO_DEL_LIMITE_DE_CREDITO = response.getMONTO_DEL_LIMITE_DE_CREDITO().toString().subSequence(response.getMONTO_DEL_LIMITE_DE_CREDITO().toString().length()-2,  response.getMONTO_DEL_LIMITE_DE_CREDITO().toString().length()).toString();
					MONTO_DEL_LIMITE_DE_CREDITO = ENTERO_MONTO_DEL_LIMITE_DE_CREDITO+"."+DECIMAL_MONTO_DEL_LIMITE_DE_CREDITO;
				}else{
					MONTO_DEL_LIMITE_DE_CREDITO = response.getMONTO_DEL_LIMITE_DE_CREDITO().toString();
				}
			}
			
			
			
			if(response.getMONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO() != null){
				if(response.getMONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO() != 0){
					String ENTERO_MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO = response.getMONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO().toString().subSequence(0,response.getMONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO().toString().length()-2 ).toString();
					String DECIMAL_MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO = response.getMONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO().toString().subSequence(response.getMONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO().toString().length()-2,  response.getMONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO().toString().length()).toString();
					MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO = ENTERO_MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO+"."+DECIMAL_MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO;
				}else{
					MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO = response.getMONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO().toString();
				}
			}
			
			
			
			if(response.getMONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE() != null){
				if(response.getMONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE() != 0){
					String ENTERO_MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE = response.getMONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE().toString().subSequence(0,response.getMONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE().toString().length()-2 ).toString();
					String DECIMAL_MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE = response.getMONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE().toString().subSequence(response.getMONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE().toString().length()-2,  response.getMONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE().toString().length()).toString();
					MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE = ENTERO_MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE+"."+DECIMAL_MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE;
				}else{
					MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE = response.getMONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE().toString();
				}
			}
			
			
			
			
			log.info("CODIGO_DE_AREA: "+CODIGO_DE_AREA);
			log.info("TELEFONO: "+TELEFONO);
			log.info("INDICADOR_TELEFONO_ACTIVO: "+INDICADOR_TELEFONO_ACTIVO);
			log.info("FECHA_DE_LA_DEUDA_1: "+FECHA_DE_LA_DEUDA_1);
			log.info("DIA_FECHA_DE_LA_DEUDA_1: "+DIA_FECHA_DE_LA_DEUDA_1);
			log.info("MES_FECHA_DE_LA_DEUDA_1: "+MES_FECHA_DE_LA_DEUDA_1);
			log.info("ANIO_FECHA_DE_LA_DEUDA_1: "+ANIO_FECHA_DE_LA_DEUDA_1);
			log.info("MONTO_DE_LA_DEUDA_1: "+MONTO_DE_LA_DEUDA_1);
			log.info("FECHA_DE_LA_DEUDA_2: "+FECHA_DE_LA_DEUDA_2);
			log.info("DIA_FECHA_DE_LA_DEUDA_2: "+DIA_FECHA_DE_LA_DEUDA_2);
			log.info("MES_FECHA_DE_LA_DEUDA_2: "+MES_FECHA_DE_LA_DEUDA_2);
			log.info("ANIO_FECHA_DE_LA_DEUDA_2: "+ANIO_FECHA_DE_LA_DEUDA_2);
			log.info("MONTO_DE_LA_DEUDA_2: "+MONTO_DE_LA_DEUDA_2);
			log.info("FECHA_DE_LA_DEUDA_3: "+FECHA_DE_LA_DEUDA_3);
			log.info("DIA_FECHA_DE_LA_DEUDA_3: "+DIA_FECHA_DE_LA_DEUDA_3);
			log.info("MES_FECHA_DE_LA_DEUDA_3: "+MES_FECHA_DE_LA_DEUDA_3);
			log.info("ANIO_FECHA_DE_LA_DEUDA_3: "+ANIO_FECHA_DE_LA_DEUDA_3);
			log.info("MONTO_DE_LA_DEUDA_3: "+MONTO_DE_LA_DEUDA_3);
			log.info("FECHA_DE_LA_DEUDA_4: "+FECHA_DE_LA_DEUDA_4);
			log.info("DIA_FECHA_DE_LA_DEUDA_4: "+DIA_FECHA_DE_LA_DEUDA_4);
			log.info("MES_FECHA_DE_LA_DEUDA_4: "+MES_FECHA_DE_LA_DEUDA_4);
			log.info("ANIO_FECHA_DE_LA_DEUDA_4: "+ANIO_FECHA_DE_LA_DEUDA_4);
			log.info("MONTO_DE_LA_DEUDA_4: "+MONTO_DE_LA_DEUDA_4);
			log.info("DIA_FECHA_DE_LA_DEUDA_5: "+FECHA_DE_LA_DEUDA_5);
			log.info("MES_FECHA_DE_LA_DEUDA_5: "+MES_FECHA_DE_LA_DEUDA_5);
			log.info("ANIO_FECHA_DE_LA_DEUDA_5: "+ANIO_FECHA_DE_LA_DEUDA_5);
			log.info("MONTO_DE_LA_DEUDA_5: "+MONTO_DE_LA_DEUDA_5);
			log.info("FECHA_DE_LA_DEUDA_6: "+FECHA_DE_LA_DEUDA_6);
			log.info("DIA_FECHA_DE_LA_DEUDA_6: "+DIA_FECHA_DE_LA_DEUDA_6);
			log.info("MES_FECHA_DE_LA_DEUDA_6: "+MES_FECHA_DE_LA_DEUDA_6);
			log.info("ANIO_FECHA_DE_LA_DEUDA_6: "+ANIO_FECHA_DE_LA_DEUDA_6);
			log.info("MONTO_DE_LA_DEUDA_6: "+MONTO_DE_LA_DEUDA_6);
			log.info("MONTO_TOTAL_PENDIENTE: "+MONTO_TOTAL_PENDIENTE);
			log.info("NOMBRE_DEL_CLIENTE: "+NOMBRE_DEL_CLIENTE);
			log.info("TIPO_CLIENTE: "+TIPO_CLIENTE);
			log.info("TIPO_SERVICIO: "+TIPO_SERVICIO);
			log.info("FECHA_VENCIMIENTO_DE_FACTURA: "+FECHA_VENCIMIENTO_DE_FACTURA);
			log.info("DIA_FECHA_VENCIMIENTO_DE_FACTURA: "+DIA_FECHA_VENCIMIENTO_DE_FACTURA);
			log.info("MES_FECHA_VENCIMIENTO_DE_FACTURA: "+MES_FECHA_VENCIMIENTO_DE_FACTURA);
			log.info("ANIO_FECHA_VENCIMIENTO_DE_FACTURA: "+ANIO_FECHA_VENCIMIENTO_DE_FACTURA);
			
			log.info("MONTO_MORA_A_30_DIAS: "+MONTO_MORA_A_30_DIAS);
			log.info("FECHA_DE_LA_MORA_A_30_DIAS: "+FECHA_DE_LA_MORA_A_30_DIAS);
			log.info("DIA_FECHA_DE_LA_MORA_A_30_DIAS: "+DIA_FECHA_DE_LA_MORA_A_30_DIAS);
			log.info("MES_FECHA_DE_LA_MORA_A_30_DIAS: "+MES_FECHA_DE_LA_MORA_A_30_DIAS);
			log.info("ANIO_FECHA_DE_LA_MORA_A_30_DIAS: "+ANIO_FECHA_DE_LA_MORA_A_30_DIAS);
			
			log.info("MONTO_MORA_A_60_DIAS: "+MONTO_MORA_A_60_DIAS);
			log.info("FECHA_DE_LA_MORA_A_60_DIAS: "+FECHA_DE_LA_MORA_60_DIAS);
			log.info("DIA_FECHA_DE_LA_MORA_60_DIAS: "+DIA_FECHA_DE_LA_MORA_60_DIAS);
			log.info("MES_FECHA_DE_LA_MORA_60_DIAS: "+MES_FECHA_DE_LA_MORA_60_DIAS);
			log.info("ANIO_FECHA_DE_LA_MORA_60_DIAS: "+ANIO_FECHA_DE_LA_MORA_60_DIAS);
			
			log.info("MONTO_MORA_A_90_DIAS: "+MONTO_MORA_A_90_DIAS);
			log.info("FECHA_DE_LA_MORA_90_DIAS: "+FECHA_DE_LA_MORA_90_DIAS);
			log.info("DIA_FECHA_DE_LA_MORA_90_DIAS: "+DIA_FECHA_DE_LA_MORA_90_DIAS);
			log.info("MES_FECHA_DE_LA_MORA_90_DIAS: "+MES_FECHA_DE_LA_MORA_90_DIAS);
			log.info("ANIO_FECHA_DE_LA_MORA_90_DIAS: "+ANIO_FECHA_DE_LA_MORA_90_DIAS);
			
			log.info("INDICADOR_DE_INFORMACION_CONVENIO: "+INDICADOR_DE_INFORMACION_CONVENIO);
			log.info("NUMERO_DE_CUENTA: "+NUMERO_DE_CUENTA);
			log.info("MONTO_DEL_SALDO_CONVENIO: "+MONTO_DEL_SALDO_CONVENIO);
			log.info("MONTO_DEL_CONVENIO: "+MONTO_DEL_CONVENIO);
			log.info("CANTIDAD_DE_GIROS: "+CANTIDAD_DE_GIROS);
			log.info("MONTO_DEL_GIRO_DE_CONVENIO: "+MONTO_DEL_GIRO_DE_CONVENIO);
			log.info("CANTIDAD_DE_GIROS_VENCIDOS: "+CANTIDAD_DE_GIROS_VENCIDOS);
			
			log.info("FECHA_DEL_VENCIDO: "+FECHA_DEL_VENCIDO);
			log.info("DIA_FECHA_DEL_VENCIDO: "+DIA_FECHA_DEL_VENCIDO);
			log.info("MES_FECHA_DEL_VENCIDO: "+MES_FECHA_DEL_VENCIDO);
			log.info("ANIO_FECHA_DEL_VENCIDO: "+ANIO_FECHA_DEL_VENCIDO);
			
			
			log.info("FECHA_NOTIFICADOR: "+FECHA_NOTIFICADOR);
			log.info("DIA_FECHA_NOTIFICADOR: "+DIA_FECHA_NOTIFICADOR);
			log.info("MES_FECHA_NOTIFICADOR: "+MES_FECHA_NOTIFICADOR);
			log.info("ANIO_FECHA_NOTIFICADOR: "+ANIO_FECHA_NOTIFICADOR);
			
			
			log.info("INDICADOR_CORTE_RECONEXION: "+INDICADOR_CORTE_RECONEXION);
			log.info("CANTIDAD_DE_LLAMADAS: "+CANTIDAD_DE_LLAMADAS);
			log.info("CODIGO_RETORNO: "+CODIGO_RETORNO);
			log.info("INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO: "+INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO);
			log.info("MONTO_DEL_LIMITE_DE_CREDITO: "+MONTO_DEL_LIMITE_DE_CREDITO);
			log.info("MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO: "+MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO);
			log.info("MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE"+MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE);
			
			
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (ApplicationException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

	/***
	 * Numero 04
	 * 
	 * consultarOrdenIVR
	 * @param idOrden
	 * @param codigoDeArea
	 * @param numDestino
	 * @return
	 */
//	public void consultarOrdenIVR(String idOrden, String codigoDeArea,String numDestino) {
//		try {
//			ConsultarOrdenIVRRP responseIVR = null;
//			AP719ConsultarOrdenIVRProxy proxyIVR = new AP719ConsultarOrdenIVRProxy();
//			ConsultarOrdenIVRRQ requestIVR = new ConsultarOrdenIVRRQ();
//			if (idOrden == null) {
//				log.info("Sin numero de orden");
//				requestIVR.setNumeroTelefono(codigoDeArea + numDestino);
//			} else {
//				log.info("Con numero de orden");
//				requestIVR.setIDOrden(idOrden);
//			}
//			responseIVR = proxyIVR.consultarOrdenIVR(requestIVR);
//			if (responseIVR != null) {
//				CEDULA_ASAP = responseIVR.getCedula_asap();
//				CODIGO_ASAP = responseIVR.getCodigo_asap();
//				CODIGO_BOSS = responseIVR.getCodigo_boss().toString();
//				DESCRIPCION_ASAP = responseIVR.getDescripcion_asap();
//				DESCRIPCION_BOSS = responseIVR.getDescripcion_boss();
//				
//				if(responseIVR.getFecha_orden() != null){
//					FECHA_ORDEN = responseIVR.getFecha_orden();
//					if(responseIVR.getFecha_orden().length() == 10){
//						int DIA_ORDEN = Integer.parseInt(responseIVR.getFecha_orden().subSequence(0, 2).toString());
//						int MES_ORDEN = Integer.parseInt(responseIVR.getFecha_orden().subSequence(3, 5).toString());
//						int ANIO_ORDEN = Integer.parseInt(responseIVR.getFecha_orden().subSequence(6, 10).toString());
//						Calendar calendar_FECHA_ORDEN = new GregorianCalendar(ANIO_ORDEN,MES_ORDEN-1,DIA_ORDEN);
//						ANIO_FECHA_ORDEN = String.valueOf(calendar_FECHA_ORDEN.get(Calendar.YEAR));
//						MES_FECHA_ORDEN = String.valueOf(calendar_FECHA_ORDEN.get(Calendar.MONTH)+1);
//						DIA_FECHA_ORDEN = String.valueOf(calendar_FECHA_ORDEN.get(Calendar.DAY_OF_MONTH));
//					}else{
//						ANIO_FECHA_ORDEN = "0";
//						MES_FECHA_ORDEN = "0";
//						DIA_FECHA_ORDEN = "0";
//					}
//				}
//				NUMERO_TELEFONO = responseIVR.getNumeroTelefono();
//				ORDEN_ASAP = responseIVR.getOrden_asap();
//				ORDEN_BOSS = responseIVR.getOrden_boss();
//				STATUS_ORDEN = responseIVR.getStatus_orden().toString();
//				STATUS_ORDEN_ASAP = responseIVR.getStatus_orden_asap();
//				VALIDEZ_ORDEN = responseIVR.getValidez_orden().toString();
//				
//				log.info("CEDULA_ASAP: "+ CEDULA_ASAP);
//				log.info("CODIGO_ASAP: "+ CODIGO_ASAP);
//				log.info("CODIGO_BOSS: "+ CODIGO_BOSS);
//				log.info("DESCRIPCION_ASAP: "+DESCRIPCION_ASAP);
//				log.info("DESCRIPCION_BOSS: "+DESCRIPCION_BOSS);
//				log.info("FECHA_ORDEN: "+FECHA_ORDEN);
//				log.info("DIA_FECHA_ORDEN: "+DIA_FECHA_ORDEN);
//				log.info("MES_FECHA_ORDEN: "+MES_FECHA_ORDEN);
//				log.info("ANIO_FECHA_ORDEN: "+ANIO_FECHA_ORDEN);
//				log.info("NUMERO_TELEFONO: "+NUMERO_TELEFONO);
//				log.info("ORDEN_ASAP: "+ORDEN_ASAP);
//				log.info("ORDEN_BOSS: "+ORDEN_BOSS);
//				log.info("STATUS_ORDEN: "+STATUS_ORDEN);
//				log.info("STATUS_ORDEN_ASAP: "+STATUS_ORDEN_ASAP);
//				log.info("VALIDEZ_ORDEN: "+VALIDEZ_ORDEN);
//				
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
//	}

	/***
	 * Numero 05
	 * 
	 * estatusDeInternet
	 * @param codigoDeArea
	 * @param numDestino
	 * @return
	 */
	public boolean consultarOrdenIVR(String codigoDeArea, String numDestino) {
		// 2.- Consulta orden IVR - Verifico que estatus tiene la orden si el
		// estatus es igual 399/400 retorno el idorden sino retorno el status de
		// la orden
		try {
			ConsultarOrdenIVRRP responseIVR = null;
			AP719ConsultarOrdenIVRProxy proxyIVR = new AP719ConsultarOrdenIVRProxy();
			ConsultarOrdenIVRRQ requestIVR = new ConsultarOrdenIVRRQ();
			requestIVR.setNumeroTelefono(codigoDeArea+numDestino);
			responseIVR = proxyIVR.consultarOrdenIVR(requestIVR);
			
			if (responseIVR != null) {
				CEDULA_ASAP = responseIVR.getCedula_asap();
				CODIGO_ASAP = responseIVR.getCodigo_asap();
				CODIGO_BOSS = responseIVR.getCodigo_boss().toString();
				DESCRIPCION_ASAP = responseIVR.getDescripcion_asap();
				DESCRIPCION_BOSS = responseIVR.getDescripcion_boss();
				FECHA_ORDEN = responseIVR.getFecha_orden();
				NUMERO_TELEFONO = responseIVR.getNumeroTelefono();
				ORDEN_ASAP = responseIVR.getOrden_asap();
				ORDEN_BOSS = responseIVR.getOrden_boss();
				STATUS_ORDEN = responseIVR.getStatus_orden().toString();
				STATUS_ORDEN_ASAP = responseIVR.getStatus_orden_asap();
				VALIDEZ_ORDEN = responseIVR.getValidez_orden().toString();
				
				if(responseIVR.getFecha_orden() != null && responseIVR.getFecha_orden().length() == 10){
					//se parsea la fecha reporte de string a entero con substring
					int DIA_CREADO = Integer.parseInt(responseIVR.getFecha_orden().subSequence(0, 2).toString());
					int MES_CREADO = Integer.parseInt(responseIVR.getFecha_orden().subSequence(3, 5).toString());
					int ANIO_CREADO = Integer.parseInt(responseIVR.getFecha_orden().subSequence(6, 10).toString());
					log.info( DIA_CREADO+" "+MES_CREADO+" "+ANIO_CREADO);
					//Se crea los dos calendarios para la operacion
					Calendar calendar_CREADO = Calendar.getInstance();
					Calendar calendar_CREADO2 = Calendar.getInstance();
					
					calendar_CREADO.set(ANIO_CREADO,MES_CREADO-1,DIA_CREADO);//Se crea el calendario del reporte
					calendar_CREADO2.setTimeInMillis(System.currentTimeMillis());//Se crea calendario con la fecha actual 
					
					long fechaReporte = calendar_CREADO.getTimeInMillis();//Se pasa a milisegundos
					long fechaActual = calendar_CREADO2.getTimeInMillis();//Se pasa a milisegundos
					long diferHora =  fechaActual - fechaReporte;//Se hace la operacion del dia actual menos la fecha del reporte
					long fechaHora = TimeUnit.MILLISECONDS.toHours(diferHora);
					
					if(fechaHora < 360 ){
						TIEMPO_MAYOR_360 = "N";
						log.info("LAS TIEMPO ES: "+fechaHora+" MINUTOS / MENOR A 360");
					}
					if(fechaHora > 360 ){
						TIEMPO_MAYOR_360 = "Y";
						log.info("LAS TIEMPO ES: "+fechaHora+" MINUTOS / MAYOR A 360");
					}
					
				}
				
				
				log.info("CEDULA_ASAP: "+ CEDULA_ASAP);
				log.info("CODIGO_ASAP: "+ CODIGO_ASAP);
				log.info("CODIGO_BOSS: "+ CODIGO_BOSS);
				log.info("DESCRIPCION_ASAP: "+DESCRIPCION_ASAP);
				log.info("DESCRIPCION_BOSS: "+DESCRIPCION_BOSS);
				log.info("FECHA_ORDEN: "+FECHA_ORDEN);
				log.info("DIA_FECHA_ORDEN: "+DIA_FECHA_ORDEN);
				log.info("MES_FECHA_ORDEN: "+MES_FECHA_ORDEN);
				log.info("ANIO_FECHA_ORDEN: "+ANIO_FECHA_ORDEN);
				log.info("NUMERO_TELEFONO: "+NUMERO_TELEFONO);
				log.info("ORDEN_ASAP: "+ORDEN_ASAP);
				log.info("ORDEN_BOSS: "+ORDEN_BOSS);
				log.info("STATUS_ORDEN: "+STATUS_ORDEN);
				log.info("STATUS_ORDEN_ASAP: "+STATUS_ORDEN_ASAP);
				log.info("VALIDEZ_ORDEN: "+VALIDEZ_ORDEN);
			}

		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	/***
	 * Numero 06
	 * obtenerHistoriaTelefonoIntegracion
	 * @param codigoDeArea
	 * @param numDestino
	 * @return
	 */
	public void obtenerHistoriaTelefonoIntegracion(String codigoDeArea, String numDestino,String aplicativo, String usuario) {
		try {
			com.cantv.sacas.integracion.obtenerHistoriaTelefono.xsd.CbObtenerHistoriaTelefonoRP[] resp = null;
			CbObtenerHistoriaTelefonoRP responseSacas = null;
			CwsObtenerHistoriaTelefonoIntegracionPortTypeProxy proxySacas = new CwsObtenerHistoriaTelefonoIntegracionPortTypeProxy();
			CbObtenerHistoriaTelefonoRQ requestSacas = new CbObtenerHistoriaTelefonoRQ();
			requestSacas.setTelefono(codigoDeArea + numDestino);
			requestSacas.setAplicativo(aplicativo);
			requestSacas.setUsuario(usuario);
			resp = proxySacas.obtenerHistoriaTelefono(requestSacas);
			
			
			
			CODIGO_ERROR = resp[resp.length-1].getCodigoError();
			ESTATUS = resp[resp.length-1].getEstatus();
			FECHA_CANCELACION = resp[resp.length-1].getFechaCancelacion();
			FECHA_REPORTE = resp[resp.length-1].getFechaReporte();
			HORA_CANCELACION = resp[resp.length-1].getHoraCancelacion();
			HORA_REPORTE = resp[resp.length-1].getHoraReporte();
			MENSAJE_ERROR = resp[resp.length-1].getMensajeError();
			NUMERO_INCIDENTE = resp[resp.length-1].getNumeroIncidente();
			TIPO_SERVICIO = resp[resp.length-1].getTipoServicio();
			
			
			
			if(resp[0].getFechaReporte() != null && resp[resp.length-1].getFechaReporte().length() == 8){
				//se parsea la fecha reporte de string a entero con substring
				int DIA_FECHA_REPORTE = Integer.parseInt(resp[resp.length-1].getFechaReporte().subSequence(0, 2).toString());
				int MES_FECHA_REPORTE = Integer.parseInt(resp[resp.length-1].getFechaReporte().subSequence(2, 4).toString());
				int ANIO_FECHA_REPORTE = Integer.parseInt(resp[resp.length-1].getFechaReporte().subSequence(4, 8).toString());
				//Se crea los dos calendarios para la operacion
				Calendar calendar_FECHA_REPORTE = Calendar.getInstance();
				Calendar calendar_FECHA_ACTUAL = Calendar.getInstance();
				
				calendar_FECHA_REPORTE.set(ANIO_FECHA_REPORTE,MES_FECHA_REPORTE-1,DIA_FECHA_REPORTE);//Se crea el calendario del reporte
				calendar_FECHA_ACTUAL.setTimeInMillis(System.currentTimeMillis());//Se crea calendario con la fecha actual 
				
				long fechaReporte = calendar_FECHA_REPORTE.getTimeInMillis();//Se pasa a milisegundos
				long fechaActual = calendar_FECHA_ACTUAL.getTimeInMillis();//Se pasa a milisegundos
				long diferHora =  fechaActual - fechaReporte;//Se hace la operacion del dia actual menos la fecha del reporte
				long fechaHora = TimeUnit.MILLISECONDS.toHours(diferHora);
				
				if(fechaHora < 72 ){
					TIEMPO_MAYOR_72 = "N";
					log.info("LAS TIEMPO ES: "+fechaHora+" MINUTOS / MENOR A 72");
				}
				if(fechaHora > 72 ){
					TIEMPO_MAYOR_72 = "Y";
					log.info("LAS TIEMPO ES: "+fechaHora+" MINUTOS / MAYOR A 72");
				}
				
			}
			
			log.info("CODIGO_ERROR: "+CODIGO_ERROR);
			log.info("ESTATUS: "+ESTATUS);
			log.info("FECHA_CANCELACION: "+FECHA_CANCELACION);
			log.info("FECHA_REPORTE: "+FECHA_REPORTE);
			log.info("HORA_CANCELACION: "+HORA_CANCELACION);
			log.info("HORA_REPORTE: "+HORA_REPORTE);
			log.info("MENSAJE_ERROR: "+MENSAJE_ERROR);
			log.info("NUMERO_INCIDENTE: "+NUMERO_INCIDENTE);
			log.info("TIPO_SERVICIO: "+TIPO_SERVICIO);
			log.info("TIEMPO_MAYOR_72: "+TIEMPO_MAYOR_72);
			
		} catch (ApplicationException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	/***
	 * Numero 07
	 * consultarClienteBOSS
	 * @param IdCliente
	 * @return
	 */
	public void consultarClienteBOSS(String IdCliente) {
		// numero de cedula o rif
		// 1.- Consultar Cliente BOSS - Consulto si existe o no
		try {
			ConsultarClienteRP responseCliente = null;
			CU683ConsultarClienteBOSSProxy proxyCliente = new CU683ConsultarClienteBOSSProxy();
			ConsultarClienteRQ requestCliente = new ConsultarClienteRQ();
			if (!IdCliente.equalsIgnoreCase("0")) {
				requestCliente.setIDCliente(IdCliente);
				//requestCliente.setNumeroTelefono(IdCliente);
				responseCliente = proxyCliente.consultarCliente(requestCliente);
				
				APELLIDO = responseCliente.getApellido();
				ASAPDATA = responseCliente.getAsapcata();
				CATAS = responseCliente.getCatas();
				CLTTYPE = responseCliente.getClttype();
				ERROR = responseCliente.getError();
				FECORTE = responseCliente.getFeccorte();
				FECPAGO = responseCliente.getFecpago();
				LOGIN = responseCliente.getLogin();
				MARSKPLAN = responseCliente.getMaskplan();
				MASKSTATUS = responseCliente.getMaskstatus();
				MTOPAGO = responseCliente.getMtopago();
				N_ERROR = responseCliente.getN_error().toString();
				NOMBRE = responseCliente.getNombre();
				NOMBRE_JURIDICO = responseCliente.getNombreJuridico();
				PAYMEDIA = responseCliente.getPaymedia();
				PLAN = responseCliente.getPlan();
				STATUS = responseCliente.getStatus();
				STATUSREASON  = responseCliente.getStatusreason();
				TIPO = responseCliente.getTipo();
				TOTALBALANCE = responseCliente.getTotalbalance();
				
				
				log.info("APELLIDO: "+APELLIDO);
				log.info("ASAPDATA: "+ASAPDATA);
				log.info("CATAS: "+CATAS);
				log.info("CLTTYPE: "+CLTTYPE);
				log.info("ERROR: "+ERROR);
				log.info("FECORTE: "+FECORTE);
				log.info("FECPAGO: "+FECPAGO);
				log.info("LOGIN: "+LOGIN);
				log.info("MARSKPLAN: "+MARSKPLAN);
				log.info("MASKSTATUS: "+MASKSTATUS);
				log.info("MTOPAGO: "+MTOPAGO);
				log.info("N_ERROR: "+N_ERROR);
				log.info("NOMBRE: "+NOMBRE);
				log.info("NOMBRE_JURIDICO: "+NOMBRE_JURIDICO);
				log.info("PAYMEDIA: "+PAYMEDIA);
				log.info("PLAN: "+PLAN);
				log.info("STATUS: "+STATUS);
				log.info("STATUSREASON: "+STATUSREASON);
				log.info("TIPO: "+TIPO);
				log.info("TOTALBALANCE: "+TOTALBALANCE);
				
			}
		}catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	/***
	 * Numero 08
	 * consultaCasoRemedy
	 * @param numeroCedula
	 * @param cod_area
	 * @param num_telf
	 * @return
	 */
	
	public void consultaCasoRemedy(String numeroCedula, String cod_area, String num_telf){
		ConsultarCasoRemedyRQ requestRemedy = new ConsultarCasoRemedyRQ();
		ConsultarCasoRemedyRP responseRemedy = null;
		GI114ConsultarCasoRemedyProxy proxyRemedy = new GI114ConsultarCasoRemedyProxy();

		if(numeroCedula != null){
			requestRemedy.setCedula(numeroCedula);
		}else{
			requestRemedy.setNumeroTelefono(cod_area+num_telf);
		}
		
		try {
			responseRemedy = proxyRemedy.consultarCaso(requestRemedy);
			
			CASO = responseRemedy.getCaso();
			CATEGORIA = responseRemedy.getCategoria();
			CREADO = responseRemedy.getCreado();
			DESCRIPCION = responseRemedy.getDesctripcion();
			ERROR = responseRemedy.getError();
			ESTADO = responseRemedy.getEstado();
			REGISTROS = responseRemedy.getRegistros().toString();
			RESULTADO = responseRemedy.getResultado();
			
			if(responseRemedy.getCreado() != null && responseRemedy.getCreado().length() == 19){
				//se parsea la fecha reporte de string a entero con substring
				int DIA_CREADO = Integer.parseInt(responseRemedy.getCreado().subSequence(0, 2).toString());
				int MES_CREADO = Integer.parseInt(responseRemedy.getCreado().subSequence(3, 5).toString());
				int ANIO_CREADO = Integer.parseInt(responseRemedy.getCreado().subSequence(6, 10).toString());
				int HORA_CREADO = Integer.parseInt(responseRemedy.getCreado().subSequence(11, 13).toString());
				int MINUTO_CREADO = Integer.parseInt(responseRemedy.getCreado().subSequence(14, 16).toString());
				log.info("HOLAAA: "+DIA_CREADO+" "+MES_CREADO+" "+ANIO_CREADO+" "+HORA_CREADO+" "+MINUTO_CREADO);
				//Se crea los dos calendarios para la operacion
				Calendar calendar_CREADO = Calendar.getInstance();
				Calendar calendar_CREADO2 = Calendar.getInstance();
				
				calendar_CREADO.set(ANIO_CREADO,MES_CREADO-1,DIA_CREADO,HORA_CREADO,MINUTO_CREADO);//Se crea el calendario del reporte
				calendar_CREADO2.setTimeInMillis(System.currentTimeMillis());//Se crea calendario con la fecha actual 
				
				long fechaReporte = calendar_CREADO.getTimeInMillis();//Se pasa a milisegundos
				long fechaActual = calendar_CREADO2.getTimeInMillis();//Se pasa a milisegundos
				long diferHora =  fechaActual - fechaReporte;//Se hace la operacion del dia actual menos la fecha del reporte
				long fechaHora = TimeUnit.MILLISECONDS.toHours(diferHora);
				
				if(fechaHora < 72 ){
					TIEMPO_MAYOR_72 = "N";
					log.info("LAS TIEMPO ES: "+fechaHora+" MINUTOS / MENOR A 72");
				}
				if(fechaHora > 72 ){
					TIEMPO_MAYOR_72 = "Y";
					log.info("LAS TIEMPO ES: "+fechaHora+" MINUTOS / MAYOR A 72");
				}
				
			}
			
			log.info("CASO: "+CASO);
			log.info("CATEGORIA: "+CATEGORIA);
			log.info("CREADO: "+CREADO);
			log.info("DESCRIPCION: "+DESCRIPCION);
			log.info("ERROR: "+ERROR);
			log.info("ESTADO: "+ESTADO);
			log.info("REGISTROS: "+REGISTROS);
			log.info("RESULTADO: "+RESULTADO);
			log.info("TIEMPO_MAYOR_72: "+TIEMPO_MAYOR_72);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
	

	/***
	 * Numero 09
	 * tvsatConsultarCuentaGeneral
	 * @param numeroSerial
	 * @return
	 */
	public void tvsatConsultarCuentaGeneral(String numeroSerial) {
		ConsultaTarjetaRP responseTVSAT = null;
		TVSAT006ConsultarCuentaGeneralProxy proxyTVSAT = new TVSAT006ConsultarCuentaGeneralProxy();
		//ConsultaContratosRQ requestTVSAT = new ConsultaContratosRQ();
		ConsultaTarjetaRQ requestTVSAT = new ConsultaTarjetaRQ();
		requestTVSAT.setSerialTarjeta(numeroSerial);
		requestTVSAT.setIDCLIENTEPIC("?");
		
		
		try {
			responseTVSAT = proxyTVSAT.consultarCuentasTarjeta(requestTVSAT);
			
			if(responseTVSAT != null){
				CuentaContratoTo[] cuenta = new CuentaContratoTo[1];
				cuenta = responseTVSAT.getCuentaContrato();
				BalanceTo balances =  new BalanceTo();
				AgenteTo agente = new AgenteTo();
				ClienteTo cliente = new ClienteTo();
				ModeloTo  modelo = new ModeloTo();
				CargoPeriodicoTo cargoPeriodico = new CargoPeriodicoTo();
				PlanTo plan = new PlanTo();
				PromocionTo promocion = new PromocionTo();
				LocalidadTo localidad = new LocalidadTo();
				DireccionTo direccion = new DireccionTo();
				NacionalidadTo nacionalidad = new NacionalidadTo();
				PersonaContactoTo personaContacto = new PersonaContactoTo();
				ProfesionTo profesion = new ProfesionTo();
				for (CuentaContratoTo cuentaContratoTo : cuenta) {
					SERIAL_DECODIFICADOR = cuentaContratoTo.getSerialDecodificador();
					ESTATUS = cuentaContratoTo.getEstatus();
					modelo =  cuentaContratoTo.getModelo();
					if( cuentaContratoTo.getFechaCreacion() != null){
						FECHA_CREACION = cuentaContratoTo.getFechaCreacion().toString();
					}else{
						FECHA_CREACION = "00000000";
					}
					
					if(cuentaContratoTo.getCargoPeriodico() != null){
						cargoPeriodico = cuentaContratoTo.getCargoPeriodico();
					}
					SERIAL_TARJETA_ACCESO = cuentaContratoTo.getSerialTarjetaAcceso();
					
					if(cuentaContratoTo.getFechaFinProgramacion() != null){
						FECHA_FIN_PROGRAMACION = cuentaContratoTo.getFechaFinProgramacion().toString();
					}else{
						FECHA_FIN_PROGRAMACION = "00000000";
					}
					
					if(cuentaContratoTo.getFechaExpiracion() != null){
						FECHA_EXPIRACION = cuentaContratoTo.getFechaExpiracion().toString();
					}else{
						FECHA_EXPIRACION = "00000000";
					}
					cliente = cuentaContratoTo.getCliente();
					CLIENTE_CARGO = cliente.getCargo();
					CLIENTE_CORREO_ELECTRONICO = cliente.getCorreoElectronico();
					direccion = cliente.getDireccion();
					CLIENTE_DOCUMENTO_ID = cliente.getDocumentoId();
					CLIENTE_EXTENSION_OFICINA = cliente.getExtensionOficina();
					
					
					if(cliente.getFechaIngresoEmpresa() != null){
						CLIENTE_FECHA_INGRESO_EMPRESA = cliente.getFechaIngresoEmpresa().toString();
					}else{
						CLIENTE_FECHA_INGRESO_EMPRESA = "00000000";
					}
					
					
					if(cliente.getFechaNacimiento() != null){
						CLIENTE_FECHA_NACIMIENTO = cliente.getFechaNacimiento().toString();
					}else{
						CLIENTE_FECHA_NACIMIENTO = "00000000";
					}
					CLIENTE_GENERO = cliente.getGenero();
					nacionalidad = cliente.getNacionalidad();
					CLIENTE_NOMBRE_EMPRESA = cliente.getNombreEmpresa();
					personaContacto = cliente.getPersonaContacto();
					CLIENTE_PRIMER_APELLIDO = cliente.getPrimerApellido();
					CLIENTE_PRIMER_NOMBRE = cliente.getPrimerNombre();
					profesion = cliente.getProfesion();
					CLIENTE_SEGUNDO_APELLIDO = cliente.getSegundoApellido();
					CLIENTE_SEGUNDO_NOMBRE = cliente.getSegundoNombre();
					CLIENTE_TELEFONO_HABITACION = cliente.getTelefonoHabitacion();
					CLIENTE_TELEFONO_OFICINA = cliente.getTelefonoOficina();
					CLIENTE_TIPO_CLIENTE = cliente.getTipoCliente();
					CLIENTE_TIPO_DOCUMENTO = cliente.getTipoDocumento();
					CLIENTE_TITULO = cliente.getTitulo();
					
					plan = cuentaContratoTo.getPlan();
					promocion = cuentaContratoTo.getPromocion();
					CODIGO_MONEDA = cuentaContratoTo.getCodigoMoneda();
					
					if(cuentaContratoTo.getFechaActivacion() != null){
						FECHA_ACTIVACION = cuentaContratoTo.getFechaActivacion().toString();
					}else{
						FECHA_ACTIVACION = "00000000";
					}
					ID = cuentaContratoTo.getId();
					NUMERO = cuentaContratoTo.getNumero();
					
					if(cuentaContratoTo.getSaldo() != 0){
						String ENTERO_SALDO = String.valueOf(cuentaContratoTo.getSaldo()).subSequence(0,String.valueOf(cuentaContratoTo.getSaldo()).length()-2 ).toString();
						String DECIMAL_SALDO = String.valueOf(cuentaContratoTo.getSaldo()).subSequence(String.valueOf(cuentaContratoTo.getSaldo()).length()-2,  String.valueOf(cuentaContratoTo.getSaldo()).length()).toString();
						SALDO = ENTERO_SALDO+"."+DECIMAL_SALDO;
					}else{
						SALDO = String.valueOf(cuentaContratoTo.getSaldo());
					}
					PROVEEDOR_SERVICIO = cuentaContratoTo.getProveedorServicio();
					ESTATUS_ANTERIOR = cuentaContratoTo.getEstatusAnterior();
					
					//AGENTE
					agente = cuentaContratoTo.getAgente();
					
					LENGUAJE = cuentaContratoTo.getLenguaje();
					TECNOLOGIA = cuentaContratoTo.getTecnologia();
					localidad = cuentaContratoTo.getLocalidad();
				}
				ERROR_CODE = responseTVSAT.getErrorCode();
				ERROR_MESSAGE = responseTVSAT.getErrorMessage();
				
			}
			
			log.info("SERIAL_DECODIFICADOR: "+SERIAL_DECODIFICADOR);
			log.info("ESTATUS: "+ESTATUS);
			log.info("FECHA_CREACION: "+FECHA_CREACION);
			log.info("SERIAL_TARJETA_ACCESO: "+SERIAL_TARJETA_ACCESO);
			log.info("FECHA_FIN_PROGRAMACION: "+FECHA_FIN_PROGRAMACION);
			log.info("FECHA_EXPIRACION: "+FECHA_EXPIRACION);
			log.info("CLIENTE_CARGO: "+CLIENTE_CARGO);
			log.info("CLIENTE_CORREO_ELECTRONICO: "+CLIENTE_CORREO_ELECTRONICO);
			log.info("CLIENTE_DOCUMENTO_ID: "+CLIENTE_DOCUMENTO_ID);
			log.info("CLIENTE_EXTENSION_OFICINA: "+CLIENTE_EXTENSION_OFICINA);
			log.info("CLIENTE_FECHA_INGRESO_EMPRESA: "+CLIENTE_FECHA_INGRESO_EMPRESA);
			log.info("CLIENTE_FECHA_NACIMIENTO: "+CLIENTE_FECHA_NACIMIENTO);
			log.info("CLIENTE_GENERO: "+CLIENTE_GENERO);
			log.info("CLIENTE_NOMBRE_EMPRESA: "+CLIENTE_NOMBRE_EMPRESA);
			log.info("CLIENTE_PRIMER_APELLIDO: "+CLIENTE_PRIMER_APELLIDO);
			log.info("CLIENTE_PRIMER_NOMBRE: "+CLIENTE_PRIMER_NOMBRE);
			log.info("CLIENTE_SEGUNDO_APELLIDO: "+CLIENTE_SEGUNDO_APELLIDO);
			log.info("CLIENTE_SEGUNDO_NOMBRE: "+CLIENTE_SEGUNDO_NOMBRE);
			log.info("CLIENTE_TELEFONO_HABITACION: "+CLIENTE_TELEFONO_HABITACION);
			log.info("CLIENTE_TELEFONO_OFICINA: "+CLIENTE_TELEFONO_OFICINA);
			log.info("CLIENTE_TIPO_CLIENTE: "+CLIENTE_TIPO_CLIENTE);
			log.info("CLIENTE_TIPO_DOCUMENTO: "+CLIENTE_TIPO_DOCUMENTO);
			log.info("CODIGO_MONEDA: "+CODIGO_MONEDA);
			log.info("FECHA_ACTIVACION: "+FECHA_ACTIVACION);
			log.info("ID: "+ID);
			log.info("NUMERO: "+NUMERO);
			log.info("SALDO: "+SALDO);
			log.info("PROVEEDOR_SERVICIO: "+PROVEEDOR_SERVICIO);
			log.info("ESTATUS_ANTERIOR: "+ESTATUS_ANTERIOR);
			log.info("LENGUAJE: "+LENGUAJE);
			log.info("TECNOLOGIA: "+TECNOLOGIA);
			log.info("ERROR_CODE: "+ERROR_CODE);
			log.info("ERROR_MESSAGE: "+ERROR_MESSAGE);

		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	private static boolean validateCustomerIPTV(java.lang.String idAccount, ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv.TelephoneLine telephoneLine) throws ValidateCustomerIPTVFault_Exception {
        ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv.ValidateCustomerIPTV_Service service = new ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv.ValidateCustomerIPTV_Service();
        ve.com.cantv.iptv.bss.webservice.validatecustomeriptv.validatecustomeriptv.ValidateCustomerIPTV port = service.getValidateCustomerIPTVSOAP();
        return port.validateCustomerIPTV(idAccount, telephoneLine);
    }
	
	/***
	 * Numero 10
	 * consultarIPTV
	 * @param codigoArea
	 * @param numDestino
	 * @return
	 */
	public boolean consultarIPTV(String cod_area, String numTelf){
//		ConsultarServicioPorTlfIPTVRP responseIPTV_Telf = null;
//		LP511ConsultarServicioIPTVProxy proxyIPTV = new LP511ConsultarServicioIPTVProxy();
//		
//		try {
//			//response2 = proxyIPTV.consultarServicio(request2);
//			responseIPTV_Telf = proxyIPTV.consultarServicioPorTlf(new ConsultarServicioPorTlfIPTVRQ(cod_area, "", numTelf));
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		responseIPTV_Telf.getAvenue();
//		responseIPTV_Telf.getBetweenThat();
//		responseIPTV_Telf.getBetweenThis();
//		responseIPTV_Telf.getCedula();
//		responseIPTV_Telf.getCreateDate();
//		responseIPTV_Telf.getCuentaFacturable();
//		responseIPTV_Telf.getDireccion();
//		responseIPTV_Telf.getErrorCode();
//		responseIPTV_Telf.getErrorDescription();
//		responseIPTV_Telf.getIdAccount();
//		responseIPTV_Telf.getIdAccountContract();
//		responseIPTV_Telf.getIdAccountIPTV();
//		responseIPTV_Telf.getIdAddress();
//		responseIPTV_Telf.getIdSubscriber();
//		responseIPTV_Telf.getName();
//		responseIPTV_Telf.getNationality();
//		responseIPTV_Telf.getParishUrbanization();
//		responseIPTV_Telf.getPhone();
//		responseIPTV_Telf.getPlace();
//		responseIPTV_Telf.getPlant();
//		responseIPTV_Telf.getReference();
//		responseIPTV_Telf.getResidence();
//		responseIPTV_Telf.getStatus();
//		
//		log.info(responseIPTV_Telf.getAvenue());
//		log.info(responseIPTV_Telf.getBetweenThat());
//		log.info(responseIPTV_Telf.getBetweenThis());
//		log.info(responseIPTV_Telf.getCedula());
//		log.info(responseIPTV_Telf.getCreateDate());
//		log.info(responseIPTV_Telf.getCuentaFacturable());
//		log.info(responseIPTV_Telf.getDireccion());
//		log.info(responseIPTV_Telf.getErrorCode());
//		log.info(responseIPTV_Telf.getErrorDescription());
//		log.info(responseIPTV_Telf.getIdAccount());
//		log.info(responseIPTV_Telf.getIdAccountContract());
//		log.info(responseIPTV_Telf.getIdAccountIPTV());
//		log.info(responseIPTV_Telf.getIdAddress());
//		log.info(responseIPTV_Telf.getIdSubscriber());
//		log.info(responseIPTV_Telf.getName());
//		log.info(responseIPTV_Telf.getNationality());
//		log.info(responseIPTV_Telf.getParishUrbanization());
//		log.info(responseIPTV_Telf.getPhone());
//		log.info(responseIPTV_Telf.getPlace());
//		log.info(responseIPTV_Telf.getPlant());
//		log.info(responseIPTV_Telf.getReference());
//		log.info(responseIPTV_Telf.getResidence());
//		log.info(responseIPTV_Telf.getStatus());
		
		
		
		
		ValidateCustomerIPTV_Service service = new ValidateCustomerIPTV_Service();
	    ValidateCustomerIPTV port = service.getValidateCustomerIPTVSOAP();
	        
        TelephoneLine telefono = new TelephoneLine();
        telefono.setCodeArea(Long.valueOf(cod_area));
        telefono.setPhoneNumber(Long.valueOf(numTelf));
        telefono.setBillingAccountKenan("");
        try {
			log.info(port.validateCustomerIPTV("", telefono));
			if(port.validateCustomerIPTV("", telefono)){
				log.info("EXISTE");
				return true;
			}else{
				log.info("NO EXISTE");
				return false;
			}
		} catch (ValidateCustomerIPTVFault_Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}

	
	/**
	 * Obtener Saldo Cuenta
	 */
	public void obtenerSaldoCuenta(String codigoArea, String telefono){
		Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse response = null;
		F2V5_NAP_Asc_obtenerSaldoCuenta_RP responseSaldo = null;
        Serviciof2V5_NAP_Asc_obtenerSaldoCuentaProxy proxy = new Serviciof2V5_NAP_Asc_obtenerSaldoCuentaProxy();
        F2V5_NAP_Asc_obtenerSaldoCuenta_RQ request = new F2V5_NAP_Asc_obtenerSaldoCuenta_RQ();
		request.setAplicacion("NAP");
		request.setCodigoArea(codigoArea);
		request.setTelefono(telefono);
		Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element element = new Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element(request);
		
		try {
			response = proxy.serviciof2V5_NAP_Asc_obtenerSaldoCuenta(element);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		responseSaldo = response.getF2V5_NAP_ASC_OBTENERSALDOCUENTA_RP();
		
		
		SALDO_ACTUAL = responseSaldo.getSaldoActual().toString();
		SALDO_VENCIDO = responseSaldo.getSaldoVencido().toString();
		CODIGO_DE_AREA = responseSaldo.getCuentas().getCodigoArea();
		TELEFONO = responseSaldo.getCuentas().getTelefono();
		
		if(responseSaldo.getCuentas().getFechaUltimaFacturacion() != null){
			FECHA_ULTIMA_FACTURACION = responseSaldo.getCuentas().getFechaUltimaFacturacion();
			if(responseSaldo.getCuentas().getFechaUltimaFacturacion().length() == 8 && !responseSaldo.getCuentas().getFechaUltimaFacturacion().equalsIgnoreCase("00000000")){
				int ANIO_NOTI = Integer.parseInt(responseSaldo.getCuentas().getFechaUltimaFacturacion().subSequence(0, 4).toString());
				int MES_NOTI = Integer.parseInt(responseSaldo.getCuentas().getFechaUltimaFacturacion().subSequence(4, 6).toString());
				int DIA_NOTI = Integer.parseInt(responseSaldo.getCuentas().getFechaUltimaFacturacion().subSequence(6, 8).toString());
				Calendar calendar_FECHA_ULTIMA_FACTURACION = new GregorianCalendar(ANIO_NOTI,MES_NOTI-1,DIA_NOTI);
				ANIO_FECHA_ULTIMA_FACTURACION = String.valueOf(calendar_FECHA_ULTIMA_FACTURACION.get(Calendar.YEAR));
				MES_FECHA_ULTIMA_FACTURACION = String.valueOf(calendar_FECHA_ULTIMA_FACTURACION.get(Calendar.MONTH)+1);
				DIA_FECHA_ULTIMA_FACTURACION = String.valueOf(calendar_FECHA_ULTIMA_FACTURACION.get(Calendar.DAY_OF_MONTH));
			}else{
				ANIO_FECHA_ULTIMA_FACTURACION = "0";
				MES_FECHA_ULTIMA_FACTURACION = "0";
				DIA_FECHA_ULTIMA_FACTURACION = "0";
			}
		}
		
		log.info("SALDO_ACTUAL: "+SALDO_ACTUAL);
		log.info("SALDO_VENCIDO: "+SALDO_VENCIDO);
		log.info("CODIGO_DE_AREA: "+CODIGO_DE_AREA);
		log.info("TELEFONO: "+TELEFONO);
		log.info("FECHA_ULTIMA_FACTURACION: "+FECHA_ULTIMA_FACTURACION);
		log.info("ANIO_FECHA_ULTIMA_FACTURACION: "+ANIO_FECHA_ULTIMA_FACTURACION);
		log.info("MES_FECHA_ULTIMA_FACTURACION: "+MES_FECHA_ULTIMA_FACTURACION);
		log.info("DIA_FECHA_ULTIMA_FACTURACION: "+DIA_FECHA_ULTIMA_FACTURACION);
	}
	
	
	public static void main(String[] args) {
		ConsultNumber consul = new ConsultNumber();
		
		consul.obtenerTipoTarifa("212","3920031");
		consul.obtenerMovimientos("212","3920031");
		consul.estatusDeLinea("998032175100", null, null);
		consul.consultarOrdenIVRProxy("212","8589468");
		consul.consultaDeInternet("12826978");
		consul.consultarClienteBOSS("4810551");
		consul.tvsatConsultarCuentaGeneral("8120202752537456");
		consul.consultaCasoRemedy("12826978", null, null);
		consul.consultaCasoRemedy(null, "242", "3644401");
		consul.consultarIPTV("212", "7515026");
		consul.consultarOrdenIVR("251", "2685666");
		consul.obtenerHistoriaTelefonoIntegracion("212","3552899", "Integracion", "_intmpsanp");
		consul.obtenerSaldoCuenta("212", "7935164");
	}

}
