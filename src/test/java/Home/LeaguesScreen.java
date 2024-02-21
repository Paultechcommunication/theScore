package Home;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ApplicationBase.ApplicationBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
public class LeaguesScreen extends ApplicationBase{
	
	

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/league_name_text\" and @text=\"NFL\"]")
	public WebElement nflleague;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/league_name_text\" and @text=\"NHL\"]")
	public WebElement nhlleague;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/league_name_text\" and @text=\"NBA\"]")
	public WebElement nbaleague;


	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/titleTextView\" and @text=\"NFL\"]")
	public WebElement nflleague_title;
	

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/titleTextView\" and @text=\"NHL\"]")
	public WebElement nhlleague_title;
	

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/titleTextView\" and @text=\"NBA\"]")
	public WebElement nbaleague_title;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/titleTextView\" and @text=\"jjj\"]")
	public WebElement test;

	

	public LeaguesScreen() {
		loadPageElements();
	}
	

	
	public NFLLeaguesScreen NavigateNFLLeagues () throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(nflleague));
		nflleague.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(nflleague_title));
		assertTrue(nflleague_title.isDisplayed());
		logger.info("NFL Page opens successfully");
		Thread.sleep(2000);
		return new NFLLeaguesScreen();
	}
	 
	
	public NHLLeaguesScreen NavigateNHLLeagues () throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(nhlleague));
		nhlleague.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(nhlleague_title));
		assertTrue(nhlleague_title.isDisplayed());
		Thread.sleep(2000);
		return new NHLLeaguesScreen();
	}

	public NBALeaguesScreen NavigateNBALeagues () throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(nbaleague));
		nbaleague.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(nbaleague_title));
		assertTrue(nbaleague_title.isDisplayed());
		//extentTest.info("NBA Page opens successfully");
		logger.info("NBA Page opens successfully");
		Thread.sleep(2000);
		return new NBALeaguesScreen();
	}
	
	   public void VerifyNFLLeaguesScreen () throws InterruptedException {
			
			wait.until(ExpectedConditions.visibilityOf(nflleague_title));
			assertTrue(nflleague_title.isDisplayed());
			logger.info("NFL Page opens successfully");
			Thread.sleep(2000);
			
		}
	   
	   public void VerifyNBALeaguesScreen () throws InterruptedException {
			
			wait.until(ExpectedConditions.visibilityOf(nbaleague_title));
			assertTrue(nbaleague_title.isDisplayed());
			//extentTest.info("NBA Page opens successfully");
			logger.info("NBA Page opens successfully");
			Thread.sleep(2000);
			
		}
	   
	   public void VerifyNHLLeaguesScreen () throws InterruptedException {
			
			wait.until(ExpectedConditions.visibilityOf(nhlleague_title));
			assertTrue(nhlleague_title.isDisplayed());
			logger.info("NHL Page opens successfully");
			Thread.sleep(2000);
			
		}
}
