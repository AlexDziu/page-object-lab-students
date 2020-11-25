package project.pages;

import components.TopBar;
import components.TopMenu;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public abstract class BasePage {
    private TopMenu topMenu;
    private TopBar topBar;

    public BasePage() {
        this.topBar = new TopBar(driver);
        this.topMenu = new TopMenu(driver);
    }

    //protected WebDriver variable (only classes in same folder (pages) will get driver)
    protected static WebDriver driver;

    //set driver for base page
    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    //method for get driver from any page
    public static WebDriver getDriver() {
        return driver;
    }

    protected WebElement find(By locator) {
        return getDriver().findElement(locator);
    }

    protected WebElement waitUntilVisible(By locator, int seconds) {
        return new WebDriverWait(getDriver(), seconds)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public boolean waitUntilTextWillPresent(By locator, int time, String text) {
        return new WebDriverWait(driver, time)
                .until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    public boolean waitInvisibilityOf(By locator, int time) {
        return new WebDriverWait(driver, time)
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void clickWithJs(WebElement webElement) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", webElement);
    }

    public void moveToElement(WebElement element) {
        new Actions(driver).moveToElement(element).build().perform();
    }

}
