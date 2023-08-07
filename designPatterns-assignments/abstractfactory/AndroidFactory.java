package net.media.training.designpattern.abstractfactory;

public class AndroidFactory implements Factory {
    @Override
    public Case assemble(){
        MotherBoard motherBoard;
        motherBoard = new AndroidMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new AndroidProcessor());
        Screen screen;
        screen = new AndroidScreen();
        Case phoneCase;
        phoneCase = new AndroidCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
        return phoneCase;
    }
}
