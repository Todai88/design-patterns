package main.java.behavioural.observer;

import java.util.Vector;

public class Inventory implements Subject {

    private Vector<Observer> observers;
    private String operation;
    private String item;

    public Inventory() {
        observers = new Vector<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(this.operation, this.item));
    }

    public void drink(String drink) {
        this.operation = "drinks";
        this.item = drink;
        notifyObservers();
    }

    public void eat(String edible) {
        this.operation = "eats";
        this.item = edible;
        notifyObservers();
    }
}
