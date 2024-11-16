package DesignPatterns.FactoryPattern;

public class FactoryDemo {
    public static void main(String[] args) {
        Toy toy1 = ToyFactory.createToy("car");
        toy1.play();

        Toy toy2 = ToyFactory.createToy("doll");
        toy2.play();

        Toy toy3 = ToyFactory.createToy("robot");
        toy3.play();
    }
}
