package MyRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class MyRunner {
	
	
@CucumberOptions(tags = "", features = {"src/test/resources/Features"}, 
                                glue = {"StepDefinitions","AppHooks"},
                                plugin = {"pretty","html:src/test/resources/Reports/Report.html"})




public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}

}
