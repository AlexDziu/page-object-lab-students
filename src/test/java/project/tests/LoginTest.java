package project.tests;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import project.pages.MainPage;

public class LoginTest extends BaseTest {

    private MainPage mainPage;
    String email = "sashagood12121986@gmail.com";
    String password = "1234";
    String expectedTitle = "My Account";

    @Test
    public void loginWithCredentials() {
        mainPage = new MainPage();
        String actualTitle = mainPage.openMainPage()
                .getTopBar()
                .clickOnMyAccountDropDown()
                .selectLogin()
                .inputEmail(email)
                .inputPassword(password)
                .clickButtonLogin()
                .getTextFromMyAccountMenuTitle();

        Assertions.assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}
