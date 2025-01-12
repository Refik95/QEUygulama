package MobileWeb.mobileStepDefinitions;

import MobileWeb.pages.AddMoneyMobilePage;
import MobileWeb.pages.LoginMobilePage;
import MobileWeb.pages.MyAccountMobilePage;
import MobileWeb.pages.OpenAccountMobilePage;
import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AddMoneyMobilePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    AddMoneyMobilePage addMoneyPageMobile = new AddMoneyMobilePage(driver);

    @When("User should see Add money page title on Mobile Web")
    public void userShouldSeeAddMoneyPageTitleMobile() throws InterruptedException {
        Thread.sleep(1000);
        addMoneyPageMobile.checkAddMoneyVisibilityMobile();
    }

    @Then("User should see Add money title on Mobile Web")
    public void userShouldSeeAddMoneyTitleMobile() {
        addMoneyPageMobile.checkAddMoneyVisibilityMobile();
    }

    @When("User enters {string} to card number field on Mobile Web")
    public void userEntersCardNumberMobile(String cardNumberField) {
        addMoneyPageMobile.cardNumberMobile(cardNumberField);
    }

    @When("User enters {string} to card holder field on Mobile Web")
    public void userEntersCardHolderMobile(String cardHolderField) {
        addMoneyPageMobile.cardHolderMobile(cardHolderField);
    }

    @When("User enters {string} to expiry date field on Mobile Web")
    public void userEntersExpiryDateMobile(String expiryDateField) {
        addMoneyPageMobile.expiryDateMobile(expiryDateField);
    }

    @When("User enter {string} to cvv field on Mobile Web")
    public void userEntersCvvMobile(String cvvField) {
        addMoneyPageMobile.cvvMobile(cvvField);
    }

    @When("User enters money amount to add {string} on Mobile Web")
    public void userEntersMoneyAmountToAddMobile(String moneyAmount) {addMoneyPageMobile.setAddMoneyAmountMobile(moneyAmount);}

    @When("User clicks add button on Mobile Web")
    public void userClicksAddButtonMobile() {
        addMoneyPageMobile.clickAddButtonMobile();
    }

    @Then("User should see required text on Mobile Web")
    public void userShouldSeeRequiredTextMobile() throws InterruptedException {
        addMoneyPageMobile.checkAddMoneyVisibilityMobile();
    }
}
