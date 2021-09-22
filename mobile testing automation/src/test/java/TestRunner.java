import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRunner extends BasePage {
    TestCase objTest;

    public TestRunner() throws IOException, InterruptedException {
    }

    @Test
    public void runApp() throws IOException, InterruptedException {
        objTest=new TestCase();
        String result=objTest.doSum();
        Assert.assertEquals(result,"12");
    }

    @Test(enabled = false , groups = "smoke")
    public void runApp2() throws IOException, InterruptedException {
        objTest=new TestCase();
        String result=objTest.doSub();
        Assert.assertEquals(result,"2");
    }

    @Test
    public void runApp3() throws IOException, InterruptedException {
        objTest=new TestCase();
        String result= objTest.doMul();
        Assert.assertEquals(result,"35");
    }

    @Test(enabled = false, groups = "smoke")
    public void runApp4() throws IOException, InterruptedException {
        objTest=new TestCase();
        String result=objTest.doDiv();
        Assert.assertEquals(result,"4");
    }

//    @Test
//    public void runApp5() throws IOException, InterruptedException {
//        objTest=new TestCase();
//        String result=objTest.doPercent();
//        Assert.assertEquals(result,"180");
//    }
}
