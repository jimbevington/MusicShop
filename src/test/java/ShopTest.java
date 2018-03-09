import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Vibrant Matter");
    }

    @Test
    public void hasNoStock() {
        assertEquals(0, shop.stockCount());
    }


    //    has no stock
//    can add stock
//    can remove stock

//    can get all of X
//    can get a product based on name
//    can update a products quantity
}
