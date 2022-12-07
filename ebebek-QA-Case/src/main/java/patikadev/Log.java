package patikadev;

import org.apache.logging.log4j.*;


public class Log {


	static Logger logger = LogManager.getLogger(Log.class);


	public void info(String message) {

		logger.info(message);

	}

	public void warn(String message) {

		logger.warn(message);

	}

	public void error(String message) {

		logger.error(message);

	}

}
