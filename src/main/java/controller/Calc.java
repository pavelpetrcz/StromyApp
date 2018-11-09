package controller;

import model.Branch;
import model.Leaf;
import model.Nut;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Calc implements ICalc {


    public Leaf createLeaf(String input) {
        String[] parts = input.split(";");
        Leaf leaf = new Leaf();
        leaf.setId(Integer.parseInt(parts[0]));
        leaf.setColor(parts[2].charAt(0));
        return leaf;
    }

    public Nut createNut(String input) {
        String[] parts = input.split(";");
        Nut nut = new Nut();
        nut.setId(Integer.parseInt(parts[0]));
        nut.setState(parts[2].charAt(0));
        return nut;
    }

    public Branch createBranch(String input) {
        String[] parts = input.split(";"); //vstup rozdelime
        Branch branch = new Branch(); //vytvorim vetev
        branch.setId(Integer.parseInt(parts[0])); //urcim ID

        //ulozim id ostatnich nodu
        ArrayList<Integer> restOfParts = new ArrayList<Integer>();
            for (int i = 2; i <= parts.length; i++) {
                int value = Integer.parseInt(parts[i]);
                restOfParts.add(value);
                //System.out.println(value);
                //restOfParts.add(i, Integer.parseInt(parts[i]));

            }
        branch.setLinks(restOfParts);
        return branch;
    }

    public boolean checkInput(String input) {
        boolean a = false;
        String s;
        try {
            s = input.trim().toLowerCase();
              if ("start" .equals(s)) {
                  a = true;
                    }
            }
        catch (Exception e) {
            System.out.println("Chyba.");
        }
        return a;
    }

    /* Zjistí zda je soubor na místě */
    public boolean checkInputFileExists() {
        boolean result = false;
        try {
            File file = new File("C:/Users/Pavel/Desktop/strom.txt");
            return file.exists();
        } catch (Exception e) {
            System.out.println("Soubor není na místě.");
        }
        return result;
    }

    /*Načte dokument*/
    public List<String> readFile() throws Exception {
        List<String> nodes = null;
        try {
            nodes = Files.readAllLines(Paths.get("C:/Users/Pavel/Desktop/strom.txt"));
        }
        catch (Exception e) {
            System.out.println("Chyba. Nelze analyzovat soubor.");
        }
        return nodes;
    }


    public void createEdge(ArrayList<Object> nodes) {

    }

    public int countLeafs(List<Leaf> leafs, char colorParam) {
        int i = 0;
        int count = 0;

            char color;
            for (Leaf leaf : leafs) {
                color = leafs.get(i).getColor();
                if (color == colorParam) {
                    count++;
                }
            }
        return count;
    }
    /*
    Spocte stav orechu
     */
    public int countNuts(List<Nut> nuts, char nutState) {
        int i = 0;
        int count = 0;
        char state;
            for (Nut nut : nuts) {
                state = nuts.get(i).getState();
                if (state == nutState) {
                    count++;
                }
            }
        return count;
    }




}
