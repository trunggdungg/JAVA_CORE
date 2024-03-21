package service;

import entity.Member;
import entity.Position;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PositionService {
    public List<Position> positions = new ArrayList<>();

    public void inputInfoPosition() {
        System.out.println("Nhập tên vị trí công việc: ");
        String namePS = new Scanner(System.in).nextLine();
        System.out.println("Nhập mức thưởng của công việc: ");
        double bonus ;

        while (true) {
            try {
                bonus = new Scanner(System.in).nextDouble();
                if (bonus < 0) {
                    System.out.println("Mức thưởng không được âm. Vui lòng nhập lại: ");
                    continue;
                }
              break;
            } catch (InputMismatchException e) {
                System.out.println("Mức thưởng phải là một số. Vui lòng nhập lại: ");
            }
        }
        Position position = new Position(namePS, bonus);
        positions.add(position);
    }

    public void outputInfoPosition(List<Position> positionList) {
        for (Position p : positionList) {
            System.out.println(p);
        }
    }
}
