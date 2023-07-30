## Chapter 2 Observer Pattern

### _Exercise: Sharpen your pencil page 42

Based on our first implementation, which of the following apply? (Choose all that apply.)
 - We are coding to concrete implementations, not interfaces.
 - For every new display we’ll need to alter this code.
 - We have no way to add (or remove) display elements at runtime.
 - The display elements don’t implement a common interface.

### Key take aways
 - IObservable (This is a Interface class)
        This is class that can be Observed. It has to have a way to register and unregister "Subscribers".
        Also a way to notify to the "Subscribers" when there is a change to it.
        Methods: register, unregister, notify
 - IObserver (This is a Interface class)
        This is what will Observe the Observable.
        Methods: update
 - WeatherStation (This is a concrete Observable)
 - CurrentConditionsDisplay, ForecastDisplay, HeatIndexDisplay, StatisticsDisplay (These are concrete Observers)


Example
    IObservable (Implemented by) (Is an Observable)
    -> WeatherStation
    IObserver (Implemented by) (Registered as Observers)
    -> CurrentConditionsDisplay
    -> ForecastDisplay
    -> HeatIndexDisplay
    -> StatisticsDisplay
    IDisplayElement (Implemented by) 
    -> CurrentConditionsDisplay
    -> ForecastDisplay
    -> HeatIndexDisplay
    -> StatisticsDisplay