package project.tests;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import project.pages.MainPage;

import java.util.List;

import static components.MenuCategories.*;
import static components.MenuSubCategories.*;

public class SelectItemsTest extends BaseTest {

    private MainPage mainPage;
    String email = "sashagood12121986@gmail.com";
    String password = "1234";

    @Test
    public void checkItems() {
        mainPage = new MainPage();

        List<String> myWishListItems = mainPage.openMainPage()
                .getTopBar()
                .clickOnMyAccountDropDown()
                .selectLogin()
                .inputEmail(email)
                .inputPassword(password)
                .clickButtonLogin()
                .getTopMenu()
                .hoverMouseOverMenuItem(COMPONENTS)
                .selectSubCategory(MONITORS)
                .addToWishListFollowingProducts("Apple Cinema 30\"", "Samsung SyncMaster 941BW")
                .getTopBar()
                .clickOnWishListTotal()
                .getNamesFromWishListItems();

        Assertions.assertThat(myWishListItems)
                .contains("Apple Cinema 30\"", "Samsung SyncMaster 941BW");
    }

}
