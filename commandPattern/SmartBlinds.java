package commandPattern;

public class SmartBlinds implements Device {
    private String id;

    public SmartBlinds(String id) {
        this.id = id;
    }

    public void open() {
        System.out.println("SmartBlinds " + id + " are OPEN.");
    }

    public void close() {
        System.out.println("SmartBlinds " + id + " are CLOSED.");
    }

    public void setPosition(int percent) {
        System.out.println("SmartBlinds " + id + " set to " + percent + "% open.");
    }

    @Override
    public String getId() {
        return id;
    }
}