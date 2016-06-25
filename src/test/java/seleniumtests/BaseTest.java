package seleniumtests;

import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    public WebDriver driver;
    @Before
    public void init(){
      driver = new FirefoxDriver();
    }

    @After
    public void cleanup(){
        driver.close();
        driver.quit();
    }
}
