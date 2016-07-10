import org.junit.Test;

import java.util.Map;

/**
 * Created by Sagar on 10-07-2016.
 */
public class MathsTest {

    @Test
    public void test1(){
        System.out.println("Executing addition test");
        assert 3 == MathsClass.add(1,2);
    }

    @Test
    public void test2(){
        System.out.println("Executing multiplication test");
        assert 12 == MathsClass.multiply(6,2);
    }

    @Test
    public void test3(){
        System.out.println("Print all env variables");
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }
    }
}
