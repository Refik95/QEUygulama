package MobileWeb.mobileStepDefinitions;

import MobileWeb.pages.OpenAccountMobilePage;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class OpenAccountMobilePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    OpenAccountMobilePage openAccountePageMobile = new OpenAccountMobilePage(driver);


    @Given("User is on Account Page on mobile web")
    public void userIsOnAccountPage() {
        openAccountePageMobile.openAccountMobile();
    }

    @Then("User should see challenge name on mobile web")
    public void userShouldChallengeName() {
        openAccountePageMobile.checkCallengeVisibilityMobile();
    }

    @When("User clicks open money transfer button on mobile web")
    public void userClicksOpenMoneyTransferButton() {
        openAccountePageMobile.openAccountMobile();
    }
}
