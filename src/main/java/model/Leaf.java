package model;

public class Leaf extends Node {
    public char getColor() {
        return leafColor; //barva listu - Z = zelený, H = hnědy
    }

    public void setColor(char color) {
        this.leafColor = color;
    }

    private char leafColor; //barva listu - Z = zeleny, H = hnedy



}
