package n01_e02_ClasseCotxe;


public class Main {
    public static void main(String[] args) {

        Car.brake();

        Car tucson = new Car("90hp");
        tucson.accelerate();

        // Add model to Class - it will span all instances
        Car.setModel("Elantra");
        System.out.println("Car model set successfully: " + Car.getModel());

        // Create new instance after setting model
        Car i20 = new Car("70hp");

        // Retrieve model names for each instance; all the same
        System.out.println("i20 Car instance model name: " + Car.getModel());
        System.out.println("tucson Car instance model name: " + Car.getModel());

    }
}
