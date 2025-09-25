package commandPattern;

public class TVPowerOnCommand implements Command {
    private SmartTV tv;

    public TVPowerOnCommand(SmartTV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.powerOn();
    }

    @Override
    public void undo() {
        tv.powerOff();
    }
}