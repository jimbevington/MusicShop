package accessories;

import stock.Product;

public class SheetMusic extends Product{

    private String composer;

    public SheetMusic(String name, String manufacturer, int quantity, double buyPrice, double sellPrice,
                      String composer) {
        super(name, manufacturer, quantity, buyPrice, sellPrice);
        this.composer = composer;
    }


    public String getComposer() {
        return composer;
    }
}
