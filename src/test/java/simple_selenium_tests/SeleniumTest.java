package simple_selenium_tests;

import org.junit.Assert;
import org.junit.Test;
import seleniumtests.BaseTest;

public class SeleniumTest extends BaseTest {

    @Test
    public void verifyTitle(){
        driver.get("http://www.softpost.org");
        Assert.assertTrue(driver.getTitle().
                contains("Free Software Tutorials"));
    }

}
