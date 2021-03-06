package com.zipcodewilmington.froilansfarm.storage;

import java.util.List;

public abstract class Storage<SomeType> {
    List<SomeType> list;

    void add(SomeType something) {
        list.add(something);
    }

    void remove(SomeType something) {
        list.remove(something);
    }

    SomeType get(Integer index) {
        return list.get(index);
    }

    Integer getSize(){
        return list.size();
    }

}
