package n03_e01_noticiesEsportives.Objects;

public abstract class NewsArticle {
    
    private final String title;
    private String text = "";
    protected int points = 0;
    protected double price = 0.0;

    protected NewsArticle(String title, String text) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
        this.text = text;
    }

    public abstract double calculatePriceNewsArticle();
    public abstract int calculatePoints();

    // Search helpers
    protected static boolean igual(String a, String b) {
        return a != null && a.equalsIgnoreCase(b);
    }

    protected static boolean mention(String font, String... candidates) {
        if (font == null) return false;
        String f = font.toLowerCase();
        for (String c : candidates) {
            if (f.contains(c.toLowerCase())) return true;
        }
        return false;
    }

    // Getters
    public String getTitle()  { return title; }

    private String limitText(String text) {
        return text.substring(0, Math.min(text.length(), 20));
    }

    @Override
    public String toString() {
        return "NewsArticle{" +
                "title='" + title + '\'' +
                ", text='" + limitText(text) + "..." + '\'' +
                ", points=" + points +
                ", price=" + price +
                '}';
    }
}