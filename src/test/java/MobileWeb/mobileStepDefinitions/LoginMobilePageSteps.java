package MobileWeb.mobileStepDefinitions;

import MobileWeb.pages.LoginMobilePage;
import Util.ConfigReader;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginMobilePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginMobilePage loginPageMobile = new LoginMobilePage(driver);

    @Given("User is on mobile loginpage")
    public void userIsOnLoginpageMobile() {
        loginPageMobile.navigateToLoginPageMobile(ConfigReader.getProperties().getProperty("login.page"));
    }

    @Then("User should see enter username on mobile web")
    public void userShouldSeeUsernameMobile() {
        loginPageMobile.usernameVisibilityMobile();
    }

    @When("User enters correct username and password on mobile web")
    public void userEntersCorrectUsernameAndPasswordMobile() {
        String username = ConfigReader.getProperties().getProperty("login.username");
        String password = ConfigReader.getProperties().getProperty("login.password");
        loginPageMobile.loginCredentialsMobile(username,password);
    }

    @When("User writes wrong Username and Password on mobile web")
    public void userWritesWrongUsernameAndPasswordMobile() {
        loginPageMobile.writeWrongUsernameAndPasswordMobile("abcd","123456");
    }

    @When("User click login button on mobile web")
    public void userClickLoginButtonMobile() {
        loginPageMobile.clickLoginButtonMobile();
    }

    @Then("User should see check invalid credentials message about login on mobile web")
    public void checkInvalidCredentialsMessageMobile() {loginPageMobile.checkInvalidCredentialsMessageMobile();}
}
