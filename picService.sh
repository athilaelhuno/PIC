#javier riveros
#Start and Stop pic services


case $1 in

"start" )
	echo "starting Pic Services"
	#/var/lib/jvm/jdk1.6.0_45/bin/java -cp lib/log4j-1.2.17.jar:lib/asterisk-java-1.0.0.M3.jar:lib/apache-log4j-extras-1.2.17.jar:lib/axis.jar:lib/axis-ant.jar:lib/axis-jaxrpc-1.3-sources.jar:lib/commons-discovery-0.2.jar:lib/commons-logging-1.0.4.jar:lib/javax.wsdl_1.6.2.v201012040545.jar:lib/jaxb-api-2.2.jar:lib/jaxrpc.jar:lib/jaxws-api.jar:lib/mail.jar:lib/org.apache.commons.logging-1.1.1.v201101211721.jar:lib/saaj.jar:lib/wsdl4j-1.5.1.jar:fastagi-mapping.properties:. org.asteriskjava.fastagi.DefaultAgiServer > /tcantv/logs/pic/pic-zte.log 2>&1 &
	/var/lib/jvm/jdk1.6.0_45/bin/java -cp lib/log4j-1.2.17.jar:lib/asterisk-java-1.0.0.M3.jar:lib/apache-log4j-extras-1.2.17.jar:lib/axis.jar:lib/jaxrpc.jar:lib/commons-logging-1.0.4.jar:lib/commons-discovery-0.2.jar:lib/javax.wsdl_1.6.2.v201012040545.jar:. org.asteriskjava.fastagi.DefaultAgiServer > null 2>&1 &
	
;;
"stop" )
	echo "Stoping Pic Services"
	for i in `ps aux | grep DefaultAgiServer | grep -v grep | awk '{print $2}'`; do kill -9  $i; done
;;

esac



