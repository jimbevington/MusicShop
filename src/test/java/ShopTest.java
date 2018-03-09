import enums.GuitarType;
import enums.PianoType;
import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import stock.Shop;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private Piano piano;
    private Guitar electric;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Rumpy Trumpy");
        guitar = new Guitar("Jazz", "Fender", 4, 1500.00, 3000.00,
                "aquamarine", "graphene", GuitarType.BASS, 4);
        electric = new Guitar("Speedster", "Maranello", 2, 450.00, 500.00,
                "green", "antelope tusk", GuitarType.ELECTRIC, 12 );
        piano = new Piano("EB-56", "Kawai", 1, 1200.00, 4500.00,
                "white", "mahogany", PianoType.UPRIGHT, 56);
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
        assertEquals(4800.00, shop.totalProfit(), 0.01);
    }

//    can get all of Instrument class

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
    public void canGetAllOfAnInstrumentType() {
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(electric);
        ArrayList<Guitar> all_electrics = shop.listGuitarType(GuitarType.ELECTRIC);
        assert(all_electrics.contains(electric));
        assertEquals(1, all_electrics.size());
    }

    //    can get all of Piano Type
//    can get all of Instrument Type
//    can get all of Guitar type
//    can get all accessories
//    can get a product based on name
//    can update a products quantity
//    if adding a product that is the same as another product, it updates the quantity
}
