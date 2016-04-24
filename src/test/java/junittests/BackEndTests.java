package junittests;

import mycategories.SanityTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by Sagar on 24-04-2016.
 */
@Category(SanityTests.class)
public class BackEndTests {

    @Test
    public void test1(){

        System.out.println("Simple Back end test1");
    }
}
