package instruments;

public class Saxaphone extends Instrument {

    private int holes;
    private String model;

    public Saxaphone(String productName, double buyPrice, double sellPrice, InstrumentType instrumentType, int holes, String model) {
        super(productName, buyPrice, sellPrice, instrumentType);
        this.holes = holes;
        this.model = model;
    }

    public int getHoles() {
        return holes;
    }

    public String getModel() {
        return model;
    }


    public String play() {
        return "Doot doot";
    }
}
