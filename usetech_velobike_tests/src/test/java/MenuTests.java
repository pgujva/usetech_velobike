import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/",plugin = {"pretty","html:build/cucumber-report","json:target/cucumber.json"})
public class MenuTests extends AbstractTestNGCucumberTests {

}
