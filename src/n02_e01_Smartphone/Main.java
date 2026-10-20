package n02_e01_Smartphone;

import n02_e01_Smartphone.Objects.Smartphone;

public class Main {
    public static void main(String[] args) {
        
        Smartphone smarty = new Smartphone("Apple", "iPhone 15");
        
        smarty.call("600123456");
        
        smarty.click();
        
        smarty.alarm();
    }
}
