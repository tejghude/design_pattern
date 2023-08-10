package net.media.training.designpattern.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Update implements Commands{
    String fileName;
    String content;
    String previousContent="hello world";
    Update(String filename,String content){
        this.fileName=filename;
        this.content=content;
    }
    @Override
    public void execute() {
        File file = new File(fileName);
        if (!file.exists())
            throw new RuntimeException("File: " + this.fileName + " does not exist");
        try {

            PrintWriter writer = new PrintWriter(file);
            writer.write(this.content);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void undo(){
        Update update =new Update(this.fileName,previousContent);
        update.execute();
    }
}
