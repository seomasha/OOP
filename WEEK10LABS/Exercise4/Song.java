package OOP.WEEK10LABS.Exercise4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

class Song {
    private String title;
    private String artist;
    private String genre;

    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + ", Artist: " + this.artist + ", Genre: " + this.genre;
    }
}

class GenreFilterIterator implements Iterator<Song> {

    private ArrayList<Song> songs;
    private String genre;
    private int currentIndex;

    public GenreFilterIterator(ArrayList<Song> songs, String genre) {
        this.songs = songs;
        this.genre = genre;
        this.currentIndex = 0;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean hasNext() {
        if(this.currentIndex < songs.size() && !songs.get(this.currentIndex).getGenre().equals(this.genre)) {
            this.currentIndex++;
        }
        return this.currentIndex < songs.size();
    }

    @Override
    public Song next() {
        if(!hasNext()) {
            throw new NoSuchElementException("No more elements like that.");
        }
        return songs.get(currentIndex++);
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Sehidski rastanak", "Safet Isovic", "Sevdah"));
        songs.add(new Song("Moj dilbere", "Safet Isovic", "Sevdah"));
        songs.add(new Song("Dino Merlin", "Burek", "Zabavna"));
        songs.add(new Song("Jala", "Roze", "Tehno"));

        GenreFilterIterator genreFilterIterator = new GenreFilterIterator(songs, "Sevdah");

        while(genreFilterIterator.hasNext()) {
            System.out.println(genreFilterIterator.next());
        }
    }
}