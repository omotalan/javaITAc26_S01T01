package n01_e01_Instrument.objects;

public class PercussionInstrument extends Instrument {

    public PercussionInstrument(String name, double price) {
         super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
