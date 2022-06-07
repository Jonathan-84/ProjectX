package com.game.model;

import java.util.Scanner;

public class Hero extends Characters {

    String heroChosen;

    public void danaScully() {
        int attack = 5;
        String strength = "IQ";
        System.out.println(attack);
        System.out.println("Dana's " + strength);
        System.out.println("Scully");
    }
    public void foxMulder() {
        int attack = 7;
        String strength = "EQ";
        System.out.println(attack);
            System.out.println("Fox's " + strength);
        System.out.println("Mulder");
    }

    public void walterSkinner() {
        int attack = 4;
        String strength = "Balanced";
        System.out.println(attack);
        System.out.println("Skinner's " + strength);
        System.out.println("Skinner");
    }

    public String playerSelect() {

    Scanner hero = new Scanner(System.in);
        System.out.println("Choose your character: Fox Mulder, Dana Scully or Walter Skinner:");

    String heroName = hero.nextLine();

        switch (heroName) {
        case "Dana Scully":
           danaScully();
            break;
        case "Fox Mulder":
            foxMulder();
            break;
        case "Walter Skinner":
            walterSkinner();

            break;

        default:
            System.out.println("No hero selected, try again");
            playerSelect();
            break;
    }
     return heroChosen = heroName;

}


}