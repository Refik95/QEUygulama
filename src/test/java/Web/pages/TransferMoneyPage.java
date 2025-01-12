package Web.pages;

import Util.ConfigReader;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferMoneyPage {

    WebDriver driver;
    WebDriverWait wait;

    public TransferMoneyPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigReader.getProperties().getProperty("explicit.timeout"))));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[3]//select[1]")
    WebElement senderAccount;

    @FindBy(xpath = "//div[7]//select[1]")
    WebElement receiverAccount;

    @FindBy(xpath = "//input[@class='css-11aywtz r-6taxm2 r-1eh6qqt r-z2wwpe r-rs99b7 r-h3s6tt r-1qhn6m8']")
    WebElement transferMoneyAmount;

    @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-1b43r93'][normalize-space()='Send']")
    WebElement sendButton;

    @FindBy(xpath = "//div[@class='css-146c3p1 r-ubezar r-vw2c0b']")
    WebElement transferMoneyText;


    public void senderAccount() {
        senderAccount.click();
    }

    public void selectReceiverAccount(String receiverName) {
        final Select selectBox = new Select(receiverAccount);
        selectBox.selectByVisibleText(receiverName);
    }
    public void sendMoneyAmount(String amount) {
//        wait.until(ExpectedConditions.elementToBeClickable(transferMoneyAmount));
        transferMoneyAmount.sendKeys(amount);
        sendButton.click();
    }

    public void clickSendButton() {
        sendButton.click();
    }

    public void checkTransferMoneyVisibility(){
        wait.until(ExpectedConditions.visibilityOf(transferMoneyText));
    }

    public void acceptWarning(){
        try
        {
            wait.until(ExpectedConditions.alertIsPresent());
        }
        catch (TimeoutException Ex)
        {
        }

    }
}
