package DesignPatterns.FactoryPattern;
interface Toy{
    void play();
}

class Car implements Toy{
    @Override
    public void play() {
        System.out.println("Vroom!!, Car is racing");
    }
}

class Doll implements Toy{
    @Override
    public void play() {
        System.out.println("wow!!, Doll is blinking");
    }
}

class Robot implements Toy{
    @Override
    public void play() {
        System.out.println("Beep Beep!!, Robot is moving");
    }
}
public class ToyFactory {
    public static Toy createToy(String toy){
        switch (toy){
            case "car":
                return new Car();
            case "doll":
                return new Doll();
            case "robot":
                return new Robot();
            default:
                throw new IllegalArgumentException("Wrong Toy Type : "+toy);

        }
    }
}
