package n03_e01_noticiesEsportives.Objects;

public class TennisArticle extends NewsArticle {
    private String tournament;
    private String player;

    public TennisArticle(String title, String text, String tournament, String player) {
        super(title, text);
        this.tournament = tournament;
        this.player = player;
        this.points = calculatePoints();
        this.price = calculatePriceNewsArticle();
    }

    private boolean esVip() { return mention(player, "federer", "nadal", "djokovic"); }

    @Override
    public double calculatePriceNewsArticle() {
        return 150 + (esVip() ? 100 : 0);
    }

    @Override
    public int calculatePoints() {
        return 4 + (esVip() ? 3 : 0);
    }
}
