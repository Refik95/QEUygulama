package MobileWeb.pages;

import Util.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountMobilePage {
    WebDriver driver;
    WebDriverWait wait;

    public MyAccountMobilePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigReader.getProperties().getProperty("explicit.timeout"))));
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class='css-175oi2r r-14lw9ot r-z2wwpe r-edyy15'] div:nth-child(1) div:nth-child(2)")
    WebElement usernameMobile;

    @FindBy(xpath = "//div[contains(text(),'Transfer money')]")
    WebElement transferMoneyButtonMobile;

    @FindBy(css = "div.css-175oi2r.r-14lw9ot.r-z2wwpe.r-edyy15 > div.css-175oi2r > div.css-175oi2r")
    WebElement transferMoneyAmountMobile;

    @FindBy(xpath = "//div[contains(text(),'Add money')]")
    WebElement addMoneyButtonMobile;

    @FindBy(xpath = "//div[contains(text(),'Edit account')]")
    WebElement editAccountButtonMobile;

    @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-vw2c0b r-13hce6t']")
    WebElement backButtonMobile;

    @FindBy(xpath = "//div[normalize-space()='My account']")
    WebElement myAccountTextMobile;

    public void moneyTransferMobile() {
        transferMoneyButtonMobile.click();
    }

    public void addMoneyMobile() {
        addMoneyButtonMobile.click();
    }

    public void editAccountMobile() {
        editAccountButtonMobile.click();
    }

    public void backMobile() {
        backButtonMobile.click();
    }

    public void checkMyaccountTextVisibilityMobile() {
        wait.until(ExpectedConditions.visibilityOf(myAccountTextMobile));
    }

    public static void HomePageMobile() {
    }
}
