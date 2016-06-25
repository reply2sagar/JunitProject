package seleniumtests;

import org.junit.Assert;
import org.junit.Test;

public class SmokeTests extends BaseTest {

    @Test
    public void verifyTitle(){
        driver.get("http://www.softpost.org");
        Assert.assertTrue(driver.getTitle().contains("Free Software Tutorials"));
    }
}
