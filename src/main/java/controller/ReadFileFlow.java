package controller;

public class ReadFileFlow {
    public void starReadFile() {
        try {
            readFile();
        } catch (Exception e) {
            System.out.println("Chyba nelze číst.");
        }
    }

    protected void readFile() throws Exception {
        try {
            Calc analyze = new Calc();
            analyze.readFile();
        } catch (Exception e) {
            System.out.println("Chyba nelze číst.");
        }



    }

}
