package project.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private final By fieldEmail = By.xpath("//input[@id='input-email']");
    private final By fieldPassword = By.xpath("//input[@id='input-password']");
    private final By buttonLogin = By.xpath("//input[@type='submit']");

    public LoginPage inputEmail(String email) {
        waitUntilVisible(fieldEmail, 5).sendKeys(email);
        return this;
    }

    public LoginPage inputPassword(String password) {
        find(fieldPassword).sendKeys(password);
        return this;
    }

    public MyAccountPage clickButtonLogin() {
        waitUntilVisible(buttonLogin, 5).click();
        return new MyAccountPage();
    }
}
