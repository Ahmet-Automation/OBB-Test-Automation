package at.obb.automation.tests;

import at.obb.automation.utils.Driver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ObbFirstTest {

    @Test
    public void titleTest () {
        // Open the OBB home page
        Driver.getDriver().get("https://www.oebb.at/en/");

        // Check the page title
        String title = Driver.getDriver().getTitle();
        System.out.println("Page Title: " + title);

        // Verify that the title contains "ÖBB"
        assertTrue(title.contains("ÖBB"), "Title does not contain ÖBB!");

        // Close the driver
        Driver.closeDriver();
    }

}
