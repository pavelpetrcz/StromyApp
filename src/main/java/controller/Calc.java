package controller;

import java.io.*;
import java.util.ArrayList;

public class Calc implements ICalc {

    public void createLeaf() {

    }

    public void createNugget() {

    }

    public void createBranch() {

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
            FileReader doc = new FileReader("C:/Users/Pavel/Desktop/strom.txt");
            Object in = null;
            BufferedReader br = new BufferedReader(doc);
            String readLine = "";
            ArrayList<E> nodesAndEdges = new ArrayList<Object>();

            while ((readLine = br.readLine()) != null) {
                //System.out.println(readLine);
                nodesAndEdges.add(String readLine);
            }
            nodesAndEdges.stream()
                    .filter(s -> s.);

        }
        catch (Exception e) {
            System.out.println("Chyba. Nelze analyzovat soubor.");
        }



    }

}
