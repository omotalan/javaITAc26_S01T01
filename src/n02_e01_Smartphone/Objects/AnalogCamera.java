package n02_e01_Smartphone.Objects;

import n02_e01_Smartphone.Interfaces.Camera;
import n02_e01_Smartphone.Interfaces.Clock;

public class AnalogCamera implements Camera {
    private String brand;
    private String model;

    public AnalogCamera(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void click() {
        System.out.println("Making photo with " + brand + " camera.");
    }

}