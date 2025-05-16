import java.util.ArrayList;

public class CollArrayList {
    public static void main(String[] args) {
        System.out.println("ArrayList : Integer");

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(3);
        ali.add(7);
        ali.add(10);
        ali.remove(2);

        System.out.println(ali);

        System.out.println("ArrayList : String");

        ArrayList<String> als = new ArrayList<>();
        als.add("Java");
        als.add("Python");
        als.add("C");
        als.set(2,"Js");

        for (String arr : als) {
            System.out.println(arr);
        }
    }
    
}
