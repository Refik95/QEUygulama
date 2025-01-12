package Web.webStepDefinitions;

import Util.DriverFactory;
import Web.pages.MyAccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccountPageSteps {

    WebDriver driver = DriverFactory.getDriver();
    MyAccountPage myAccountPage = new MyAccountPage(driver);

    double initialAmount;

    @Then("User is on myAccountPage")
    public void userIsOnMyAccountPage() {
        MyAccountPage.HomePage();
    }

    @Then("User should see My account page text")
    public void userShouldSeeMyAccountPageText() {
        myAccountPage.checkMyaccountTextVisibility();
    }

    @When("User clikcs transfer money")
    public void userClikcsTransferMoney() {
        myAccountPage.moneyTransfer();
    }

    @When("User clicks add money button")
    public void userClikcsAddMoney() {
        myAccountPage.addMoney();
    }

    @When("User clicks edit account")
    public void userClicksEditAccount() {
        myAccountPage.editAccount();
    }

    @When("User clicks back button")
    public void userBackButton() {
        myAccountPage.back();
    }

    @When("User sees balance")
    public void userSeesBalance() {
        initialAmount = myAccountPage.getCurrentAmount();
    }

    @Then("User should see that the amount is reduced by {string}")
    public void userShouldSeeThatTheAmountIsReducedBy(String amount) {
        double currentAmount = myAccountPage.getCurrentAmount();
        double newAmount = initialAmount-Double.parseDouble(amount);
        Assert.assertEquals(currentAmount, newAmount);
    }


    @Then("User should see that the amount is increased by {string}")
    public void userShouldSeeThatTheAmountIsIncreasedBy(String amount) {
        double currentAmount = myAccountPage.getCurrentAmount();
        double newAmount = initialAmount+Double.parseDouble(amount);
        Assert.assertEquals(currentAmount, newAmount);
    }

    @When("User refreshes page after sending money")
    public void userRefreshes() {
        myAccountPage.driverRefresh();
    }

}
