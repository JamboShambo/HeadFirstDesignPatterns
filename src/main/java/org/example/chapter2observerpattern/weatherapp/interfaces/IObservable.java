package org.example.chapter2observerpattern.weatherapp.interfaces;

public interface IObservable {
    public void registerObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void notifyObservers();
}