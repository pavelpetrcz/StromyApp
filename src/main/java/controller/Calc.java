package controller;

import model.Branch;
import model.Leaf;
import model.Nut;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Calc implements ICalc {

    public void createLeaf(String input) {
        String[] parts = input.split(";");
        Leaf leaf = new Leaf();
        leaf.setId(Integer.parseInt(parts[0]));
        leaf.setColor(parts[2].charAt(0));
    }

    public void createNut(String input) {
        String[] parts = input.split(";");
        Nut nut = new Nut();
        nut.setId(Integer.parseInt(parts[0]));
        nut.setState(parts[2].charAt(0));
    }

    public void createBranch(String input) {
        String[] parts = input.split(";");
        Branch branch = new Branch();
        branch.setId(Integer.parseInt(parts[0]));
    }

    public boolean checkInput(String input) {
        boolean a = false;
        try {
            String s = input.trim().toLowerCase();
                if (s.equals("analyzuj")) {
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
            return result = file.exists();
        } catch (Exception e) {
            System.out.println("Soubor není na místě.");
        }
        return result;
    }

    /*Načte dokument a podle procházení vytváří objekty*/
    public void readFile() throws Exception {
        try {
            //nactu dokument
            FileReader doc = new FileReader("C:/Users/Pavel/Desktop/strom.txt");
            Object in = null;
            BufferedReader br = new BufferedReader(doc);
            String readLine = "";

            //kolekce - co radek v souboru, to jedna polozka kolekce
            ArrayList<String> nodes = new ArrayList<>();

            while ((readLine = br.readLine()) != null) {
                //System.out.println(readLine);
                nodes.add(readLine);
            }
            //streamy na filtrovani podle typu uzlu a vytvoreni uzlu
            nodes.stream()
                .filter(element -> element.matches("\\w;[V]."))
                .forEach(t -> createBranch(t));

            nodes.stream()
                .filter(element -> element.matches("\\w;[L]."))
                .forEach(s -> createLeaf(s));

            nodes.stream()
                    .filter(element -> element.matches("\\w;[O]."))
                    .forEach(a -> createNut(a));
        }
        catch (Exception e) {
            System.out.println("Chyba. Nelze analyzovat soubor.");
        }



    }

}
