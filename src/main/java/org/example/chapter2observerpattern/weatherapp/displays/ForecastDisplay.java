package org.example.chapter2observerpattern.weatherapp.displays;

import org.example.chapter2observerpattern.weatherapp.interfaces.IDisplayElement;
import org.example.chapter2observerpattern.weatherapp.interfaces.IObserver;
import org.example.chapter2observerpattern.weatherapp.WeatherStation;

public class ForecastDisplay implements IObserver, IDisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherStation weatherStation;

    public ForecastDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    public void display() {
        System.out.println("");
        System.out.println("Forecast");
        if (currentPressure > lastPressure) {
            System.out.println("    Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("    More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("    Watch out for cooler, rainy weather");
        }

    }
}