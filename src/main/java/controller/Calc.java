package controller;

import model.Branch;
import model.Leaf;
import model.Nut;
import sun.net.www.content.text.Generic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

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
        ArrayList<Integer> restOfParts = new ArrayList<>();
            for (int i = 1; i <= parts.length; i++) {
                restOfParts.add(Integer.parseInt(parts[i]));
            }
        branch.setLinks(restOfParts);

        return branch;
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
    public ArrayList<String> readFile() throws Exception {
        ArrayList<String> nodes = null;
        try {
            //nactu dokument
            FileReader doc = new FileReader("C:/Users/Pavel/Desktop/strom.txt");
            Object in = null;
            BufferedReader br = new BufferedReader(doc);
            String readLine = "";

            while ((readLine = br.readLine()) != null) {
                //System.out.println(readLine);
                nodes.add(readLine);
            }
        } catch (Exception e) {
            System.out.println("Chyba. Nelze analyzovat soubor.");
        }
        return nodes;
    }

    public void createEdge(ArrayList<Object> nodes) {

    }

}
