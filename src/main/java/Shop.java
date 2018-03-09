import stock.Product;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Product> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }
}
