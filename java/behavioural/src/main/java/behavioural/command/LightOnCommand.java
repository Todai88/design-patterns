package main.java.behavioural.command;

public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Light is on");
        this.light.switchOn();
    }
}
