package test;

/**
 * @author Denny Yang
 * @since 2022/11/27
 */
public class AddService implements NumService {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
