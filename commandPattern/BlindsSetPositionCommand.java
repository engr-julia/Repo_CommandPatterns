package commandPattern;

public class BlindsSetPositionCommand implements Command {
    private SmartBlinds blinds;
    private int position;

    public BlindsSetPositionCommand(SmartBlinds blinds, int position) {
        this.blinds = blinds;
        this.position = position;
    }

    @Override
    public void execute() {
        blinds.setPosition(position);
    }

    @Override
    public void undo() {
        blinds.setPosition(0); // reset to closed
    }
}