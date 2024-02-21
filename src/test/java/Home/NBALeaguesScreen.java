package Home;


import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ApplicationBase.ApplicationBase;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NBALeaguesScreen extends ApplicationBase{
	
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"LEADERS\"]")
	public WebElement leaderstab;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"NBA\"]")
	public  WebElement nbaleague_title;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"LEADER\"]")
	public List<WebElement> leaders;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public WebElement backnav;
	
	

	public NBALeaguesScreen() {
		loadPageElements();
	}

	 



	public NBALeadersScreen NavigateLeadersscreen() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(leaderstab));
		leaderstab.click();
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOfAllElements(leaders));
		//assertTrue(nbaleague_title.isDisplayed());
		//extentTest.info("NBA Leaders page opens successfully");
		//Thread.sleep(2000);
		return new NBALeadersScreen();
	}
	
   public void VerifyNBALeaderScreen () throws InterruptedException {
		
	 wait.until(ExpectedConditions.visibilityOfAllElements(leaders));
	 assertTrue(nbaleague_title.isDisplayed());
	 //extentTest.info("NBA Leaders page opens successfully");
	 Thread.sleep(2000);
		
	}
}
