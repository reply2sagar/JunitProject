import static org.junit.Assert.*;

import org.junit.*;
import org.junit.experimental.categories.Category;

public class TestClass {

    @BeforeClass
    public static void initialize(){
//This method will be called once before all tests are run in this class
//do stuff here which you want to do only once for all test methods
//in this class like setting up environment, allocating resources
        System.out.println("Before Class method");
    }

    @Before
    public void initMethod(){
//This method will be called once before each test is run
//In this method, do stuff which you want to do before each test
        System.out.println("Before each test");
    }

    @Category(SanityTests.class)
    @Test
    public void test1(){
        System.out.println("**Running test from sanity**");
        assertTrue("Checking simple condition",1==1);
    }

    @Test
    public void test2(){
        System.out.println("Running test2");
        Assert.assertTrue("Checking other condition",1==2);
    }

    @After
    public void cleanUpMethod(){
//This method will be called once after each test is run
//In this method, do stuff which you want to do after each test
        System.out.println("After each test");
    }

    @AfterClass
    public static void cleanUp(){
//This method will be called once after all tests are run in this class
//do stuff here which you want to do only once for all test methods
//in this class like cleaning environment, releasing resources
        System.out.println("After Class method");
    }
}