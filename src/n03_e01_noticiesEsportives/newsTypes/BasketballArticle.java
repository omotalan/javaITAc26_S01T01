package n03_e01_noticiesEsportives.newsTypes;

public class BasketballArticle extends NewsArticle {
    private String tournament;
    private String club;
    private static final String category = "Básquet";

    public BasketballArticle(String title, String text, String tournament, String club) {
        super(title, text);
        this.tournament = tournament;
        this.club = club;
        this.points = calculatePoints();
        this.price = calculatePriceNewsArticle();
    }

    public static String getCategory() {
        return category;
    }

    private boolean esGran() { return mention(club, "barça", "barca", "barcelona", "real madrid", "madrid"); }

    @Override
    public double calculatePriceNewsArticle() {
        this.price = 250;
        if (igual(tournament, "Eurolliga")) price += 75;
        if (esGran()) price += 75;
        return price;
    }

    @Override
    public int calculatePoints() {
        this.points = 4;
        if (igual(tournament, "Eurolliga")) points += 3;
        else if (igual(tournament, "ACB")) points += 2;
        if (esGran()) points += 1;
        return points;
    }
}