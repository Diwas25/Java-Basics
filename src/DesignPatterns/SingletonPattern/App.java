package DesignPatterns.SingletonPattern;

public class App {
    public static void main(String[] args) {
//        EagerSingletonDemo esdemo  = EagerSingletonDemo.getInstance();
//        System.out.println("hashcode of object 1: "+esdemo.hashCode());
//
//        EagerSingletonDemo esdemo2  = EagerSingletonDemo.getInstance();
//        System.out.println("hashcode of object 2: "+esdemo2.hashCode());

//        LazySingletonDemo lsdemo  = LazySingletonDemo.getInstance();
//        System.out.println("hashcode of object 1: "+lsdemo.hashCode());
//
//        LazySingletonDemo lsdemo2  = LazySingletonDemo.getInstance();
//        System.out.println("hashcode of object 2: "+lsdemo2.hashCode());

        DoubleCheckLazySingletonDemo dclsdemo  = DoubleCheckLazySingletonDemo.getInstance();
        System.out.println("hashcode of object 1: "+dclsdemo.hashCode());

        DoubleCheckLazySingletonDemo dclsdemo2  = DoubleCheckLazySingletonDemo.getInstance();
        System.out.println("hashcode of object 2: "+dclsdemo2.hashCode());
    }
}
