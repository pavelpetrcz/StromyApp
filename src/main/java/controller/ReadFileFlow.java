package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class ReadFileFlow {
    public void starReadFile() {
        try {
            readFile();
        } catch (Exception e) {
            System.out.println("Chyba nelze číst.");
        }
    }

    protected void readFile() throws Exception {
        try {

            Calc analyze = new Calc();
            List<Object> list = new ArrayList<>();

            () -> analyze.readFile().stream()
                    .filter(element -> element.matches("\\w;[L]."))
                    .forEach(s -> analyze.createLeaf(s)).(s -> list.add(s);

            analyze.readFile().stream()
                    .filter(element -> element.matches("\\w;[O]."))
                    .forEach(a -> analyze.createNut(a));

            analyze.readFile().stream()
                    .filter(element -> element.matches("\\w;[V]."))
                    .forEach(t -> analyze.createBranch(t));

        } catch (Exception e) {
            System.out.println("Chyba nelze číst.");
        }



    }

}
