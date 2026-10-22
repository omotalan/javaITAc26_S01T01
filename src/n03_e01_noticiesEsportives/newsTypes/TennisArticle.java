package n03_e01_noticiesEsportives.newsTypes;

public class TennisArticle extends NewsArticle {
    private String tournament;
    private String player;
    private static String category = "Tenis";

    public TennisArticle(String title, String text, String tournament, String player) {
        super(title, text);
        this.tournament = tournament;
        this.player = player;
        this.points = calculatePoints();
        this.price = calculatePriceNewsArticle();
    }

    public static String getCategory() {
        return category;
    }

    private boolean esVip() { return mention(player, "federer", "nadal", "djokovic"); }

    @Override
    public double calculatePriceNewsArticle() {
        this.price = 150 + (esVip() ? 100 : 0);
        return price;
    }

    @Override
    public int calculatePoints() {
        this.points = 4 + (esVip() ? 3 : 0);
        return points;
    }
}
