package main.java.behavioural.observer;

public class InventoryManager implements Observer {
    @Override
    public void update(String operation, String item) {
        System.out.println(String.format("One %s removed from inventory", item));
    }
}
