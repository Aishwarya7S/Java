import java.util.LinkedList;

public class CollLinkedList {
    public static void main(String[] args) {
        System.out.println("LinkedList : Integer");
        LinkedList<Integer> lli = new LinkedList<>() ;

        lli.add(37);
        lli.add(73);
        lli.add(100);
        lli.add(2,50);
        lli.addLast(115);
        lli.addFirst(1);

        System.out.println(lli);

        lli.removeLast();

        System.out.println("LinkedList to Array");
        System.out.println("LinkedList: "+ lli);
        Object[] a = lli.toArray();
        System.out.print("To Array: ");
        for(Object element : a) 
        System.out.print(element+" ");

        System.out.println("\nLinkedList : String");
        LinkedList<String> lls = new LinkedList<>();

        lls.add("Learn");
        lls.add("Code");
        lls.add("Grow");

        System.out.println(lls);
        

    }
    
}
