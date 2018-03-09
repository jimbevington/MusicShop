import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic music;

    @Before
    public void setUp() throws Exception {
        music = new SheetMusic("Palm & Face Percussion: From Rubbish to Rambunctious in 12 Slaps",
                "Zero Books", 1, 4.89, 10.00, "Ed Balls");
    }

    @Test
    public void canGetComposer() {
        assertEquals("Ed Balls", music.getComposer());
    }
}
