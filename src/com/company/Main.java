package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
//	    variables
//      ==============================
//      Primitive Types - pass by value
//      ==============================
//        Data Type       Size          Description
        /* byte         1 byte          Stores whole numbers from -128 to 127
        *  short        2 bytes         Stores whole numbers from -32,768 to 32,767
        *  int          4 bytes         Stores whole numbers from -2,147,493,648 to the positive version
        *  long         8 bytes         Stores whole numbers from -9,...,...,...,...,... to the positive
        *  float        4 bytes         Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        *  double       8 bytes         Stores fractional numbers. Sufficient for storing 15 decimal digits
        *  boolean      1 bit           Stores true or false values
        *  char         2 bytes         Stores a single character/letter ASCII values
        * */
        byte theByte = -128;
        short theShort = 8989;
        short anotherShort = 32_000;

        int number = 787838334;
        int anotherNumber = 787_232_323;
        long theLong = 78783833422L;

        float pi = 3.14F;
        double doublePi = 3.1415;

        boolean isAdult = false;

//        within single quotes
        char nameInitial = 'A';

//      ==============================
//      Reference Types - pass by reference
//      ==============================
        String brand = "amigosCode";
        LocalDate now = LocalDate.now();
        Date date = new Date();

//      non primitive data types aka reference types
//      reference types always begin with an uppercase
        String name = new String("AmigosCode");
        String wendell = "Wendell";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.equals("code"));
        System.out.println(now);
        System.out.println(now.getMonth());
        System.out.println(date);
    }
}
