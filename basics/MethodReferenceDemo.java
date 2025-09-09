import java.util.*;
import java.util.function.*;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        // Static method reference
        Consumer<String> c1 = MethodReferenceDemo::printMessage;
        c1.accept("Hello via static method reference!");

        // Instance method reference
        MethodReferenceDemo obj = new MethodReferenceDemo();
        Supplier<String> s1 = obj::getMessage;
        System.out.println(s1.get());

        // Constructor reference
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> list = listSupplier.get();
        list.add("Added using constructor reference!");
        list.forEach(System.out::println);
    }

    public static void printMessage(String msg) {
        System.out.println(msg);
    }

    public String getMessage() {
        return "Hello via instance method reference!";
    }
}


// Definition ===  Shorthand for lambdas when a method already exists.
// Types:
// Static method → ClassName::staticMethod
// Instance method → object::instanceMethod
// Constructor → ClassName::new
