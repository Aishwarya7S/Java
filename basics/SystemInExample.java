//System.in is the standard input stream (keyboard input)
public class SystemInExample {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a character: ");
        int input = System.in.read(); // reads 1 byte (ASCII value)
        System.out.println("You entered: " + (char) input);
    }
}


