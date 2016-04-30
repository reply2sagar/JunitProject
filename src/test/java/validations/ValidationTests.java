package validations;

import org.junit.Test;

/**
 * Created by Sagar on 24-04-2016.
 */
public class ValidationTests {

    @Test
    public void test1(){
        System.out.println("Simple validation test1");
    }

    @Test
    public void test2(){
        System.out.println("another validation test2");
    }

    @Test
    public void test3(){
        System.out.println("another validation test3");
        assert "softpost".equalsIgnoreCase(".org");
    }
}
