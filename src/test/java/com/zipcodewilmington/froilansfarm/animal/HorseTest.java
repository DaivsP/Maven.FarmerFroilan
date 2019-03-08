package com.zipcodewilmington.froilansfarm.animal;


import com.zipcodewilmington.froilansfarm.produce.EarCorn;
import com.zipcodewilmington.froilansfarm.util.Edible;
import com.zipcodewilmington.froilansfarm.util.Rideable;

import org.junit.Test;
import org.junit.Assert;


public class HorseTest {

    Horse horse;


    @Test
    public void extendsAnimalTest(){
        //Given
        this.horse = new Horse(null, null);

        //Then
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void implementsRideableTest(){
        //Given
        this.horse = new Horse(null, null);

        //Then
        Assert.assertTrue(horse instanceof Rideable);
    }

    @Test
    public void setNameTest(){
        //Given
        this.horse = new Horse(null, null);

        //When
        horse.setName("Seabiscuit");
        String actualName = horse.getName();

        //Then
        String expectedName = "Seabiscuit";
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setEnergyTest(){
        //Given
        this.horse = new Horse(null, null);

        //When
        horse.setEnergy(10);
        Integer actualEnergy = horse.getEnergy();

        //Then
        Integer expectedEnergy = 10;
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void eatTest(){
        //Given
        this.horse = new Horse(null, null);
        Edible earCorn = new EarCorn();
        horse.setEnergy(10);

        //When
        horse.eat(earCorn);
        Integer actualEnergy = horse.getEnergy();

        //Then
        Integer expectedEnergy = 20;
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void rideTest(){
        //Given
        this.horse = new Horse(null, null);
        horse.setEnergy(10);

        //When
        horse.ride();
        String expected = "You rode " + horse.getName();

        Assert;
    }
}
