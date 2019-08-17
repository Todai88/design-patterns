package main.java.behavioural.command;

public class Light {
    public boolean on;

    public void switchOff() {
        this.on = false;
    }

    public void switchOn() {
        this.on = true;
    }
}
