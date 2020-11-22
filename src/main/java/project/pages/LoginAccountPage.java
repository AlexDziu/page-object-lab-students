package project.pages;

import org.openqa.selenium.By;

public class LoginAccountPage extends BasePage {
    private By fieldEmail = By.xpath("//input[@id='input-email']");
    private By fieldPassword = By.xpath("//input[@id='input-password']");
    private By buttonLogin = By.xpath("//input[@type='submit']");

    public LoginAccountPage inputEmail(String email) {
        find(fieldEmail).sendKeys(email);
        return this;
    }

    public LoginAccountPage inputPassword(String password) {
        find(fieldPassword).sendKeys(password);
        return this;
    }

    public MyAccountPage clickButtonLogin() {
        waitUntilVisible(buttonLogin, 5).click();
        return new MyAccountPage();
    }
}
