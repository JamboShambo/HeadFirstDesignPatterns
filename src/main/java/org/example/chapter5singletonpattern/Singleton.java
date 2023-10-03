package org.example.chapter5singletonpattern;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;

    }

    /*
        if(uniqueInstance == uniqueInstance){
            uniqueInstance = new Singleton();
        }
        Use this to test/illustrate that multiple
        uniqueInstance are created with different IDS
    */

    /*
    Calling this class outside of this class would look like this:
    Singleton.getInstance();

    We call the class Singleton and the public class getInstance()
    this returns a type Singleton variable. We use this to determine
    if there has been an instantiation of uniqueInstance so far. If
    there has then we return the one that has already been instantiated.
    If it hasn't we instantiate an instance of it and store it.

    The constructor is private and cannot be called from outside of this class.

     */
}