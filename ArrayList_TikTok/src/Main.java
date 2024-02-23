import entities.Follower;
import entities.Idol;
import entities.Song;
import entities.TikTok;
import service.IdolService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Idol> idols = new ArrayList<>();
        ArrayList<Song> songs = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // Nhập thông tin Idol
        System.out.println("Nhập thông tin idol:");
        System.out.println("Nhập id idol: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên idol: ");
        String name = sc.nextLine();
        System.out.println("Nhập email idol: ");
        String email = sc.nextLine();
        System.out.println("Nhập tên group của idol: ");
        String group = sc.nextLine();

        Idol idol = new Idol(name, id, email, new ArrayList<>() , group);
        idols.add(idol);

        // Nhập thông tin Follower
        System.out.println("Nhập thông tin follower: ");
        System.out.print("NHập tên follower: ");
        String followerName = sc.nextLine();
        System.out.print("Id follower: ");
        int followerId = Integer.parseInt(sc.nextLine());
        System.out.print("Email follower: ");
        String followerEmail = sc.nextLine();
        System.out.print("số lượng thích: ");
        int numberOfLikes = Integer.parseInt(sc.nextLine());
        Follower follower = new Follower(followerName, followerId, followerEmail, numberOfLikes);

        idol.getFollowers().add(follower);

        // Nhập thông tin Song

        System.out.println("Nhập thông tin bài hát:");
        System.out.println("NHập id bài hát:");
        System.out.print("Id: ");
        int songId = Integer.parseInt(sc.nextLine());
        System.out.print("Name: ");
        String songName = sc.nextLine();
        System.out.print("Singer: ");
        String singer = sc.nextLine();

        Song song = new Song(songId, songName, singer);
        songs.add(song);

        // Hiển thị thông tin TikTok
        TikTok tikTok = new TikTok(idols, songs);
        System.out.println("Thông tin:");
        System.out.println("-------- Idols --------");
        for (Idol i : tikTok.getIdols()) {
            System.out.println(i);
        }

        System.out.println("-------- Songs --------");
        for (Song s : tikTok.getSongs()) {
            System.out.println(s);
        }





    }
}