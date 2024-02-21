package Home;




import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class NHLLeadersScreen extends HomeScreen {
	
	
	

	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"NHL\"]")
	public  WebElement nhlleague_title;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"LEADER\"]")
	public List<WebElement> leaders;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public WebElement backnav;
	

	
	

	

	public NHLLeadersScreen() {
		loadPageElements();
	}

	 
	public LeaguesScreen BackNavigation() throws InterruptedException {
		
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(backnav));
			backnav.click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(leagues_title));
		
				
	
		return new LeaguesScreen();
	
	}



}
