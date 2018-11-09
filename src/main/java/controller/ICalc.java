package controller;

import model.Branch;
import model.Leaf;
import model.Nut;

import java.util.ArrayList;
import java.util.List;

public interface ICalc {

    /*
    Vytvoří instance listů
     */
    Leaf createLeaf(String input);

    /*
    Vytvoří instance ořechů
     */
    Nut createNut(String input);

    /*
    Vytvoří instanci větví
     */
    Branch createBranch(String input);

    /*
    Zkontroluje pokyn
     */
    boolean checkInput(String input) throws Exception;

    /*
    Zkontroluje jestli existuje soubor na ploše, který očekáváme a máme zpracovat
     */
    boolean checkInputFileExists() throws Exception;

    /*
    Přečte soubor a vytvoří instance příslušných tříd
    */
    List<String> readFile() throws Exception;

    /*
    Vytvori vazbu mezi objekt
     */
    void createEdge(ArrayList<Object> nodes);

    /*
    Spočte listy
     */
    int countLeafs(List<Leaf> nodes, char colorParam) throws Exception;

    /*
    Spocte orechy
     */
    int countNuts(List<Nut> nodes, char nutState);
}
