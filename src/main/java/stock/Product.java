package stock;

import interfaces.Sellable;

public abstract class Product implements Sellable {

    private String name;
    private String manufacturer;
    private int quantity;
    private double buyPrice;
    private double sellPrice;

    public Product(String name, String manufacturer, int quantity, double buyPrice, double sellPrice) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


    @Override
    public double calculateMarkup() {
        double markup = sellPrice - buyPrice;
        return markup;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
