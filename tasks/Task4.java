public class Task4 {
    //Array based - int
    public static void main(String[] args) {
        int[] marks = {37,48,17,50,23};
        int sum = 0, lowestnum = Integer.MAX_VALUE , highestnum = Integer.MIN_VALUE;
        for(int a : marks) {
            sum += a;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / marks.length);
        for (int num : marks) {
            if(num > highestnum) {
                highestnum = num;
            }
            if(num < lowestnum) {
                lowestnum = num;
            }
        }
        System.err.println("Highest Value: " + highestnum);
        System.err.println("Lowest Value: " + lowestnum);

        for(int data : marks) {
            System.out.print(data + " ");
        }
        
    }
}



// import java.util.Scanner;

// public class Task {

// 	public static void main(String[] args) {

// 		Scanner scan = new Scanner(System.in);
// 		int n = scan.nextInt();

// 		int[] a = new int[n];
// 		for (int i = 0; i < n; ++i) {
// 			int val = scan.nextInt();
// 			a[i] = val;
// 		}

// 		scan.close();

// 		for (int i = 0; i < a.length; i++) {
// 			System.out.println(a[i]);
// 		}
// 	}
// }
