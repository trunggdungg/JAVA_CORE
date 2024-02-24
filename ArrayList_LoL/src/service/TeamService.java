package service;

import entities.Figure;
import entities.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamService {

    public static Team teamInput() {
        List<Figure> figures = new ArrayList<>();
        System.out.println("Nhập tên team: ");
        String name = new Scanner(System.in).nextLine();
        for(int i =0;i< 3;i++) {
            Figure figure = FigureService.figureInput();
            figures.add(figure);
        }
        return new Team(name, figures);
    }
}
