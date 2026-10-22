package n03_e01_noticiesEsportives;

import n03_e01_noticiesEsportives.newsTypes.NewsArticle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Writer {
    private static double salary = 1500;

    private final String dni;
    private String name;
    private List<NewsArticle> newsArticles = new ArrayList<>();

    public Writer(String name, String dni) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        } else if (name.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Name cannot have numbers");
        }
        this.name = name;
        this.dni = dni;
    }

    // Getters
    public static double getSalary() { return salary; }
    public String getDni() { return dni; }
    public String getName() { return name; }
    public List<NewsArticle> getNewsArticles() {
        return Collections.unmodifiableList(newsArticles);
    }
    
    // Setters
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        } else if (name.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Name cannot have numbers");
        }
        this.name = name;
    }
    public static void setSalary(double newSalary) {
        if (newSalary <= 0.0) {
            throw new IllegalArgumentException("Salary cannot be zero or negative.");
        }
        salary = newSalary;
    }

    // Add or delete articles
    public Optional<NewsArticle> searchNewsArticle(String title) {
        return newsArticles.stream()
                .filter(n -> n.getTitle().equalsIgnoreCase(title))
                .findFirst();
    }

    public boolean addNewsArticle(NewsArticle newsArticle) {
        if (searchNewsArticle(newsArticle.getTitle()).isPresent()) return false;
        return newsArticles.add(newsArticle);
    }

    public boolean deleteNewsArticle(String title) {
        return newsArticles.removeIf(n -> n.getTitle().equalsIgnoreCase(title));
    }

}