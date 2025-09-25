package commandPattern;

public class SmartHomeTest {
    public static void main(String[] args) {
        // Devices
        SmartLight light = new SmartLight("LivingRoom");
        SmartTV tv = new SmartTV("BedroomTV");
        SmartBlinds blinds = new SmartBlinds("Window1");

        // Commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command tvOn = new TVPowerOnCommand(tv);
        Command tvVolume = new TVSetVolumeCommand(tv, 20);
        Command blindsOpen = new BlindsOpenCommand(blinds);
        Command blindsPosition = new BlindsSetPositionCommand(blinds, 75);

        // Remote
        RemoteControl remote = new RemoteControl();

        remote.register("lightOn", lightOn);
        remote.register("lightOff", lightOff);
        remote.register("tvOn", tvOn);
        remote.register("tvVolume", tvVolume);
        remote.register("blindsOpen", blindsOpen);
        remote.register("blindsSet", blindsPosition);

        // Simulate button presses
        remote.send("lightOn");
        remote.send("tvOn");
        remote.send("tvVolume");
        remote.send("blindsOpen");
        remote.send("blindsSet");

        // Undo example
        remote.undo("lightOn");
        remote.undo("blindsSet");
    }
}