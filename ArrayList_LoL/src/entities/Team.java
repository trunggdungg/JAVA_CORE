package entities;
import java.util.List;
public class Team {
    private  String name;
    private List<Figure> figures;

    public Team(String name, List<Figure> figures) {
        this.name = name;
        this.figures = figures;
    }

    public Team() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", figures=" + figures +
                '}';
    }
}
