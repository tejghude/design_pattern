package net.media.training.designpattern.abstractfactory;

public class AndroidFactory implements Factory {

    @Override
    public MotherBoard assembleMotherboard() {
        MotherBoard motherBoard;
        motherBoard = new AndroidMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new AndroidProcessor());
        return motherBoard;
    }

    @Override
    public Screen assembleScreen() {
        Screen screen = new AndroidScreen();
        return screen;
    }

    @Override
    public Case assembleCase() {
        Case phoneCase = new AndroidCase();
        return phoneCase;
    }
}
