package project.tests;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import project.pages.MainPage;
import project.pages.RegisterAccountPage;
import utils.RandomEmails;

public class WrongRegistrationTest extends BaseTest {

    private MainPage mainPage;
    String lastName = "Petrovskiy";
    String email = RandomEmails.generateEmail();
    String phone = "0935554444";
    String password = "444580";
    String expectedText = "First Name must be between 1 and 32 characters!";

    @Test
    public void registrationWithoutValidCredentials() {
        mainPage = new MainPage();
        RegisterAccountPage registerAccountPage = (RegisterAccountPage) mainPage.openMainPage()
                .getTopBar()
                .clickOnMyAccountDropDown()
                .selectRegister()
                .setLastName(lastName)
                .setEmail(email)
                .setPhone(phone)
                .setPassword(password)
                .setPasswordConfirm(password)
                .clickPrivacyPolicy()
                .clickButtonContinue();

        Assertions.assertThat(registerAccountPage.textAppears()).isEqualTo(expectedText);
    }
}
