package com.qa.sel.utilities;

import org.apache.log4j.Logger;

public class Log {


	public static Logger Log = Logger.getLogger(Log.class.getName());
	
	public static void startTestCase(String sTestCaseName){		  
		 Log.info("====================================="+sTestCaseName+" TEST START=========================================");
		 }
	
	public static void endTestCase(String sTestCaseName){
		Log.info("====================================="+sTestCaseName+" TEST END=========================================");
		 }
	
	 public static void info(String message) {

			Log.info(message);

			}

	 public static void warn(String message) {

	    Log.warn(message);

		}

	 public static void error(String message) {

	    Log.error(message);

		}

	 public static void fatal(String message) {

	    Log.fatal(message);

		}

	 public static void debug(String message) {

	    Log.debug(message);

		}
	


}
