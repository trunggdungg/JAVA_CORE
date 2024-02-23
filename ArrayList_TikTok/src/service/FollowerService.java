package service;

import entities.Follower;
import entities.Idol;

import java.util.ArrayList;
import java.util.Scanner;

public class FollowerService {
    public Follower inputInfo(Scanner sc){

        System.out.print("NHập tên follower: ");
        String name = sc.nextLine();
        System.out.print("Id follower: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Email follower: ");
        String email = sc.nextLine();
        System.out.print("số lượng thích: ");
        int numberOfLikes = Integer.parseInt(sc.nextLine());

        Follower follower = new Follower(name, id, email, numberOfLikes);
//        idol.getFollowers().add(follower);
        return follower;
    }
}
