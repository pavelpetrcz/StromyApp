package model;

public class Nut extends Node {
    private char nutState; //stav orechu - Z = zraly, N = nezraly

    /*
    Getters a Setters
    */
    public char getState() {
        return nutState;
    }

    public void setState(char state) {
        this.nutState = state;
    }



}
