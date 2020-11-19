package project.pages;

import org.openqa.selenium.By;

public class AccountCreated extends BasePage {
    private By accountSuccess = By.xpath("//div[@id='content']/h1[text()='Your Account Has Been Created!']");

    public String resultAccountCreated() {
        return find(accountSuccess).getText();
    }
}
