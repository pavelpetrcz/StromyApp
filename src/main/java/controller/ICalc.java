package controller;

public interface ICalc {

    /*
    Vytvoří instance listů
     */
    public void createLeaf();

    /*
    Vytvoří instance ořechů
     */
    public void createNugget();

    /*
    Vytvoří instanci větví
     */
    public void createBranch();

    /*
    Zkontroluje pokyn
     */
    public boolean checkInput(String pokynek) throws Exception;

    /*
    Zkontroluje jestli existuje soubor na ploše, který očekáváme a máme zpracovat
     */
    public boolean checkInputFileExists() throws Exception;

    /*
    Přečte soubor a vytvoří instance příslušných tříd
    */
    public void readFile() throws Exception;
}
