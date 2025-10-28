// Java thread is the smallest unit of execution within a program. 
// It is a lightweight subprocess that runs independently but shares the same memory space as the process, allowing multiple tasks to execute concurrently.

// Thread Creation Methods
// 1. By Extending the Thread Class
// 2. By Implementing the Runnable Interface
// Note -> Extend Thread when you don’t need to extend any other class. Implement Runnable when your class already extends another class.

// Thread Life Cycle
// New: Thread object is created but not started.
// Runnable: Thread is ready to run and waiting for CPU allocation.
// Running: Thread is executing its run() method.
// Waiting/Blocked: Thread waits for a resource or another thread.
// Terminated: Thread completes execution or is stopped.
