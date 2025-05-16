import java.util.PriorityQueue;
import java.util.Queue;

public class CollPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pqi = new PriorityQueue<>();

        pqi.offer(40);
        pqi.offer(10);
        pqi.offer(30);
        pqi.offer(20);

        System.out.println("PriorityQueue: " + pqi);
        System.out.println("Head of queue (peek): " + pqi.peek());
        System.out.println("Removed: " + pqi.poll());
        System.out.println("Contains 30? " + pqi.contains(30));
        System.out.println("Queue size: " + pqi.size());
        System.out.println("Final PriorityQueue: " + pqi);
    }
}
