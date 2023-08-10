package net.media.training.designpattern.abstractfactory;

public interface Factory {
    public MotherBoard assembleMotherboard();
    public Screen assembleScreen();
    public Case assembleCase();
}
