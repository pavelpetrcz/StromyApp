package controller;

import model.Branch;
import model.Leaf;
import model.Nut;

import java.util.ArrayList;

public interface ICalc {

    /*
    Vytvoří instance listů
     */
    public Leaf createLeaf(String input);

    /*
    Vytvoří instance ořechů
     */
    public Nut createNut(String input);

    /*
    Vytvoří instanci větví
     */
    public Branch createBranch(String input);

    /*
    Zkontroluje pokyn
     */
    public boolean checkInput(String input) throws Exception;

    /*
    Zkontroluje jestli existuje soubor na ploše, který očekáváme a máme zpracovat
     */
    public boolean checkInputFileExists() throws Exception;

    /*
    Přečte soubor a vytvoří instance příslušných tříd
    */
    public ArrayList<String> readFile() throws Exception;

    /*
    Vytvori vazbu mezi objekt
     */
    public void createEdge(ArrayList<Object> nodes);

}
