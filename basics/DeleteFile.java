import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File obj = new File("file.txt");
        if(obj.delete()) {
            System.out.println("File deleted: " + obj.getName());
        }
        else{
            System.out.println("Failed to delete");
        }
    }
}
