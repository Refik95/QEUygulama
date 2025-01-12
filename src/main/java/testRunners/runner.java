package testRunners;
import Util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

@CucumberOptions(
        features = {"src/test/java/Web/features"},
        glue = {"Web.webStepDefinitions","Util"},
        tags = "",
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "html:target/cucumber-reports.html"
        }
)
public class runner extends AbstractTestNGCucumberTests {
    static WebDriver driver = DriverFactory.getDriver();
}