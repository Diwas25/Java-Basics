package DesignPatterns.AbstractFactoryPattern;

public interface Phone {
    void displayPhone();
}
interface Laptop {
    void displayLaptop();
}
//Apple Products
class Iphone implements Phone{
    @Override
    public void displayPhone() {
        System.out.println("This is an iphone");
    }
}
class MacBook implements Laptop{
    @Override
    public void displayLaptop() {
        System.out.println("This is a Macbook");
    }
}
//Galaxy Product
class GalaxyPhone implements Phone{
    @Override
    public void displayPhone() {
        System.out.println("This is an Galaxy Phone");
    }
}
class GalaxyLaptop implements Laptop{
    @Override
    public void displayLaptop() {
        System.out.println("This is a Galaxy Laptop");
    }
}

interface GadgetFactory{
    Phone createPhone();
    Laptop createLaptop();
}

class AppleFactory implements GadgetFactory{
    @Override
    public Phone createPhone() {
        return new Iphone();
    }
    @Override
    public Laptop createLaptop() {
        return new MacBook();
    }
}
class GalaxyFactory implements GadgetFactory{
    @Override
    public Phone createPhone() {
        return new GalaxyPhone();
    }
    @Override
    public Laptop createLaptop() {
        return new GalaxyLaptop();
    }
}
