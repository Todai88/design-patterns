package main.java.behavioural.chainOfResponsibility;

public class Middleware implements Tooltip {
    private final int MIDDLEWARE_TOOLTIP = 2;
    private final Tooltip successor;

    public Middleware(Tooltip successor) {
        this.successor = successor;
    }

    @Override
    public void getTooltip(int helpConstant) {
        if (helpConstant != MIDDLEWARE_TOOLTIP) {
            successor.getTooltip(helpConstant);
        } else {
            System.out.printf("This is the middle-ware");
        }
    }
}
