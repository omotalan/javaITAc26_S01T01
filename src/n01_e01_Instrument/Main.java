package n01_e01_Instrument;

import n01_e01_Instrument.objects.Instrument;
import n01_e01_Instrument.objects.PercussionInstrument;
import n01_e01_Instrument.objects.StringInstrument;
import n01_e01_Instrument.objects.WindInstrument;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        WindInstrument flute = new WindInstrument(
                "flute",
                75.00
        );

        StringInstrument citar = new StringInstrument(
                "citar",
                275.00
        );

        PercussionInstrument agogo = new PercussionInstrument(
                "agogo",
                30.00
        );

        List<Instrument> llista = List.of(
                agogo,
                citar,
                flute
        );

        // Constructor feedback
        for (Instrument item : llista) {
            System.out.println("Instrument created: " + item.getName());
            item.play();
        }
    }
}
