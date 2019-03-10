package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.produce.TomatoPlant;

import java.util.ArrayList;
import java.util.List;

public class CropRow<T extends Crop> extends Storage {
    private ArrayList<T> crops;

    public CropRow(ArrayList<T> crops) {
        this.crops = crops;
    }
}
