package rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

/**
 * Created by Sagar on 25-04-2016.
 */
public class TimeoutClass {

    public static class HasGlobalTimeout {
        public static String log;

        @Rule
        public TestRule globalTimeout = new Timeout(20000);

        @Test
        public void testInfiniteLoop1() {
            log += "ran1";
            for(;;) {}
        }

        @Test
        public void testInfiniteLoop2() {
            log += "ran2";
            for(;;) {}
        }
    }
}
