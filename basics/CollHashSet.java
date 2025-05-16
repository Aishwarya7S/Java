import java.util.HashSet;
public class CollHashSet {
    public static void main(String[] args) {
        System.out.println("HashSet : Integer");
        HashSet<Integer> hsi = new HashSet<>();

        hsi.add(11);
        hsi.add(33);
        hsi.add(100);
        hsi.add(11); //duplicate - ignored
        hsi.remove(11);
        hsi.add(77);

        System.out.println(hsi);

        System.out.println("HashSet : String");
        HashSet<String> hss = new HashSet<>();

        hss.add("Aishu");
        hss.add("Java");
        hss.add("Developer");

        for(String element: hss) {
            System.out.print(element + "\t");
        }
        
    }
}
