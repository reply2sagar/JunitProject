import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Sagar on 30-06-2016.
 */
public class IgnoreTest {

    @Test @Ignore
    public void test1(){
        System.out.println("This will be ignored");
    }
}
