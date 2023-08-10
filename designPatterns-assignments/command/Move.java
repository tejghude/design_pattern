package net.media.training.designpattern.command;

import java.io.File;

public class Move implements Commands{
    String source;
    String destination;
    Move(String source, String destination){
        this.source=source;
        this.destination=destination;
    }
    @Override
    public void execute() {
        File file = new File(this.source);
        if (!file.exists())
            throw new RuntimeException("File does not exist");
        if (!file.renameTo(new File(this.destination)))
            throw new RuntimeException("Rename failed");
    }
    public void undo(){
        Move move = new Move(this.destination,this.source);
        move.execute();
    }
}
