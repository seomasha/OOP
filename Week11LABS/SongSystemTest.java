package OOP.Week11LABS;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SongSystemTest {

    private static SongSystem system;

    @BeforeEach
    void initializeSongs() {
        system = new SongSystem("songs.csv");
    }

    @Test
    void ifId500IsPassed_thenThrowTheSongNotFoundException() {
        assertThrows(SongNotFoundException.class, () -> {
            system.getSongByID(500);
        });
    }

    @Test
    void ifId10Passed_nameShouldEqual() {
        assertEquals("bad guy", system.getSongByID(10).get().name());
    }

    @Test
    void ifMultipleTests_thenPass() {
        assertAll(
                () -> assertEquals("bad guy", system.getSongByID(10).get().name()),
                () -> assertEquals("sucker", system.getLongestSong().name()));
    }
}
