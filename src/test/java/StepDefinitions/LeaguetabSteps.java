package StepDefinitions;



import org.apache.log4j.Logger;



import ApplicationBase.ApplicationBase;
import Home.HomeScreen;
import Home.LeaguesScreen;
import Home.NBALeadersScreen;
import Home.NBALeaguesScreen;
import Home.NFLLeadersScreen;
import Home.NFLLeaguesScreen;
import Home.NHLLeadersScreen;
import Home.NHLLeaguesScreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LeaguetabSteps extends ApplicationBase {
	
	public static HomeScreen homeScreen;
	public static LeaguesScreen leaguesScreen;
	public static Logger logger = Logger.getLogger(ApplicationBase.class);
	public NFLLeaguesScreen nflLeaguesScreen;
	public NHLLeaguesScreen nhlLeaguesScreen;
	public NBALeaguesScreen nbaLeaguesScreen;
	public NFLLeadersScreen nflLeadersScreen;
	public NHLLeadersScreen nhlLeadersScreen;
	public NBALeadersScreen nbaLeadersScreen;
	
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		
		logger.info("Test Setup Started");
		homeScreen = new HomeScreen ();
		logger.info("Home Screen loaded");
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("User Click League menu")
	public void user_click_league_menu() {
		try {
			leaguesScreen = homeScreen.NavigateLeagues();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Navigated to Leagues screen");
	    
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("User is Navigated to Leagues Page")
	public void user_is_navigated_to_leagues_page() {
		
		try {
			homeScreen.VerifyLeagueScreen();
			logger.info("Verified Leagues screen");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	@When("User Clicks on the {string}")
	public void user_clicks_on_the(String string) {
		switch(string) 
		{
		case "NFL" :
			try {
				nflLeaguesScreen = leaguesScreen.NavigateNFLLeagues();
				logger.info("Navigated to the NFLLeaguesScreen");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}break;
			
			
		case "NHL" :
			try {
				nhlLeaguesScreen = leaguesScreen.NavigateNHLLeagues();
				logger.info("Navigated to the NHLLeaguesScreen");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "NBA" :
			try {
				nbaLeaguesScreen = leaguesScreen.NavigateNBALeagues();
				logger.info("Navigated to the NBALeaguesScreen");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		default:
			logger.info("Team Not Available");
			break;
		
		}
	
	}
	@Then("User is Navigating to the {string} page")
	public void user_is_navigating_to_the_page(String string) {
		switch(string) 
		{
		case "NFL" :
			try {
				leaguesScreen.VerifyNFLLeaguesScreen();
				logger.info("Verified  NFLLeaguesScreen");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}break;
			
			
		case "NHL" :
			try {
				leaguesScreen.VerifyNHLLeaguesScreen();
					logger.info("Verified  NHLLeaguesScreen");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "NBA" :
			try {
				leaguesScreen.VerifyNBALeaguesScreen();
					logger.info("Verified  NBALeaguesScreen");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		default:
			logger.info("Team Not Available");
			break;
		
		}
	 
	}
	
	@When("User Click on {string}")
	public void user_click_on(String string) {
		switch(string) 
		{
		case "NFLLeader":
		{

			try {
				nflLeadersScreen = nflLeaguesScreen .NavigateLeadersscreen();
				logger.info("Navigated to the NFLLeadersScreen");
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		break;
		
	    case "NHLLeader":
	      {
	   try {
		nhlLeadersScreen = nhlLeaguesScreen .NavigateLeadersscreen();
		logger.info("Navigated to the NFLLeadersScreen");
	      } 
	   catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
     	}
	    } break;  
	
	 case "NBALeader":
		{
		try {
			nbaLeadersScreen = nbaLeaguesScreen .NavigateLeadersscreen();
			logger.info("Navigated to the NFLLeadersScreen");
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} break;
			
		default:
			logger.info("Tab Not Available");
			break;
			}
		
	}
	
	
	@Then("User is Navigating to the {string}")
	public void user_is_navigating_to_the(String string) {
		switch(string) 
		{
		case "NFLLeader":
		{

			try {
				nflLeaguesScreen .VerifyNFLLeaderScreen();
				logger.info("Navigated to the NFLLeadersScreen");
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		break;
		
	    case "NHLLeader":
	      {
	   try {
		nhlLeaguesScreen .VerifyNHLLeaderScreen();
		logger.info("Navigated to the NFLLeadersScreen");
	      } 
	   catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
     	}
	    } break;  
	
	 case "NBALeader":
		{
		try {
			nbaLeaguesScreen .VerifyNBALeaderScreen();
			logger.info("Navigated to the NFLLeadersScreen");
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} break;
			
		default:
			logger.info("Tab Not Available");
			break;
	}
	}
	
	@When("User Click BackButton on {string}")
	public void user_click_back_button_on(String string) {
		switch(string) 
		{
		case "NFLLeader":
		{

			try {
				leaguesScreen = nflLeadersScreen.BackNavigation();
				logger.info("Navigated Back to the Leaguescreen");
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		break;
		
	    case "NHLLeader":
	      {
	   try {
			leaguesScreen = nhlLeadersScreen.BackNavigation();
			logger.info("Navigated Back to the Leaguescreen");
	      } 
	   catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
     	}
	    } break;  
	
	 case "NBALeader":
		{
		try {
			leaguesScreen = nbaLeadersScreen.BackNavigation();
			logger.info("Navigated Back to the Leaguescreen");
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} break;
			
		default:
			logger.info("Back button Not Available");
			break;
			}
		
	}
	
	@Then("User is Navigated Back")
	public void user_is_navigated_back() {
		try {
			homeScreen.VerifyLeagueScreen();
			logger.info("Verified Leagues screen");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
