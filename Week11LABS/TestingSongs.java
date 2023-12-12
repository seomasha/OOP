package OOP.Week11LABS;

import java.util.Optional;

public class TestingSongs {
    public static void main(String[] args) {
        SongSystem songSystem = new SongSystem("songs.csv");
        Optional<Song> s = songSystem.getSongByID(13);
    }
}
