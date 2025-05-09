import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (1-5): ");
        int num = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("Even or Odd");
                if(num % 2 == 0) {
                    System.out.println("Even");
                } else { 
                    System.out.println("Odd");
                }
                break;

            case 2:
                System.out.println("Multiplication Table");
                for(int i = 0; i <= 10; i++) {
                    int result = num * i;
                    System.out.println(num + " x " + i + " = " + result);
                }
                break;

            case 3:
                System.out.println("Numbers from that number to zero");
                while(num >= 0) {
                    System.out.println(num);
                    num--;
                }
                break;

            case 4:
                System.out.println("Sum of numbers from 1 to the number");
                int a = 1;
                int sum = 0;
                do {
                    sum += a;
                    a++;
                } while(a <= num); 
                System.out.println("Sum = " + sum);
                break;

            case 5:
                System.out.println("Jump Statements");
                for(int i = 0; i < 15; i++) {
                    if(i % 4 == 0) {
                        continue;
                    }
                    if (i == 10) {
                        break;
                    }
                    System.out.println(i);
                }
                break;

            default:
                System.out.println("Invalid");
                break;
        }

        sc.close();
    }
}
