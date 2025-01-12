package MobileWeb.pages;

import Util.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferMoneyMobilePage {
    WebDriver driver;
    WebDriverWait wait;

    public TransferMoneyMobilePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigReader.getProperties().getProperty("explicit.timeout"))));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[3]//select[1]")
    WebElement senderAccountMobile;

    @FindBy(xpath = "//div[7]//select[1]")
    WebElement recieverAccountMobile;

    @FindBy(xpath = "//div[@class='css-175oi2r r-13qz1uu']")
    WebElement transferMoneyAmountMobile;

    @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-1b43r93'][normalize-space()='Send']")
    WebElement sendButtonMobile;

    @FindBy(xpath = "//div[@class='css-146c3p1 r-ubezar r-vw2c0b']")
    WebElement transferMoneyTextMobile;

    public void senderAccountMobile() {
        senderAccountMobile.click();
    }

    public By recieverAccountMobile(String recieverName) {
        return By.xpath("//option[contains(text(),'" + recieverName + "')]");
    }
    public void sendMoneyAmountMobile(String amount) {
        transferMoneyAmountMobile.sendKeys(amount);
        sendButtonMobile.click();
    }

    public void checkTransferMoneyVisibilityMobile(){
        wait.until(ExpectedConditions.visibilityOf(transferMoneyTextMobile));
    }

}
