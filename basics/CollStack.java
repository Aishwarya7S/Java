import java.util.Stack;
public class CollStack {
    public static void main(String[] args) {
        System.out.println("Stack : Integer");
        Stack<Integer> si = new Stack<>();

        si.push(1);
        si.push(77);
        si.push(8);
        si.pop();
        System.out.println(si);

        System.out.println("Stack : String");
        Stack<String> ss = new Stack<>();

        ss.push("Hai");
        ss.push("hello");
        ss.push("Welcome");
        System.out.println(ss.peek());
        System.out.println("Does the stack contains 'Hai'? "  + ss.search("Hai"));
        System.out.println(ss);
   } 
}
