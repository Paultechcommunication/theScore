package AppHooks;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ApplicationBase.ApplicationBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks extends ApplicationBase{

	
	private static final String HelperClass = null;

	@Before(order=0)
	public void initSuit() {
		loadConfigurations();

	}
	

	
	@After
	public void teardown(Scenario scenario) {
		
		 if (scenario.isFailed()) {
		            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		            scenario.attach(screenshot, "image/png", scenario.getName()); 
		        
		 }
		   driver.quit();
	}
	
	

	
	
}
