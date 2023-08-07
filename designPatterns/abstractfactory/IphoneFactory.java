package net.media.training.designpattern.abstractfactory;

public class IphoneFactory implements Factory{
    @Override
    public Case assemble(){
        MotherBoard motherBoard;
        motherBoard = new IphoneMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new IphoneProcessor());
        Screen screen;
        screen = new IphoneScreen();
        Case phoneCase;
        phoneCase = new IphoneCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
        return phoneCase;
    }
}
