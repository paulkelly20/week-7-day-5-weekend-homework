package instruments;

public class Piano extends Instrument{

    private String design;
    private int numberOfStrings;

    public Piano(String productName, double buyPrice, double sellPrice, InstrumentType instrumentType, String design, int numberOfStrings) {
        super(productName, buyPrice, sellPrice, instrumentType);
        this.design = design;
        this.numberOfStrings = numberOfStrings;
    }

    public String getDesign() {
        return design;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Ding dong";
    }
}
