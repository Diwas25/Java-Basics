package DesignPatterns.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        GadgetFactory appleFactory = new AppleFactory();
        Phone applePhone = appleFactory.createPhone();
        Laptop appleLaptop = appleFactory.createLaptop();
        applePhone.displayPhone();
        appleLaptop.displayLaptop();


        GadgetFactory galaxyFactory = new GalaxyFactory();
        Phone galaxyPhone = galaxyFactory.createPhone();
        Laptop galaxyLaptop = galaxyFactory.createLaptop();
        galaxyPhone.displayPhone();
        galaxyLaptop.displayLaptop();
    }
}
