import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/exercise1/HomePage.feature", glue="steps")
public class RunTest extends AbstractTestNGCucumberTests{
	
}
