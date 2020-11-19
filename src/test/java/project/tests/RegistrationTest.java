package project.tests;

import org.junit.Assert;
import org.junit.Test;
import project.pages.AccountCreated;
import project.pages.BasePage;
import project.pages.MainPage;

public class RegistrationTest extends BaseTest {

  private MainPage mainPage;
  String firstName1 = "Alex";
  String lastName1 = "Alex";
  String email1 = "alex@gmai122121l.com";
  String telephone1 = "0935554444";
  String password1 = "444580";
  String passwordConfirm1 = "444580";
  String expectedText = "Your Account Has Been Created!";


  @Test
  public void registrationWithValidCredentials() {
    mainPage = new MainPage();
    AccountCreated accountCreatedPage = (AccountCreated) mainPage.openMainPage().clickOnMyAccount()
            .waitButtonRegisterVisible()
            .setFirstName(firstName1)
            .setLastName(lastName1)
            .setEmail(email1)
            .setTelephone(telephone1)
            .setPassword(password1)
            .setPasswordConfirm(passwordConfirm1)
            .clickPrivacyPolicy()
            .clickButtonContinue();
    String actualText = accountCreatedPage.resultAccountCreated();
    Assert.assertEquals(expectedText,actualText);
    //Assertions asserJ
  }

}
