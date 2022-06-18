package Multithreading;

class MyTimePassThread implements Runnable {
    Thread t;
    String name;

    MyTimePassThread(String name) {
        this.name = name;
        t = new Thread(name);
        System.out.println("Thread " + name + " created");
    }

    MyTimePassThread(String name, int num) {
        this.name = name;
        t = new Thread(name);
        try {
            t.setPriority(num);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid priority");
        }

        System.out.println("Thread " + name + " created");
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Thread " + name + " is running");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread " + name + " interrupted");
            }
        }
    }
}

public class Multithread_Ex5 {
    public static void main(String[] args) {
        MyTimePassThread t1 = new MyTimePassThread("Thread 1");
        t1.run();
    }
}
