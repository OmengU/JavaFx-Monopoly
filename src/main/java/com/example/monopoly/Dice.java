package com.example.monopoly;

public class Dice{
    private int highestPossible;
    Dice (int h){
        highestPossible = h;
    }
    public int rollDice(){
        int rolledNumber = (int)(Math.random()*(highestPossible +1));
        return rolledNumber;
    }
}
