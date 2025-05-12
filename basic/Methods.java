public class Methods {
    public static void greet() {
        System.out.println("Hello Java!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    
    public static int words(String s) {
        return s.length();
    }

    public static int counts(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public int max(int[] arr) {
        int sum = 0;
        for (int n: arr){
            sum += n;
        }
        return sum;
    }
    public static void main(String[] args) {
        greet();
        System.out.println("Add: " + add(13,17));

        Methods met = new Methods();
        System.out.println("Multiplication: "+ met.multiply(10,7));

        System.out.println("Length of a string: " + words("Hello"));

        String sentence = "Java is a programming language";
        System.out.println("Word Count: " + counts(sentence));

        int[] elements = {3, 7, 10, 15, 30};
        System.out.println("Sum of the array: " + met.max(elements));

    }
}
