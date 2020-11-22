package project.pages;

import org.openqa.selenium.By;

public class MyWishListPage extends BasePage {
    private By productSamsung = By.xpath("//a[text()='Samsung SyncMaster 941BW']");
    private By productApple = By.xpath("//a[text()='Apple Cinema 30\"']");

    public String checkSamsungAppears() {
        waitUntilVisible(productSamsung,5);
        return find(productSamsung).getText();
    }

    public String checkAppleAppears() {
        waitUntilVisible(productApple,5);
        return find(productApple).getText();
    }
}
