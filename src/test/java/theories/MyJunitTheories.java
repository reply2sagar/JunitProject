package theories;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class MyJunitTheories {

    @DataPoints
    public static int[] dataPoints() {
        return new int[]{
                71, 82, 53,-1
        };
    }

    //For a and b where a,b > 0
    //(a+b)^2 = a^2+b^2+2ab
    //a+b > a and a+b > b
    @Theory
    public void squareTheory(Integer a, Integer b) {
        //Below assume statement ensures that we are testing only positive numbers
        Assume.assumeTrue(a > 0 && b > 0);

        System.out.println("Running with Data points - " + a + " , "+ b);

        Double leftSide = Math.pow(a+b,2);
        Double rightSide = Double.valueOf(a * a + b * b + 2 * a * b);

        assertEquals(leftSide,rightSide);
        assertTrue(a + b > a);
        assertTrue(a + b > b);
    }

}
