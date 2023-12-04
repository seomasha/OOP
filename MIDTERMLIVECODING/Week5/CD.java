package OOP.MIDTERMLIVECODING.Week5;

class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingyear;
    private double weight;

    public CD(String artist, String title, int publishingyear) {
        this.artist = artist;
        this.title = title;
        this.publishingyear = publishingyear;
        this.weight = 0;
    }

    @Override
    public double weight() {
        return this.weight;
    }
}
