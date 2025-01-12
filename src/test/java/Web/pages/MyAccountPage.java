package Web.pages;

import Util.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage {

    WebDriver driver;
    WebDriverWait wait;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigReader.getProperties().getProperty("explicit.timeout"))));
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class='css-175oi2r r-14lw9ot r-z2wwpe r-edyy15'] div:nth-child(1) div:nth-child(2)")
    WebElement username;

    @FindBy(xpath = "//div[contains(text(),'Transfer money')]")
    WebElement transferMoneyButton;

    @FindBy(css = "div.css-175oi2r.r-14lw9ot.r-z2wwpe.r-edyy15 > div.css-175oi2r > div.css-175oi2r")
    WebElement transferMoneyAmount;

    @FindBy(xpath = "//div[contains(text(),'Add money')]")
    WebElement addMoneyButton;

    @FindBy(xpath = "//div[contains(text(),'Edit account')]")
    WebElement editAccountButton;

    @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-vw2c0b r-13hce6t']")
    WebElement backButton;

    @FindBy(xpath = "//div[normalize-space()='My account']")
    WebElement myAccountText;

    public void moneyTransfer() {
        transferMoneyButton.click();
    }

    public void addMoney() {
        addMoneyButton.click();
    }

    public void editAccount() {
        editAccountButton.click();
    }

    public void back() {
        backButton.click();
    }

    public void checkMyaccountTextVisibility() {
        wait.until(ExpectedConditions.visibilityOf(myAccountText));
    }

    public double getCurrentAmount() {
        return Double.parseDouble(transferMoneyAmount.getText().replace(",", ""));
    }

    public boolean checkUsername(String newUsername) {
        return wait.until(ExpectedConditions.textToBePresentInElement(username, newUsername));
    }

    public String getUsername() {
        return username.getText();
    }

    public void driverRefresh() {
        driver.navigate().refresh();
    }

    public static void HomePage() {
    }
}
