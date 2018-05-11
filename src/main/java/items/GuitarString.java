package items;

public class GuitarString extends Item {

    private double buyPrice;
    private String guitarType;

    public GuitarString(String productName,  double buyPrice, double sellPrice,  String guitarType) {
        super(productName, buyPrice, sellPrice);
        this.buyPrice = buyPrice;
        this.guitarType = guitarType;
    }


    public String getGuitarType() {
        return guitarType;
    }



}
