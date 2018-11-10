package controller;

import model.Branch;
import model.Leaf;
import model.Node;
import model.Nut;

import java.util.List;
import java.util.stream.Collectors;

public class CalculationFlow {

    public List<Leaf> starReadFileAndCreateLeafs() throws Exception {
        return readFileCreateLeafs();
    }

    public List<Branch> starReadFileAndCreateBranches() throws Exception {
        return readFileCreateBranch();
    }

    public List<Nut> starReadFileAndCreateNuts() throws Exception {
        return readFileCreateNuts();
    }

    private List<Leaf> readFileCreateLeafs() throws Exception {
        List<Leaf> listLeafs = null;
        try {
            Calc analyze = new Calc();

                    listLeafs = analyze.readFile().stream()
                            .filter(element -> element.matches("\\d;L;\\w"))
                            .map(analyze::createLeaf).collect(Collectors.toList());

            }


        catch (Exception e) {
            System.out.println("Chyba nelze načíst listy.");
        }
        return listLeafs;
    }

    private List<Nut> readFileCreateNuts() throws Exception {
        List<Nut> listNuts = null;


        try {
            Calc analyze = new Calc();
                    listNuts = analyze.readFile().stream()
                            .filter(element -> element.matches("\\d;O;\\w"))
                            .map(analyze::createNut).collect(Collectors.toList());
            }
        catch (Exception e) {
            System.out.println("Chyba nelze načíst orechy.");
        }
        return listNuts;
    }

    private List<Branch> readFileCreateBranch() throws Exception {
        List<Branch> listBranch = null;
        try {
            Calc analyze = new Calc();
                listBranch = analyze.readFile().stream()
                            .filter(element -> element.matches("\\d;V[;\\d]*"))
                            .map(analyze::createBranch).collect(Collectors.toList());
                    }
        catch (Exception e) {
              System.out.println("Chyba nelze načíst větve.");
        }

        return listBranch;
    }


}