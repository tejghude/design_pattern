package net.media.training.designpattern.composite;

import java.util.List;

public interface Data {

    default void setParent(Directory parent) {}

    default String getName() {return null;};

    default int getSize(){return Integer.parseInt(null);};

    default Directory getParent(){return null;};
    default List<Data> getContents(){return null;}
}
