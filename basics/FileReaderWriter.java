import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write("Hello FileWriter and FileReader!");
            writer.close();
            System.out.println("Successfully written.");

            FileReader reader = new FileReader("file.txt");
            int ch;
            System.out.println("Reading content:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
