package service;

import entities.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongService {

    public static List<Song> songs = new ArrayList<>();

    public static void addSong() {
        System.out.print("Số bài hát: ");
        int n = new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++) {
            //  thông tin Song
            System.out.println("Nhập thông tin bài hát số " + (i+1) + " :");
            System.out.println("NHập id bài hát:");
            int songId = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.print("Name: ");
            String songName = new Scanner(System.in).nextLine();
            System.out.print("Singer: ");
            String singer = new Scanner(System.in).nextLine();

            Song song = new Song(songId, songName, singer);
            songs.add(song);
        }
    }
}
