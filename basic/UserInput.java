import java.util.Scanner;
public class UserInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Personalized Welcome Message 
        System.out.println("Enter Your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your favorite activity: ");
        String activity = sc.nextLine();

        System.out.println("Enter your dream job: ");
        String job = sc.nextLine();

        System.out.println();

        System.out.println("Hi " + name + "! It's awesome that you love " + activity + ". Hope you become a great " + job + "!");

        sc.close();

        //Always follow nextInt(), nextDouble(), or next() with sc.nextLine() if you're using nextLine() after.
    }
}
