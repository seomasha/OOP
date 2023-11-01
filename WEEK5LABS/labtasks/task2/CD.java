package OOP.WEEK5LABS.labtasks.task2;

public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;

    private double weight;

    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = year;
        this.weight = 0.1;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.title + "(" + this.publishingYear + ")";
    }

    @Override
    public double weight() {
        return this.weight;
    }
}
