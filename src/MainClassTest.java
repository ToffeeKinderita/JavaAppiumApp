import org.junit.Assert;
import org.junit.Test;
import sun.applet.Main;

public class MainClassTest {
    MainClass mainObj = new MainClass();

    @Test
    public void testGetLocalNumber() {
        Assert.assertSame("getLocalNumber != 14", 14, mainObj.getLocalNumber());
    }

    @Test
    public void testGetClassNumber() {
        int var = mainObj.getClassNumber();
        Assert.assertTrue("class_number is " + var, var > 45);
    }

    @Test
    public void testGetClassString() {
        String var = mainObj.getClasString();
        Assert.assertTrue("class_string doesn't contain 'Hello' or 'hello' substring. class_string = " + var, var.contains("Hello") | var.contains("hello"));
    }
}
