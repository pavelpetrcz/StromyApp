package controller;

import model.Node;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReadFileFlow {
    public void starReadFile() {
        try {
            readFile();
        } catch (Exception e) {
            System.out.println("Chyba nelze číst.");
        }
    }
    protected List<Node> readFile() throws Exception {
        List<Node> nodes = null;
        try {
            Calc analyze = new Calc();

            nodes = analyze.readFile().stream()
                    .filter(element -> element.matches("\\w;[L]."))
                    .map(s -> analyze.createLeaf(s)).collect(Collectors.toList());

            nodes = analyze.readFile().stream()
                    .filter(element -> element.matches("\\w;[O]."))
                    .map(a -> analyze.createNut(a)).collect(Collectors.toList());

            nodes = analyze.readFile().stream()
                    .filter(element -> element.matches("\\w;[V]."))
                    .map(t -> analyze.createBranch(t)).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Chyba nelze číst.");
        }
        return nodes;
    }

}
