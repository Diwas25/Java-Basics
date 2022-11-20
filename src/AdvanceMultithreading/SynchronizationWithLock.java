package AdvanceMultithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

class StringReverseThread extends Thread {
    private List<Character> names;
    private String message;
    private static Lock lock = new ReentrantLock(true);

    public StringReverseThread(List<Character> names, String message) {
        this.names = names;
        this.message = message;
    }

    @Override
    public void run() {
        pleaseLock();
        try {
            System.out.println("'Lock' aquired by " + Thread.currentThread().getName());
            for (int i = 0; i < message.length(); i++) {
                try {
                    names.add(message.charAt(i));
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(StringReverseThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println(names);
        } finally {
            lock.unlock();
            System.out.println("Lock unlocked by " + Thread.currentThread().getName());
        }
    }
    private void pleaseLock() {
        lock.lock();
    }
}

public class SynchronizationWithLock {
    public static void main(String[] args) throws InterruptedException {
        List<Character> list = new ArrayList<>();

        Thread thread1 = new StringReverseThread(list, "HELLO");
        thread1.start();

        Thread thread2 = new StringReverseThread(list, "WORLD");
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

