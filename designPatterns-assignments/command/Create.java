package net.media.training.designpattern.command;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Create implements Commands{
    String fileName;
    String content;
    Create(String fileName ,String content){
        this.fileName=fileName;
        this.content=content;
    }
    @Override
    public void execute() {
        File file = new File(this.fileName);
        if (file.exists())
            throw new RuntimeException("File already exist");
        try {
            file.createNewFile();
            PrintWriter writer = new PrintWriter(file);
            writer.write(this.content);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void undo(){
        Delete delete = new Delete(fileName);
        delete.execute();
    }
}
