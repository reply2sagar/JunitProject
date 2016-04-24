package parallel;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

/**
 * Created by Sagar on 24-04-2016.
 */
public class ParallelTests {

    @Test @Ignore
    public void test() {
        Class[] testClasses = {ParallelTestClassA.class,ParallelTestClassB.class };

        System.out.println("running multiple classes serially");
        JUnitCore.runClasses(ParallelComputer.serial(), testClasses);

        System.out.println("running multiple classes in parallel");
        JUnitCore.runClasses(ParallelComputer.classes(), testClasses);

        System.out.println("running methods in a class in parallel");
        JUnitCore.runClasses(ParallelComputer.methods(), testClasses);

        System.out.println("running methods as well classes in parallel");
        JUnitCore.runClasses(new ParallelComputer(true, true), testClasses);
    }

    public static class ParallelTestClassA {
        @Test
        public void testA1(){
            System.out.println("Running A1");
        }

        @Test
        public void testA2(){
            System.out.println("Running A2");
        }
    }

    public static class ParallelTestClassB {
        @Test public void testB1(){
            System.out.println("Running B1");
        }

        @Test public void testB2(){
            System.out.println("Running B2");
        }
    }
}