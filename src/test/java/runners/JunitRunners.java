package runners;

import hamcrest.TestHamcrest;
import ordered_tests.OrderedTests;
import org.junit.runner.JUnitCore;

/**
 * Created by Sagar on 30-04-2016.
 */
public class JunitRunners {

    public static void main(String [] args){
        JUnitCore.runClasses(OrderedTests.class, TestHamcrest.class);
    }
}
