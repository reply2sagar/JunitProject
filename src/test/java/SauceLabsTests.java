import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Sagar on 03-07-2016.
 */
@Ignore
public class SauceLabsTests {

    String Access_Key = "3fd40be9-add3-4a6c-b580-4622e9a76810";
    String UserId = "reply2sagar";
    String url = "http://" + UserId+ ":" + Access_Key +
            "@ondemand.saucelabs.com:80/wd/hub";

    @Test
    public void testIPhone() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appiumVersion", "1.5.3");
        caps.setCapability("deviceName","iPhone 6");
        caps.setCapability("deviceOrientation", "portrait");
        caps.setCapability("platformVersion","9.3");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");
        caps.setCapability("name", "iPhone 6 Test");

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
        caps.setCapability("appiumVersion", "1.5.3");
        caps.setCapability("deviceName","iPad 2");
        caps.setCapability("deviceOrientation", "portrait");
        caps.setCapability("platformVersion","9.3");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");
        caps.setCapability("name", "iPad 2 Test");

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
}
