import java.util.Scanner;
public class TCFExceptions {
    public static void main(String[] args) {
        String[] name = {"Aishu", "Tom", "Java"};
        int[] marks = {37, 19, 17};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an index: ");
        int num = sc.nextInt();

        try{
            System.out.println(marks[num] + "\t" + name[num]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
        finally{
            System.out.println("Completed");
        }
        sc.close();
    }
}
