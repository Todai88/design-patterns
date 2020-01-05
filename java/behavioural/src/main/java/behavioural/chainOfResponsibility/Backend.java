package main.java.behavioural.chainOfResponsibility;

public class Backend implements Tooltip {

    public Backend() {
    }


    @Override
    public void getTooltip(int helpConstant) {
        System.out.println("This is the backend");
    }
}
