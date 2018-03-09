import enums.GuitarType;
import enums.InstrumentType;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("G300", "G & L", 2, 800.00, 1500.00,
                            InstrumentType.GUITAR, "black", "maple", GuitarType.BASS, 4);
    }

//    test can play it
//    can calculate markup
//    can get quantity
    @Test
    public void canGetQuantity() {
        assertEquals(2, guitar.getQuantity());
    }

    @Test
    public void canPlay() {
        assertEquals("Karrrrrooooeeew!", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(700.00, guitar.calculateMarkup(), 0.01);
    }
}
