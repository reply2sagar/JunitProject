package junittests;

import mycategories.RegressionTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by Sagar on 24-04-2016.
 */
@Category(RegressionTests.class)
public class FrontEndTests {

    @Test
    public void test1(){
        System.out.println("Simple front end test1");
    }
}
