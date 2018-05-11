package shop;

import instruments.Guitar;
import interfaces.Isell;

import java.util.ArrayList;

public class Shop {

    private double till;
    private ArrayList<Isell> stock;

    public Shop(double till) {
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public double getTill() {
        return till;
    }

    public int getStock() {
        return stock.size();
    }

    public void addStock(Isell item) {
        stock.add(item);
    }

    public void removeStock(Isell item) {
        stock.remove(item);
    }


    public double getStockValue() {
        double totalValue = 0;


        for (Isell item : stock) { totalValue += item.getBuyPrice();
        }
        return totalValue;
    }
}
