package components;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ProductBox {

    private WebDriver driver;

    public ProductBox(WebDriver webDriver) {
        this.driver = webDriver;
    }

    private WebElement image;
    private String nameItem;
    private String direction;
    private String price;
    private WebElement addToCard;
    private WebElement addToWishList;
    private WebElement compareThisProduct;

    public ProductBox(WebElement image, String nameItem, String direction, String price, WebElement addToCard, WebElement addToWishList, WebElement compareThisProduct) {
        this.image = image;
        this.nameItem = nameItem;
        this.direction = direction;
        this.price = price;
        this.addToCard = addToCard;
        this.addToWishList = addToWishList;
        this.compareThisProduct = compareThisProduct;
    }

    public List<ProductBox> getAllProducts(By locator) {
        List<ProductBox> list = new ArrayList<>();
        List<WebElement> elements = driver.findElements(locator);
        for (WebElement element : elements) {
            WebElement image = element.findElement(By.xpath(".//img[@class='img-responsive']"));
            String nameItem = element.findElement(By.xpath(".//div[@class='caption']//h4/a")).getText();
            String direction = element.findElement(By.xpath(".//div[@class='caption']/p[1]")).getText();
            String price = element.findElement(By.xpath(".//span[@class='price-tax']")).getText();
            WebElement addToCard = element.findElement(By.xpath(".//div[@class='button-group']/button[1]"));
            WebElement addToWishList = element.findElement(By.xpath(".//div[@class='button-group']/button[2]"));
            ProductBox productBox = new ProductBox(image, nameItem, direction, price, addToCard, addToWishList, null);
            list.add(productBox);
        }
        return list;

    }
}
