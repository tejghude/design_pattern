package net.media.training.designpattern.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Invoker {
    public List<Commands> commandList = new ArrayList<Commands>();
    public Stack<Commands> stack = new Stack<Commands>();


    public void invoke(List<Commands> commandList){
        for(Commands command : commandList){
            try {
                command.execute();
                stack.push(command);
            }catch (Exception e){
                for (int i = 0; i != stack.size(); i++) stack.pop().undo();
                break;
            }
        }
    }

}
