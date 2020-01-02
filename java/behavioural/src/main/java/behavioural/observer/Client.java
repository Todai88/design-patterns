package main.java.behavioural.observer;

public class Client {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Player player = new Player();
        inventory.registerObserver(player);
        inventory.registerObserver(new InventoryManager());
        inventory.drink("potion");
        inventory.unregisterObserver(player);
        inventory.eat("chocolate");
    }
}
