import java.util.TreeMap;

public class CollTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmis = new TreeMap<>();

        tmis.put(3, "Aishaa");
        tmis.put(1, "Arjun");
        tmis.put(2, "Sneha");
        tmis.put(4, "Rishi");

        System.out.println("TreeMap : " + tmis);

        System.out.println("First Entry: " + tmis.firstEntry());
        System.out.println("Last Key: " + tmis.lastKey());
        System.out.println("Higher key than 2: " + tmis.higherKey(2));
        System.out.println("\nStudent with roll number 4: " + tmis.get(4));
        System.out.println("Contains value 'Arjun'? " + tmis.containsValue("Arjun"));
        tmis.clear();
        System.out.println("\nAfter clearing, TreeMap is empty? " + tmis.isEmpty());
    }
}
