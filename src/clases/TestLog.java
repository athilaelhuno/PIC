package clases;

import org.apache.log4j.Logger;
import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiException;
import org.asteriskjava.fastagi.AgiRequest;
import org.asteriskjava.fastagi.BaseAgiScript;

public class TestLog  extends BaseAgiScript{
	static Logger log = Logger.getLogger("debugLogger");
	
	
	public void service(AgiRequest request, AgiChannel arg1) throws AgiException {
		
	}
	
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
