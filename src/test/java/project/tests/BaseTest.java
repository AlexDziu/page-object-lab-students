package project.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import project.pages.BasePage;

public class BaseTest {

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        BasePage.setDriver(driver);
        BasePage.getDriver().manage().window().maximize();
    }

    @After
    public void closeDriver() {
        BasePage.getDriver().quit();
    }


}
