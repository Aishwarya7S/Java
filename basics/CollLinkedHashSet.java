import java.util.LinkedHashSet;

public class CollLinkedHashSet {
    public static void main(String[] args) {
        System.out.println("LinkedHashSet : Integer");
        LinkedHashSet<Integer> lhsi = new LinkedHashSet<>();

        lhsi.add(100);
        lhsi.add(50);
        lhsi.add(25);
        lhsi.add(75);
        
        lhsi.remove(25); 

        System.out.println(lhsi);

        System.out.println("Contains 75? " + lhsi.contains(75));
        System.out.println("Is Empty? " + lhsi.isEmpty());
        System.out.println("Size: " + lhsi.size());

        System.out.println("\nLinkedHashSet : String");
        LinkedHashSet<String> lhss = new LinkedHashSet<>();

        lhss.add("React");
        lhss.add("HTML");
        lhss.add("Bootstrap");
        lhss.add("Java");

        lhss.remove("HTML");

        for (String tech : lhss) {
            System.out.print(tech + "\t");
        }

        System.out.println("\nContains 'Java'? " + lhss.contains("Java"));
        lhss.clear();
        System.out.println("After clearing: " + lhss);
    }
}
