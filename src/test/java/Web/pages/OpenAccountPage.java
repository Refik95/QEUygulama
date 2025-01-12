package Web.pages;

import Util.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenAccountPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-h3s6tt r-1777fci r-tsynxw r-11c0sde r-13qz1uu']")
    WebElement openMoneyTransferButton;

    @FindBy(xpath = "//span[normalize-space()='Challenge name:']")
    WebElement challengeName;

    public OpenAccountPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigReader.getProperties().getProperty("explicit.timeout"))));
        PageFactory.initElements(driver, this);
    }

    public void checkChallengeVisibility() {
        wait.until(ExpectedConditions.visibilityOf(challengeName));
    }


    public void openAccountButton() {
        openMoneyTransferButton.click();
    }


}
