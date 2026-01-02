package at.obb.automation.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;

    private Driver() {

    }

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver !=null) {
            driver.quit();
            driver = null;
        }
    }
}
