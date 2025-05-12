import java.util.Scanner;
public class Task3{
    //String based
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("String equals 'Code'? " + input.equalsIgnoreCase("code"));
        System.out.println("Length: " + input.length());
        System.out.println("Endswith 'a' " + input.endsWith("a"));
        System.out.println("First Letter: " + input.charAt(0));
        System.out.println("Last Letter: " + input.charAt(input.length()-1));
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Substring: " + input.substring(1,4));
        
        sc.close();
    }
}