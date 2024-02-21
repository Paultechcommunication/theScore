package ApplicationBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import TestUtilities.CommonUtil;
import io.appium.java_client.android.*;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ApplicationBase {

	public static AndroidDriver driver;
	public static  WebDriverWait wait;
	public static Logger logger = Logger.getLogger(ApplicationBase.class);
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	
	public static void loadConfigurations() {
		CommonUtil.loadAppConfiguration("Capabilities.properties");
		PropertyConfigurator.configure("src/test/resources/Properties/log4j.properties");
		logger.info("App Configurations Loaded");
		CommonUtil.setDriverCapabilities();
		logger.info("Driver Capabilities Loaded");
		driver = CommonUtil.getDriver();
		logger.info("Driver initiated");
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		System.out.println(logger!=null);
		
	
	}
	

	public void loadPageElements() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
}
