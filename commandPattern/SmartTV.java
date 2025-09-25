package commandPattern;

public class SmartTV implements Device {
    private String id;

    public SmartTV(String id) {
        this.id = id;
    }

    public void powerOn() {
        System.out.println("SmartTV " + id + " is ON.");
    }

    public void powerOff() {
        System.out.println("SmartTV " + id + " is OFF.");
    }

    public void setVolume(int level) {
        System.out.println("SmartTV " + id + " volume set to " + level + ".");
    }

    public void changeChannel(int channel) {
        System.out.println("SmartTV " + id + " changed to channel " + channel + ".");
    }

    @Override
    public String getId() {
        return id;
    }
}