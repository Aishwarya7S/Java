import java.util.Scanner;
public class Task6 {
    //2D array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i< rows; i++){
            for(int j=0; j < cols ; j++){
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();           
            }

        }
        System.out.println("Print elements of an array: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
