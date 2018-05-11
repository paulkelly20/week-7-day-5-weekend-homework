package items;

public class LoopPedal extends Item{

    private String category;


    public LoopPedal(String productName, double buyPrice, double sellPrice, String category) {
        super(productName, buyPrice, sellPrice);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
