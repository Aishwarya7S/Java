import java.util.*;

public class OptionalDemo {
    public static void main(String[] args) {
        String name = null;

        // Using Optional.ofNullable
        Optional<String> opt = Optional.ofNullable(name);

        // ifPresent
        opt.ifPresent(val -> System.out.println("Value: " + val));

        // orElse
        String result = opt.orElse("Default User");
        System.out.println("Result: " + result);

        // orElseThrow
        try {
            String val = opt.orElseThrow(() -> new RuntimeException("No value present!"));
            System.out.println(val);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

// Definition === A container for values that may be null or non-null & Why → Helps avoid NullPointerException.
// Common Methods:
// of(value) → creates Optional (non-null).
// ofNullable(value) → accepts null.
// empty() → empty Optional.
// isPresent() → check if value exists.
// orElse(default) → return default if null.
// ifPresent(Consumer) → action if value present.
