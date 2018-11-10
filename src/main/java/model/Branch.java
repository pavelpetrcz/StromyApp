package model;

import java.util.List;

public class Branch extends Node {
    private List<Integer> links; //id ostatnich vetvi


    public List<Integer> getLinks() {
        return links;
    }

    public void setLinks(List<Integer> links) {
        this.links = links;
    }
}
