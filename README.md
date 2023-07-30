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


## Chapter 2

### _Exercise: Sharpen your pencil page 42

Based on our first implementation, which of the following apply? (Choose all that apply.)
 - We are coding to concrete implementations, not interfaces.
 - For every new display we’ll need to alter this code.
 - We have no way to add (or remove) display elements at runtime.
 - The display elements don’t implement a common interface.