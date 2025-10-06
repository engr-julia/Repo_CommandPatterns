package adapterPattern;

public class Client {
    public static void main(String[] args) {
        // Create adaptee objects
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger charger = new SmartphoneCharger();

        // Create adapters
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet phoneOutlet = new SmartphoneAdapter(charger);

        // Plug in devices
        laptopOutlet.plugIn();
        fridgeOutlet.plugIn();
        phoneOutlet.plugIn();
    }
}
