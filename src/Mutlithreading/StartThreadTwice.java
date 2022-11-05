package Mutlithreading;

public class StartThreadTwice extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        StartThreadTwice t1 = new StartThreadTwice();
        t1.start();
        System.out.println("Thread State : "+t1.getState());
        //t1.start();

    }
}
