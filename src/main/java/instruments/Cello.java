package instruments;

import enums.InstrumentType;
import stock.Instrument;

public class Cello extends Instrument {
    public Cello(String name, String manufacturer, int quantity, double buyPrice, double sellPrice, String colour,
                 String material) {
        super(name, manufacturer, quantity, buyPrice, sellPrice, InstrumentType.STRINGS, colour, material);
    }

    @Override
    public String play() {
        return "Hummmmmmmph";
    }
}
