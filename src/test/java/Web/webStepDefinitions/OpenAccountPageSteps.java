package Web.webStepDefinitions;

import Util.DriverFactory;
import Web.pages.OpenAccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class OpenAccountPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    OpenAccountPage openAccountPage = new OpenAccountPage(driver);

    @Then("User should see challenge name")
    public void userShouldChallengeName() {
        openAccountPage.checkChallengeVisibility();
    }

    @When("User clicks open money transfer button")
    public void userClicksOpenMoneyTransferButton() {
        openAccountPage.openAccountButton();
    }

}
