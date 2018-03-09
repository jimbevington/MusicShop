import accessories.DrumStick;
import accessories.SheetMusic;
import enums.GuitarType;
import enums.InstrumentType;
import enums.PianoType;
import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import stock.Product;
import stock.Shop;
import stock.Instrument;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private Piano piano;
    private Guitar electric;
    private DrumStick sticks;
    private SheetMusic music;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Rumpy Trumpy");
        guitar = new Guitar("Jazz", "Fender", 4, 1500.00, 3000.53,
                "aquamarine", "graphene", GuitarType.BASS, 4);
        electric = new Guitar("Speedster", "Maranello", 2, 450.00, 500.00,
                "green", "antelope tusk", GuitarType.ELECTRIC, 12 );
        piano = new Piano("EB-56", "Kawai", 1, 1200.00, 4500.00,
                "white", "mahogany", PianoType.UPRIGHT, 56);
        sticks = new DrumStick("ClownHands", "Sono", 2, 2.00, 5,
                "6B");
        music = new SheetMusic("Metal Machine Music", "Sire", 9, 7.00,
                12.00, "Lou Reed");
    }

    @Test
    public void hasNoStock() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddStock(){

        shop.addStock(guitar);
        assertEquals(1, shop.stockCount());
        assert(shop.getStock().contains(guitar));
    }

    @Test
    public void canRemoveStock() {
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(0, shop.stockCount());
    }

//    can calculate all Profit
    @Test
    public void canGetAllPotentialProfit() {
        shop.addStock(guitar);
        shop.addStock(piano);
        assertEquals(4800.53, shop.totalProfit(), 0.01);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //// in creating additional methods, I'm experimenting with listing items by checking them in different ways, i.e
    //// by Class, InstrumentType, etc. Thus, I've not tried to be totally comprehensive, just try out different
    //// approaches.
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test
    public void canGetAllPianos() {
        shop.addStock(guitar);
        assertFalse(shop.listPianos().contains(piano));
        assertEquals(0, shop.listPianos().size());
        shop.addStock(piano);
        assert(shop.listPianos().contains(piano));
        assertEquals(1, shop.listPianos().size());
    }

    @Test
    public void canGetAllGuitars() {
        shop.addStock(piano);
        ArrayList<Guitar> guitars = shop.listGuitars();
        assertFalse(guitars.contains(guitar));
        assertEquals(0, guitars.size());
        shop.addStock(guitar);
//        update guitars
        guitars = shop.listGuitars();
        assert(guitars.contains(guitar));
        assertEquals(1, guitars.size());
    }

    @Test
    public void canGetAllOfAGuitarType() {
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(electric);
        ArrayList<Guitar> all_electrics = shop.listGuitarType(GuitarType.ELECTRIC);
        assert(all_electrics.contains(electric));
        assertEquals(1, all_electrics.size());
    }

    @Test
    public void canGetAllOfAnInstrumentType() {
        shop.addStock(guitar);
        shop.addStock(electric);
        shop.addStock(piano);
        ArrayList<Instrument> guitars = shop.listInstrumentType(InstrumentType.GUITAR);
        assertEquals(2, guitars.size());
        assertEquals(InstrumentType.GUITAR, guitars.get(0).getInstrumentType());
    }

    @Test
    public void canGetAllAccessories() {
        shop.addStock(sticks);
        shop.addStock(music);
        ArrayList<Product> accessories = shop.getAccessories();
        assertEquals(2, accessories.size());
        assert(accessories.contains(sticks));
        assert(accessories.contains(music));
    }

    @Test
    public void canGetLowStock() {
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(electric);
        shop.addStock(sticks);
        shop.addStock(music);
        ArrayList<Product> lowStock = shop.getLowStock();
        assertEquals(4, lowStock.size());
        assertFalse(lowStock.contains(null));
    }

//    can update a products quantity

//    can sell an item, if out of stock, remove from stock

//    if adding a product that is the same as another product, it updates the quantity

}
