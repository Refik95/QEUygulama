package Web.webStepDefinitions;

import Util.DriverFactory;
import Web.pages.AddMoneyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AddMoneyPageSteps {

    WebDriver driver = DriverFactory.getDriver();
    AddMoneyPage addMoneyPage = new AddMoneyPage(driver);

    @When("User should see Add money page title")
    public void userShouldSeeAddMoneyPageTitle() throws InterruptedException {
        Thread.sleep(1000);
        addMoneyPage.checkAddMoneyVisibility();
    }

    @Then("User should see Add money title")
    public void userShouldSeeAddMoneyTitle() {
        addMoneyPage.checkAddMoneyVisibility();
    }

    @When("User enters {string} to card number field")
    public void userEntersCardNumber(String cardNumberField) {
        addMoneyPage.cardNumber(cardNumberField);
    }

    @When("User enters {string} to card holder field")
    public void userEntersCardHolder(String cardHolderField) {
        addMoneyPage.cardHolder(cardHolderField);
    }

    @When("User enters {string} to expiry date field")
    public void userEntersExpiryDate(String expiryDateField) {
        addMoneyPage.expiryDate(expiryDateField);
    }

    @When("User enter {string} to cvv field")
    public void userEntersCvv(String cvvField) {
        addMoneyPage.cvv(cvvField);
    }

    @When("User enters money amount to add {string}")
    public void userEntersMoneyAmountToAdd(String moneyAmount) {addMoneyPage.setAddMoneyAmount(moneyAmount);}

    @When("User clicks add button")
    public void userClicksAddButton() {
        addMoneyPage.clickAddButton();
    }


}
