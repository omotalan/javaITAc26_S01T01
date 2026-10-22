package n01_e01_Instrument;

import n01_e01_Instrument.objects.Instrument;
import n01_e01_Instrument.objects.PercussionInstrument;
import n01_e01_Instrument.objects.StringInstrument;
import n01_e01_Instrument.objects.WindInstrument;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Instrument flute = new WindInstrument(
                "flute",
                75.00
        );
        System.out.println("Constructor ejecutado: " + flute);

        Instrument citar = new StringInstrument(
                "citar",
                275.00
        );
        System.out.println("Constructor ejecutado: " + citar);

        Instrument agogo = new PercussionInstrument(
                "agogo",
                30.00
        );
        System.out.println("Constructor ejecutado: " + agogo);

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
