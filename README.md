# HeadFirstDesignPatterns
Repo for my study of the book head first design patterns

## Chapter 1

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
 