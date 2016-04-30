package assumptions;

import org.junit.Assume;
import org.junit.Test;

/**
 * Created by Sagar on 30-04-2016.
 */
public class AssumeTest {

    @Test
    public void test1(){
        Assume.assumeTrue(ServiceCheck.isServiceRunning());
        System.out.println("This test will be executed only " +
                "when above assumption is true");
    }
}

class ServiceCheck{
    public static boolean isServiceRunning(){
        //code here to check if service is running or not
        //if service is running, true is returned else false is returned.
       return false;
    }
}
