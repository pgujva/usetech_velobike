import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/",plugin = {"pretty","html:build/cucumber-report"})
public class MenuTests extends AbstractTestNGCucumberTests {

}
