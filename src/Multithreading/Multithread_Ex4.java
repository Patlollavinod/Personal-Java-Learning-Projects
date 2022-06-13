package Multithreading;

class DemoThread1 extends Thread {
    Thread t;

    DemoThread1(String name) {
        t = new Thread(name);
        System.out.println("Thread " + name + " created");
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                // System.out.println("Thread " + t.getName() + " is running"); This is also
                // executable
                System.out.println("Thread != Threat");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + t.getName() + " interrupted");
        }
    }
}

public class Multithread_Ex4 {
    public static void main(String[] args) {
        DemoThread1 t1 = new DemoThread1("Test");
        t1.start();
        System.out.println(t1.getName()); // Threadname = Thread 0
        t1.t.start();
        System.out.println(t1.t.getName()); // Threadname = Test
    }
}
