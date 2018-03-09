package instruments;


import enums.GuitarType;
import enums.InstrumentType;
import stock.Instrument;

public class Guitar extends Instrument {


    private GuitarType guitarType;
    private int stringNumber;

    public Guitar(String name, String manufacturer, int quantity, double buyPrice, double sellPrice, String colour,
                  String material, GuitarType guitarType, int stringNumber) {
//        Instrument Type is set as Guitar in SuperConstructor, as Guitars will always be Guitars.
        super(name, manufacturer, quantity, buyPrice, sellPrice, InstrumentType.GUITAR, colour, material);
        this.guitarType = guitarType;
        this.stringNumber = stringNumber;
    }

    @Override
    public String play() {
        return "Karrrrrooooeeew!";
    }

    public GuitarType getType() {
        return guitarType;
    }
}
