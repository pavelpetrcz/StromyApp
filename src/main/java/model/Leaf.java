package model;

public class Leaf extends Node {
    private char leafColor; //barva listu - Z = zeleny, H = hnedy

    /*
    Getters and setters
    */

    public char getColor() {
        return leafColor; //barva listu - Z = zelený, H = hnědy
    }

    public void setColor(char color) {
        this.leafColor = color;
    }
}
