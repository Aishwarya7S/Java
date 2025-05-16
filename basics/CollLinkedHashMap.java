import java.util.LinkedHashMap;

public class CollLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> llhmsi = new LinkedHashMap<>();

        llhmsi.put("Aishu", 75);
        llhmsi.put("Jaya", 92);
        llhmsi.put("Senthil", 90);
        llhmsi.put("Jaya", 95); 

        System.out.println("LinkedHashMap: " + llhmsi);
        System.out.println("Size: " + llhmsi.size());
        System.out.println("Contains Rishi? " + llhmsi.containsKey("Rishi"));

        for (String name : llhmsi.keySet()) {
            System.out.println(name + " scored " + llhmsi.get(name));
        }
    }
}
