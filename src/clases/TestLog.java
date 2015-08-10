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


public class TestLog  extends BaseAgiScript{
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
	
	
	
	
	
	private void logear(){
		for (int i = 0; i < 20; i++) {
			log.info("ESTOY LOGEANDO!!!!!!    "+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		TestLog test = new TestLog();
		test.logear();
			
	}

}
