package com.game.model;

import java.util.Scanner;

public class Enemy {

    String enemyChosen;

    public void flukeMan() {
        int attack = 5;
        String weakness = "EQ";
        System.out.println(attack);
        System.out.println("Flukeman's " + weakness);
        System.out.println("FlukeMan");
    }

    public void Tooms() {
        int attack = 5;
        String weakness = "EQ";
        System.out.println(attack);
        System.out.println("Toom's " + weakness);
        System.out.println("Tooms");
    }

    public void Syndicate() {
        int attack = 5;
        String weakness = "Balanced";
        System.out.println(attack);
        System.out.println("Syndicate's " + weakness);
        System.out.println("Syndicate");
    }

    public void Grimace() {
        int attack = 20;
        String weakness = "";
        System.out.println(attack);
        System.out.println("Grimace's " + weakness);
        System.out.println("Grimace");
    }

    public String enemySelect() {

        Scanner enemy = new Scanner(System.in);
        System.out.println("Choose your character: Flukeman, Tooms, Syndicate, or Grimace:");

        String enemyName = enemy.nextLine();

        switch (enemyName) {
            case "Flukeman":
                flukeMan();
                break;
            case "Tooms":
               Tooms();
                break;
            case "Syndicate":
              Syndicate();
                break;
            case "Grimace":
                Grimace();
                break;

            default:
                System.out.println("Select your enemy, try again");
                enemySelect();
                break;
        }
        return enemyChosen = enemyName;
    }
}
