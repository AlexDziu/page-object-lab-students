package project.pages;

import components.MyWishListItems;
import lombok.Getter;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WishListPage extends BasePage {

    private final MyWishListItems myWishListItems;
    private final By myWishListTable = By.xpath("//div[@class='table-responsive']//table//tbody");

    public WishListPage() {
        this.myWishListItems = new MyWishListItems(driver);
    }

    public List<MyWishListItems> getAllItemsFromWishList() {
        return myWishListItems.getAllItems(myWishListTable);
    }

    public List<String> getNamesFromWishListItems() {
        List<MyWishListItems> allItemsFromWishList = getAllItemsFromWishList();
        List<String> names = new ArrayList<>();
        for (MyWishListItems wishListItem : allItemsFromWishList) {
            names.add(wishListItem.getProductName());
        }
        return names;
    }
}
