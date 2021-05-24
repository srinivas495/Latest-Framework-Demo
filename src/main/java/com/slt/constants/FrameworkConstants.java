package com.slt.constants;

public final class FrameworkConstants {

	private FrameworkConstants() {

	}

	private static final String RESOURCERPATH = System.getProperty("user.dir")+"/src/test/resources";
	private static final String CHROMEDRIVERPATH = RESOURCERPATH + "/exectables/chromedriver.exe";
	private static final String CONFIGRPATH = RESOURCERPATH + "/config/config.properties";


	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}


	public static String getConfigrPath() {
		return CONFIGRPATH;
	}
}
