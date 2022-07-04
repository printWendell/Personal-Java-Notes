package com.company.Scanner;
import java.time.LocalDate;
import java.util.Scanner;

public class Survey {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");

        String username = scan.nextLine();
        System.out.println("Hello " + username);

        System.out.println("How old are you");
        int age = scan.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);
    }
}
