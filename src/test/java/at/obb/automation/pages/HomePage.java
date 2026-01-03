package at.obb.automation.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

public class HomePage extends BasePage{

    // Locators
    // Using CSS Selectors based on the latest UI inspection
    private final By cookieButton = By.id("consent_prompt_submit");
    // Selecting the link inside the ticketshop-link list item
    private final By bookTicketButton = By.cssSelector(".ticketshop-link a");
//    private final By fromInput = By.cssSelector("input[placeholder='From']");
//    private final By toInput = By.cssSelector("input[placeholder='To']");

    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Action Methods
    public void acceptCookies() {
        try {
            click(cookieButton);
        } catch (Exception e) {
            System.out.println("Cookie banner was not found or already closed.");
        }
    }

    /**
     * Clicks the initial search button to open the journey planner in a new window
     */
    public void clickTicketButton() {
        click(bookTicketButton);
    }

    /*
    public void searchForJourney(String origin, String destination) {

        click(searchButton);
        String currentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
        }
    }

     */

}
