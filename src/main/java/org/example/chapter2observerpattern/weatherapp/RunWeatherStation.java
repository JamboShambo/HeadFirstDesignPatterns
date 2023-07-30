package org.example.chapter2observerpattern.weatherapp;

import org.example.chapter2observerpattern.weatherapp.displays.CurrentConditionsDisplay;
import org.example.chapter2observerpattern.weatherapp.displays.ForecastDisplay;
import org.example.chapter2observerpattern.weatherapp.displays.StatisticsDisplay;
import org.example.chapter2observerpattern.weatherapp.displays.HeatIndexDisplay;

public class RunWeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);


        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);

        System.out.println("");
        System.out.println("");
        System.out.println("getTemperature: " + weatherData.getTemperature());
        System.out.println("getHumidity: " + weatherData.getHumidity());
        System.out.println("getPressure: " + weatherData.getPressure());

    }
}