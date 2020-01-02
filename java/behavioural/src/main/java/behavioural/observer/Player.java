package main.java.behavioural.observer;

public class Player implements Observer {
    @Override
    public void update(String operation, String item) {
        System.out.println(String.format("Player %s %s", operation, item));
    }
}
