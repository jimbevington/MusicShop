import instruments.Guitar;
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

    public ArrayList<Product> getStock() {
        return stock;
    }

    public void addStock(Product product) {
        this.stock.add(product);
    }

    public void removeStock(Product product) {
        stock.remove(product);
    }
}
