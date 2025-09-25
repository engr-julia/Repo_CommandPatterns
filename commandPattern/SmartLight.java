package commandPattern;

public class SmartLight implements Device {
    private String id;

    public SmartLight(String id) {
        this.id = id;
    }

    public void turnOn() {
        System.out.println("SmartLight " + id + " is ON.");
    }

    public void turnOff() {
        System.out.println("SmartLight " + id + " is OFF.");
    }

    @Override
    public String getId() {
        return id;
    }
}