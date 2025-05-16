import java.util.HashMap;

public class CollHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hmis = new HashMap<>();

        hmis.put(301, "Java");
        hmis.put(302, "Python");
        hmis.put(303, "C++");
        hmis.put(301, "Java Latest Version"); 
        hmis.put(null, "NullKey");
        hmis.put(304, null);
        hmis.remove(302);

        System.out.println("Hashmap: " + hmis);
        System.out.println(hmis.size());
		System.out.println(hmis.values());
        System.out.println("Value at key 303: " + hmis.get(303));
        System.out.println("Contains Key 304? " + hmis.containsKey(304));
        System.out.println("Contains Value 'Python'? " + hmis.containsValue("Python"));

        System.out.println("Key-Value pairs:");
        for (Integer key : hmis.keySet()) {
            System.out.println(key + " => " + hmis.get(key));
        }
    }
}
