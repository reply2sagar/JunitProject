package ordered_tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Created by Sagar on 30-04-2016.
 */

    @FixMethodOrder(MethodSorters.NAME_ASCENDING)
    public class OrderedTests {

        @Test
        public void abcTest() {
            System.out.println("ABC");
        }

        @Test
        public void pqrTest() {
            System.out.println("PQR");
        }

        @Test
        public void xyzTest() {
            System.out.println("XYZ");
        }

    }

