package com.company.OOP.Constructors;

public class Main {
    public static void main(String[] args){
        /*
        * Create a new class for a bank account
        * Create fields for the account number, balance, customer name, email and phone number
        *
        * Create getters and setters for each field
        * Crete two additional methods
        * --1) To allow the customer to deposit funds(this should increment the balance field)
        * --2) To allow the customer to withdraw funds. This should deduct from the balance field,
        *       but not allow the withdrawal to complete if their are insufficient funds
        * Add some System.out.println's in the two methods above as well
        * */

        BankAccount bobsAccount = new BankAccount(12345, 0.00, "Bob", "bob@gmail.com", "5555555");

        bobsAccount.withdrawFunds(100.0);

        bobsAccount.depositFunds(50.0);
        bobsAccount.withdrawFunds(100.0);

        bobsAccount.depositFunds(51.0);

        System.out.println("==============================");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Matt", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());

    }
}
