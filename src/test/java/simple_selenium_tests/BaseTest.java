package simple_selenium_tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("Launching browser");
        driver = new FirefoxDriver();
    }

    @After
    public void cleanup(){
        System.out.println("Closing the browser");
        driver.close();
        driver.quit();
    }
}
