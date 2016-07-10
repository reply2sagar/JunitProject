package seleniumtests;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class SmokeTests extends BaseTest {

    @Test
    public void verifyTitle(){
        driver.get("http://www.softpost.org");
        Assert.assertTrue(driver.getTitle().contains("Free Software Tutorials"));
    }

    @Test
    public void verifyNumber(){
       Assert.assertTrue(2==2);
    }
}
