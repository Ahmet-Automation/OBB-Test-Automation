package at.obb.automation.tests;

import at.obb.automation.pages.HomePage;
import at.obb.automation.utils.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ObbFirstTest {

        HomePage homePage;

        @BeforeEach
                public void setUp() {
        // 1. Open the OBB home page
        Driver.getDriver().get("https://www.oebb.at/en/");
        homePage = new HomePage();
        }

    @Test
    public void titleTest () {
          // 2. Handle the cookie banner first (Pre-condition)
        homePage.acceptCookies();

        // 3. Check the page title
        String title = Driver.getDriver().getTitle();
        System.out.println("Page Title: " + title);

        // 4. Verify that the title contains "ÖBB"
        assertTrue(title.contains("ÖBB"), "Title does not contain ÖBB!");

    }

    @AfterEach
    public void tearDown() {
            // 5. Close the driver after the test is finished
        Driver.closeDriver();
    }

}
