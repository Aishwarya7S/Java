import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter Writer = new FileWriter("file.txt");
            Writer.write("Hello, this is Java File Handling!");
            Writer.close();
            System.out.println("Successfully written to the file.");
        }
        catch(IOException e){
            System.out.println("Error");
            // e.printStackTrace();
        }
    }
}
