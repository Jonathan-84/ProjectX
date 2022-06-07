package com.game.model;

import java.util.Scanner;

public class Allies {

String chosenAlly;



    public String alexKrycek() {

        int id =1;
        int boost = 5;
        String strength = "EQ";
        System.out.println(boost);
        System.out.println("Krycek's " + strength);
        System.out.println("Krycek");
        return strength;
    }

    public void loneGunmen() {
        int id =2;
        int boost = 5;
        String strength = "IQ";
        System.out.println(boost);
        System.out.println("Lone Gunmen's " + strength);
        System.out.println("Lone Gunmen");
    }

    public void x() {
        int id =2;
        int boost = 5;
        String strength = "Balance";
        System.out.println(boost);
        System.out.println("X's " + strength);
        System.out.println("X");
    }
    public String allySelect() {

        Scanner ally = new Scanner(System.in);
        System.out.println("Choose your ally: Alex Krycek, The Lone Gunmen or X:");

        String allyName = ally.nextLine();

        switch (allyName) {
            case "Alex Krycek":
                alexKrycek();
                break;
            case "The Lone Gunmen":
                loneGunmen();
                break;
            case "X":
                x();

                break;

            default:
                System.out.println("No hero selected, try again");
                allySelect();
                break;
        }
        return chosenAlly=allyName;
    }

}
