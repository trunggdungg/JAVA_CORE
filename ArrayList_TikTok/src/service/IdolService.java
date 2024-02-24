package service;

import entities.Follower;
import entities.Idol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IdolService {

    public static List<Idol> idols = new ArrayList<>();

    public static void addIdol() {
        System.out.print("Số lượng idol: ");
        int n = new Scanner(System.in).nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin idol thứ " + (i + 1) + " :");
            System.out.println("Nhập id idol: ");
            int id = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.println("Nhập tên idol: ");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Nhập email idol: ");
            String email = new Scanner(System.in).nextLine();
            System.out.println("Nhập tên group của idol: ");
            String group = new Scanner(System.in).nextLine();

            List<Follower> followers = FollowerService.addFollowers();

            Idol idol = new Idol(name, id, email, followers, group);
            idols.add(idol);
        }
    }
}
