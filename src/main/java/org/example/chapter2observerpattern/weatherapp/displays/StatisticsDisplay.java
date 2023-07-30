package org.example.chapter2observerpattern.weatherapp.displays;

import org.example.chapter2observerpattern.weatherapp.interfaces.IDisplayElement;
import org.example.chapter2observerpattern.weatherapp.interfaces.IObserver;
import org.example.chapter2observerpattern.weatherapp.WeatherStation;

public class StatisticsDisplay implements IObserver, IDisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private WeatherStation weatherStation;

    public StatisticsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    public void display() {
        System.out.println("");
        System.out.println("Statistics Display");
        System.out.println("    Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);

    }
}