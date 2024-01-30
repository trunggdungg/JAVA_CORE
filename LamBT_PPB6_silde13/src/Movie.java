public class Movie extends  Film{
    private int time;

    public Movie(String id, String title, Category category, double ranking, int time) {
        super(id, title, category, ranking);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Movie{" +
                "time=" + time +
                '}';
    }
}
