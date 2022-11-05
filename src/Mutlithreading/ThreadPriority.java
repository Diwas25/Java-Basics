package Mutlithreading;

public class ThreadPriority extends Thread{
    @Override
    public void run(){
        System.out.println("Inside the run() method");
    }
    public static void main(String[] args) {
        ThreadPriority tp = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();

        System.out.println(tp);
        System.out.println(tp2);
        System.out.println("Priority of the thread tp is : " + tp.getPriority());
        System.out.println("Priority of the thread tp2 is : " + tp2.getPriority());

        tp.setPriority(6);
        tp2.setPriority(3);
        System.out.println("Priority of the thread tp is : " + tp.getPriority());
        System.out.println("Priority of the thread tp2 is : " + tp2.getPriority());
    }
}
