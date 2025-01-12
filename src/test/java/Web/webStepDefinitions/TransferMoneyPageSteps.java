package Web.webStepDefinitions;

import Util.DriverFactory;
import Web.pages.TransferMoneyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TransferMoneyPageSteps {

    WebDriver driver = DriverFactory.getDriver();
    TransferMoneyPage transferMoneyPage = new TransferMoneyPage(driver);

    @Then("User should see Transfer money title")
    public void userShouldSeeTransferMoneyTitle() {
        transferMoneyPage.checkTransferMoneyVisibility();
    }

    @When("User accepts alert")
    public void userAcceptsAlert() {
        transferMoneyPage.acceptWarning();
    }

    @When("User select {string} account")
    public void userSelectReceiverAccount(String accountName) {
        transferMoneyPage.selectReceiverAccount(accountName);
    }

    @When("User types {string} amount to the amount field")
    public void userClickSendButton(String amount) {
        transferMoneyPage.sendMoneyAmount(amount);
    }

    @When("User clicks send button")
    public void userClickSendButton() {
        transferMoneyPage.clickSendButton();
    }

}
