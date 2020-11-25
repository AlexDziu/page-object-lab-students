package project.pages;

import org.openqa.selenium.By;


public class MyAccountPage extends BasePage {

    private By textMyAccount = By.xpath("//h2[text()='My Account']");

    public String getTextFromMyAccountMenuTitle() {
        return waitUntilVisible(textMyAccount, 5).getText();
    }

}
