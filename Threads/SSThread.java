package Threads;

class cooking implements Runnable {
    
    String task;

    cooking(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " " + Thread.currentThread().getName());
    }
}

public class SSThread {

    public static void main(String[] args) {

        Thread t1 = new Thread(new cooking("Task1"));
        Thread t2 = new Thread(new cooking("Task2"));
        Thread t3 = new Thread(new cooking("Task3"));
        Thread t4 = new Thread(new cooking("Task4"));

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}