package commandPattern;

public class BlindsOpenCommand implements Command {
    private SmartBlinds blinds;

    public BlindsOpenCommand(SmartBlinds blinds) {
        this.blinds = blinds;
    }

    @Override
    public void execute() {
        blinds.open();
    }

    @Override
    public void undo() {
        blinds.close();
    }
}