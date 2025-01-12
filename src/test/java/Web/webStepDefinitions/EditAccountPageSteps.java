package Web.webStepDefinitions;

import Util.DriverFactory;
import Web.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class EditAccountPageSteps {

    WebDriver driver = DriverFactory.getDriver();
    EditAccountPage editAccountPage = new EditAccountPage(driver);

    @Then("User should see Edit account title")
    public void userShouldSeeEditAccountTitle() {
        editAccountPage.checkEditAccountVisibility();
    }

    @When("User updates account name with {string}")
    public void userUpdatesAccountName(String accountName) {
        editAccountPage.accountName(accountName);
    }

    @When("User clicks update button")
    public void userClicksUpdateButton() {
        editAccountPage.updateAccountButton();
    }
}
