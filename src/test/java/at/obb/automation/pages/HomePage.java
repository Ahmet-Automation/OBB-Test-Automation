package at.obb.automation.pages;

import at.obb.automation.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{

    private final By cookieButton = By.id("consent_prompt_submit");

    public void acceptCookies() {
       try {
           click(cookieButton);
           System.out.println("All cookies accepted.");
       } catch (Exception e) {
           System.out.println("The cookie banner didn't appear.");
       }
    }


}