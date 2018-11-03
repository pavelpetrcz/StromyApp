package view;

import controller.ReadFileFlow;
import controller.CheckInputsFlow;

import java.util.Scanner;

public class startApp {
    public static void main(String[] args) throws Exception {
        //start appky

        System.out.println("\n" +
                "\n" +
                "   _____   __                                         ___                   \n" +
                "  / ___/  / /_   _____  ____    ____ ___    __  __   /   |    ____     ____ \n" +
                "  \\__ \\  / __/  / ___/ / __ \\  / __ `__ \\  / / / /  / /| |   / __ \\   / __ \\\n" +
                " ___/ / / /_   / /    / /_/ / / / / / / / / /_/ /  / ___ |  / /_/ /  / /_/ /\n" +
                "/____/  \\__/  /_/     \\____/ /_/ /_/ /_/  \\__, /  /_/  |_| / .___/  / .___/ \n" +
                "                                         /____/           /_/      /_/      \n" +
                "                                                                            \n" +
                "\n");

        System.out.println("Nahrajte soubor se stromem na Plochu vašeho PC s názvem strom.txt - kontrolu souboru  spustíte pokynem \"analyzuj\".");
        Scanner input = new Scanner(System.in, "Windows-1250");
        String inputString = input.nextLine();
        CheckInputsFlow startApp = new CheckInputsFlow();
        startApp.setInput(inputString);

        //kontrola pokynu a přítomnosti souboru
        String uspech = "Soubor v pořádku. Pro start analýzy zadejte pokyn \"pocitej\".";
        String chyba = "Špatný příkaz nebo chybí zdrojový soubor na ploše.";
        if (startApp.getCheckInputs(inputString)) {
            System.out.println(uspech);
        }
        else System.out.println(chyba);

        //čtení souboru
        ReadFileFlow document = new ReadFileFlow();
        document.starReadFile();



    }
}

