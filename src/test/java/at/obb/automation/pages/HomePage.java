package at.obb.automation.pages;

import at.obb.automation.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{
    // No need for constructor here because it inherits from BasePage

    @FindBy(id = "consent_prompt_submit")
    public WebElement acceptCookiesButton;

    public void acceptCookies() {
        // Create a wait object (waits up to 10 seconds)
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        try {
            // We manually tell the driver to wait until the button is displayed
            wait.until(driver -> acceptCookiesButton.isDisplayed());
            acceptCookiesButton.click();
            System.out.println("Cookie banner accepted successfully.");
        } catch (Exception e) {
            System.out.println("Cookie banner was not found or already closed.");
        }


    }


}
