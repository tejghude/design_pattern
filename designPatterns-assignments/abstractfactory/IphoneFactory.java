package net.media.training.designpattern.abstractfactory;

public class IphoneFactory implements Factory{

    @Override
    public MotherBoard assembleMotherboard() {
        MotherBoard motherBoard = new IphoneMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new IphoneProcessor());
        return motherBoard;
    }

    @Override
    public Screen assembleScreen() {
        Screen screen = new IphoneScreen();
        return screen;
    }

    @Override
    public Case assembleCase() {
        Case phoneCase = new IphoneCase();
        return phoneCase;
    }

}
