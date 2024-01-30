public class Film {
    private String id;
    private String title;
private  Category category;
    private double ranking;

    public Film(String id, String title, Category category, double ranking) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.ranking = ranking;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", category=" + category +
                ", ranking=" + ranking +
                '}';
    }
}
