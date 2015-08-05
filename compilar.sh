#!/bin/bash
cd /var/lib/asterisk/agi-bin/ZTE-PIC
echo "Compilando canonicoconsultarordenivr"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/canonicoconsultarordenivr/*.java
echo "Compilando muleconsultarordenivr"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/muleconsultarordenivr/*.java
echo "Compilando cantv/arquitectura/asc/contratos/exceptions"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/cantv/arquitectura/asc/contratos/exceptions/*.java
echo "Compilando obtenerMovimientosCent"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/obtenerMovimientosCent/*.java
echo "Compilando Serviciof2v5_NAP_Asc_obtenerSaldoCuenta/jul2003/ibse/iwaysoftware"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/Serviciof2v5_NAP_Asc_obtenerSaldoCuenta/jul2003/ibse/iwaysoftware/*.java
echo "Compilando ve/com/cantv/iptv/bss/webservice/validatecustomeriptv/validatecustomeriptv"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/ve/com/cantv/iptv/bss/webservice/validatecustomeriptv/validatecustomeriptv/*.java
echo "Compilando com/cantv/sacas/integracion/obtenerHistoriaTelefono/xsd"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/com/cantv/sacas/integracion/obtenerHistoriaTelefono/xsd/*.java
echo "Compilando com/cantv/sacas/integracion/obtenerHistoriaTelefono"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/com/cantv/sacas/integracion/obtenerHistoriaTelefono/*.java
echo "Compilando UtilsClass"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/UtilsClass/*.java
echo "Compilando consultarcliente"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/consultarcliente/*.java
echo "Compilando ve/com/movilnet/tvsat/dominio"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/ve/com/movilnet/tvsat/dominio/*.java
echo "Compilando ClasesUtilMovilnet"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/ClasesUtilMovilnet/*.java
echo "Compilando MuleConsultarCasoRemedy"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/MuleConsultarCasoRemedy/*.java
echo "Compilando MuleConsultarCuentaGeneralMovilnet"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/MuleConsultarCuentaGeneralMovilnet/*.java
echo "Compilando response/Serviciof2v5_NAP_Asc_obtenerSaldoCuenta/jul2003/ibse/iwaysoftware"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/response/Serviciof2v5_NAP_Asc_obtenerSaldoCuenta/jul2003/ibse/iwaysoftware/*.java
echo "Compilando NAP_Asc_obtenerSaldoCuenta"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/NAP_Asc_obtenerSaldoCuenta/*.java
echo "Compilando ObtenerTipoTarifa_pkg"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/ObtenerTipoTarifa_pkg/*.java
echo "Compilando Serviciof2v5_NAP_Asc_obtenerSaldoCuenta/jul2003/ibse/iwaysoftware"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/Serviciof2v5_NAP_Asc_obtenerSaldoCuenta/jul2003/ibse/iwaysoftware/*.java
echo "Compilando cantv/arquitectura/asc/contratos/exceptions"
javac -cp lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/cantv/arquitectura/asc/contratos/exceptions/*.java
echo "Compilando clases"
javac -cp lib/log4j-1.2.17.jar:lib/apache-log4j-extras-1.2.17.jar:lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/jaxrpc.jar:lib/wsdl4j-1.5.1.jar:lib/axis-ant.jar:lib/commons-discovery-0.2.jar:lib/saaj.jar:lib/asterisk-java-1.0.0.M3.jar:. -d . src/clases/*.java
