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
        List<Integer> restOfParts = new ArrayList<>();
            for (int i = 2; i < parts.length; i++) {
                int value = Integer.parseInt(parts[i]);
                restOfParts.add(value);
            }
        branch.setLinks(restOfParts);
        return branch;
    }

    public boolean checkInput(String input) throws Exception {
        boolean a = false;
        String s;
        try {
            s = input.trim().toLowerCase();
              if ("start" .equals(s)) {
                  a = true;
                    }
            }
        catch (Exception e) {
            System.out.println("Chyba. Špatný příkaz.");
        }
        return a;
    }

    /**
     * Zjistí zda je soubor na místě
     * @param path - cesta k souboru
     * @return true - pokud soubor existuje
     * @throws Exception - soubor neni na miste
     */
    public boolean checkInputFileExists(String path) throws Exception {
        boolean result = false;
        try {
            File file = new File(path);
            return file.exists();
        } catch (Exception e) {
            System.out.println("Soubor není na místě.");
        }
        return result;
    }

    /**
     * Načte dokument
     * @return radky nactene ze souboru
     * @throws Exception
     */
    public List<String> readFile(String path) throws Exception {
        List<String> nodes = null;
        try {
            nodes = Files.readAllLines(Paths.get(path));
        }
        catch (Exception e) {
            System.out.println("Chyba. Nelze analyzovat soubor.");
        }
        return nodes;
    }

    /**
     *
     * @param branches list vetvi
     * @param ids list id vsech uzlu
     * @return je graf spojity?
     */
    public boolean checkConnection(List<Branch> branches, List<Integer> ids) {
        boolean statement = false;
        List<Integer> allLinks = new ArrayList<>();

        for (Branch branch : branches) {
            allLinks.addAll(branch.getLinks());
            }
        allLinks.add(1);
        if (allLinks.containsAll(ids)) {
            statement = true;
        }
        return statement;
    }

    /**
     * Spocte pocet listu urcite barvy
     * @param leafs - list objektů reprezentujici listy
     * @param colorParam - barva listu
     * @return
     */
    public int countLeafs(List<Leaf> leafs, char colorParam) {
        int i = 0;
        int count = 0;

            char color;
            for (Leaf leaf : leafs) {
                color = leafs.get(i).getColor();
                if (color == colorParam) {
                    count++;
                }
                i++;
            }
        return count;
    }

    /**
     * Spocte pocet orechu v urcitem stavu
     * @param nuts - list objektu reprezentujici orechy
     * @param nutState - stav orechu
     * @return
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
                i++;
            }
        return count;
    }

    public List<Integer> readIds(String path) throws Exception {
        List<Integer> ids = new ArrayList<>();
        List<String> listInput; //seznam načtených řádků
        Calc node = new Calc(); //konstruktor

        try {
            listInput = node.readFile(path);
            for (String item : listInput) {
                String[] helper = listInput.get(listInput.indexOf(item)).split(";");
                if (helper[0].matches("\\d")) {
                    ids.add(Integer.parseInt(helper[0]));
                }
            }
        } catch (Exception e) {
            System.out.println("Nejde načíst seznam IDs.");
        }
        return ids;
    }

}
