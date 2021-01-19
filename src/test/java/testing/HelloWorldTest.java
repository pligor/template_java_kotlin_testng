package testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Logger;

@Test(groups = {"HelloWorld"})
public class HelloWorldTest {

    @Test(description = "Dummy test")
    public void dummy_test() {
        final String txt = "looks ready";
        System.out.println(txt);
        Logger.INSTANCE.WARNING(txt);
        Assert.assertTrue(true);
    }
}