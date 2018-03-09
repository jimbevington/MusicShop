import accessories.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    private DrumStick sticks;

    @Before
    public void setUp() throws Exception {
        sticks = new DrumStick("hulk smash", "Tesla", 10, 2.99, 5.99,
                    "7A");
    }

    @Test
    public void canGetWeightTip() {
        assertEquals("7A", sticks.getWeightTip());
    }
}
