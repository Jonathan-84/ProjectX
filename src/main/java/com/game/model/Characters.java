package com.game.model;

import java.util.Scanner;

public class Characters {

   // public static String playerChoice;


    /// currently player, ally, enemy select all happen on their model pages...
    /// Since this is the page that I'm supposed to have those plays inherit health from... OI think that I need
    // to reworkd this to potentially to interface or some similar service page.
    // look into how abstract class worjks too


    static void sharedCharacter() {
        int health = 100;
        // System.out.println(health);

    }

static public void characterSelect(){
Hero selectedHero = new Hero();
Enemy selectedEnemy = new Enemy();
Allies selectedAlly= new Allies();
selectedHero.playerSelect();
selectedEnemy.enemySelect();
selectedAlly.allySelect();

    }


}