package org.example.chapter2observerpattern.weatherapp.displays;

import org.example.chapter2observerpattern.weatherapp.interfaces.IDisplayElement;
import org.example.chapter2observerpattern.weatherapp.interfaces.IObserver;
import org.example.chapter2observerpattern.weatherapp.WeatherStation;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {
    private float temperature;
    private float humidity;
    private WeatherStation weatherStation;

    public CurrentConditionsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("");
        System.out.println("Current conditions");
        System.out.println("    Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");

    }
}