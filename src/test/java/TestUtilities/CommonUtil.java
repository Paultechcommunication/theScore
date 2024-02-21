package TestUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import ApplicationBase.ApplicationBase;
import io.appium.java_client.android.*;



public class CommonUtil extends ApplicationBase {

	private static AndroidDriver driver;
	private static URL serverUrl;
	private static DesiredCapabilities driverCapabilities = new DesiredCapabilities();
	private static String APPIUM_SERVER_PORT;
	private static String PLATFORM_VERSION;
	private static String PLATFORM_NAME;
	private static String DEVICE_NAME;
	private static String AUTOMATION_NAME;
	private static Properties properties = new Properties();
	private static FileInputStream fileInputStream;



	
	public static void loadAppConfiguration(String loadPropertyFile) {

		try {
			fileInputStream = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/Properties/" + loadPropertyFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		PLATFORM_NAME = properties.getProperty("platform.name");
		PLATFORM_VERSION = properties.getProperty("platform.version");
		DEVICE_NAME = properties.getProperty("device.name");
		APPIUM_SERVER_PORT = properties.getProperty("appium.server.port");
		AUTOMATION_NAME = properties.getProperty("automation.name");

	}
	
	



	public static void setDriverCapabilities() {

		driverCapabilities.setCapability("platformName", PLATFORM_NAME);
		driverCapabilities.setCapability("platformVersion", PLATFORM_VERSION);
		driverCapabilities.setCapability("deviceName", DEVICE_NAME);
		driverCapabilities.setCapability("automationName", AUTOMATION_NAME);


	}



	public static AndroidDriver getDriver() {

		try {
			serverUrl = new URL("http://127.0.0.1:" + APPIUM_SERVER_PORT + "/");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new AndroidDriver(serverUrl, driverCapabilities);
		return driver;

	}



}
