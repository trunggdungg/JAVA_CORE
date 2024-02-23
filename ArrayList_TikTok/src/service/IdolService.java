package service;

import entities.Follower;
import entities.Idol;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolService {
    public Idol InputInfor(Scanner sc){

        System.out.println("Nhập thông tin idol:");
        System.out.println("Nhập id idol: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên idol: ");
        String name = sc.nextLine();
        System.out.println("Nhập email idol: ");
        String email = sc.nextLine();
        System.out.println("Nhập tên group của idol: ");
        String group = sc.nextLine();
        System.out.println("Nhập số lượng followers của idol: ");
        int followers = Integer.parseInt(sc.nextLine());

        ArrayList<Idol> idols = new ArrayList<>();
        Idol idol = new Idol(name, id , email, new ArrayList<>(), group);

        idols.add(idol);
        return idol;
    }


}
