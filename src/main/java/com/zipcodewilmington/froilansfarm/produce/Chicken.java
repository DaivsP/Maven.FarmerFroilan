package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.util.Edible;
import com.zipcodewilmington.froilansfarm.util.Produce;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chicken extends Animal implements Produce {
    private Boolean hasBeenFertilized = false;
    Integer eggCount;

    public Chicken()
    {
        this.eggCount = 0;

    }

    public static ArrayList<Chicken> chickenArrayList(Integer numberOfChickens) {
        return (ArrayList<Chicken>) Stream.generate(Chicken::new)
                .limit(numberOfChickens)
                .collect(Collectors.toList());
    }


    public void setEggCount(Integer eggCount) {
        this.eggCount = eggCount;
    }

    public Integer getEggCount() {
        return eggCount;
    }


    public Boolean getHasBeenFertilized()
    {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public String makeNoise() {

        return "Cock-A-Doodle-Doo!";
    }

    public Edible yield() {
        Edible edible = new Egg();
        this.eggCount++;
        return edible;
    }

    public String eat(Edible edible) {
        return null;
    }
}
