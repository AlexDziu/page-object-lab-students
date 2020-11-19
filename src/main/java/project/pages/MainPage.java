package project.pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage {
  private By myAccount = By.cssSelector("dropdown open");
  private By register = By.xpath("//li[@class='dropdown open']//a[text()='Register']");



  public MainPage openMainPage() {
    getDriver().get("https://demo.opencart.com/");
    return this;
  }

  public MainPage clickOnMyAccount() {
    find(myAccount).click();
    return this;
  }

  public RegisterAccountPage waitButtonRegisterVisible() {
    waitUntilVisible(register, 5).click();
    return new RegisterAccountPage();
  }




}
