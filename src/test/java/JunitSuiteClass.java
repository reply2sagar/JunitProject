import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestClass.class,
        IgnoreTest.class
})
public class JunitSuiteClass {
}