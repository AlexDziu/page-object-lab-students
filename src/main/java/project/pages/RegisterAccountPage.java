package project.pages;

import org.openqa.selenium.By;

public class RegisterAccountPage extends BasePage {

    private final By firstName = By.xpath("//input[@id='input-firstname']");
    private final By lastName = By.xpath("//input[@id='input-lastname']");
    private final By email = By.xpath("//input[@id='input-email']");
    private final By password = By.xpath("//input[@id='input-password']");
    private final By passwordConfirm = By.xpath("//input[@id='input-confirm']");
    private final By telephone = By.xpath("//input[@id='input-telephone']");
    private final By privacyPolicy = By.xpath("//input[@name='agree']");
    private final By buttonContinue = By.xpath("//input[@value='Continue']");
    private final By textMessage = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");


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

    public RegisterAccountPage setPhone(String inputTelephone) {
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
            return new CreatedPage();
        }

    }

    public String textAppears() {
        waitUntilVisible(textMessage, 5);
        return find(textMessage).getText();
    }


}
