package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.util.FarmVehicle;
import com.zipcodewilmington.froilansfarm.util.Rideable;

public class Tractor implements FarmVehicle {

    public Tractor() {
    }

    public static Tractor createTractor() {
        return new Tractor();
    }

    public String makeNoise() {
        return "operating tractor";
    }

    public String ride(Rideable rideable) {
        return "riding tractor";
    }


    public boolean harvest(Crop crop) {
        return true;
    }
}
