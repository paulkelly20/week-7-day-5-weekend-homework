package items;

public class SheetMusic extends Item{

    private String musicType;

    public SheetMusic(String productName, double buyPrice, double sellPrice, String musicType) {
        super(productName, buyPrice, sellPrice);
        this.musicType = musicType;
    }

    public String getMusicType() {
        return musicType;
    }


}
