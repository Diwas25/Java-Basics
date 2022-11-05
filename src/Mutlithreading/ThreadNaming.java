package Mutlithreading;

public class ThreadNaming extends Thread{
    public void run(){
        System.out.println("Thread is running....");
    }
    public static void main(String[] args) {
        ThreadNaming t1 = new ThreadNaming();
        ThreadNaming t2 = new ThreadNaming();
        ThreadNaming t3 = new ThreadNaming();

        t1.setName("Ravi");
        t2.setName("Nitin");
        t3.setName("Rahul");
        System.out.println("Thread Name "+t1.getName());
        System.out.println("Thread Name "+t2.getName());
        System.out.println("Thread Name "+t3.getName());
    }
}
