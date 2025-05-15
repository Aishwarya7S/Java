//User-defined Exception
import java.util.Scanner;
class InvalidStudentNameException extends Exception{
    InvalidStudentNameException (String message) {
        super(message);
    }
}

public class Task11 {
    static String[] names = {"Aishaa", "Java","Rishi"};
    static int[] marks = {77,80,93};

    public static void validStudent(String input) throws InvalidStudentNameException{
            boolean test = false;
            for(String name : names) {
                if(name.equalsIgnoreCase(input)) {
                    test = true;
                    break;
                }
            }
            if (!test) {
            throw new InvalidStudentNameException("Student '" + input + "' not found.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter student name: ");
            String input = sc.nextLine();

            System.out.print("Enter an index:" );
            int index = sc.nextInt();

            validStudent(input);

            System.out.println("Name: " + names[index]);
            System.out.println("Marks: " + marks[index]);

        } catch (InvalidStudentNameException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter a value between 0 and " + (names.length - 1));
        } finally {
            System.out.println("Validation process completed.");
            sc.close();
        }
    }
    
}
