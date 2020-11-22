package project.tests;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import project.pages.CreatedAccountPage;
import project.pages.MainPage;
import utils.RandomEmails;

public class RegistrationTest extends BaseTest {

    private MainPage mainPage;
    String firstName1 = "Alex";
    String lastName1 = "Petrovskiy";
    String email1 = RandomEmails.generateEmail() + "@mailinator.com";
    String telephone1 = "0935554444";
    String password1 = "444580";
    String passwordConfirm1 = "444580";
    String expectedText = "Your Account Has Been Created!";

    @Test
    public void registrationWithValidCredentials() {
        mainPage = new MainPage();
        CreatedAccountPage accountCreatedPage = (CreatedAccountPage) mainPage.openMainPage().clickOnMyAccount()
                .waitButtonRegisterVisible()
                .setFirstName(firstName1)
                .setLastName(lastName1)
                .setEmail(email1)
                .setTelephone(telephone1)
                .setPassword(password1)
                .setPasswordConfirm(passwordConfirm1)
                .clickPrivacyPolicy()
                .clickButtonContinue();
        assertThat(accountCreatedPage.resultAccountCreated()).isEqualTo(expectedText);
    }

}
