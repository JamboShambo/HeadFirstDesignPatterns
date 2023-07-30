package org.example.chapter2observerpattern.weatherapp.interfaces;

public interface IObserver {
    public void update(float temp, float humidity, float pressure);
}