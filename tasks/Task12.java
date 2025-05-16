//Regex based
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter input to validate: ");
        String input = scanner.nextLine();

        // Email Pattern:
        // Matches standard email addresses like user123@gmail.com
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        // Number Pattern:
        // Matches strings that contain only digits (0-9)
        String numberPattern = "^[0-9]+$";

        // Symbol Pattern:
        // Matches strings that contain only special characters (no letters or digits)
        String symbolPattern = "^[^a-zA-Z0-9]+$";

        // Combination Pattern:
        // Must contain at least one letter, one digit, and one special character
        String comboPattern = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).+$";

        // Pattern matching using Pattern.matches()
        if (Pattern.matches(emailPattern, input)) {
            System.out.println("Valid Email Address.");
        } else if (Pattern.matches(numberPattern, input)) {
            System.out.println("Contains only Numbers.");
        } else if (Pattern.matches(symbolPattern, input)) {
            System.out.println("Contains only Symbols.");
        } else if (Pattern.matches(comboPattern, input)) {
            System.out.println("Contains Letters, Numbers & Symbols.");
        } else {
            System.out.println(" Input doesn't match any expected format.");
        }

        scanner.close();
    }
}


