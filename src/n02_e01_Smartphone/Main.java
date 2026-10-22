package n02_e01_Smartphone;

import n02_e01_Smartphone.Interfaces.Camera;
import n02_e01_Smartphone.Objects.AnalogCamera;
import n02_e01_Smartphone.Objects.Smartphone;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Smartphone smarty = new Smartphone("Apple", "iPhone 15");
        smarty.call("600123456");
        smarty.alarm();

        AnalogCamera analog = new AnalogCamera("Canon", "Canonito");

        List<Camera> clickers = List.of(
                smarty,
                analog
        );

        for (Camera item : clickers) {
            item.click();
        }
    }
}
