package at.obb.automation.tests;

import at.obb.automation.pages.HomePage;
import at.obb.automation.pages.TicketPage;
import at.obb.automation.utils.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookingTest {

    HomePage homePage;
    TicketPage ticketPage;

    @BeforeEach
    public void setUp() {
        Driver.getDriver().get("https://shop.oebbtickets.at/en/ticket");

        homePage = new HomePage();
        ticketPage = new TicketPage();
    }

    @Test
    public void searchTicketSuccessfully () {
        homePage.acceptCookies();

        ticketPage.searchJourney("Vienna", "Salzburg");

        System.out.println("Testing steps are complete, results are awaited...");

    }

    @AfterEach
    public void tearDown() {
        Driver.closeDriver();
    }



}
