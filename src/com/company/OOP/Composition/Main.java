package com.company.OOP.Composition;

public class Main {
    public static void main(String[] args){

        /*
        * A composition in Java between two objects associated with each other exists when there
        * is a strong relationship between one class and another. Other classes cannot exist without
        * the owner or parent class. For example, A ‘Human’ class is a composition of Heart and lungs.
        * When the human object dies, nobody parts exist.
        * */

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        //Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, nativeResolution); - same as above

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

//        if you want to access methods that the PC class doesn't own you can do this:
        //thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        //thePC.getMotherboard().loadProgram("Windows 1.0");
        //thePC.getTheCase().pressPowerButton();

        //however these do not work anymore since I refactored the PC class to have it's own built-in functions
        thePC.powerUp();

    }
}
