import interfaces.Sellable;

public abstract class Product implements Sellable {

    private String name;
    private String manufacturer;
    private double buyPrice;
    private double sellPrice;

    public Product(String name, String manufacturer, double buyPrice, double sellPrice) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


}
