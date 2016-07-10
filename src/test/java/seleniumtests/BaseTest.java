package seleniumtests;

import org.apache.commons.io.FileUtils;
import org.junit.AssumptionViolatedException;
import org.junit.Before;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import rules.MyMethodRule;

import java.io.File;

public class BaseTest {
    public WebDriver driver=new FirefoxDriver();

    @Rule
    public MyMethodRule m = new MyMethodRule(driver);

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

//    @Before
//    public void init(){
//      driver = new FirefoxDriver();
//    }

    @After
    public void cleanup(){
        System.out.println("in clean up");
    }
}
