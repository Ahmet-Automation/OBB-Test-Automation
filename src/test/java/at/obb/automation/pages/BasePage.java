package at.obb.automation.pages;


import at.obb.automation.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriverWait wait;

    public BasePage () {
        this.wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        /*
        //        This initializes the @FindBy annotations
//        PageFactory.initElements(Driver.getDriver(), this);
//
//

         */

    }

    protected WebElement find(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void sendKeys(By locator, String text) {
        find(locator).sendKeys();
    }

}
