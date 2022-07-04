package com.company.arrays;

import java.util.Arrays;

public class array {
    public static void main(String[] args){
//        Arrays
        int [] numbers =  {2, 0, 1, 4, 100};
        String [] names = {"Anna", "Ali"};

//        advanced way of looping through arrays
        Arrays.stream(numbers).forEach(System.out::println);

//        for loop
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("+++++++++++");
//        enhanced for loop
        for(int number: numbers){
            System.out.println(number);
        }

        for(String name: names){
            System.out.println(name);
        }
    }
}
