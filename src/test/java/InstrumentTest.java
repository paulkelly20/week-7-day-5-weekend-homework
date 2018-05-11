import instruments.Guitar;
import instruments.GuitarFamily;
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Piano piano;
    Guitar guitar1;
    Guitar guitar2;

    @Before
    public void before() {
        piano = new Piano("Steinway & Sons", 250, 500, InstrumentType.STRING, "V-125", 25);
        guitar1 = new Guitar("Gibson", 100, 200, InstrumentType.STRING, 6,"SJ 200", GuitarFamily.ACOUSTIC);
        guitar2 = new Guitar("Gibson", 100, 200, InstrumentType.STRING, 6,"SJ 200", GuitarFamily.ELECTRICGUITAR);
    }

    @Test
    public void checkPianoMarkUpValue() {
        assertEquals(250, piano.calculateMarkup(),0);
    }

    @Test
    public void checkPianoCanPlay() {
        assertEquals("Ding dong", piano.play());
    }

    @Test
    public void testAcousticGuitarCanPlay() {
        assertEquals("Bling blang", guitar1.play());
    }
    @Test
    public void testElectricGuitarCanPlay() {
        assertEquals("Vrooom", guitar2.play());
    }
}
