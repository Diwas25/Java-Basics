package DesignPatterns.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer.ComputerBuilder("Intel 9","ASI 950")
                .setRam(234)
                .setStorage(436)
                .setMemoryCard("Seleron")
                .build();
        System.out.println(computer1);

        Computer computer2 = new Computer.ComputerBuilder("AMD Ryzen 5","ASUS B450")
                .setRam(8)
                .setStorage(512)
                .build();
        System.out.println(computer2);
    }
}
