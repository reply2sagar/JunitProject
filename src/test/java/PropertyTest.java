import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Sagar on 04-07-2016.
 */
public class PropertyTest {
    public static void main(String[] args) {

        String resourceName = "Environment.properties"; // could also be a constant
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties props = new Properties();
        try{
            InputStream resourceStream =
                    loader.getResourceAsStream(resourceName);
            props.load(resourceStream);
            System.out.println(props.getProperty("webserver.url"));
        }catch (Exception ex){
            System.out.println("Exception ");
        }


    }
}
