package service;

import entities.Figure;

import java.util.Scanner;

public class FigureService {
    public static Figure figureInput() {
        System.out.println("Nhập thông tin tướng: ");
        System.out.println("Nhập tên tướng: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Nhập vị trí tướng: ");
        String position = new Scanner(System.in).nextLine();
        return new Figure(name,position);

    }
}
