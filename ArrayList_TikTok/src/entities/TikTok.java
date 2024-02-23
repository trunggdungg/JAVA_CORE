package entities;

import entities.Idol;
import entities.Song;

import java.util.ArrayList;
import java.util.List;

public class TikTok {
    private ArrayList<Idol> idols;
    private ArrayList<Song> songs;

    public TikTok(ArrayList<Idol> idols, ArrayList<Song> songs) {
        this.idols = idols;
        this.songs = songs;
    }

    public ArrayList<Idol> getIdols() {
        return idols;
    }

    public void setIdols(ArrayList<Idol> idols) {
        this.idols = idols;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "TikTok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }
}
