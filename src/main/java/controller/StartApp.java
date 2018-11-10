package controller;

import java.util.Arrays;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) throws Exception {
        //start appky
        System.out.println("Vítejte v kalkulačce stromů. Pro správný běh zadejte absolutní cestu k .txt souboru, který chcete analyzovat.");
        Scanner path = new Scanner(System.in, "Windows-1250");
        String pathToFile = path.nextLine();
        System.out.println("Kontrolu cesty a výpočet spustíte pokynem \"start\".");
        Scanner input = new Scanner(System.in, "Windows-1250");
        String inputString = input.nextLine();
        CheckInputsFlow startApp = new CheckInputsFlow();

        String chyba = "Špatně napsaný příkaz nebo špatně zadaná adresa zdrojového souboru.";
        //kontrola vstupu
        if (startApp.getCheckInputs(inputString, pathToFile)) {
            CalculationFlow listOfNodes = new CalculationFlow();
            Calc calculation = new Calc();

            //nacteni souboru a vypocty
            boolean connection; //výsledek kontroly spojistosti
            String textConnection; //textová reprezentace výsledku spojitosti
            connection = (calculation.checkConnection(listOfNodes.starReadFileAndCreateBranches(), calculation.readIds()));
            System.out.println("Výsledek:");
            textConnection = connection ? "S:ANO" : "S:NE";
            System.out.println(textConnection);

            if (connection) {
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

        }
            else System.out.println(chyba);

    }
}

