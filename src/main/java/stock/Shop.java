package stock;

import instruments.Guitar;
import instruments.Piano;
import stock.Product;

import java.util.ArrayList;
import java.util.Collection;

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

    public double totalProfit() {
        double total = 0;
        for (Product product : stock) {
            double profit = product.calculateMarkup();
            total += profit;
        }
        return total;
    }


    public ArrayList<Piano> listPianos() {
        ArrayList<Piano> pianos = new ArrayList<>();
        for (Product product : stock) {
            if (product instanceof Piano) {
                Piano piano = (Piano) product;
                pianos.add(piano);
            }
        }
        return pianos;
    }
}
