import instruments.Guitar;
import instruments.GuitarFamily;
import instruments.InstrumentType;
import instruments.Piano;
import items.GuitarString;
import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    GuitarString guitarString;
    SheetMusic sheetMusic;
    Piano piano;
    Guitar guitar1;
    Guitar guitar2;
    Shop shop;

    @Before
    public void before() {
        piano = new Piano("Steinway & Sons", 250, 500, InstrumentType.STRING, "V-125", 25);
        guitar1 = new Guitar("Gibson", 100, 200, InstrumentType.STRING, 6,"SJ 200", GuitarFamily.ACOUSTIC);
        guitar2 = new Guitar("Gibson", 100, 200, InstrumentType.STRING, 6,"SJ 200", GuitarFamily.ELECTRICGUITAR);
        guitarString = new GuitarString("4 Guitar Strings", 10, 30, "Bass");
        sheetMusic = new SheetMusic("Piano", 0, 5, "Intro to piano");
        shop = new Shop(100);
    }

    @Test
    public void checkStoreHasStockEmoty() {
        assertEquals(0, shop.getStock());
    }

    @Test
    public void checkStoreHasStockAfterAddingStock() {
        shop.addStock(guitar1);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void checkStoreCanRemoveStock() {
        shop.addStock(guitar1);
        shop.addStock(guitar2);
        shop.removeStock(guitar1);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void checkStoreStockValue() {
        shop.addStock(guitar1);
        shop.addStock(guitar2);
        shop.addStock(piano);
        shop.addStock(sheetMusic);
        assertEquals(450, shop.getStockValue(), 0);
    }





}
