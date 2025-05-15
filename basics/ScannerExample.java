import java.util.Scanner;
// Scanner -> Used for reading input from user via System.in.
public class ScannerExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); 
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); 

        System.out.println("Hello " + name + ", age: " + age);

        sc.close();
    }
}

 // Always follow nextInt(), nextDouble(), or next() with sc.nextLine() if you're using nextLine() after.