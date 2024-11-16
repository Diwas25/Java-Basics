package DesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(float temperature);
}

class PhoneDisplay implements Observer{
    @Override
    public void update(float temperature) {
        System.out.println("Phone Display - Current Temperature is : "+temperature+" degree");
    }
}

class ComputerDisplay implements Observer{
    @Override
    public void update(float temperature) {
        System.out.println("Computer Display - Current Temperature is : "+temperature+" degree");
    }
}
public class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void addObserve(Observer observer){
        observers.add(observer);
    }

    public void removeObserve(Observer observer){
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    
    public void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update(temperature);
        }
    }
}
