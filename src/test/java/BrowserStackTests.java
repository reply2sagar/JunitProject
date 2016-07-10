import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

/**
 * Created by Sagar on 03-07-2016.
 */

@Ignore
public class BrowserStackTests {

    String Access_Key = "ScGsN3tZEGVAFCX8nCzq";

    String UserId = "sagar211";
    String url = "http://" + UserId+ ":" + Access_Key +
            "@hub-cloud.browserstack.com/wd/hub";

    @Test
    public void testIPhone() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "iPhone");
        caps.setCapability("platform", "MAC");
        caps.setCapability("device", "iPhone 6S");

        try{
            WebDriver driver = new RemoteWebDriver(new URL(url), caps);
            driver.get("http://www.softpost.org/selenium-test-page/");
            driver.findElement(By.id("fn")).sendKeys("Sagar");
            driver.close();
            driver.quit();
    }catch (MalformedURLException ex){
            System.out.println("Malformed Exception");
        }
    }

    @Test
    public void testIpad() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "iPad");
        caps.setCapability("platform", "MAC");
        caps.setCapability("device", "iPad Pro");

        try{
            WebDriver driver = new RemoteWebDriver(new URL(url), caps);
            driver.get("http://www.softpost.org/selenium-test-page/");
            driver.findElement(By.id("fn")).sendKeys("Sagar");
            driver.close();
            driver.quit();
        }catch (MalformedURLException ex){
            System.out.println("Malformed Exception");
        }
    }

    @Test
    public void testAndroid() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "android");
        caps.setCapability("platform", "ANDROID");
        caps.setCapability("device", "Samsung Galaxy S5");

        try{
            WebDriver driver = new RemoteWebDriver(new URL(url), caps);
            driver.get("http://www.softpost.org/selenium-test-page/");
            driver.findElement(By.id("fn")).sendKeys("Sagar");
            driver.quit();
        }catch (MalformedURLException ex){
            System.out.println("Malformed Exception");
        }
    }
}
