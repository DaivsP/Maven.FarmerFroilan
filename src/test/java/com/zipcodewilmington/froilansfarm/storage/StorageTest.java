package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animal.Farmer;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.animal.Person;
import com.zipcodewilmington.froilansfarm.produce.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StorageTest {
    ArrayList<Horse> stable;
    ArrayList<Chicken> chickenCoop;
    ArrayList<Person> farmHouse;
    ArrayList<Crop> field;
    ArrayList<Crop> cropRow;
    Crop crop;
    Horse horse;
    Chicken chicken;
    Person person;

    @Test
    public void addHorseTest() {
        //Given
        this.stable = new ArrayList<>(Horse.horsesArrayList(1));

        //When
        Integer actualSize = stable.size();

        //Then
        Integer expectedSize = 1;
        Assert.assertEquals(actualSize, expectedSize);
    }

    @Test
    public void addChickenTest() {
        //Given
        this.chickenCoop = new ArrayList<>(Chicken.chickenArrayList(1));

        //When
        Integer actualSize = chickenCoop.size();

        //Then
        Integer expectedSize = chickenCoop.size();
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void addFarmerTest() {
        //Given
        this.farmHouse = new ArrayList<>();
        this.person = Farmer.createFarmer("Froilan", 10);

        //When
        farmHouse.add(person);
        Object actualPerson = farmHouse.get(0);

        //Then
        Object expectedPerson = person;
        Assert.assertEquals(expectedPerson, actualPerson);
    }

    @Test
    public void addFieldTest() {
        //Given
        this.field = new ArrayList<>();
        this.cropRow = new ArrayList<>(TomatoPlant.createTomatoPlants(1));

        //When
        Integer actualSize = field.size();

        //Then
        Integer expectedSize = field.size();
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void addCropTest() {
        //Given
        this.cropRow = new ArrayList<>(TomatoPlant.createTomatoPlants(1));

        //When
        Integer actualSize = cropRow.size();

        //Then
        Integer expectedSize = 1;
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void removeHorseTest() {
        //Given
        this.stable = new ArrayList<>(Horse.horsesArrayList(1));

        //When
        Integer beforeRemove = stable.size();
        stable.remove(0);

        //Then
        Integer afterRemove = stable.size();
        Assert.assertNotEquals(beforeRemove, afterRemove);
    }

    @Test
    public void removeChickenTest() {
        //Given
        this.chickenCoop = new ArrayList<>(Chicken.chickenArrayList(1));

        //When
        Integer beforeRemove = chickenCoop.size();
        chickenCoop.remove(0);

        //Then
        Integer afterRemove = chickenCoop.size();
        Assert.assertNotEquals(beforeRemove, afterRemove);
    }

    @Test
    public void removeFarmerTest() {
        //Given
        this.farmHouse = new ArrayList<>();
        this.person = Farmer.createFarmer("Froilan", 10);

        //When
        farmHouse.add(person);
        Integer beforeRemove = farmHouse.size();
        farmHouse.remove(person);

        //Then
        Integer afterRemove = farmHouse.size();
        Assert.assertNotEquals(beforeRemove, afterRemove);
    }

    @Test
    public void removeCropRowTest() {
        //Given
        this.field = new ArrayList<>(TomatoPlant.createTomatoPlants(1));

        //When
        Integer beforeRemove = field.size();
        field.remove(0);

        //Then
        Integer afterRemove = field.size();
        Assert.assertNotEquals(beforeRemove, afterRemove);
    }

    @Test
    public void removeCropTest() {
        //Given
        this.cropRow = new ArrayList<>(TomatoPlant.createTomatoPlants(1));

        //When
        cropRow.add(crop);
        Integer beforeRemove = cropRow.size();
        cropRow.remove(crop);

        //Then
        Integer afterRemove = cropRow.size();
        Assert.assertNotEquals(beforeRemove, afterRemove);
    }
}