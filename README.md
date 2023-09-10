# HeadFirstDesignPatterns
Repo for my study of the book head first design patterns

## Chapter 1 StrategyPattern

### _Exercise: Sharpen your pencil page 5_

Which of the following are disadvantages of using inheritance to
provide Duck behavior? (Choose all that apply.)

A. Code is duplicated across subclasses.
B. Runtime behavior changes are difficult.
F. Changes can unintentionally affect other ducks.

### Key take aways
 - Encapsulate: remove code that will be repeated
 - Use a interface: The interface is the gateway to the behaviours
 - Use behaviours: These are the things the object will do.
 
 Example 
        ducks
        -> Duck
            -> MallardDuck
            interface
            -> FlyBehviour
            -> QuackBehviour
                behaviour
                    fly
                    -> FlyNoWings
                    -> FlyWithWings
                    quack
                    -> MuteQuack
                    -> Quack
                    -> Squeak


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

## Chapter 3 Decorator Pattern

Conponent (Beverage)
    -> ConcreteComponent(Dark Roast, Decaf etc etc)
    -> CondimentDecorator(Milk, Soy etc etc)

Beverage 
    -> CondimentDecorator
        -> Condiment


## Chapter 4 Factory Pattern

Product Classes
    -> Pizza (Abstract)
        -> NYCheesePizza (Concrete Classes)
        -> NYVeggiePizza (Concrete Classes)
        -> ChicagoCheesePizza (Concrete Classes)
        -> ChicagoCheesePizza (Concrete Classes)

Creator Classes 
    -> PizzaStore (Abstract)
        -> NYPizzaStore (Concrete Classes)
        -> ChicagoPizzaStore (Concrete Classes)


The Factory Method Pattern defines an interface
for creating an object, but lets subclasses decide which
class to instantiate. Factory Method lets a class defer
instantiation to subclasses.