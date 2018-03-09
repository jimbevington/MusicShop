package accessories;

import enums.StringsType;
import stock.Product;

public class InstrumentStrings extends Product{

    private StringsType stringsType;

    public InstrumentStrings(String name, String manufacturer, int quantity, double buyPrice, double sellPrice,
                             StringsType stringsType) {
        super(name, manufacturer, quantity, buyPrice, sellPrice);
        this.stringsType = stringsType;
    }


    public StringsType getType() {
        return stringsType;
    }
}
