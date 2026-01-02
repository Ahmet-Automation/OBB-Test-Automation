package at.obb.automation.tests;

import at.obb.automation.pages.HomePage;
import at.obb.automation.pages.JourneyPlannerPage;
import at.obb.automation.utils.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class SearchJourneyTest {

    HomePage homePage;

    @BeforeEach
    public void setUp() {
        // 1. Open the OBB home page
        Driver.getDriver().get("https://www.oebb.at/en/");
        homePage = new HomePage(Driver.getDriver());
    }

    @Test
    public void searchJourneyTest () {
        homePage.acceptCookies();
        homePage.clickTicketButton();

        String mainHandle = Driver.getDriver().getWindowHandle();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> allWindows = Driver.getDriver().getWindowHandles();
        for (String handle : allWindows) {
            if (!handle.equals(mainHandle)) {
                Driver.getDriver().switchTo().window(handle);
            }
        }

        JourneyPlannerPage plannerPage = new JourneyPlannerPage(Driver.getDriver());

        plannerPage.waitForPlannerToLoad();
        plannerPage.enterJourneyDetails("Wien", "Linz");

            System.out.println("Search performed successfully!");

        }

    @AfterEach
    public void tearDown() {
        // 5. Close the driver after the test is finished
        Driver.closeDriver();
    }

}
