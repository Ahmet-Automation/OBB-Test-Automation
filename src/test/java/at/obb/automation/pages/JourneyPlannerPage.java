package at.obb.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JourneyPlannerPage extends BasePage {

    // iframe that contains the journey planner
    private final By plannerIframe =
            By.cssSelector("iframe[src*='fahrplan'], iframe[src*='journey'], iframe");

    private final By fromInput =
            By.cssSelector("input[data-unique-id='travelStationFromInput']");

    private final By destinationInput =
            By.cssSelector("input[data-unique-id='travelStationToInput']");

    public JourneyPlannerPage(WebDriver driver) {
        super(driver);
    }

    public void enterJourneyDetails(String from, String to) {

        sendKeys(fromInput, from);
        sendKeys(destinationInput, to);
    }

    public void switchToPlannerIframe() {
        switchToFrame(plannerIframe);
    }

    public void waitForPlannerToLoad() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(fromInput));
    }

}
