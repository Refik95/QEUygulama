package MobileWeb.pages;

import Util.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditAccountMobilePage {
    WebDriver driver;
    WebDriverWait wait;

    public EditAccountMobilePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigReader.getProperties().getProperty("explicit.timeout"))));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@class='css-11aywtz r-6taxm2 r-1eh6qqt r-z2wwpe r-rs99b7 r-h3s6tt r-1qhn6m8']")
    WebElement accountNameTextBoxMobile;

    @FindBy(xpath = "//div[contains(text(),'UPDATE')]")
    WebElement updateButtonMobile;

    @FindBy(xpath = "//div[@class='css-146c3p1 r-ubezar r-vw2c0b']")
    WebElement editAccountTextMobile;

    public void accountNameMobile(String accountName) {
        accountNameTextBoxMobile.sendKeys(accountName);
    }

    public void updateAccountButtonMobile() {
        updateButtonMobile.click();
    }

    public void checkEditAccountVisibilityMobile(){
        wait.until(ExpectedConditions.visibilityOf(editAccountTextMobile));
    }
}
