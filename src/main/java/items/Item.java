package items;

import interfaces.Isell;

public abstract class Item implements Isell {

    private String productName;
    private double buyPrice;
    private double sellPrice;

    public Item(String productName, double buyPrice, double sellPrice) {
        this.productName = productName;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
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


