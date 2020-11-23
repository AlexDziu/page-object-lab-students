package project.pages;

import components.BoxProduct;
import org.openqa.selenium.By;

import java.util.List;

public class CategoryPage extends BasePage {
    private BoxProduct boxProduct;
    private By productBox = By.xpath("//div[@class='product-thumb']");

    public CategoryPage() {
        this.boxProduct= new BoxProduct(getDriver());
    }

    public List<BoxProduct> getProductFromPage() {
        return boxProduct.getAllProducts(productBox);
    }

//    private By addApple = By.xpath("//*[@id='content']/div[3]/div[1]/div/div[2]/div[2]/button[2]");
//    private By addSamsung = By.xpath("//*[@id='content']/div[3]/div[2]/div/div[2]/div[2]/button[2]");
//    private By wishList = By.xpath("//a[@id='wishlist-total']");
//
//    public CategoryPage buttonAddApple() {
//        waitUntilVisible(addApple,5).click();
//        return new CategoryPage();
//    }
//
//    public CategoryPage buttonAddSamsung() {
//        waitUntilVisible(addSamsung,5).click();
//        return new CategoryPage();
//    }
//
//    public MyWishListPage clickOnWishList() {
//        waitUntilVisible(wishList, 5).click();
//        return new MyWishListPage();
//    }
}
