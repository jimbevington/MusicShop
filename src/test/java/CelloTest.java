import instruments.Cello;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    private Cello cello;

    @Before
    public void setUp() throws Exception {
        cello = new Cello("Agatha", "Bingewhistle & Sons", 1, 500.00, 4500.00, "natural", "rosewood");
    }

    @Test
    public void canPlay() {
        assertEquals("Hummmmmmmph", cello.play());
    }
}
