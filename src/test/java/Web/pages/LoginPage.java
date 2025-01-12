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

import static org.testng.AssertJUnit.assertEquals;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "input[placeholder='Username']")
    WebElement textboxUsername;

    @FindBy(css = "input[placeholder='Password']")
    WebElement textboxPassword;

    @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-1b43r93'] ")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='css-146c3p1 r-howw7u r-1b43r93']")
    WebElement invalidCredentialsMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigReader.getProperties().getProperty("explicit.timeout"))));
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage(String url) {
        driver.navigate().to(url);
    }

    public void usernameVisibility() {
        wait.until(ExpectedConditions.visibilityOf(textboxUsername));
    }



    public void loginCredentials(String username, String password) {
        textboxUsername.sendKeys(username);
        textboxPassword.sendKeys(password);
        loginButton.click();
    }

    public void checkInvalidCredentialsMessage() {
        String errorMessageText = invalidCredentialsMessage.getText();
        assertEquals("Username or Password Invalid!", errorMessageText);
    }

    public void clickLoginButton() {
        loginButton.click();
    }


}
