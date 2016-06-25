package rules;

import org.junit.AssumptionViolatedException;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class TestWatcherRule {

    @Rule
    public TestRule testWatcher = new TestWatcher() {
        @Override
        public Statement apply(Statement base, Description description) {
            return super.apply(base, description);
        }

        @Override
        protected void succeeded(Description description) {
            System.out.println("Test " + description.getDisplayName() + " passed");
        }

        @Override
        protected void failed(Throwable e, Description description) {
            System.out.println("Test " + description.getDisplayName() + " failed");
        }

        @Override
        protected void skipped(AssumptionViolatedException e, Description description) {
            System.out.println("Test " + description.getDisplayName() + " skipped");
        }

        @Override
        protected void starting(Description description) {
            super.starting(description);
            System.out.println("Test " + description.getDisplayName() +" Started");
        }

        @Override
        protected void finished(Description description) {
            super.finished(description);
            System.out.println("Test " + description.getDisplayName() + " finished.");
        }
    };

    @Test
    public void simpleMathTest() {
         assert 5==3+2;
    }

    @Test
    public void complexMathTest() {
        assert Math.sqrt(625)==26;
    }

    @Test @Ignore
    public void stringTest() {
        assert "www.softpost.org".length() == 10;
    }
}