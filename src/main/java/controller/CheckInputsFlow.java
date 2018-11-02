package controller;

public class CheckInputsFlow {
    private String input; //pokyn uživatele

    /*Getters and Setters*/

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public boolean getCheckInputs(String vstup) throws Exception {
        return checkInputs(vstup);
    }

    /*Methods*/
    protected boolean checkInputs(String pokyn) throws Exception {
        boolean vysledek = false;
        Calc start = new Calc();
        vysledek = start.checkInput(pokyn) && start.checkInputFileExists();
        return vysledek;
    }







}
