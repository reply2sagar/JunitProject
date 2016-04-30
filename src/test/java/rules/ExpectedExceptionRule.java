package rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionRule {

    public static class HasExpectedException {
        @Rule
        public ExpectedException thrown = ExpectedException.none();

        @Test
        public void throwsNothing() {

        }

        @Test
        public void throwsNullPointerException() {
            thrown.expect(NullPointerException.class);
            throw new NullPointerException();
        }

        @Test
        public void throwsNullPointerExceptionWithMessage() {
            String car = null;
            thrown.expect(NullPointerException.class);
            //thrown.expectMessage("Strings can not be added");
            throw new ArithmeticException("Strings can not be added");
        }
    }
}
