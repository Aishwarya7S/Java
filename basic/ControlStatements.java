import java.util.Scanner;
public class ControlStatements{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();
        // Conditional Statements (if, if-else, switch)
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0){
            System.out.println("Negative number");
        } else{
            System.out.println("Zero");
        }

        System.out.println("Enter a day number from 1 to 7: ");
        int daynum = sc.nextInt();
        switch(daynum) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day number"); break;
        }
        
        // Looping Statements (for, while, do-while)
        System.out.println("for loop");
        for(int i=3; i<=7; i++) {
            System.out.println(i);
        }

        System.out.println("while loop");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("do-while loop");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        // Jump Statements (break, continue, return)
        for(int a = 0; a<20; a++) {
            if(a % 3 == 0) {
                continue;
            }
            if (a == 17) {
                break;
            }
            System.out.println(i);

        }

        System.out.println("Program ended successfully.");
        
        sc.close();

    }
}



