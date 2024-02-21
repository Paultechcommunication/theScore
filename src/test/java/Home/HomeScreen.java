package Home;




import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ApplicationBase.ApplicationBase;
import io.appium.java_client.pagefactory.AndroidFindBy;



public class HomeScreen extends ApplicationBase{
	
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/navigation_bar_item_icon_view\"])[5]")
	public WebElement leagues_menu;


	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Leagues\"]")
	public WebElement leagues_title;
	
	

	public HomeScreen() {
		loadPageElements();
	}

	


	public LeaguesScreen NavigateLeagues() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(leagues_menu));
		leagues_menu.click();
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOf(leagues_title));
		//Thread.sleep(2000);
		return new LeaguesScreen();
	}
	
	   public void VerifyLeagueScreen () throws InterruptedException {
			
		   wait.until(ExpectedConditions.visibilityOf(leagues_title));
			Thread.sleep(2000);
				
			}



	
}
