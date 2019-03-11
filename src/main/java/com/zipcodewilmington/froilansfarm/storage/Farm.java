package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animal.Farmer;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.produce.*;
import com.zipcodewilmington.froilansfarm.util.Vehicle;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

import java.util.ArrayList;
import java.util.Arrays;

public class Farm {
    public ArrayList<Stable> stables;
    public ArrayList<ChickenCoop> chickenCoops;
    public FarmHouse farmHouse;

    public Farm(ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, FarmHouse farmHouse) {
        this.chickenCoops = chickenCoops;
        this.stables = stables;
        this.farmHouse = farmHouse;
    }

    public ArrayList<ChickenCoop> generateChickenCoopsWithChickens() {
        return new ArrayList<>(Arrays.asList(
        new ChickenCoop(Chicken.chickenArrayList(4)),
        new ChickenCoop(Chicken.chickenArrayList(4)),
        new ChickenCoop(Chicken.chickenArrayList(4)),
        new ChickenCoop(Chicken.chickenArrayList(3))
        ));
    }

    public ArrayList<Stable> generateStablesWithHorses() {
        return new ArrayList<>(Arrays.asList(
                new Stable(Horse.horsesArrayList(4)),
                new Stable(Horse.horsesArrayList(3)),
                new Stable(Horse.horsesArrayList(3))
        ));
    }

    public ArrayList<CropRow> generateCropRows(){
        return new ArrayList<>(Arrays.asList(
                new CropRow<CornStalk>(CornStalk.createCornStalks(10)),
                new CropRow<TomatoPlant>(TomatoPlant.createTomatoPlants(10)),
                new CropRow<CornStalk>(CornStalk.createCornStalks(10)),
                new CropRow<TomatoPlant>(TomatoPlant.createTomatoPlants(10)),
                new CropRow<CornStalk>(CornStalk.createCornStalks(10))
        ));
    }

    public ArrayList<Vehicle> generateVehicles() {
        return new ArrayList<>(Arrays.asList(
                new Tractor(),
                new Tractor(),
                new CropDuster()
        ));
    }

    public ArrayList<Farmer> generatePersons() {
        return new ArrayList<Farmer>(Arrays.asList(
                new Farmer("Froilan", 100),
                new Farmer("Froilanda", 100)
        ));
    }
}