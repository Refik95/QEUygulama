package Web.pages;

import Util.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditAccountPage {

    WebDriver driver;
    WebDriverWait wait;

    public EditAccountPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigReader.getProperties().getProperty("explicit.timeout"))));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@class='css-11aywtz r-6taxm2 r-1eh6qqt r-z2wwpe r-rs99b7 r-h3s6tt r-1qhn6m8']")
    WebElement accountNameTextBox;

    @FindBy(xpath = "//div[contains(text(),'UPDATE')]")
    WebElement updateButton;

    @FindBy(xpath = "//div[@class='css-146c3p1 r-ubezar r-vw2c0b']")
    WebElement editAccountText;

    public void accountName(String accountName) {
        accountNameTextBox.sendKeys(accountName);
    }

    public void updateAccountButton() {
        updateButton.click();
    }

    public void checkEditAccountVisibility(){
        wait.until(ExpectedConditions.visibilityOf(editAccountText));
    }
}
