import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TimeoutTestClass {

    @Test(timeout=1000)
    public void test1() throws Exception{
        System.out.println("**Running test from sanity**");
        Thread.sleep(5000);
        assertTrue("Checking simple condition",1==1);
    }
}