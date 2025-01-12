package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static WebDriver driver;
    static Properties properties;

    public static WebDriver initialize_Driver(String browser){
        properties = ConfigReader.getProperties();
        if (browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("Safari")){
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        } else if (browser.equals("ChromeMobile")) {
            ChromeOptions mobileWebChromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();

            Map<String, String> mobileEmulation = new HashMap<>();

            mobileEmulation.put("deviceName", "iPhone 7");

            mobileWebChromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
            driver = new ChromeDriver(mobileWebChromeOptions);

        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        String url = properties.getProperty("login.page");
        int pageWait = Integer.parseInt(properties.getProperty("pageload.timeout"));
        int impWait = Integer.parseInt(properties.getProperty("implicit.timeout"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);
        return getDriver();
    }
    public static WebDriver getDriver(){
        return driver;
    }
}