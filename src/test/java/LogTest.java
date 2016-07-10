import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created by Sagar on 04-07-2016.
 */
public class LogTest {
        final static Logger logger = Logger.getLogger(LogTest.class);

        @Test
        public void test1(){
            logger.info("Hello - This is info");
            logger.warn("Warning baby");
            logger.error("Dump error");
        }


}
