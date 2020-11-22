package project.pages;

import org.openqa.selenium.By;

public class CategoryPage extends BasePage {
    private By addApple = By.xpath("//*[@id='content']/div[3]/div[1]/div/div[2]/div[2]/button[2]");
    private By addSamsung = By.xpath("//*[@id='content']/div[3]/div[2]/div/div[2]/div[2]/button[2]");
    private By wishList = By.xpath("//a[@id='wishlist-total']");

    public CategoryPage buttonAddApple() {
        waitUntilVisible(addApple,5).click();
        return new CategoryPage();
    }

    public CategoryPage buttonAddSamsung() {
        waitUntilVisible(addSamsung,5).click();
        return new CategoryPage();
    }

    public MyWishListPage clickOnWishList() {
        waitUntilVisible(wishList, 5).click();
        return new MyWishListPage();
    }
}
