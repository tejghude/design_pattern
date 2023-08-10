package net.media.training.designpattern.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 4:55:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldManipulator {

    public void fixManipulate(final String fileName, final String newPath) {
        List<Commands> commands = new ArrayList<Commands>();
        commands.add(new Create(fileName,"hello world"));
        commands.add(new Update(fileName,"new hello world"));
        commands.add(new Move(fileName,newPath));

        Invoker invoker =new Invoker();
        invoker.invoke(commands);

    }



    public void brokenManipulate(String fileName, String newPath) {
        List<Commands> commands = new ArrayList<Commands>();
        commands.add(new Create(fileName,"hello world"));
        commands.add(new Update(fileName,"new hello world"));
        commands.add(new Move(fileName,newPath));
        commands.add(new Create(fileName,"hello world"));
        commands.add(new Create(fileName,"hello world"));

        Invoker invoker =new Invoker();
        invoker.invoke(commands);

    }


}
