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

    @Then("User should see Add money title on mobile web")
    public void userShouldSeeAddMoneyTitleMobile() {
        addMoneyPageMobile.checkAddMoneyVisibilityMobile();
    }

    @When("User enters card number on mobile web")
    public void userEntersCardNumberMobile() {
        addMoneyPageMobile.cardNumberMobile("1234 1234 1234 1234 1234");
    }

    @When("User enters card holder on mobile web")
    public void userEntersCardHolderMobile() {
        addMoneyPageMobile.cardHolderMobile("Refik Erkan Gunhan");
    }

    @When("User enters expiry date on mobile web")
    public void userEntersExpiryDatMobile() {
        addMoneyPageMobile.expiryDateMobile("1026");
    }

    @When("User enter cvv on mobile web")
    public void userEntersCvvMobile() {
        addMoneyPageMobile.cvvMobile("110");
    }

    @When("User enters money amount to add on mobile web")
    public void userEntersMoneyAmountToAddMobile() {addMoneyPageMobile.setAddMoneyAmountMobile("1000");}

    @When("User clicks add button on mobile web")
    public void userClicksAddButtonMobile() {
        addMoneyPageMobile.clickAddButtonMobile();
    }
}
