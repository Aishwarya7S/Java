//System.out is the standard output stream (prints to console)
public class SystemOutExample {
    public static void main(String[] args) {
        System.out.println("Hello, world!");         // prints with a newline
        System.out.print("Welcome to Java! ");       // stays on same line
        System.out.print("Let's learn output.\n");   // manually adding newline - \n
        System.out.printf("Value of pi: %.2f", 3.14159); // formatted output
    }
}

// System.out.println() → prints with a newline

// System.out.print() → prints without a newline

// System.out.printf() → prints using formatted text 

// | Specifier | Description               | Example                               |
// | --------- | ------------------------- | ------------------------------------- |
// | `%d`      | Integer                   | `System.out.printf("%d", 10);`        |
// | `%f`      | Float/Double              | `System.out.printf("%.2f", 3.14159);` |
// | `%s`      | String                    | `System.out.printf("%s", "Hi");`      |
// | `%c`      | Character                 | `System.out.printf("%c", 'A');`       |
// | `%n`      | Newline (instead of `\n`) | `System.out.printf("Hello%nWorld");`  |
