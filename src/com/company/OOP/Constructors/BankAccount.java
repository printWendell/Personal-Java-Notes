package com.company.OOP.Constructors;

public class BankAccount {
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

    private double accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
//        calling a constructor within a constructor - default fields
//        has to be the very first line called
        this(56789, 2.50, "Default Name", "Default Address", "Default phone");
        System.out.println("Empty constructor called");
    }


    public BankAccount(double accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /*
    * another constructor, but with only a select default fields
    public BankAccount(String customerName, String email, String phoneNumber) {
    *   this(99999, 100.55, customerName, email, phoneNumber)
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    *
    * */
    public double getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setAccountNumber(int accNum){
        this.accountNumber = accNum;
    }
    public void setBalance(int balanceNum){
        this.balance = balanceNum;
    }
    public void setCustomerName(String cName){
        this.customerName = cName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String pNumber){
        this.phoneNumber = pNumber;
    }

    public void depositFunds(double funds){
        this.balance += funds;
        System.out.println("Deposit of " + this.getBalance() + " made");
    }
    public void withdrawFunds(double funds){
        if(this.balance < funds){
            System.out.println("Insufficient funds. Only " + this.getBalance() + " is available");
        } else {
            this.balance -= funds;
            System.out.println("Withdrawal Successful. Remaining balance: " + this.getBalance());
        }
    }
}
