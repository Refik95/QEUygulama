package MobileWeb.mobileStepDefinitions;

import MobileWeb.pages.LoginMobilePage;
import MobileWeb.pages.MyAccountMobilePage;
import MobileWeb.pages.OpenAccountMobilePage;
import Util.ConfigReader;
import Util.DriverFactory;
import Web.pages.MyAccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MyAccountMobilePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    MyAccountMobilePage myAccountPageMobile = new MyAccountMobilePage(driver);


    @Then("User is on mobileweb myAccountPage")
    public void userIsOnMyAccountPageMobile() {
        MyAccountPage.HomePage();
    }

    @Then("User should see My account page text on mobile web")
    public void userShouldSeeMyAccountPageTextMobile() {
        myAccountPageMobile.checkMyaccountTextVisibilityMobile();
    }

    @When("User clikcs transfer money on mobile web")
    public void userClikcsTransferMoneyMobile() {
        myAccountPageMobile.moneyTransferMobile();
    }

    @When("User clikcs add money on mobile web")
    public void userClikcsAddMoney() {
        myAccountPageMobile.addMoneyMobile();
    }

    @When("User clicks edit account on mobile web")
    public void userClicksEditAccountMobile() {
        myAccountPageMobile.editAccountMobile();
    }

    @When("User click back button on mobile web")
    public void userBackButtonMobile() {
        myAccountPageMobile.backMobile();
    }
}
