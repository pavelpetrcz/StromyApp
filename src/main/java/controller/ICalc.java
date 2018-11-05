package controller;

import model.Branch;

public interface ICalc {

    /*
    Vytvoří instance listů
     */
    public void createLeaf(String input);

    /*
    Vytvoří instance ořechů
     */
    public void createNut(String input);

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
    public void readFile() throws Exception;

    /*
    Vytvori vazbu mezi objekt
     */
    public void createEdge();

}
