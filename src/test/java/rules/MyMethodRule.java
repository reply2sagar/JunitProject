package rules;

import org.apache.commons.io.FileUtils;
import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import seleniumtests.BaseTest;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by Sagar on 26-06-2016.
 */
public class MyMethodRule implements MethodRule {
    WebDriver driver;
    public MyMethodRule(WebDriver driver){
        this.driver = driver;
    }
    public Statement apply(final Statement statement, final FrameworkMethod frameworkMethod, final Object o) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                try {
                    System.out.println("Executing method" + statement.toString());
                    statement.evaluate();
                } catch (Throwable t) {
                    captureScreenshot(frameworkMethod.getName());
                    throw t;
                }finally {
                    driver.close();
                    driver.quit();
                }
            }

            public void captureScreenshot(String fileName) {
                File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                try {
                    FileUtils.copyFile(f, new File("C:\\Users\\Sagar\\IdeaProjects\\JunitProject\\target\\abc.png"));
                }catch (Exception ex){
                    System.out.println("exception " +ex.getMessage());
                }
            }
        };
    }
}