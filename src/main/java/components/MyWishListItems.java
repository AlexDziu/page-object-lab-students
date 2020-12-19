package components;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MyWishListItems {

    private WebDriver driver;
    private WebElement image;
    private String productName;
    private String model;
    private String stock;
    private String unitPrice;
    private WebElement addToCartButton;
    private WebElement removeButton;

    public MyWishListItems(WebDriver driver) {
        this.driver = driver;
    }

    public MyWishListItems(WebElement image, String productName, String model,
                           String stock, String unitPrice, WebElement addToCartButton, WebElement removeButton) {
        this.image = image;
        this.productName = productName;
        this.model = model;
        this.stock = stock;
        this.unitPrice = unitPrice;
        this.addToCartButton = addToCartButton;
        this.removeButton = removeButton;
    }

    public List<MyWishListItems> getAllItems(By table) {
        List<MyWishListItems> myWishListItems = new ArrayList<>();
        List<WebElement> rows = driver.findElement(table).findElements(By.xpath(".//tr"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.xpath(".//td"));
            WebElement image = cells.get(0);
            String productName = cells.get(1).findElement(By.xpath(".//a")).getText();
            MyWishListItems item = new MyWishListItems(image, productName, null, null, null,
                    null, null);
            myWishListItems.add(item);
        }
        return myWishListItems;
    }

}
