package main.java.behavioural.command;

public class Client {
    public static void main(String[] args) {
        var remoteController = new RemoteController();
        var light = new Light();
        var lightOn = new LightOnCommand(light);
        var lightOff = new LightOffCommand(light);

        // light on
        remoteController.setCommand(lightOn);
        remoteController.pressButton();

        // light off
        remoteController.setCommand(lightOff);
        remoteController.pressButton();
    }
}
