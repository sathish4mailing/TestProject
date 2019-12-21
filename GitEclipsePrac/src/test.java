import java.util.logging.Logger;

public class test {

	private static Logger logger = null;
	
	public static void main(String[] args) {
		
		logger = Logger.getLogger(test.class.getName());
		logger.info("Helloooo World..");
		logger.info("Working Fine....");
	}

}
