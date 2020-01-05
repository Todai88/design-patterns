package main.java.behavioural.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        var backEnd = new Backend();
        var middleWare = new Middleware(backEnd);
        var frontEnd = new Frontend(middleWare);
        frontEnd.getTooltip(4);
    }
}
