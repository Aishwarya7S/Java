import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {
        // Lambda for Runnable
        Runnable r = () -> System.out.println("Running in thread!");
        new Thread(r).start();

        // Lambda with List forEach
        List<String> names = Arrays.asList("Aishu", "Raj", "Anu");
        names.forEach(name -> System.out.println("Hello " + name));
    }
}
