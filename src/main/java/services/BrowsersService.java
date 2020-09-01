package services;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsersService {
    private WebDriver driver = null;
    private DriverManagerType driverManagerType = null;

    public BrowsersService() {
        ReadProperties readProperties = new ReadProperties();

        switch (readProperties.getBrowserName().toLowerCase()) {
            case "chrome":
                driverManagerType = DriverManagerType.CHROME;
                WebDriverManager.getInstance(driverManagerType).setup();

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--ignore-certificate-errors");
                chromeOptions.addArguments("--silent");
                chromeOptions.addArguments("--start-maximized");

                driver = new ChromeDriver(chromeOptions);
                driver.manage().window().maximize();
                break;
            case "firefox":
                driverManagerType = DriverManagerType.FIREFOX;
                WebDriverManager.getInstance(driverManagerType).setup();

                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            default:
                System.out.println("Browser " + readProperties.getBrowserName() + " is not supported.");
                break;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
