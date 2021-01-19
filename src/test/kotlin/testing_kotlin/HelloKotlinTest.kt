package testing_kotlin

import org.testng.Assert
import org.testng.annotations.Test
import utils.Logger

class HelloKotlinTest {
    @Test(description = "Dummy kotlin")
    fun dummy_kotlin() {
        val txt = "kotlin ready"
        println(txt)
        Logger.WARNING(txt);
        Assert.assertTrue(true);
    }
}