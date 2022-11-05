package Mutlithreading;

class Hi extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
        }
    }
}
class Hello extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Hi hi = new Hi();
        Hello hello = new Hello();
        hi.start();
        try{Thread.sleep(500);} catch(Exception e){}
        hello.start();
        hi.join();
        hello.join();
        System.out.println("Bye");
    }
}
