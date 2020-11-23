package project.tests;

import static org.assertj.core.api.Assertions.*;

import components.BoxProduct;
import org.junit.Test;
import project.pages.MainPage;
import project.pages.MyWishListPage;

import java.util.List;

public class SelectItemsTest extends BaseTest {

    private MainPage mainPage;
    String email = "sashagood12121986@gmail.com";
    String password = "1234";
    String expectedTextApple = "Apple Cinema 30\"";
    String expectedTextSamsung = "Samsung SyncMaster 941BW";

    @Test
    public void checkItems() {
        mainPage = new MainPage();
        List<BoxProduct> productFromPage = mainPage.openMainPage().clickOnMyAccount()
                .waitButtonLoginVisible()
                .inputEmail(email)
                .inputPassword(password)
                .clickButtonLogin()
                .getTopMenu()
                .chooseItems()
                .getProductFromPage();
//        assertThat(myWishListPage.checkSamsungAppears()).isEqualTo(expectedTextSamsung);
//        assertThat(myWishListPage.checkAppleAppears()).isEqualTo(expectedTextApple);

        //div[@class='button-group']//button[2]
    }

}
