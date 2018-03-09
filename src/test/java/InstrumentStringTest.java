import accessories.InstrumentStrings;
import enums.StringsType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentStringTest {

    private InstrumentStrings strings;

    @Before
    public void setUp() throws Exception {
        strings = new InstrumentStrings("Growlers", "Ernie Ball", 3, 2.99,
                5.99, StringsType.BASS);
    }

    @Test
    public void canGetStringsType() {
        assertEquals(StringsType.BASS, strings.getType());
    }


}
