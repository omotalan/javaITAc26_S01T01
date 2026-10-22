package n03_e01_noticiesEsportives.newsTypes;

public class FormulaOneArticle extends NewsArticle {
    private String escuderia;
    private static final String category = "F1";

    public FormulaOneArticle(String title, String text, String escuderia) {
        super(title, text);
        this.escuderia = escuderia;
        this.points = calculatePoints();
        this.price = calculatePriceNewsArticle();
    }

    public static String getCategory() {
        return category;
    }

    private boolean esVip() { return mention(escuderia, "ferrari", "mercedes"); }

    @Override
    public double calculatePriceNewsArticle() {
        this.price = 100 + (esVip() ? 50 : 0);
        return price;
    }

    @Override
    public int calculatePoints() {
        this.points = 4 + (esVip() ? 2 : 0);
        return points;
    }
}
