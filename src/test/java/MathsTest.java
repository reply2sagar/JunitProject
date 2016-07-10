import org.junit.Test;

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
}
