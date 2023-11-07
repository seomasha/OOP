package OOP.WEEK6LABS.BirdWatchersDatabase;

import java.util.ArrayList;

public class BirdWatchers {
    private String name;
    private String latinName;
    private int birdObservations;

    public BirdWatchers(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        birdObservations = 0;
    }

    @Override
    public String toString() {
        return this.getName() + "(" + this.getLatinName() + "): " + this.getBirdObservations();
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getBirdObservations() {
        return this.birdObservations;
    }

    public String getName() {
        return this.name;
    }

    public void observation() {
        this.birdObservations++;
    }
}
