package at.obb.automation.pages;


import at.obb.automation.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage () {
        // // This initializes the @FindBy annotations
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
