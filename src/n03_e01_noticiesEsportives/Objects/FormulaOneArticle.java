package n03_e01_noticiesEsportives.Objects;

public class FormulaOneArticle extends NewsArticle {
    private String escuderia;

    public FormulaOneArticle(String title, String text, String escuderia) {
        super(title, text);
        this.escuderia = escuderia;
        this.points = calculatePoints();
        this.price = calculatePriceNewsArticle();
    }

    private boolean esVip() { return mention(escuderia, "ferrari", "mercedes"); }

    @Override
    public double calculatePriceNewsArticle() { return 100 + (esVip() ? 50 : 0); }

    @Override
    public int calculatePoints() { return 4 + (esVip() ? 2 : 0); }
}
