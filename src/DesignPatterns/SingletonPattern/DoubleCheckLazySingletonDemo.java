package DesignPatterns.SingletonPattern;

public class DoubleCheckLazySingletonDemo {
    private DoubleCheckLazySingletonDemo(){}

    private static DoubleCheckLazySingletonDemo instance = new DoubleCheckLazySingletonDemo();

    public static DoubleCheckLazySingletonDemo getInstance(){
        if(instance==null){
            synchronized (DoubleCheckLazySingletonDemo.class){
                if(instance==null){
                    return instance = new DoubleCheckLazySingletonDemo();
                }
            }
        }
        return instance;
    }
}
