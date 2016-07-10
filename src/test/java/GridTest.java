import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class GridTest {

    public static void main(String[] args) throws Exception{
        WebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.firefox());

        driver.get("http://www.softpost.org");
        driver.close();
        driver.quit();
    }
}
