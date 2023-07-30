package org.example.chapter2observerpattern.weatherapp;

import org.example.chapter2observerpattern.weatherapp.interfaces.IObservable;
import org.example.chapter2observerpattern.weatherapp.interfaces.IObserver;

import java.util.*;

public class WeatherData implements IObservable {
    private List<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<IObserver>();
    }

    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        System.out.println("");
        System.out.println("___________________ MEASUREMENTS CHANGE ___________________");
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
