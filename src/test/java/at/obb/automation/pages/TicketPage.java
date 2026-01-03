package at.obb.automation.pages;

import org.openqa.selenium.By;

public class TicketPage extends BasePage {

    private final By fromToTab = By.xpath("//span[contains(text(), 'From-To')]");

    private final By fromInput = By.cssSelector("input[placeholder='From']");
    private final By toInput = By.cssSelector("input[placeholder='To']");
    private final By findButton = By.xpath("//button[contains(., 'Find')]");

    public TicketPage () {
        super();
    }

    public void searchJourney(String origin, String destination) {
        click(fromToTab);

        sendKeys(fromInput, origin);

        sendKeys(toInput, destination);

        click(findButton);

    }

}


