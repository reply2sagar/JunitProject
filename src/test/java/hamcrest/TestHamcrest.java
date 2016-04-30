package hamcrest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

    public class TestHamcrest {

        @Test
        public void hi(){

            TestHamcrest m1 = new TestHamcrest();
            TestHamcrest m2 = m1;
            TestHamcrest m3 = null;

            //is matcher
            Assert.assertThat(111,is(100+11));
            Assert.assertThat(111,is(not(100+12)));
            assertThat(new String[]{"junit", "hamcrest"}, is(new String[]{"junit", "hamcrest"}));

            //verification of null values
            assertThat(m3, nullValue());
            assertThat(m2, notNullValue());

            //checking if both variables point to same object
            assertThat(m1, sameInstance(m2));

            //String verifications
            assertThat("hamcrest", containsString("ham"));

            //assertions with list
            List<Integer> list = Arrays.asList(5, 2, 4);
            assertThat(list, hasItems(2, 5));

            //all of - used to make multiple assertions at a time
            assertThat(4.12, is(allOf(notNullValue(), instanceOf(Double.class), equalTo(4.12))));

            //any of - used to make multiple assertions at a time
            assertThat(4.12, is(anyOf(notNullValue(), instanceOf(String.class), equalTo(4.11))));

            //equalTo
            assertThat("Junit", is(equalTo("Junit")));

            //instanceOf
            assertThat("Junit", is(instanceOf(String.class)));

            //any of - used to make multiple assertions at a time
            assertThat(4.12, is(anyOf(notNullValue(), instanceOf(String.class), equalTo(4.11))));

        }

}
