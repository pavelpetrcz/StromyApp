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

    public boolean getCheckInputs(String input) throws Exception {
        return checkInputs(input);
    }

    /*Methods*/
    protected boolean checkInputs(String input) throws Exception {
        boolean result = false;
        Calc start = new Calc();
        result = start.checkInput(input) && start.checkInputFileExists();
        return result;
    }







}
