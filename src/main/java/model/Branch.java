package model;

import java.util.ArrayList;

public class Branch extends Node {
    private ArrayList<Integer> links; //id ostatnich vetvi


    public ArrayList<Integer> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<Integer> links) {
        this.links = links;
    }
}
