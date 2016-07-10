package seleniumtests;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import rules.MyMethodRule;

@Ignore
public class MethodInterceptorTest {

    public WebDriver driver=new FirefoxDriver();

    @Rule
    public MyMethodRule m = new MyMethodRule(driver);

    @Test
    public void verifyTitle(){
        driver.get("http://www.softpost.org");
        driver.findElement(By.linkText("Java")).click();
        //Assert.assertTrue(driver.getTitle().contains("My Tuts"));
    }

}
