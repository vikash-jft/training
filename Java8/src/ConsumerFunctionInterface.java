import java.util.function.Consumer;

/**
 * Created by vikash on 3/10/17.
 */
public class ConsumerFunctionInterface {
    public static void main(String[] args) {
        Consumer<String> c= s -> {
            System.out.println("Hello"+s);
        };
        c.accept(" Vikash ");
        c.accept("JftTechnologies.com");
    }
}
