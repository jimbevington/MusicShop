package instruments;

import enums.InstrumentType;
import enums.PianoType;
import stock.Instrument;

public class Piano extends Instrument {

    private PianoType type;
    private int noOfKeys;

    public Piano(String name, String manufacturer, int quantity, double buyPrice, double sellPrice, String colour,
                 String material, PianoType type, int noOfKeys) {
        super(name, manufacturer, quantity, buyPrice, sellPrice, InstrumentType.KEYBOARD, colour, material);
        this.type = type;
        this.noOfKeys = noOfKeys;
    }


    @Override
    public String play() {
        return "Plink, plonk, crunch, smash!";
    }
}
