package rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

/**
 * Created by Sagar on 25-04-2016.
 */
public class ExternalResourceRuleTest {

    Database cn = new Database();

    @Rule
    public ExternalResource resource = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            cn.connect();
        };

        @Override
        protected void after() {
            cn.disconnect();
        };
    };

    @Test
    public void testDatabase() {
        cn.getData();
        System.out.println("Checking remote ftp server connection");
    }
}

class Database{
    public void connect(){
        System.out.println("Connecting");
    }

    public void disconnect(){
        System.out.println("Dis-connecting");
    }

    public void getData(){
        System.out.println("Getting data");
    }
}