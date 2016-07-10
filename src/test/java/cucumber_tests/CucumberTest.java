package cucumber_tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Ignore;
import org.junit.runner.RunWith;

/**
 * Created by Sagar on 30-04-2016.
 */
@Ignore
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:simplemaths.feature",
        glue = "classpath:cucumber_steps"
)

public class CucumberTest {
}
