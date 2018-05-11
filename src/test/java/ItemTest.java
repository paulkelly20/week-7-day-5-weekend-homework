import instruments.Guitar;
import items.GuitarString;
import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

 GuitarString guitarString;
 SheetMusic sheetMusic;

    @Before
    public void before() {
        guitarString = new GuitarString("4 Guitar Strings", 10, 30, "Bass");
        sheetMusic = new SheetMusic("Piano", 0, 5, "Intro to piano");
    }

    @Test
    public void getGuitarStringMarkUp() {
        assertEquals(20, guitarString.calculateMarkup(), 0);
    }

    @Test
    public void getSheetMusicMarkup() {
        assertEquals(5 ,sheetMusic.calculateMarkup(), 0);
    }

    @Test
    public void getGuitarStringMarkupPercentage() {
        assertEquals(66.66, guitarString.calculateMarkupPercentage(), 0.1);
    }


}
