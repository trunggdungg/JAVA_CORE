package service;

import entities.Follower;
import entities.Idol;
import entities.Song;
import entities.TikTok;

import java.util.ArrayList;
import java.util.List;

public class TikTokService {
    public static List<Idol> idols = IdolService.idols;
    public static List<Song> songs = SongService.songs;

    public static void showTiktok() {
        // thông tin TikTok
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
