public class Series extends Film{
    private int soTap;
    private  double timeAvg;

    public Series(String id, String title, Category category, double ranking, int soTap, double timeAvg) {
        super(id, title, category, ranking);
        this.soTap = soTap;
        this.timeAvg = timeAvg;
    }

    public int getSoTap() {
        return soTap;
    }

    public void setSoTap(int soTap) {
        this.soTap = soTap;
    }

    public double getTimeAvg() {
        return timeAvg;
    }

    public void setTimeAvg(double timeAvg) {
        this.timeAvg = timeAvg;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Series{" +
                "soTap=" + soTap +
                ", timeAvg=" + timeAvg +
                '}';
    }
}
