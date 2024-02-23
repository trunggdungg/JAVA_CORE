package service;

import entities.Song;

import java.util.Scanner;

public class SongService {
    public Song inputInfo(Scanner sc) {
        System.out.println("Nhập thông tin bài hát:");
        System.out.print("Id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Singer: ");
        String singer = sc.nextLine();
         Song song = new Song(id,name,singer);
        return song;
    }
}
