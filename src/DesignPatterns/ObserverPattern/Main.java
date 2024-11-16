package DesignPatterns.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phone = new PhoneDisplay();
        ComputerDisplay computer = new ComputerDisplay();

        weatherStation.addObserve(phone);
        weatherStation.addObserve(computer);

        weatherStation.setTemperature(23.45F);
        weatherStation.setTemperature(11.24F);
    }
}
