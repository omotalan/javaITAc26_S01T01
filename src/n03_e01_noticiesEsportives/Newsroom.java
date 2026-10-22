package n03_e01_noticiesEsportives;

import n03_e01_noticiesEsportives.newsTypes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static n03_e01_noticiesEsportives.ConsoleUI.displayArticleCategories;

public class Newsroom {
    final Scanner SC;
    private List<Writer> writers;

    public Newsroom() {
        this.writers = new ArrayList<>();
        SC = new Scanner(System.in);
    }

    // Getter
    public List<Writer> getWriters() { return writers; }

    public void addWriter() {
        String dni = Helpers.readText("DNI: ", this);
        if (Helpers.searchWriter(dni, this).isPresent()) {
            System.out.println("Ja existeix un writer amb aquest DNI.");
            return;
        }
        String nom = Helpers.readText("Nom: ", this);
        writers.add(new Writer(nom, dni));
        System.out.println("Redactor afegit.");
    }

    public void deleteWriter() {
        String dni = Helpers.readText("DNI del redactor: ", this);
        boolean deleted = writers.removeIf(r -> r.getDni().equalsIgnoreCase(dni));
        System.out.println(deleted ? "Redactor eliminat." : "No s'ha trobat el redactor.");
    }

    public void addNewsArticle(Newsroom this) {
        Optional<Writer> writer = Helpers.pullWriter(this);
        if (writer.isEmpty()) return;

        int tipus = displayArticleCategories(this);

        Object newsArticle = createNewsArticle(tipus, this);
        if (newsArticle != null ) {
            validateNewsArticle((NewsArticle) newsArticle, writer);
        }
    }

    private Object createNewsArticle(int tipus, Newsroom newsroom) {
        NewsArticle newsArticle;

        String titular = Helpers.readText("Titular: ", newsroom);
        try {
            newsArticle = switch (tipus) {
                case 1 -> new FootballArticle(titular,
                        Helpers.readText("Text: ", this), Helpers.readText("Competició: ", this), Helpers.readText("Club: ", this), Helpers.readText("Jugador: ", this));
                case 2 -> new BasketballArticle(titular,
                        Helpers.readText("Text: ", this), Helpers.readText("Competició: ", this), Helpers.readText("Club: ", this));
                case 3 -> new TennisArticle(titular,
                        Helpers.readText("Text: ", this), Helpers.readText("Competició: ", this), Helpers.readText("Tenistes: ", this));
                case 4 -> new FormulaOneArticle(titular, Helpers.readText("Text: ", this), Helpers.readText("Escuderia: ", this));
                case 5 -> new MotorbikeArticle(titular, Helpers.readText("Text: ", this), Helpers.readText("Equip: ", this));
                default -> null;
            };
            return newsArticle;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    private void validateNewsArticle(NewsArticle newsArticle, Optional<Writer> writer) {
        if (newsArticle == null) {
            System.out.println("Tipus no vàlid.");
        } else if (writer.get().addNewsArticle(newsArticle)) {
            System.out.println("Notícia afegida: " + newsArticle);
        } else {
            System.out.println("Aquest writer ja té una notícia amb aquest titular.");
        }
    }

    public void deleteNewsArticle() {
        Optional<Writer> writer = Helpers.pullWriter(this);
        if (writer.isEmpty()) return;
        String titular = Helpers.readText("Titular: ", this);
        boolean eliminada = writer.get().deleteNewsArticle(titular);
        System.out.println(eliminada ? "Notícia eliminada." : "No s'ha trobat la notícia.");
    }

    public void showNewsArticles() {
        Optional<Writer> writer = Helpers.pullWriter(this);
        if (writer.isEmpty()) return;
        List<NewsArticle> noticies = writer.get().getNewsArticles();
        if (noticies.isEmpty()) {
            System.out.println("Aquest writer no té notícies.");
        } else {
            noticies.forEach(n -> System.out.println(n.toString()));
        }
    }

    public void calculatePoints() {
        Helpers.pullNewsArticle(this).ifPresent(n ->
                System.out.println("Puntuació: " + n.calculatePoints()));
    }

    public void calculatePrice() {
        Helpers.pullNewsArticle(this).ifPresent(n ->
                System.out.printf("Price: %.2f €%n", n.calculatePriceNewsArticle()));
    }
}
