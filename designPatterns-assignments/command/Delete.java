package net.media.training.designpattern.command;

import java.io.File;

public class Delete implements Commands{
    String fileName;
    Delete(String filename){}
    @Override
    public void execute() {
        File file = new File(fileName);
        file.delete();
    }

    @Override
    public void undo() {}
}
