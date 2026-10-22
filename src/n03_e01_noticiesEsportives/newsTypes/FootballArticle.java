package n03_e01_noticiesEsportives.newsTypes;

public class FootballArticle extends NewsArticle {

    private String tournament;
    private String club;
    private String player;
    private static final String category = "Fútbol";

    public FootballArticle(String title, String text, String tournament, String club, String player) {
        super(title, text);
        this.tournament = tournament;
        this.club = club;
        this.player = player;
        this.points = calculatePoints();
        this.price = calculatePriceNewsArticle();
    }

    public static String getCategory() {
        return category;
    }

    private boolean esGran() { return mention(club, "barça", "barca", "madrid", "barcelona", "real madrid"); }
    private boolean esEstrella() { return mention(player, "ferran torres", "benzema"); }

    @Override
    public double calculatePriceNewsArticle() {
        this.price = 300;
        if (igual(tournament, "Lliga de Campions")) price += 100;
        if (esGran()) price += 100;
        if (esEstrella()) price += 50;
        return price;
    }

    @Override
    public int calculatePoints() {
        this.points = 5;
        if (igual(tournament, "Lliga de Campions")) points += 3;
        else if (igual(tournament, "Lliga")) points += 2;
        if (esGran()) points += 1;
        if (esEstrella()) points += 1;
        return points;
    }
}