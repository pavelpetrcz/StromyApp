package controller;

import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) throws Exception {
        //start appky

        System.out.println("Nahrajte soubor se stromem na Plochu vašeho PC s názvem strom.txt - kontrolu souboru  spustíte pokynem \"start\".");
        Scanner input = new Scanner(System.in, "Windows-1250");
        String inputString = input.nextLine();
        CheckInputsFlow startApp = new CheckInputsFlow();

        String chyba = "Špatný příkaz nebo chybí zdrojový soubor na ploše.";
        //kontrola vstupu
        if (startApp.getCheckInputs(inputString)) {
            CalculationFlow listOfNodes = new CalculationFlow();
            Calc calculation = new Calc();

            //nacteni souboru a vypocty
            listOfNodes.starReadFileAndCreateBranches();

            int LZ = calculation.countLeafs(listOfNodes.starReadFileAndCreateLeafs(), 'Z');
            int LH = calculation.countLeafs(listOfNodes.starReadFileAndCreateLeafs(), 'H');

            int OZ = calculation.countNuts(listOfNodes.starReadFileAndCreateNuts(), 'Z');
            int ON = calculation.countNuts(listOfNodes.starReadFileAndCreateNuts(), 'N');

                    //vypis pro listy
                    System.out.println("L;Z;" + LZ);
                    System.out.println("L;H;" + LH);

                    //vypis pro orechy
                    System.out.println("O;Z;" + OZ);
                    System.out.println("O;N;" + ON);



        }
            else System.out.println(chyba);

    }
}

