package n03_e01_noticiesEsportives;

import n03_e01_noticiesEsportives.newsTypes.NewsArticle;

import java.util.Optional;

public class Helpers {
    public static Optional<Writer> searchWriter(String dni, Newsroom newsroom) {
        return newsroom.getWriters().stream()
                .filter(r -> r.getDni().equalsIgnoreCase(dni))
                .findFirst();
    }

    public static Optional<Writer> pullWriter(Newsroom newsroom) {
        String dni = readText("DNI del redactor: ", newsroom);
        Optional<Writer> r = searchWriter(dni, newsroom);
        if (r.isEmpty()) System.out.println("No s'ha trobat el redactor.");
        return r;
    }

    public static Optional<NewsArticle> pullNewsArticle(Newsroom newsroom) {
        Optional<Writer> writer = pullWriter(newsroom);
        if (writer.isEmpty()) return Optional.empty();
        String titular = readText("Titular: ", newsroom);
        Optional<NewsArticle> n = writer.get().searchNewsArticle(titular);
        if (n.isEmpty()) System.out.println("No s'ha trobat la notícia.");
        return n;
    }

    public static String readText(String message, Newsroom newsroom) {
        System.out.print(message);
        return newsroom.SC.nextLine().trim();
    }

    public static int readNumberInput(String message, Newsroom newsroom) {
        try {
            return Integer.parseInt(readText(message, newsroom));
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
