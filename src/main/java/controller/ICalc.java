package controller;

import model.Branch;
import model.Leaf;
import model.Node;
import model.Nut;

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
    boolean checkInputFileExists(String path) throws Exception;

    /*
    Přečte soubor a vytvoří instance příslušných tříd
    */
    List<String> readFile(String path) throws Exception;

    /*
    Vytvori vazbu mezi objekt
     */
    boolean checkConnection(List<Branch> branches, List<Integer> ids);

    /*
    Spočte listy
     */
    int countLeafs(List<Leaf> nodes, char colorParam) throws Exception;

    /*
    Spocte orechy
     */
    int countNuts(List<Nut> nodes, char nutState);

    List<Integer> readIds(String path) throws Exception;


}
