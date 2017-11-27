package com.stephenslatky.logic;

import java.util.Random;

public class Dice {

    private int die_1;
    private int die_2;

    /**
     *
     */
    public Dice(){
    }

    public void roll_dice(){
        Random rand = new Random();
        die_1 = rand.nextInt(6) + 1;
        die_2 = rand.nextInt(6) + 1;
    }


    public int getDie_1() {
        return die_1;
    }

    public int getDie_2() {
        return die_2;
    }

}
