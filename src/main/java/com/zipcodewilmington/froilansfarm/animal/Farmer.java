package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.util.Botanist;
import com.zipcodewilmington.froilansfarm.util.Edible;
import com.zipcodewilmington.froilansfarm.util.Rideable;
import com.zipcodewilmington.froilansfarm.util.Rider;

public class Farmer extends Person implements Rider, Botanist {
    String name;
    Integer energy;

    public Farmer(String name, Integer energy){
        this.name = name;
        this.energy = energy;
    }

    public static Farmer createFarmer(String name, Integer energy) {
        return new Farmer(name, energy);
    }

    public void plant(Crop crop) {
        crop.plant();

    }

    public String mount(Rideable rideable) {

     return "Farmer mounted "+rideable;

    }

    public String dismount(Rideable rideable) {
        return "Farmer dismounted "+rideable;

    }

    public String eat(Edible edible){
        energy += 10;
        return name + " ate " + edible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }
}
