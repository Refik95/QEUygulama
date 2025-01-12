package testRunners;
import Util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

@CucumberOptions(
        features = {"src/test/java/Web/features","src/test/java/MobileWeb/features"},
        glue = {"Web.webStepDefinitions","Util","MobileWeb.mobileStepDefinitions"},
        tags = "",
        plugin = {
                "summary","pretty","html:Reports/CucumberReport/Reports.html"
        }
)
public class runner extends AbstractTestNGCucumberTests {
    static WebDriver driver = DriverFactory.getDriver();
}