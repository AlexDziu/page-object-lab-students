package project.pages;

import org.openqa.selenium.By;

public class RegisterAccountPage extends BasePage {
    private By firstName = By.xpath("//input[@id='input-firstname']");
    private By lastName = By.xpath("//input[@id='input-lastname']");
    private By email = By.xpath("//input[@id='input-email']");
    private By password = By.xpath("//input[@id='input-password']");
    private By passwordConfirm = By.xpath("//input[@id='input-confirm']");
    private By telephone = By.xpath("//input[@id='input-telephone']");
    private By privacyPolicy = By.xpath("//input[@name='agree']");
    private By buttonContinue = By.xpath("//input[@value='Continue']");

    public RegisterAccountPage setFirstName(String inputFirstName) {
        find(firstName).sendKeys(inputFirstName);
        return this;
    }

    public RegisterAccountPage setLastName(String inputLastName) {
        find(lastName).sendKeys(inputLastName);
        return this;
    }

    public RegisterAccountPage setEmail(String inputEmail) {
        find(email).sendKeys(inputEmail);
        return this;
    }

    public RegisterAccountPage setPassword(String inputPassword) {
        find(password).sendKeys(inputPassword);
        return this;
    }

    public RegisterAccountPage setPasswordConfirm(String inputPasswordConfirm) {
        find(passwordConfirm).sendKeys(inputPasswordConfirm);
        return this;
    }

    public RegisterAccountPage setTelephone(String inputTelephone) {
        find(telephone).sendKeys(inputTelephone);
        return this;
    }

    public RegisterAccountPage clickPrivacyPolicy() {
        find(privacyPolicy).click();
        return this;
    }

    public BasePage clickButtonContinue() {
        find(buttonContinue).click();
        if (getDriver().getCurrentUrl().contains("register")) {
            return new RegisterAccountPage();
        } else {
            return new AccountCreated();
        }

    }


}
