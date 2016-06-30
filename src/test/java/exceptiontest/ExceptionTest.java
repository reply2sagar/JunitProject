package exceptiontest;

import org.junit.Test;

public class ExceptionTest {
    @Test(expected = ArithmeticException.class)
    public void testException(){
        System.out.println("Running Exception test");
        int k = 2 ;
        int b = 100/k;
    }
}
