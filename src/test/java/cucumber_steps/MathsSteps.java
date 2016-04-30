package cucumber_steps;
import cucumber.api.java8.En;


/**
 * Created by Sagar on 30-04-2016.
 */
public class MathsSteps implements En {

    int result ;

    public MathsSteps() {
        When("^I add (\\d+) and (\\d+)$", (Integer arg0, Integer arg1) -> {
            result = arg0 + arg1;
        });

        Then("^result should be (\\d+)$", (Integer arg0) -> {
            assert arg0==result;
        });
    }

}
