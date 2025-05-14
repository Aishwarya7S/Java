import java.util.Scanner;
//In method signature & Multiple exceptions can be declared
public class ThrowsExample {

    static String[] names = {"Rishi", "Bob", "Java", "Example"};
    static int[] marks = {90, 80, 70, 65};

    public static void getStudentDetails(int index) throws ArrayIndexOutOfBoundsException {
        System.out.println("Student: " + names[index]);
        System.out.println("Marks: " + marks[index]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student index: ");
        int idx = sc.nextInt();

        try {
            getStudentDetails(idx); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter between 0 and " + (names.length - 1));
        }

        System.out.println("Program completed.");
        sc.close();
    }
}
