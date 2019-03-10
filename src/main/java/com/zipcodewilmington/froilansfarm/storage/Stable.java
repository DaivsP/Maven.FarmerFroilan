package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animal.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable extends Storage<Horse> {
    private ArrayList<Horse> horses;

    public Stable(ArrayList<Horse> horses) {
        this.horses = horses;
    }
}
