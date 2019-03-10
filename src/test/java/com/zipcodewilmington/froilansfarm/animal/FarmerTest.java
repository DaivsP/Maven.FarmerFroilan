package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.produce.Egg;
import com.zipcodewilmington.froilansfarm.produce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.util.Rideable;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    Farmer farmer = Farmer.createFarmer(null, null);

    @Test
    public void plant() {
        Crop crop = TomatoPlant.createTomatoPlant();
        farmer.plant(crop);

        Assert.assertTrue(crop.isPlanted());
    }

    @Test
    public void mount() {
        //Given
        Rideable rideable = Tractor.createTractor();
        String expected = "Farmer mounted "+rideable;

        //When
       String actual= (farmer.mount(rideable));


        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void dismount() {

        //Given
        Rideable rideable = Tractor.createTractor();
        String expected = "Farmer dismounted "+rideable;

        //When
        String actual= (farmer.dismount(rideable));


        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void constructorTest(){
        //Given
        farmer.setName("Froilan");
        farmer.setEnergy(10);

        //When
        String actualName = farmer.getName();

        //Then
        String expectedName = "Froilan";
        Assert.assertNotNull(farmer);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void eatTest(){
        //Given
        farmer.setName("Froilan");
        farmer.setEnergy(10);
        Egg egg = new Egg();

        //When
        farmer.eat(egg);
        Integer actualEnergy = farmer.getEnergy();

        //Then
        Integer expectedEnergy = 20;
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }
}