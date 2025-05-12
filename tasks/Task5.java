import java.util.Scanner;
public class Task5 {
    //Array based - string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  number of books: ");
        int number = sc.nextInt();
        sc.nextLine();

        String[] books = new String[number];
        for( int i=0; i< number; i++) {
            System.out.println("Enter book name" + (i+1) + " : ");
            books[i] = sc.nextLine();
        }

        System.out.println("The list of book names are");
        for( String data : books) {
            System.out.print(data + " ");
        }

        sc.close();
    }
}
