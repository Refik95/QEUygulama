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

import static org.testng.AssertJUnit.assertEquals;

public class LoginMobilePage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "input[placeholder='Username']")
    WebElement textboxUsernameMobile;

    @FindBy(css = "input[placeholder='Password']")
    WebElement textboxPasswordMobile;

    @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-1b43r93'] ")
    WebElement loginButtonMobile;

    @FindBy(xpath = "//div[@class='css-146c3p1 r-howw7u r-1b43r93']")
    WebElement invalidCredentialsMessageMobile;

    public LoginMobilePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigReader.getProperties().getProperty("explicit.timeout"))));
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPageMobile(String url) {
        driver.get(url);
    }

    public void usernameVisibilityMobile() {
        wait.until(ExpectedConditions.visibilityOf(textboxUsernameMobile));
    }

    public void writeWrongUsernameAndPasswordMobile(String username, String password) {
        textboxUsernameMobile.sendKeys("abcd");
        textboxPasswordMobile.sendKeys("123456");
    }

    public void loginCredentialsMobile(String username, String password) {
        textboxUsernameMobile.sendKeys(username);
        textboxPasswordMobile.sendKeys(password);
        loginButtonMobile.click();
    }

    public void checkInvalidCredentialsMessageMobile() {
        WebElement errorMessage = driver.findElement((By) invalidCredentialsMessageMobile);
        String errorMessageText = errorMessage.getText();
        assertEquals(errorMessageText,"Username or Password Invalid!");
    }

    public void clickLoginButtonMobile() {
        driver.findElement((By) loginButtonMobile).click();
    }

}
