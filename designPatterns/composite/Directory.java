package net.media.training.designpattern.composite;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements Data{
    private final String name;
    private final List<Data> contents;
    private Directory parent;



    public Directory(String name,List<Data> contents) {
        this.name = name;
        this.contents = contents;
        for (Data content :contents){content.setParent(this);}

    }

    public int getSize(Directory directoryToSize) {
        int sum = 0;
        for(Data content :directoryToSize.getContents()){sum+=content.getSize();}
        return sum;
    }

    public int getSize() {
        return getSize(this);
    }

    public void setParent(Directory directory) {
        this.parent = directory;
    }

    public void delete(Directory directoryToDelete) {
        while (directoryToDelete.getContents().size()>0){
            Data content = directoryToDelete.getContents().get(0);
            content.getParent().removeEntry(content);
        }
        directoryToDelete.getParent().removeEntry(directoryToDelete);
    }

    public void delete() {
        delete(this);
    }

    public void removeEntry(Data content){
        contents.remove(content);
    }

    public void add(Data directory) {
        contents.add(directory);
    }

    private boolean dataExists(String name, Directory directoryToSearch) {
        if (directoryToSearch.getName().equals(name)){return true;}
        for (Data content : directoryToSearch.getContents()){
            if (content.getName().equals(name)){return true;}
            if (content.getContents()!=null) {
                for(Data childContent : content.getContents()){
                dataExists(name, (Directory) childContent);
                }
            }
        }
        return false;
    }
    private boolean dataExists(String name){
        return dataExists(name,this);
    }
    public String getName() {
    return name;
}
    public List<Data> getContents(){
        return contents;
    }
    public Directory getParent() {
        return parent;
    }
}
