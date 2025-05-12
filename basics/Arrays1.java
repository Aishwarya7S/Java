public class Arrays1 {
    public static void main(String[] args) {
        int[] numbers = {5,10,15,20,25};
        for (int i : numbers ) {
            System.out.print(i + " ");
        }

        String[] data = {"java", "code", "program", "file", "system"};
        for (int a = 0;  a < data.length; a++) {
            System.out.println("Element at index " + a + " = " + data[a]);
        }       
    }
}
