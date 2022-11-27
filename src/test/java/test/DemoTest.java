package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {

    @Test
    public void test() {
        NumService addService = new AddService();
        int partA = addService.calculate(3, 5);

        NumService addService2 = new AddService2();
        int partB = addService2.calculate(6, 4);

        NumService multiplyService = new MultiplyService();
        int result = multiplyService.calculate(partA, partB);
        assertEquals(80, result);
    }
}
