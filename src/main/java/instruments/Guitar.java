package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;
    private String  model;
    private GuitarFamily guitarFamily;

    public Guitar(String productName, double buyPrice, double sellPrice, InstrumentType instrumentType, int numberOfStrings, String model, GuitarFamily guitarFamily) {
        super(productName, buyPrice, sellPrice, instrumentType);
        this.numberOfStrings = numberOfStrings;
        this.model = model;
        this.guitarFamily = guitarFamily;
    }



    public String play() {
        if(guitarFamily == GuitarFamily.ACOUSTIC){
            return "Bling blang";
        }
        if(guitarFamily == GuitarFamily.BASS){
            return "Blump blump";
        }   if(guitarFamily == GuitarFamily.DOUBLENECKGUITAR){
            return "Bing!!";
        }   if(guitarFamily == GuitarFamily.ELECTRICGUITAR){
            return "Vrooom";
        }
        if(guitarFamily == GuitarFamily.RESONATORGUITAR){
            return "Whooooo!";
        }
        else return "....";

    }
}
