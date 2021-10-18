package com.facebook.utils;

public class Constants {

	public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";

	public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver";
	
	public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir") + "/src/test/resources/configs/configs.properties";

	public static final String REPORT_FILEPATH = System.getProperty("user.dir") + "/target/html-report/HRMS.html";

	public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir") + "/screenshot/";

	public static final int IMPLICIT_WAIT_TIME = 15;
	
	public static final int EXPLICIT_WAIT_TIME = 30;
	
	
}
