import java.util.LinkedList;
import java.util.Queue;

public class CollQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");

        System.out.println("Queue: " + queue);
        System.out.println("Head of queue (peek): " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Contains Task2? " + queue.contains("Task2"));
        System.out.println("Queue size: " + queue.size());
        System.out.println("Final Queue: " + queue);
    }
}

