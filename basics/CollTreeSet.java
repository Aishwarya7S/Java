import java.util.TreeSet;
public class CollTreeSet {
        public static void main(String[] args) {
        System.out.println("TreeSet : Integer");
        TreeSet<Integer> tsi = new TreeSet<>();

        tsi.add(40);
        tsi.add(10);
        tsi.add(30);
        tsi.add(20);
        tsi.add(10); // Duplicate - ignored

        tsi.remove(30); 
        tsi.add(25);

        System.out.println(tsi);

        System.out.println("First Element: " + tsi.getFirst());
        System.out.println("Last Element: " + tsi.last());
        System.out.println("Size: " + tsi.size());
        System.out.println("Is empty? " + tsi.isEmpty());
        
        System.out.println("TreeSet : String");
        TreeSet<String> tss = new TreeSet<>();

        tss.add("orange");
        tss.add("Apple");
        tss.add("Mango");
        tss.add("Banana");
        tss.add("Jackfruit"); 

        for (String element : tss) {
            System.out.print(element + "\t");
        }

        System.out.println("\nContains 'Banana'? " + tss.contains("Banana"));
        System.out.println("Removed 'Apple': " + tss.remove("Apple"));
        System.out.println("Final Set: " + tss);
    }
}

    

