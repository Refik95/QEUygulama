package MobileWeb.mobileStepDefinitions;

import MobileWeb.pages.LoginMobilePage;
import MobileWeb.pages.MyAccountMobilePage;
import MobileWeb.pages.OpenAccountMobilePage;
import MobileWeb.pages.TransferMoneyMobilePage;
import Util.ConfigReader;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TransferMoneyMobilePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    TransferMoneyMobilePage transferMoneyPageMobile = new TransferMoneyMobilePage(driver);


    @Then("User should see Transfer money title on mobile web")
    public void userShouldSeeTransferMoneyTitleMobile() {
        transferMoneyPageMobile.checkTransferMoneyVisibilityMobile();
    }

    @When("User select sender account on mobile web")
    public void userSelectSenderAccountMobile() {
        transferMoneyPageMobile.senderAccountMobile();
    }

    @When("User select reciever account on mobile web")
    public void userSelectRecieverAccountMobile() {
        transferMoneyPageMobile.recieverAccountMobile("Testinium-3");
    }

    @When("User click send button on mobile web")
    public void userClickSendButtonMobile() {
        transferMoneyPageMobile.sendMoneyAmountMobile("1500");
    }
}
