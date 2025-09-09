import java.util.function.*;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
      //Predicate<T>  Tests a condition and returns true/false.
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("10 is even? " + isEven.test(10));
      //Consumer<T> Takes input but does not return anything.
        Consumer<String> consumer = s -> System.out.println("Consumed: " + s);
        consumer.accept("Java Functional Interfaces");
      //Function<T, R> Takes input and returns a result.
        Function<String, Integer> strLength = s -> s.length();
        System.out.println("Length of 'Hello' = " + strLength.apply("Hello"));
      //Supplier<T> Provides a value (no input, only output).
        Supplier<Double> randomVal = () -> Math.random();
        System.out.println("Random Number: " + randomVal.get());
    }
}
