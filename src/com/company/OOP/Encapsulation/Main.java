package com.company.OOP.Encapsulation;

public class Main {
    public static void main(String[] args){
        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

//        better version of encapsulation
        EnhancedPlayer player1 = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is " + player1.getHealth());
    }
}
