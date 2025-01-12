package Web.webStepDefinitions;

import Util.ConfigReader;
import Web.pages.LoginPage;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

   @Given("User is on loginpage")
   public void userIsOnLoginpage() {
        loginPage.navigateToLoginPage(ConfigReader.getProperties().getProperty("login.page"));
    }

    @Then("User should see enter username")
    public void userShouldSeeUsername() {
        loginPage.usernameVisibility();
    }

    @When("User enters correct username and password")
    public void userEntersCorrectUsernameAndPassword() {
        String username = ConfigReader.getProperties().getProperty("login.username");
        String password = ConfigReader.getProperties().getProperty("login.password");
        loginPage.loginCredentials(username,password);
    }

    @When("User writes wrong Username and Password")
    public void userWritesWrongUsernameAndPassword() {
        loginPage.loginCredentials("abcd","123456");
    }

    @When("User click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("User should see check invalid credentials message about login")
    public void checkInvalidCredentialsMessage() {loginPage.checkInvalidCredentialsMessage();}


}
