import enums.InstrumentType;
import interfaces.Playable;

public abstract class Instrument extends Product implements Playable {

    private InstrumentType instrumentType;
    private String colour;
    private String material;

    public Instrument(String name, String manufacturer, double buyPrice, double sellPrice,
                      InstrumentType instrumentType, String colour, String material) {
        super(name, manufacturer, buyPrice, sellPrice);
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.material = material;
    }
}
