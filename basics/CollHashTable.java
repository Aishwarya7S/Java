import java.util.Hashtable;

public class CollHashTable {
    public static void main(String[] args) {
        Hashtable<String, String> loginTable = new Hashtable<>();

        loginTable.put("admin", "admin@123");
        loginTable.put("user", "user@abc");
        loginTable.put("guest", "guest@xyz");

        System.out.println("Hashtable: " + loginTable);
        System.out.println("Password of user: " + loginTable.get("user"));
        System.out.println("Contains key 'admin'? " + loginTable.containsKey("admin"));

        for (String key : loginTable.keySet()) {
            System.out.println(key + " -> " + loginTable.get(key));
        }
    }
}

