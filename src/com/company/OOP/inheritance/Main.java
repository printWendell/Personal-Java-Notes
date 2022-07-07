package com.company.OOP.inheritance;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 2, 20, 5, 28, "long silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
