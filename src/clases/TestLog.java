package clases;

import org.apache.log4j.Logger;

public class TestLog {
	static Logger log = Logger.getLogger("debugLogger");
	
	
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
