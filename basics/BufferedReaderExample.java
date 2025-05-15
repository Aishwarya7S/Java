//BufferedReader -> Uses InputStreamReader to wrap System.in
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine(); 

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine()); // Convert String to int

        System.out.println("Hello " + name + ", age: " + age);
    }
}
