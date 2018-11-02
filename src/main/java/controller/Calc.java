package controller;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class Calc implements ICalc {

    public void createLeaf() {

    }

    public void createNugget() {

    }

    public void createBranch() {

    }

    public boolean checkInput(String pokynek) {
        boolean a = false;
        try {
            String s = pokynek.trim().toLowerCase();
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
            String neco = br.readLine();

            //System.out.println(neco);
        } catch (Exception e) {
            System.out.println("Chyba. Nelze analyzovat soubor.");
        }



    }

}
