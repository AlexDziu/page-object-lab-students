package components;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import project.pages.CategoryPage;


public class TopMenu {
    private static WebDriver driver;

    public TopMenu(WebDriver webDriver) {
        driver = webDriver;
    }

    private By selectComponents = By.xpath("//a[text()='Components']");
    private By selectMonitors = By.xpath("//a[text()='Monitors (2)']");

    public CategoryPage chooseItems() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(selectComponents)).moveToElement(driver.findElement(selectMonitors)).click().build().perform();
        return new CategoryPage();
    }
}
