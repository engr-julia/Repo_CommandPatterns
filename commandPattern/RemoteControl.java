package commandPattern;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private Map<String, Command> commandMap = new HashMap<>();

    public void register(String name, Command command) {
        commandMap.put(name, command);
    }

    public void send(String name) {
        Command command = commandMap.get(name);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command registered with name: " + name);
        }
    }

    public void undo(String name) {
        Command command = commandMap.get(name);
        if (command != null) {
            command.undo();
        } else {
            System.out.println("No command to undo with name: " + name);
        }
    }
}