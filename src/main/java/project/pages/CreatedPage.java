package project.pages;

import org.openqa.selenium.By;

public class CreatedPage extends BasePage {
    private By accountSuccess = By.xpath("//div[@id='content']/h1[text()='Your Account Has Been Created!']");

    public String getSuccessMessageText() {
        return waitUntilVisible(accountSuccess, 5).getText();
    }
}
