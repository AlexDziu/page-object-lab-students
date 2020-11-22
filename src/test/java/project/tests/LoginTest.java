package project.tests;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import project.pages.MainPage;
import project.pages.MyAccountPage;

public class LoginTest extends BaseTest {

    private MainPage mainPage;
    String email = "sashagood12121986@gmail.com";
    String password = "1234";
    String expectedText = "My Account";

    @Test
    public void loginWithCredentials() {
        mainPage = new MainPage();
        MyAccountPage myAccountPage = mainPage.openMainPage().clickOnMyAccount()
                .waitButtonLoginVisible()
                .inputEmail(email)
                .inputPassword(password)
                .clickButtonLogin();
        assertThat(myAccountPage.visibleText()).isEqualTo(expectedText);
    }
}
