package project.pages;

import org.openqa.selenium.By;


public class MyAccountPage extends BasePage {
    private By textMyAccount = By.xpath("//h2[text()='My Account']");
    private By selectComponents = By.xpath("//a[text()='Components']");
    private By selectMonitors = By.xpath("//a[text()='Monitors (2)']");


    public String visibleText() {
        waitUntilVisible(textMyAccount, 5);
        return find(textMyAccount).getText();
    }

    public CategoryPage selectMonitors() {
        find(selectComponents).click();
        waitUntilVisible(selectMonitors, 5).click();
        return new CategoryPage();
    }

}
