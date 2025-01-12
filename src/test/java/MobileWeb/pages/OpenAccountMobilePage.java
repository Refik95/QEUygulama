package MobileWeb.pages;

import Util.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenAccountMobilePage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-1b43r93']")
    WebElement openMoneyTransferButtonMobile;

    @FindBy(xpath = "//span[normalize-space()='Challenge name:']")
    WebElement challengeNameMobile;

    public OpenAccountMobilePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigReader.getProperties().getProperty("explicit.timeout"))));
        PageFactory.initElements(driver, this);
    }

    public void checkCallengeVisibilityMobile() {
        wait.until(ExpectedConditions.visibilityOf(challengeNameMobile));
    }

    public void openAccountMobile() {
        openMoneyTransferButtonMobile.click();
    }
}
