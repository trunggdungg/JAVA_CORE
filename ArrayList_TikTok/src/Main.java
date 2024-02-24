import entities.Follower;
import entities.Idol;
import entities.Song;
import entities.TikTok;
import service.IdolService;
import service.SongService;
import service.TikTokService;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IdolService.addIdol();
        SongService.addSong();
       TikTokService.showTiktok();
    }
}
