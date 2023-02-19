package DesignPatterns.SingletonPattern;

//code for basic singleton
public class EagerSingletonDemo {
    //make constructor private
    private EagerSingletonDemo(){}

    //make an object to be used by factory method
    private static EagerSingletonDemo instance = new EagerSingletonDemo();

    //factory method code
    public static EagerSingletonDemo getInstance(){
        return instance;
    }
}
