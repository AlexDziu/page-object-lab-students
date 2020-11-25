package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.pages.ProductsPage;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public class TopMenu {
    private WebDriver driver;

    public TopMenu(WebDriver driver) {
        this.driver = driver;
    }

    private By selectComponents = By.xpath("//a[text()='Components']");
    private By selectMonitors = By.xpath("//a[contains(text(),'Monitors')]");
    private By desktopsCategoryLink = By.xpath("//a[text()='Desktops']");

    public TopMenu hoverMouseOverMenuItem(MenuCategories category) {
        Actions actions = new Actions(driver);
        switch (category) {
            case DESKTOPS:
                actions.moveToElement(driver.findElement(desktopsCategoryLink));
                break;
            case COMPONENTS:
                actions.moveToElement(driver.findElement(selectComponents));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + category);
        }
        actions.build().perform();
        return this;
    }

    public ProductsPage selectSubCategory(MenuSubCategories subCategory) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        switch (subCategory) {
            case MONITORS:
                wait.until(visibilityOfElementLocated(selectMonitors)).click();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + subCategory);
        }
        return new ProductsPage();
    }

}
