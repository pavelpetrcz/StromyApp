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

    public boolean getCheckInputs(String input, String path) throws Exception {
        return checkInputs(input, path);
    }

    /*Methods*/
    protected boolean checkInputs(String input, String path) throws Exception {
        boolean result = false;
        Calc start = new Calc();
        result = start.checkInput(input) && start.checkInputFileExists(path);
        return result;
    }

}
