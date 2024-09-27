package guissica_soho.model;

public class Game {
    private String title;
    private String publisher;
    private String genre;
    private String description;
    private double starRating;
    private int downloads;

    public Game() {}

    public Game(String title, String publisher, String genre, String description, double starRating, int downloads) {
        this.title = title;
        this.publisher = publisher;
        this.genre = genre;
        this.description = description;
        this.starRating = starRating;
        this.downloads = downloads;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Add getters and setters for other fields if needed
}