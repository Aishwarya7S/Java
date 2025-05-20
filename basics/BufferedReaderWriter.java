import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderWriter {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"));
            bw.write("First line");
            bw.newLine();
            bw.write("Second line");
            bw.close();
            System.out.println("Written using BufferedWriter.");

            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String line;
            System.out.println("Reading using BufferedReader:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
