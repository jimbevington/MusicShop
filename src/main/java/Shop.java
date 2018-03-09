import stock.Product;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Product> stock;

    public Shop(String name) {
        this.name = name;
//        shop starts with no Stock, has to be added
        this.stock = new ArrayList<>();
    }

    public int stockCount() {
        return this.stock.size();
    }
}
