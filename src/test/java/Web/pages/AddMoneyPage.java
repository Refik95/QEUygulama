package Web.pages;

import Util.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddMoneyPage {

    WebDriver driver;
    WebDriverWait wait;

    public AddMoneyPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigReader.getProperties().getProperty("explicit.timeout"))));
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input.css-11aywtz.r-6taxm2.r-1mqtkb5.r-z2wwpe.r-rs99b7.r-h3s6tt.r-1qhn6m8")
    WebElement cardNumber;

    @FindBy(xpath = "//div//div[4]//input[1]")
    WebElement cardHolder;

    @FindBy(css = "input[placeholder='MM/YY']")
    WebElement expiryDate;

    @FindBy(xpath = "//div[@class='css-175oi2r r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-agouwx r-1pi2tsx r-13qz1uu']//div[2]//div[1]//input[1]")
    WebElement ccv;

    @FindBy(xpath = "//div[8]//input[1]")
    WebElement addMoneyAmount;

    @FindBy(xpath = "//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-h3s6tt r-1777fci r-tsynxw r-13qz1uu']")
    WebElement addButton;

    @FindBy(xpath = "//div[@class='css-146c3p1 r-ubezar r-vw2c0b']")
    WebElement addMoneyText;

    @FindBy(xpath = "//body/div/div[@class='r-1p0dtai r-1d2f490 r-1xcajam r-zchlnj r-ipm5af r-sfbmgh r-1ielgck r-1uypc71 r-xx3c9p r-6dt33c']/div[@class='css-175oi2r']/div[@role='dialog']/div[@class='css-175oi2r r-13awgt0 r-ipm5af']/div[@class='css-175oi2r r-1awozwy r-13awgt0 r-1777fci r-1ygmrgt']/div[@class='css-175oi2r r-1awozwy r-14lw9ot r-1xfd6ze r-1rr9as1 r-129l8ac r-1ik5qf4 r-e7q0ms']/div[@class='css-175oi2r r-1awozwy r-13awgt0 r-1777fci r-nsbfu8 r-13qz1uu']/div[@class='css-175oi2r r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-agouwx r-1pi2tsx r-13qz1uu']/div[@class='css-175oi2r']/div[2]/div[2]")
    WebElement requiredText;

    public void cardNumber(String cardNumber){
        this.cardNumber.click();
        this.cardNumber.clear();
        wait.until(ExpectedConditions.elementToBeClickable(this.cardNumber));
        this.cardNumber.sendKeys(cardNumber);
    }

    public void cardHolder(String cardHolder) {
        wait.until(ExpectedConditions.elementToBeClickable(this.cardHolder));
        this.cardHolder.sendKeys(cardHolder);
    }

    public void expiryDate(String expiryDate) {
        wait.until(ExpectedConditions.visibilityOf(this.expiryDate));
        this.expiryDate.sendKeys(expiryDate);
    }

    public void cvv(String cvv) {
        wait.until(ExpectedConditions.visibilityOf(this.ccv));
        this.ccv.sendKeys(cvv);
    }

    public void setAddMoneyAmount(String amount) {
        wait.until(ExpectedConditions.visibilityOf(this.addMoneyAmount));
        addMoneyAmount.sendKeys(amount);
    }

    public void clickAddButton() {
        addButton.click();
    }

    public void checkRequiredTxtVisibility() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOf(this.requiredText));
    }

    public void checkAddMoneyVisibility(){
        wait.until(ExpectedConditions.visibilityOf(addMoneyText));
    }

}
