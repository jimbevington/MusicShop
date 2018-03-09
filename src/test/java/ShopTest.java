import enums.GuitarType;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Vibrant Matter");
        Guitar guitar = new Guitar("Jazz", "Fender", 4, 1500.00, 3000.00,
                "aquamarine", "graphene", GuitarType.BASS, 4);
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

//    can remove stock

    @Test
    public void canRemoveStock() {
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(0, shop.stockCount());
    }


//    can get all of X
//    can get a product based on name
//    can update a products quantity
}
