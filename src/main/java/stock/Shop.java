package stock;

import enums.GuitarType;
import enums.InstrumentType;
import instruments.Guitar;
import instruments.Piano;
import stock.Product;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Product> stock;
    DecimalFormat formatPence = new DecimalFormat("#.00");

    public Shop(String name) {
        this.name = name;
//        shop starts with no Stock, has to be added
        this.stock = new ArrayList<>();
    }

    public int stockCount() {
        return this.stock.size();
    }

    public ArrayList<Product> getStock() {
        return stock;
    }

    public void addStock(Product product) {
        this.stock.add(product);
    }

    public void removeStock(Product product) {
        stock.remove(product);
    }

    public double totalProfit() {

        double total = 0;
        for (Product product : stock) {
//            calculate profit for each item: markup * quantity
            double profit = product.calculateMarkup() * product.getQuantity();
//            add it to running total
            total += profit;
        }
//            format double to 2 decimal places and convert it to Double
        return Double.parseDouble(formatPence.format(total));
    }


//    list by Instrument Class

    public ArrayList<Piano> listPianos() {
        ArrayList<Piano> pianos = new ArrayList<>();
        for (Product product : stock) {
            if (product instanceof Piano) {
                Piano piano = (Piano) product;
                pianos.add(piano);
            }
        }
        return pianos;
    }

    public ArrayList<Guitar> listGuitars() {
        ArrayList<Guitar> guitars = new ArrayList<>();
        for (Product product : stock) {
            if (product instanceof Guitar) {
                Guitar guitar = (Guitar) product;
                guitars.add(guitar);
            }
        }
        return guitars;
    }


    public ArrayList<Instrument> listInstrumentType(InstrumentType type) {

        ArrayList<Instrument> typeList = new ArrayList<>();

        for (Product product : stock){
            if (product instanceof Instrument) {
                Instrument instrument = (Instrument) product;
                if (instrument.getInstrumentType() == type) {
                    typeList.add(instrument);
                }
            }
        }
        return typeList;
    }

//  REFACTORED to make use of listInstrumentType
    public ArrayList<Guitar> listGuitarType(GuitarType type) {

//        make an ArrayList to return
        ArrayList<Guitar> typeList = new ArrayList<>();
//        get all the Guitars
        ArrayList<Instrument> guitars = listInstrumentType(InstrumentType.GUITAR);

//        iterate through Guitars, check their type
        for (Instrument guitar : guitars) {
                Guitar gtr = (Guitar) guitar;
                if (gtr.getType() == type){
                    typeList.add(gtr);
                }
            }
        return typeList;
        }

    public ArrayList<Product> getAccessories() {

        ArrayList<Product> accessories = new ArrayList<>();

        for (Product product : stock) {
//            check product IS NOT an Instrument
            if (!(product instanceof Instrument)) {
                accessories.add(product);
            }
        }
        return accessories;
    }

    public ArrayList<Product> getLowStock() {

        ArrayList<Product> lowStock = new ArrayList<>();

        for (Product product : stock) {
            if (product.getQuantity() <= 5) {
                lowStock.add(product);
            }
        }
        return lowStock;
    }

    public void updateStock(Product product, int newQuantity) {
        for (Product prod : stock) {
            if (prod.equals(product)) {
                prod.setQuantity(newQuantity);
            }
        }
    }

}
