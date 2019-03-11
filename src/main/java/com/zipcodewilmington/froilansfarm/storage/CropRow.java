package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.produce.Crop;

import java.util.ArrayList;

public class CropRow<T extends Crop> extends Storage<T> {
    private ArrayList<T> crops;

    public CropRow(ArrayList<T> crops) {
        this.crops = crops;
    }
}
