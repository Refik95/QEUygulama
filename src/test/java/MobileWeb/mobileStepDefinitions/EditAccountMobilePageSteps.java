package MobileWeb.mobileStepDefinitions;

import MobileWeb.pages.EditAccountMobilePage;
import MobileWeb.pages.LoginMobilePage;
import MobileWeb.pages.MyAccountMobilePage;
import MobileWeb.pages.OpenAccountMobilePage;
import Util.ConfigReader;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class EditAccountMobilePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    EditAccountMobilePage editAccountPageMobile = new EditAccountMobilePage(driver);

    @Then("User should see Edit account title on mobile web")
    public void userShouldSeeEditAccountTitleMobile() {
        editAccountPageMobile.checkEditAccountVisibilityMobile();
    }

    @When("User updates account name on mobile web")
    public void userUpdatesAccountNameMobile() {
        editAccountPageMobile.accountNameMobile("Refik Test");
    }

    @When("User clicks update button on mobile web")
    public void userClicksUpdateButtonMobile() {
        editAccountPageMobile.updateAccountButtonMobile();
    }
}
