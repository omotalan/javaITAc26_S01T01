package n02_e01_Smartphone.Objects;

import n02_e01_Smartphone.Interfaces.Camera;
import n02_e01_Smartphone.Interfaces.Clock;

public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void click() {
        System.out.println("Making photo...");
    }

    @Override
    public void alarm() {
        System.out.println("Sounding alarm!");
    }

}