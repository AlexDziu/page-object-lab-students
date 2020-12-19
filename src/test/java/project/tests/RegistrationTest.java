package project.tests;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import project.pages.CreatedPage;
import project.pages.MainPage;
import utils.RandomEmails;

public class RegistrationTest extends BaseTest {

    private MainPage mainPage;
    String firstName = "Alex";
    String lastName = "Petrovskiy";
    String email1 = RandomEmails.generateEmail();
    String phone = "0935554444";
    String password = "444580";
    String expectedText = "Your Account Has Been Created!";

    @Test
    public void registrationWithValidCredentials() {
        mainPage = new MainPage();
        CreatedPage accountCreatedPage = (CreatedPage) mainPage.openMainPage()
                .getTopBar()
                .clickOnMyAccountDropDown()
                .selectRegister()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email1)
                .setPhone(phone)
                .setPassword(password)
                .setPasswordConfirm(password)
                .clickPrivacyPolicy()
                .clickButtonContinue();

        Assertions.assertThat(accountCreatedPage.getSuccessMessageText())
                .isEqualTo(expectedText);
    }

}
