package com.company.OOP.Classes;


/*ACCESS MODIFIERS
    1) Default - Whenever a specific access level is not specified,
    then it is assumed to be ‘default’. The scope of the default level is within the package.

    2) Public: This is the most common access level and whenever the public access specifier
    is used with an entity, that particular entity is accessible throughout from within or outside
    the class, within or outside the package, etc.

    3) Protected: The protected access level has a scope that is within the package. A protected entity
    is also accessible outside the package through inherited class or child class.

    4) Private: When an entity is private, then this entity cannot be accessed outside the class. A
    private entity can only be accessible from within the class.
*
*
    Access Specifier	Inside Class	Inside Package	Outside package subclass	Outside package
    Private	            Yes	            No	            No	                        No
    Default	            Yes	            Yes	            No	                        No
    Protected	        Yes	            Yes	            Yes	                        No
    Public	            Yes	            Yes	            Yes	                        Yes
* */


public class Main {
    public static void main(String[] args){
//        private variables are hidden from this class
        Car porsche = new Car();
        Car holden = new Car();

//        null is the internal default state for a string
        porsche.setModel("Carrera");

        System.out.println("Model is " + porsche.getModel());
    }

}
