package Mutlithreading;

public class MyRunable implements Runnable{
    private String name;
    MyRunable(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Start Thread: "+name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End Thread: "+name);
    }
}
