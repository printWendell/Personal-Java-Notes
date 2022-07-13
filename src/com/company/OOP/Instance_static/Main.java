package com.company.OOP.Instance_static;


class Calculator{
    public static void printSum(int a, int b){
        System.out.println("sum= " + (a+b));
    }
}

//instance methods example
class Dog {
    public void bark(){
        System.out.println("woof");
    }
}

public class Main {

    /*
    * Static Methods:
    * - are declared using a static modifier
    * - can't access instance methods and instance variables directly
    * - can't use the 'this' keyword
    * - whenever you see a method that does not use instance variables that methods should be declared as a
    *   static method
    * */


    /*
    * Static variables
    * - every instance of that class shares the same static variable
    * - if changes are made to that variable, all other instances will see the effect of the change
    * - aren't used very often
    * */


    /*
    * Instance methods:
    * - belong to an instance of a class
    * - to use an instance method we have to instantiate the class first usually by using the 'new'
    *   keyword
    * - can access instance methods and instance variables directly
    * - can also access static methods and static variables directly
    * */

    /*
    * Instance variables
    * - also known as fields
    * - belongs to an instance of a class
    * - has it's own copy of an instance variable
    * - every instance can have a different value(state)
    * */

    public static void main(String[] args){
        // static methods are called by the ClassName.methodName() or methodName();
        // but only if it is in same class
        Calculator.printSum(5, 10);
        printHello(); //shorter form of Main.printHello()

        Dog rex = new Dog(); // create instance
        rex.bark(); // call instance method
    }

    public static void printHello(){
        System.out.println("Hello");
    }
}
