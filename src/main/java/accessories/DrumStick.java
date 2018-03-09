package accessories;

import stock.Product;

public class DrumStick extends Product {

    private String weightTip;

    public DrumStick(String name, String manufacturer, int quantity, double buyPrice, double sellPrice,
                     String weightTip) {
        super(name, manufacturer, quantity, buyPrice, sellPrice);
        this.weightTip = weightTip;
    }

    public String getWeightTip() {
        return weightTip;
    }
}
