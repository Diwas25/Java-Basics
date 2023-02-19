package DesignPatterns.SingletonPattern;

public class LazySingletonDemo {
    private LazySingletonDemo(){}

    private static LazySingletonDemo instance = new LazySingletonDemo();

    public static LazySingletonDemo getInstance(){
        if(instance==null){
            return instance = new LazySingletonDemo();
        } else{
            return instance;
        }
    }
}
