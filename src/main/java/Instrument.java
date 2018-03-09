public abstract class Instrument extends Product{

    public Instrument(String name, String manufacturer, double buyPrice, double sellPrice, InstrumentType instrumentType) {
        super(name, manufacturer, buyPrice, sellPrice);
        this.instrumentType = instrumentType;
    }
}
