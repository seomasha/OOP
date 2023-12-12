package OOP.Week11LABS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SongSystem {
    private List<Song> songs = new ArrayList<>();

    public SongSystem(String fileName) {
        try {
            songs = loadSongsFromFile("songs.csv");
            for(Song song : songs) {
                System.out.println(song);
            }
        }
        catch (IOException e) {
            System.out.println("Unable to read a file.");
        }
    }

    public static List<Song> loadSongsFromFile(String fileName) throws IOException {
        List<Song> songs1 = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        List<String> lines = bufferedReader.lines().collect(Collectors.toList());
        for(String line : lines) {
            String[] parsedLine = line.split(",");
            Song temp = new Song(parsedLine[0] == "" ? 000 : Integer.parseInt(parsedLine[0]),
                    parsedLine[1],
                    parsedLine[2],
                    parsedLine[3],
                    parsedLine[4] == "" ? 000 : Double.parseDouble(parsedLine[4]),
                    parsedLine[5] == "" ? 000 : Double.parseDouble(parsedLine[5])
                    );

            songs1.add(temp);
        }
        bufferedReader.close();
        return songs1;
    }

    public Optional<Song> getSongByID(int id) throws SongNotFoundException {
        for(Song song : this.songs) {
            if(song.id() == id) {
                return Optional.of(song);
            }
        }
        throw new SongNotFoundException("Song couldn't be found.");
    }

    public Song getLongestSong() {
        Song longestSong = songs.get(0);
        for(Song song : this.songs) {
            if(song.length() > longestSong.length()) {
                longestSong = song;
            }
        }
        return longestSong;
    }
}
