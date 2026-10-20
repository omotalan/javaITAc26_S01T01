package n03_e01_noticiesEsportives;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option;
        do {
            ConsoleUI.showMenu();
            option = ConsoleUI.readNumberInput("Opció: ");
            switch (option) {
                case 1 -> ConsoleUI.addWriter();
                case 2 -> ConsoleUI.deleteWriter();
                case 3 -> ConsoleUI.addNewsArticle();
                case 4 -> ConsoleUI.deleteNewsArticle();
                case 5 -> ConsoleUI.showNewsArticles();
                case 6 -> ConsoleUI.calculatePoints();
                case 7 -> ConsoleUI.calculatePrice();
                case 0 -> System.out.println("Adéu!");
                default -> System.out.println("Opció no vàlida.");
            }
        } while (option != 0);
    }

}
