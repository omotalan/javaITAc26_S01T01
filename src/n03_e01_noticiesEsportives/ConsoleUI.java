package n03_e01_noticiesEsportives;

import n03_e01_noticiesEsportives.newsTypes.*;

public class ConsoleUI {
    private Newsroom newsroom;

    public ConsoleUI(Newsroom newsroom) {
        this.newsroom = newsroom;
    }

    static void showMenu() {
        System.out.println("""

                === REDACCIÓ ESPORTIVA ===
                1. Introduir redactor
                2. Eliminar redactor
                3. Introduir notícia a un redactor
                4. Eliminar notícia
                5. Mostrar notícies d'un redactor
                6. Calcular puntuació d'una notícia
                7. Calcular preu d'una notícia
                0. Sortir
                """);
    }

    int getOption() {
        int option;
        option = Helpers.readNumberInput("Opció: ", newsroom);
        switch (option) {
            case 1 -> newsroom.addWriter();
            case 2 -> newsroom.deleteWriter();
            case 3 -> newsroom.addNewsArticle();
            case 4 -> newsroom.deleteNewsArticle();
            case 5 -> newsroom.showNewsArticles();
            case 6 -> newsroom.calculatePoints();
            case 7 -> newsroom.calculatePrice();
            case 0 -> System.out.println("Adéu!");
            default -> System.out.println("Opció no vàlida.");
        }
        return option;
    }
    
    static int displayArticleCategories(Newsroom newsroom) {
        System.out.println(
                "Tipus: 1-" + FootballArticle.getCategory() +
                        " 2-" + BasketballArticle.getCategory() +
                        " 3-" + TennisArticle.getCategory() +
                        " 4-" + FormulaOneArticle.getCategory() +
                        " 5-" + MotorbikeArticle.getCategory()
        );
        return Helpers.readNumberInput("Tipus: ", newsroom);
    }
}