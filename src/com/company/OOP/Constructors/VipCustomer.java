package com.company.OOP.Constructors;

public class VipCustomer {
    /*
    * Create a new class VipCustomer
    * it should have 3 fields name, credit limit, and email address
    * create 3 constructors
    * --1st constructor empty should call the constructor with 3 parameters with default values
    * --2nd constructor should pass on the 2 values if receives and add a default value for the 3rd
    * --3rd constructor should save all fields.
    * create getters only for this using code generation intellij as setters wont be needed
    * */

    private String name;
    private double creditLimit;
    private String email;

//    3rd constructor
    public VipCustomer(){
        this("Default name", 50000.00, "default@gamil.com");
    }

//    2nd constructor - default email
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@gmail.com");
    }

//    default values - 1st constructor
    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email= email;
    }

    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
