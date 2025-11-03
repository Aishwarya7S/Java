// When multiple threads access shared data at same time - issues like data inconsistency & corruption
// Synchronization - ensures only one thread accesses it at a time.\

//Types - 2
// 1. Mutual Exclusion (Synchronization) => synchronized methods, synchronized blocks , synchronized static methods
// 2. Cooperation (Inter-thread comm) => wait(),  notify(), notifyAll()

// 1
class Counter {
    private int count = 0; // Shared variable
    synchronized void inc() {
        count++;
    }
    int get() {
        return count;
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> { for (int i = 0; i < 700; i++) c.inc(); });
        Thread t2 = new Thread(() -> { for (int i = 0; i < 700; i++) c.inc(); });

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Final Count: " + c.get());
    }
}

// 2 
// allows threads to coordinate their actions rather than just running independently.
// wait() → pauses the thread until another thread calls notify().
// notify() → wakes up one waiting thread.
// notifyAll() → wakes up all waiting threads.

// Eg: Producer–Consumer problem, where:
// The Producer thread generates data.
// The Consumer thread uses that data.
// wait() and notify() handle the coordination between them safely.
// => PC Program Flow  === The Producer creates an item and calls notify() to wake up the Consumer.The Consumer waits if no item is available and calls notify() after consuming.Both threads cooperate instead of competing — ensuring data consistency and no race conditions.
