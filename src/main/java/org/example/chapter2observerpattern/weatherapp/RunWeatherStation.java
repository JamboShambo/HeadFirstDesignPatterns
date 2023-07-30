package org.example.chapter2observerpattern.weatherapp;

import org.example.chapter2observerpattern.weatherapp.displays.CurrentConditionsDisplay;
import org.example.chapter2observerpattern.weatherapp.displays.ForecastDisplay;
import org.example.chapter2observerpattern.weatherapp.displays.StatisticsDisplay;
import org.example.chapter2observerpattern.weatherapp.displays.HeatIndexDisplay;

public class RunWeatherStation {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherStation);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherStation);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherStation);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherStation);


        weatherStation.setMeasurements(80, 65, 30.4f);
        weatherStation.setMeasurements(82, 70, 29.2f);
        weatherStation.setMeasurements(78, 90, 29.2f);

        weatherStation.removeObserver(forecastDisplay);
        weatherStation.setMeasurements(62, 90, 28.1f);

        System.out.println("");
        System.out.println("");
        System.out.println("getTemperature: " + weatherStation.getTemperature());
        System.out.println("getHumidity: " + weatherStation.getHumidity());
        System.out.println("getPressure: " + weatherStation.getPressure());

    }
}