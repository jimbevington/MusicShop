import enums.GuitarType;
import enums.PianoType;
import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private Piano piano;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Vibrant Matter");
        guitar = new Guitar("Jazz", "Fender", 4, 1500.00, 3000.00,
                "aquamarine", "graphene", GuitarType.BASS, 4);
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

//    can get all of Instrument Type
//    can get all of Guitar type
//    can get all of Piano Type
//    can get all accessories
//    can get a product based on name
//    can update a products quantity
//    if adding a product that is the same as another product, it updates the quantity
}
