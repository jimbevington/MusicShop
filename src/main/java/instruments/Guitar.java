package instruments;


import enums.InstrumentType;
import stock.Instrument;

public class Guitar extends Instrument {


    public Guitar(String name, String manufacturer, int quantity, double buyPrice, double sellPrice, InstrumentType instrumentType, String colour, String material) {
        super(name, manufacturer, quantity, buyPrice, sellPrice, instrumentType, colour, material);
    }

    @Override
    public String play() {
        return "Karrrrrooooeeew!";
    }
}
