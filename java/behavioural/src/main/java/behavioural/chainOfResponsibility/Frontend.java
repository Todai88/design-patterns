package main.java.behavioural.chainOfResponsibility;

public class Frontend implements Tooltip {
    private final int FRONTEND_TOOLTIP = 1;
    private final Tooltip successor;

    public Frontend(Tooltip successor) {
        this.successor = successor;
    }

    @Override
    public void getTooltip(int helpConstant) {
        if (helpConstant != FRONTEND_TOOLTIP) {
            successor.getTooltip(helpConstant);
        } else {
            System.out.println("This is the front-end");
        }
    }


}
