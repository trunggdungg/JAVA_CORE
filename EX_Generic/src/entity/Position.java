package entity;

public class Position {
    private static int AUTO_ID=200;

    private int idPosition;
    private String name;

    private double bonusSalary;

    public Position( String name, double bonusSalary) {
        this.idPosition = AUTO_ID++;
        this.name = name;
        this.bonusSalary = bonusSalary;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    @Override
    public String toString() {
        return "Position{" +
                "idPosition=" + idPosition +
                ", name='" + name + '\'' +
                ", bonusSalary=" + bonusSalary +
                '}';
    }
}
