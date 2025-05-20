//File based 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename = sc.nextLine();

        try{
            File obj = new File(filename);
            if(obj.createNewFile()){
                System.out.println("File created : " + obj.getName());
            }
            else {
                System.out.println("File already exists");
            }
        

        System.out.println("Absolute Path: " + obj.getAbsolutePath());
        System.out.println("Readable: " + obj.canRead());
        System.out.println("Writable: " + obj.canWrite());
        System.out.println("File Size: " + obj.length() + " bytes");

        System.out.print("Do you want to delete the file? (yes/no): ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("yes") && obj.delete()) {
                System.out.println("File deleted.");
            } else {
                System.out.println("File not deleted.");
            }
        }

        catch(IOException e){
            e.printStackTrace();
        }
        sc.close();
        
    }
}
