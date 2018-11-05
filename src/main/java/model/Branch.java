package model;

import java.util.ArrayList;

public class Branch extends Node {
    public ArrayList<Integer> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<Integer> links) {
        this.links = links;
    }

    protected ArrayList<Integer> links;


}
