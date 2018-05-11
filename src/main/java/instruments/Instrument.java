package instruments;

import interfaces.Iplay;
import interfaces.Isell;

public abstract class Instrument implements Isell, Iplay {


    private String productName;
    private double buyPrice;
    private double sellPrice;
    private InstrumentType instrumentType;

    public Instrument(String productName, double buyPrice, double sellPrice, InstrumentType instrumentType) {
        this.productName = productName;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getProductName() {
        return productName;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup() {
        return   getSellPrice() - this.buyPrice;
    }

    public double calculateMarkupPercentage(){
        if(this.buyPrice == 0)
        {return 100;}
        else return (calculateMarkup() / this.sellPrice) * 100;
    }
}
