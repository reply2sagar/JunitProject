import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class JunitParametersClass {
    private Integer number;
    private String expectedResult;

    public JunitParametersClass(Integer number,
                                String expectedResult) {
        this.number = number;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection Numbers() {
        return Arrays.asList(new Object[][] {
                { 1, "odd" },
                { 2, "even" },
                { 3, "odd"},
                { 4, "even" },
                { 5, "odd"}
        });
    }

    @Test
    public void testOddEven() {
        System.out.println("Number is : " + number);
        if (expectedResult.equalsIgnoreCase("odd"))
            assertTrue(number %2!=0);
        else
            assertTrue(number %2==0);
    }
}
