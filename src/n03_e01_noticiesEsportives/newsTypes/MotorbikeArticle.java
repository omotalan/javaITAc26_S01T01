package n03_e01_noticiesEsportives.newsTypes;

public class MotorbikeArticle extends NewsArticle {
    private String team;
    private static final String category = "MotoGP";

    public MotorbikeArticle(String title, String text, String team) {
        super(title, text);
        this.team = team;
        this.points = calculatePoints();
        this.price = calculatePriceNewsArticle();
    }

    public static String getCategory() {
        return category;
    }

    private boolean esVip() { return mention(team, "honda", "yamaha"); }

    @Override
    public double calculatePriceNewsArticle() {
        this.price = 100 + (esVip() ? 50 : 0);
        return price;
    }

    @Override
    public int calculatePoints() {
        this.points = 3 + (esVip() ? 3 : 0);
        return points;
    }
}