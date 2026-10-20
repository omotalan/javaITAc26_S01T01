package n03_e01_noticiesEsportives.Objects;

public class MotorbikeArticle extends NewsArticle {
    private String team;

    public MotorbikeArticle(String title, String text, String team) {
        super(title, text);
        this.team = team;
        this.points = calculatePoints();
        this.price = calculatePriceNewsArticle();
    }

    private boolean esVip() { return mention(team, "honda", "yamaha"); }

    @Override
    public double calculatePriceNewsArticle() { return 100 + (esVip() ? 50 : 0); }

    @Override
    public int calculatePoints() { return 3 + (esVip() ? 3 : 0); }
}