package service;

import entities.Follower;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FollowerService {
    public static List<Follower> followers = new ArrayList<>();
    public static List<Follower> addFollowers() {
        Scanner sc = new Scanner(System.in);
        List<Follower> followers = new ArrayList<>();
        System.out.print("Idol có bao nhiêu follower: ");
        int m = sc.nextInt();
        for (int j = 0; j < m; j++) {
            followers.add(addFollower());
        }
        return followers;
    }
    public static Follower addFollower() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin follower: ");
        System.out.print("Id follower: ");
        int followerId = Integer.parseInt(sc.nextLine());
        System.out.print("NHập tên follower: ");
        String followerName = sc.nextLine();
        System.out.print("Email follower: ");
        String followerEmail = sc.nextLine();
        System.out.print("số lượng thích: ");
        int numberOfLikes = Integer.parseInt(sc.nextLine());

        Follower follower = new Follower(followerName, followerId, followerEmail, numberOfLikes);
        followers.add(follower);

        return follower;
    }
}
