package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.pages.LoginPage;
import project.pages.WishListPage;
import project.pages.RegisterAccountPage;

public class TopBar {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final Actions actions;

    public TopBar(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
        actions = new Actions(driver);
    }

    private final By myAccountDropDown = By.xpath("//span[@class='caret']");
    private final By registerLink = By.xpath("//ul//a[text()='Register']");
    private final By loginLink = By.xpath("//ul//a[text()='Login']");
    private final By wishListTotal = By.xpath("//a[@id='wishlist-total']");

    public TopBar clickOnMyAccountDropDown() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountDropDown)).click();
        return this;
    }

    public RegisterAccountPage selectRegister() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerLink)).click();
        return new RegisterAccountPage();
    }

    public LoginPage selectLogin() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginLink)).click();
        return new LoginPage();
    }

    public WishListPage clickOnWishListTotal() {
        actions.moveToElement(driver.findElement(wishListTotal));
        driver.findElement(wishListTotal).click();
        return new WishListPage();
    }
}
