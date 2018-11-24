package controller;

import model.Branch;
import model.Leaf;
import model.Node;
import model.Nut;

import java.util.List;
import java.util.stream.Collectors;

public class CalculationFlow {

    public List<Leaf> starReadFileAndCreateLeafs(String path) throws Exception {
        return readFileCreateLeafs(path);
    }

    public List<Branch> starReadFileAndCreateBranches(String path) throws Exception {
        return readFileCreateBranch(path);
    }

    public List<Nut> starReadFileAndCreateNuts(String path) throws Exception {
        return readFileCreateNuts(path);
    }

    private List<Leaf> readFileCreateLeafs(String path) throws Exception {
        List<Leaf> listLeafs = null;
        try {
            Calc analyze = new Calc();

                    listLeafs = analyze.readFile(path).stream()
                            .filter(element -> element.matches("\\d{1,3};L;\\w"))
                            .map(analyze::createLeaf).collect(Collectors.toList());

            }


        catch (Exception e) {
            System.out.println("Chyba nelze načíst listy.");
        }
        return listLeafs;
    }

    private List<Nut> readFileCreateNuts(String path) throws Exception {
        List<Nut> listNuts = null;


        try {
            Calc analyze = new Calc();
                    listNuts = analyze.readFile(path).stream()
                            .filter(element -> element.matches("\\d{1,3};O;\\w"))
                            .map(analyze::createNut).collect(Collectors.toList());
            }
        catch (Exception e) {
            System.out.println("Chyba nelze načíst orechy.");
        }
        return listNuts;
    }

    private List<Branch> readFileCreateBranch(String path) throws Exception {
        List<Branch> listBranch = null;
        try {
            Calc analyze = new Calc();
                listBranch = analyze.readFile(path).stream()
                            .filter(element -> element.matches("\\d{1,3};V[;\\d{1,3}]*"))
                            .map(analyze::createBranch).collect(Collectors.toList());
                    }
        catch (Exception e) {
              System.out.println("Chyba nelze načíst větve.");
        }

        return listBranch;
    }


}