package project.tests;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import project.pages.MainPage;
import project.pages.RegisterAccountPage;
import utils.RandomEmails;

public class WrongRegistrationTest extends BaseTest {

    private MainPage mainPage;
    String lastName1 = "Petrovskiy";
    String email1 = RandomEmails.generateEmail() + "@mailinator.com";
    String telephone1 = "0935554444";
    String password1 = "444580";
    String passwordConfirm1 = "444580";
    String expectedText = "First Name must be between 1 and 32 characters!";

    @Test
    public void registrationWithoutFirstName() {
        mainPage = new MainPage();
        RegisterAccountPage registerAccountPage = (RegisterAccountPage) mainPage.openMainPage().clickOnMyAccount()
                .waitButtonRegisterVisible()
                .setLastName(lastName1)
                .setEmail(email1)
                .setTelephone(telephone1)
                .setPassword(password1)
                .setPasswordConfirm(passwordConfirm1)
                .clickPrivacyPolicy()
                .clickButtonContinue();
        assertThat(registerAccountPage.textAppears()).isEqualTo(expectedText);
    }
}
