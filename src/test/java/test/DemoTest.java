package test;

import org.junit.*;

public class DemoTest {

    @Test
    public void test() {
        Demo demo = new Demo();
        demo.setName("Yang");
        Assert.assertEquals("Yang", demo.getName());
    }
}
