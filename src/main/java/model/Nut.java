package model;

public class Nut extends Node {

    /*Getter a Setter */
    public char getState() {
        return nutState;
    }

    public void setState(char state) {
        this.nutState = state;
    }

    /* Proměnné */
    private char nutState; //stav orechu - Z = zraly, N = nezraly

}
