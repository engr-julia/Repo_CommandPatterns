package commandPattern;

public class TVSetVolumeCommand implements Command {
    private SmartTV tv;
    private int level;

    public TVSetVolumeCommand(SmartTV tv, int level) {
        this.tv = tv;
        this.level = level;
    }

    @Override
    public void execute() {
        tv.setVolume(level);
    }

    @Override
    public void undo() {
        tv.setVolume(0); // reset volume as undo action
    }
}