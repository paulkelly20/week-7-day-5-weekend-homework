import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Steinway & Sons", 250, 500, InstrumentType.STRING, "V-125", 25);
    }

    @Test
    public void checkPianoMarkUpValue() {
        assertEquals(250, piano.calculateMarkup(),0);
    }


}
